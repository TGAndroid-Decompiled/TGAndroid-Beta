package fi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.mt0;
public final class ha extends FrameLayout {
    public final Rect f12144a;
    public final Rect f12145b;
    public RenderNode f12146c;
    public final va d;

    public ha(va vaVar, Activity activity) {
        super(activity);
        this.d = vaVar;
        this.f12144a = new Rect();
        this.f12145b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        RecordingCanvas recordingCanvas;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.g0.m0) {
            if (this.f12146c == null) {
                this.f12146c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f12146c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f12146c.beginRecording();
            z9 = true;
        } else {
            z9 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z9 && i7 >= 31) {
            this.f12146c.endRecording();
            org.telegram.ui.Components.y9 y9Var = this.d.f12988r0;
            if (y9Var != null) {
                y9Var.g(this, this.f12146c);
            }
            canvas.drawRenderNode(this.f12146c);
        }
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.d.E;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (Build.VERSION.SDK_INT >= 29) {
            int i13 = i11 - i7;
            int i14 = i12 - i10;
            int L = org.telegram.messenger.g0.L(40.0f);
            Rect rect = this.f12144a;
            rect.set(0, i14 - org.telegram.messenger.g0.L(120.0f), L, i14);
            Rect rect2 = this.f12145b;
            rect2.set(i13 - org.telegram.messenger.g0.L(40.0f), i14 - org.telegram.messenger.g0.L(120.0f), i13, i14);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        va vaVar = this.d;
        ld0 ld0Var = vaVar.F1;
        if (ld0Var != null) {
            ki0 ki0Var = ld0Var.f35673e;
            ki0Var.f35339a = 0.0f;
            ki0Var.f35340b = 0.0f;
            ki0Var.f35341c = ld0Var.getMeasuredWidth();
            ki0Var.d = vaVar.F1.getMeasuredHeight();
        }
        jd0 jd0Var = vaVar.E1;
        if (jd0Var != null) {
            mt0 mt0Var = jd0Var.d;
            mt0Var.f36114a = jd0Var.getMeasuredWidth();
            mt0Var.f36115b = vaVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f13003v2;
        if (r02 != 0) {
            r02.i(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
