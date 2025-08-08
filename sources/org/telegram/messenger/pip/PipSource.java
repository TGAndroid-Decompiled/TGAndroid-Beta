package org.telegram.messenger.pip;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.content.ComponentCallbacks2;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.exoplayer2.Player;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.pip.activity.IPipActivity;
import org.telegram.messenger.pip.activity.IPipActivityActionListener;
import org.telegram.messenger.pip.source.IPipSourceDelegate;
import org.telegram.messenger.pip.source.PipSourceHandlerState2;
import org.telegram.messenger.pip.utils.PipPositionObserver;
import org.telegram.messenger.pip.utils.PipSourceParams;
import org.telegram.messenger.pip.utils.PipUtils;
import org.webrtc.TextureViewRenderer;

public class PipSource {
    private static int sourceIdCounter;
    private static final Rect tmpRect = new Rect();
    public View contentView;
    public final PipActivityController controller;
    public final int cornerRadius;
    public final IPipSourceDelegate delegate;
    private boolean isAvailable;
    public final boolean needMediaSession;
    public final PipSourceParams params;
    private final PipPositionObserver pipPositionObserver;
    public View placeholderView;
    Player player;
    public final int priority;
    private ArrayList remoteActions;
    public final int sourceId;
    public final PipSourceHandlerState2 state2;
    public final String tag;

    public void invalidateActions() {
    }

    private PipSource(PipActivityController pipActivityController, Builder builder) {
        int i = sourceIdCounter;
        sourceIdCounter = i + 1;
        this.sourceId = i;
        PipSourceParams pipSourceParams = new PipSourceParams();
        this.params = pipSourceParams;
        this.pipPositionObserver = new PipPositionObserver(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public final void onGlobalLayout() {
                PipSource.this.invalidatePosition();
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(builder.tagPrefix != null ? builder.tagPrefix : "pip-source");
        sb.append("-");
        sb.append(i);
        this.tag = sb.toString();
        this.delegate = builder.delegate;
        Builder.access$200(builder);
        this.priority = builder.priority;
        this.cornerRadius = builder.cornerRadius;
        this.needMediaSession = builder.needMediaSession;
        this.controller = pipActivityController;
        pipSourceParams.setRatio(builder.width, builder.height);
        this.player = builder.player;
        this.placeholderView = builder.placeholderView;
        this.state2 = new PipSourceHandlerState2(this);
        setContentView(builder.contentView);
        checkAvailable(false);
        invalidateActions();
        pipActivityController.dispatchSourceRegister(this);
    }

    public void destroy() {
        this.pipPositionObserver.stop();
        this.controller.dispatchSourceUnregister(this);
    }

    public void setContentView(View view) {
        this.pipPositionObserver.start(view);
        this.contentView = view;
        if (view != null) {
            updateContentPosition(view);
        }
    }

    public void setPlaceholderView(View view) {
        this.placeholderView = view;
    }

    public void setContentRatio(int i, int i2) {
        if (this.params.setRatio(i, i2)) {
            checkAvailable(true);
            this.controller.dispatchSourceParamsChanged(this);
        }
    }

    public void setPlayer(Player player) {
        this.player = player;
        checkAvailable(true);
        this.controller.dispatchSourceParamsChanged(this);
    }

    private void updateContentPosition(View view) {
        if (AndroidUtilities.isInPictureInPictureMode(this.controller.activity)) {
            return;
        }
        Activity activity = this.controller.activity;
        Rect rect = tmpRect;
        PipUtils.getPipSourceRectHintPosition(activity, view, rect);
        boolean position = this.params.setPosition(rect);
        if (view instanceof TextureViewRenderer) {
            TextureViewRenderer textureViewRenderer = (TextureViewRenderer) view;
            position |= this.params.setRatio(textureViewRenderer.rotatedFrameWidth, textureViewRenderer.rotatedFrameHeight);
        }
        if (position) {
            checkAvailable(true);
            this.controller.dispatchSourceParamsChanged(this);
        }
    }

    public void invalidatePosition() {
        View view = this.contentView;
        if (view != null) {
            updateContentPosition(view);
        }
    }

    public PictureInPictureParams buildPictureInPictureParams() {
        PictureInPictureParams build;
        PictureInPictureParams.Builder build2 = this.params.build();
        build2.setActions(this.remoteActions);
        if (Build.VERSION.SDK_INT >= 31) {
            build2.setAutoEnterEnabled(PipUtils.useAutoEnterInPictureInPictureMode());
        }
        build = build2.build();
        return build;
    }

    private void checkAvailable(boolean z) {
        boolean z2 = this.params.isValid() && this.delegate.pipIsAvailable();
        if (this.isAvailable != z2) {
            this.isAvailable = z2;
            if (z) {
                this.controller.dispatchSourceAvailabilityChanged(this);
            }
        }
    }

    public void invalidateAvailability() {
        checkAvailable(true);
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public static class Builder {
        private final Activity activity;
        private View contentView;
        private int cornerRadius;
        private final IPipSourceDelegate delegate;
        private int height;
        private View placeholderView;
        private Player player;
        private String tagPrefix;
        private int width;
        private int priority = 0;
        private boolean needMediaSession = false;

        static IPipActivityActionListener access$200(Builder builder) {
            builder.getClass();
            return null;
        }

        public Builder(Activity activity, IPipSourceDelegate iPipSourceDelegate) {
            this.activity = activity;
            this.delegate = iPipSourceDelegate;
        }

        public Builder setTagPrefix(String str) {
            this.tagPrefix = str;
            return this;
        }

        public Builder setPriority(int i) {
            this.priority = i;
            return this;
        }

        public Builder setPlaceholderView(View view) {
            this.placeholderView = view;
            return this;
        }

        public Builder setCornerRadius(int i) {
            this.cornerRadius = i;
            return this;
        }

        public Builder setNeedMediaSession(boolean z) {
            this.needMediaSession = z;
            return this;
        }

        public Builder setContentView(View view) {
            this.contentView = view;
            return this;
        }

        public Builder setContentRatio(int i, int i2) {
            this.width = i;
            this.height = i2;
            return this;
        }

        public Builder setPlayer(Player player) {
            this.player = player;
            return this;
        }

        public PipSource build() {
            ComponentCallbacks2 componentCallbacks2 = this.activity;
            if (componentCallbacks2 instanceof IPipActivity) {
                return new PipSource(((IPipActivity) componentCallbacks2).getPipController(), this);
            }
            return null;
        }
    }
}
