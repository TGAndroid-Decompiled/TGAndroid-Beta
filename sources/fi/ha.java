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
import org.telegram.ui.Components.nt0;
public final class ha extends FrameLayout {
    public final Rect f12151a;
    public final Rect f12152b;
    public RenderNode f12153c;
    public final va d;

    public ha(va vaVar, Activity activity) {
        super(activity);
        this.d = vaVar;
        this.f12151a = new Rect();
        this.f12152b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        RecordingCanvas recordingCanvas;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.g0.m0) {
            if (this.f12153c == null) {
                this.f12153c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f12153c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f12153c.beginRecording();
            z9 = true;
        } else {
            z9 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z9 && i7 >= 31) {
            this.f12153c.endRecording();
            org.telegram.ui.Components.x9 x9Var = this.d.f12990r0;
            if (x9Var != null) {
                x9Var.g(this, this.f12153c);
            }
            canvas.drawRenderNode(this.f12153c);
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
            Rect rect = this.f12151a;
            rect.set(0, i14 - org.telegram.messenger.g0.L(120.0f), L, i14);
            Rect rect2 = this.f12152b;
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
            ki0 ki0Var = ld0Var.f35657e;
            ki0Var.f35353a = 0.0f;
            ki0Var.f35354b = 0.0f;
            ki0Var.f35355c = ld0Var.getMeasuredWidth();
            ki0Var.d = vaVar.F1.getMeasuredHeight();
        }
        jd0 jd0Var = vaVar.E1;
        if (jd0Var != null) {
            nt0 nt0Var = jd0Var.d;
            nt0Var.f36392a = jd0Var.getMeasuredWidth();
            nt0Var.f36393b = vaVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f13005v2;
        if (r02 != 0) {
            r02.i(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
