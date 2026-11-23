package hi;

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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.xt0;
public final class za extends FrameLayout {
    public final Rect f15926a;
    public final Rect f15927b;
    public RenderNode f15928c;
    public final nb d;

    public za(nb nbVar, Activity activity) {
        super(activity);
        this.d = nbVar;
        this.f15926a = new Rect();
        this.f15927b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.g0.m0) {
            if (this.f15928c == null) {
                this.f15928c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f15928c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f15928c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i7 >= 31) {
            this.f15928c.endRecording();
            org.telegram.ui.Components.ba baVar = this.d.f15112s0;
            if (baVar != null) {
                baVar.g(this, this.f15928c);
            }
            canvas.drawRenderNode(this.f15928c);
        }
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.d.F;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (Build.VERSION.SDK_INT >= 29) {
            int i13 = i11 - i7;
            int i14 = i12 - i10;
            int L = org.telegram.messenger.g0.L(40.0f);
            Rect rect = this.f15926a;
            rect.set(0, i14 - org.telegram.messenger.g0.L(120.0f), L, i14);
            Rect rect2 = this.f15927b;
            rect2.set(i13 - org.telegram.messenger.g0.L(40.0f), i14 - org.telegram.messenger.g0.L(120.0f), i13, i14);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        nb nbVar = this.d;
        wd0 wd0Var = nbVar.G1;
        if (wd0Var != null) {
            aj0 aj0Var = wd0Var.f41613e;
            aj0Var.f33482a = 0.0f;
            aj0Var.f33483b = 0.0f;
            aj0Var.f33484c = wd0Var.getMeasuredWidth();
            aj0Var.d = nbVar.G1.getMeasuredHeight();
        }
        ud0 ud0Var = nbVar.F1;
        if (ud0Var != null) {
            xt0 xt0Var = ud0Var.d;
            xt0Var.f42189a = ud0Var.getMeasuredWidth();
            xt0Var.f42190b = nbVar.F1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f15127w2;
        if (r02 != 0) {
            r02.i(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
