package org.telegram.messenger.pip;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Rational;
import android.view.View;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import org.webrtc.TextureViewRenderer;

public class PipSource {
    private static int sourceIdCounter;
    private static final int[] tmpCords = new int[2];
    Activity activity;
    private View attachedToPictureInPictureView;
    private View contentView;
    private boolean isEnabled;
    private final PictureInPictureContentViewProvider listener;
    public final boolean needMediaSession;
    private final View.OnLayoutChangeListener onLayoutChangeListener;
    Player player;
    private final Rect position;
    public final int priority;
    final Point ratio;
    public final int sourceId;
    public final String tag;

    public static class Builder {
        private final Activity activity;
        private View contentView;
        private int height;
        private final PictureInPictureContentViewProvider listener;
        private Player player;
        private String tagPrefix;
        private int width;
        private int priority = 0;
        private boolean needMediaSession = false;

        public Builder(Activity activity, PictureInPictureContentViewProvider pictureInPictureContentViewProvider) {
            this.activity = activity;
            this.listener = pictureInPictureContentViewProvider;
        }

        public PipSource build() {
            return new PipSource(this);
        }

        public Builder setContentRatio(int i, int i2) {
            this.width = i;
            this.height = i2;
            return this;
        }

        public Builder setContentView(View view) {
            this.contentView = view;
            return this;
        }

        public Builder setNeedMediaSession(boolean z) {
            this.needMediaSession = z;
            return this;
        }

        public Builder setPlayer(Player player) {
            this.player = player;
            return this;
        }

        public Builder setPriority(int i) {
            this.priority = i;
            return this;
        }

        public Builder setTagPrefix(String str) {
            this.tagPrefix = str;
            return this;
        }
    }

    private PipSource(Builder builder) {
        int i = sourceIdCounter;
        sourceIdCounter = i + 1;
        this.sourceId = i;
        this.onLayoutChangeListener = new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                PipSource.this.onLayoutChange(view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.position = new Rect();
        Point point = new Point();
        this.ratio = point;
        this.isEnabled = true;
        StringBuilder sb = new StringBuilder();
        sb.append(builder.tagPrefix != null ? builder.tagPrefix : "pip-source");
        sb.append("-");
        sb.append(i);
        this.tag = sb.toString();
        this.listener = builder.listener;
        this.activity = builder.activity;
        this.priority = builder.priority;
        this.needMediaSession = builder.needMediaSession;
        point.set(builder.width, builder.height);
        this.player = builder.player;
        setContentView(builder.contentView);
        PipNativeApiController.register(this);
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        updateContentPosition(view);
    }

    private void updateContentPosition(View view) {
        int[] iArr = tmpCords;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        Activity activity = this.activity;
        if (activity != null) {
            activity.getWindow().getDecorView().getLocationOnScreen(iArr);
            i -= iArr[0];
            i2 -= iArr[1];
        }
        int width = view.getWidth() + i;
        int height = view.getHeight() + i2;
        Rect rect = this.position;
        boolean z = (rect.left == i && rect.top == i2 && rect.right == width && rect.bottom == height) ? false : true;
        rect.set(i, i2, width, height);
        if (view instanceof TextureViewRenderer) {
            TextureViewRenderer textureViewRenderer = (TextureViewRenderer) view;
            int i3 = textureViewRenderer.rotatedFrameWidth;
            int i4 = textureViewRenderer.rotatedFrameHeight;
            Point point = this.ratio;
            z |= (point.x == i3 && point.y == i4) ? false : true;
            point.set(i3, i4);
            if (this.player != null && z) {
                PipNativeApiController.onUpdateSourcesMap();
            }
        }
        if (PipNativeApiController.isMaxPrioritySource(this.tag) && z) {
            applyPictureInPictureParams();
        }
    }

    public void applyPictureInPictureParams() {
        boolean isInPictureInPictureMode;
        if (Build.VERSION.SDK_INT >= 31) {
            isInPictureInPictureMode = this.activity.isInPictureInPictureMode();
            if (isInPictureInPictureMode) {
                return;
            }
            this.activity.setPictureInPictureParams(buildPictureInPictureParams());
        }
    }

    public void attachToPictureInPicture() {
        detachFromPictureInPicture();
        if (this.activity instanceof PictureInPictureActivityHandler) {
            View detachContentFromWindow = this.listener.detachContentFromWindow();
            this.attachedToPictureInPictureView = detachContentFromWindow;
            ((PictureInPictureActivityHandler) this.activity).addActivityPipView(detachContentFromWindow);
            this.listener.onAttachContentToPip();
        }
    }

    public PictureInPictureParams buildPictureInPictureParams() {
        PictureInPictureParams build;
        int i;
        Rational rational;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        Point point = this.ratio;
        int i2 = point.x;
        if (i2 <= 0 || (i = point.y) <= 0) {
            builder.setAspectRatio(null);
        } else {
            double d = i2 / i;
            if (d < 0.45d) {
                rational = new Rational(45, 100);
            } else if (d > 2.35d) {
                rational = new Rational(235, 100);
            } else {
                Point point2 = this.ratio;
                rational = new Rational(point2.x, point2.y);
            }
            builder.setAspectRatio(rational);
        }
        if (this.position.width() <= 0 || this.position.height() <= 0) {
            builder.setSourceRectHint(null);
        } else {
            builder.setSourceRectHint(this.position);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            builder.setSeamlessResizeEnabled(true);
            builder.setAutoEnterEnabled(true);
        }
        build = builder.build();
        return build;
    }

    public void destroy() {
        detachFromPictureInPicture();
        PipNativeApiController.unregister(this);
        setContentView(null);
        this.activity = null;
    }

    public void detachFromPictureInPicture() {
        if (this.attachedToPictureInPictureView != null && (this.activity instanceof PictureInPictureActivityHandler)) {
            this.listener.prepareDetachContentFromPip();
            ((PictureInPictureActivityHandler) this.activity).removeActivityPipView(this.attachedToPictureInPictureView);
            this.listener.attachContentToWindow();
            this.attachedToPictureInPictureView = null;
        }
    }

    public boolean isAttachedToPictureInPicture() {
        return this.attachedToPictureInPictureView != null;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void setContentRatio(int i, int i2) {
        Point point = this.ratio;
        boolean z = (point.x == i && point.y == i2) ? false : true;
        point.set(i, i2);
        if (this.player != null && z) {
            PipNativeApiController.onUpdateSourcesMap();
        }
        if (PipNativeApiController.isMaxPrioritySource(this.tag) && z) {
            applyPictureInPictureParams();
        }
    }

    public void setContentView(View view) {
        View view2 = this.contentView;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this.onLayoutChangeListener);
        }
        this.contentView = view;
        if (view != null) {
            view.addOnLayoutChangeListener(this.onLayoutChangeListener);
            updateContentPosition(this.contentView);
        }
    }

    public void setEnabled(boolean z) {
        this.isEnabled = z;
        PipNativeApiController.onUpdateSourcesMap();
    }

    public void setPlayer(Player player) {
        MediaSessionConnector mediaSessionConnector;
        this.player = player;
        PipNativeApiController.onUpdateSourcesMap();
        if (!PipNativeApiController.isMaxPrioritySource(this.tag) || (mediaSessionConnector = PipNativeApiController.mediaSessionConnector) == null) {
            return;
        }
        mediaSessionConnector.setPlayer(player);
    }
}
