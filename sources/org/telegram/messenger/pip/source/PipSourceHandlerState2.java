package org.telegram.messenger.pip.source;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.PipSourceContentView;
import org.telegram.messenger.pip.activity.IPipActivityAnimationListener;
import org.telegram.messenger.pip.activity.IPipActivityListener;
import org.telegram.messenger.pip.utils.Trigger;
import org.telegram.ui.ActionBar.Theme;

public class PipSourceHandlerState2 implements IPipActivityListener, IPipActivityAnimationListener {
    private PipSourceSnapshot contentBackground;
    private PipSourceSnapshot contentForeground;
    private float lastProgress;
    private float lastRadius;
    public View pictureInPicturePlaceholderView;
    public View pictureInPictureView;
    private PipSourceContentView pictureInPictureWrapperView;
    private PipSourcePlaceholder pipSourcePlaceholder;
    private final PipSource source;
    private int state = 0;
    public final Rect positionSource = new Rect();
    public final Rect position = new Rect();
    private final RectF rect = new RectF();
    private final Path path = new Path();

    public PipSourceHandlerState2(PipSource pipSource) {
        this.source = pipSource;
    }

    private void drawBackground(Canvas canvas) {
        canvas.drawColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite), (int) Math.min(this.lastProgress * 420.0f, 255.0f)));
        this.contentBackground.draw(canvas, 1.0f);
    }

    private void drawForeground(Canvas canvas) {
        this.contentForeground.draw(canvas, 1.0f - this.lastProgress);
    }

    public void lambda$performAttach$1(boolean z) {
        this.pipSourcePlaceholder.stopPlaceholderForActivity();
        Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z);
    }

    public void lambda$performPreAttach$0(boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PipSourceHandlerState2.this.performAttach();
            }
        });
    }

    public void lambda$performPreDetach1$2(boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PipSourceHandlerState2.this.performPreDetach2();
            }
        });
    }

    public void lambda$performPreDetach2$3(boolean z) {
        Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z);
        final PipSourcePlaceholder pipSourcePlaceholder = this.pipSourcePlaceholder;
        Objects.requireNonNull(pipSourcePlaceholder);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PipSourcePlaceholder.this.stopPlaceholderForSource();
            }
        });
    }

    public void lambda$performPreDetach2$4(boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PipSourceHandlerState2.this.performDetach();
            }
        });
    }

    public void performAttach() {
        if (this.state != 1) {
            throw new IllegalStateException("wrong pip state");
        }
        Log.i("PIP_DEBUG", "[HANDLER] attach");
        this.pipSourcePlaceholder.stopPlaceholderForSource();
        this.source.delegate.pipHidePrimaryWindowView(Trigger.run(new Trigger.Callback() {
            @Override
            public final void run(boolean z) {
                PipSourceHandlerState2.this.lambda$performAttach$1(z);
            }
        }, 400L));
        this.state = 2;
    }

    public void performDetach() {
        if (this.state != 4) {
            throw new IllegalStateException("wrong pip state");
        }
        this.source.controller.getPipContentView().removeView(this.pictureInPictureWrapperView);
        this.pictureInPictureView = null;
        this.pictureInPictureWrapperView = null;
        this.pictureInPicturePlaceholderView = null;
        PipSourceSnapshot pipSourceSnapshot = this.contentForeground;
        if (pipSourceSnapshot != null) {
            pipSourceSnapshot.release();
            this.contentForeground = null;
        }
        PipSourceSnapshot pipSourceSnapshot2 = this.contentBackground;
        if (pipSourceSnapshot2 != null) {
            pipSourceSnapshot2.release();
            this.contentBackground = null;
        }
        this.pipSourcePlaceholder.stopPlaceholderForActivity();
        this.state = 0;
        Log.i("PIP_DEBUG", "[HANDLER] detach");
    }

    private void performPreAttach() {
        if (this.state != 0) {
            throw new IllegalStateException("wrong pip state");
        }
        this.source.params.getPosition(this.positionSource);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + this.positionSource);
        int measuredWidth = this.source.controller.activity.getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = this.source.controller.activity.getWindow().getDecorView().getMeasuredHeight();
        Bitmap pipCreatePrimaryWindowViewBitmap = this.source.delegate.pipCreatePrimaryWindowViewBitmap();
        final IPipSourceDelegate iPipSourceDelegate = this.source.delegate;
        Objects.requireNonNull(iPipSourceDelegate);
        this.contentBackground = new PipSourceSnapshot(measuredWidth, measuredHeight, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                IPipSourceDelegate.this.pipRenderBackground((Canvas) obj);
            }
        });
        final IPipSourceDelegate iPipSourceDelegate2 = this.source.delegate;
        Objects.requireNonNull(iPipSourceDelegate2);
        this.contentForeground = new PipSourceSnapshot(measuredWidth, measuredHeight, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                IPipSourceDelegate.this.pipRenderForeground((Canvas) obj);
            }
        });
        this.pictureInPictureView = this.source.delegate.pipCreatePictureInPictureView();
        this.pictureInPicturePlaceholderView = new View(this.source.controller.activity);
        PipSourceContentView pipSourceContentView = new PipSourceContentView(this.source.controller.activity, this);
        this.pictureInPictureWrapperView = pipSourceContentView;
        pipSourceContentView.addView(this.pictureInPicturePlaceholderView);
        this.pictureInPictureWrapperView.addView(this.pictureInPictureView);
        PipSourcePlaceholder pipSourcePlaceholder = new PipSourcePlaceholder(this.pictureInPicturePlaceholderView, this.source.placeholderView);
        this.pipSourcePlaceholder = pipSourcePlaceholder;
        pipSourcePlaceholder.setPlaceholder(pipCreatePrimaryWindowViewBitmap);
        this.source.controller.getPipContentView().addView(this.pictureInPictureWrapperView);
        this.state = 1;
        this.pictureInPictureWrapperView.invalidate();
        AndroidUtilities.doOnPreDraw(this.pictureInPictureView, Trigger.run(new Trigger.Callback() {
            @Override
            public final void run(boolean z) {
                PipSourceHandlerState2.this.lambda$performPreAttach$0(z);
            }
        }, 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    private void performPreDetach1() {
        if (this.state != 2) {
            throw new IllegalStateException("wrong pip state");
        }
        this.pipSourcePlaceholder.setPlaceholder(this.source.delegate.pipCreatePictureInPictureViewBitmap());
        this.state = 3;
        this.pictureInPictureWrapperView.removeView(this.pictureInPictureView);
        this.pictureInPictureWrapperView.invalidate();
        this.pictureInPictureView = null;
        AndroidUtilities.doOnPreDraw(this.pictureInPictureWrapperView, Trigger.run(new Trigger.Callback() {
            @Override
            public final void run(boolean z) {
                PipSourceHandlerState2.this.lambda$performPreDetach1$2(z);
            }
        }, 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    public void performPreDetach2() {
        if (this.state != 3) {
            throw new IllegalStateException("wrong pip state");
        }
        this.source.delegate.pipShowPrimaryWindowView(Trigger.run(new Trigger.Callback() {
            @Override
            public final void run(boolean z) {
                PipSourceHandlerState2.this.lambda$performPreDetach2$3(z);
            }
        }, 400L));
        this.pictureInPictureWrapperView.invalidate();
        this.state = 4;
        AndroidUtilities.doOnPreDraw(this.source.contentView, Trigger.run(new Trigger.Callback() {
            @Override
            public final void run(boolean z) {
                PipSourceHandlerState2.this.lambda$performPreDetach2$4(z);
            }
        }, 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
    }

    private void rebuildPath(float f) {
        if (this.lastRadius == f) {
            return;
        }
        this.lastRadius = f;
        this.rect.set(this.position);
        this.path.reset();
        this.path.addRoundRect(this.rect, f, f, Path.Direction.CW);
        this.path.close();
    }

    public void draw(Canvas canvas, Utilities.Callback callback) {
        float f = this.source.cornerRadius * (1.0f - this.lastProgress);
        boolean z = f > 1.0f;
        drawBackground(canvas);
        if (z) {
            rebuildPath(f);
            canvas.save();
            canvas.clipPath(this.path);
        }
        callback.run(canvas);
        drawForeground(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public boolean isAttachedToPip() {
        return this.state != 0;
    }

    @Override
    public void onCompleteEnterToPip() {
        IPipActivityListener.CC.$default$onCompleteEnterToPip(this);
    }

    @Override
    public void onCompleteExitFromPip(boolean z) {
        performPreDetach1();
    }

    @Override
    public void onEnterAnimationEnd(long j) {
        IPipActivityAnimationListener.CC.$default$onEnterAnimationEnd(this, j);
    }

    @Override
    public void onEnterAnimationStart(long j) {
        IPipActivityAnimationListener.CC.$default$onEnterAnimationStart(this, j);
    }

    @Override
    public void onLeaveAnimationEnd(long j) {
        IPipActivityAnimationListener.CC.$default$onLeaveAnimationEnd(this, j);
    }

    @Override
    public void onLeaveAnimationStart(long j) {
        IPipActivityAnimationListener.CC.$default$onLeaveAnimationStart(this, j);
    }

    public void onLoseMaxPriority() {
        if (this.state == 2) {
            performPreDetach1();
        }
        this.source.controller.removePipListener(this);
        this.source.controller.removeAnimationListener(this);
        PipSource pipSource = this.source;
        pipSource.controller.removeActionListener(pipSource.tag, null);
    }

    public void onReceiveMaxPriority() {
        this.source.controller.addPipListener(this);
        this.source.controller.addAnimationListener(this);
        PipSource pipSource = this.source;
        pipSource.controller.addActionListener(pipSource.tag, null);
    }

    @Override
    public void onStartEnterToPip() {
        performPreAttach();
    }

    @Override
    public void onStartExitFromPip(boolean z) {
        IPipActivityListener.CC.$default$onStartExitFromPip(this, z);
    }

    @Override
    public void onTransitionAnimationFrame() {
        this.pictureInPictureWrapperView.invalidate();
    }

    @Override
    public void onTransitionAnimationProgress(float f) {
        this.lastProgress = f;
        this.pictureInPictureWrapperView.invalidate();
    }

    public void updatePositionViewRect(int i, int i2, boolean z) {
        if (z) {
            this.position.set(0, 0, i, i2);
        } else {
            this.position.set(this.positionSource);
        }
    }
}
