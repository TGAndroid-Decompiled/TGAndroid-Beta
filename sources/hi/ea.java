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
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.yt0;
public final class ea extends FrameLayout {
    public final Rect f14601a;
    public final Rect f14602b;
    public RenderNode f14603c;
    public final sa d;

    public ea(sa saVar, Activity activity) {
        super(activity);
        this.d = saVar;
        this.f14601a = new Rect();
        this.f14602b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.g0.m0) {
            if (this.f14603c == null) {
                this.f14603c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f14603c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f14603c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i7 >= 31) {
            this.f14603c.endRecording();
            org.telegram.ui.Components.ca caVar = this.d.f15439s0;
            if (caVar != null) {
                caVar.g(this, this.f14603c);
            }
            canvas.drawRenderNode(this.f14603c);
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
            Rect rect = this.f14601a;
            rect.set(0, i14 - org.telegram.messenger.g0.L(120.0f), L, i14);
            Rect rect2 = this.f14602b;
            rect2.set(i13 - org.telegram.messenger.g0.L(40.0f), i14 - org.telegram.messenger.g0.L(120.0f), i13, i14);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        sa saVar = this.d;
        xd0 xd0Var = saVar.G1;
        if (xd0Var != null) {
            aj0 aj0Var = xd0Var.f42060e;
            aj0Var.f33522a = 0.0f;
            aj0Var.f33523b = 0.0f;
            aj0Var.f33524c = xd0Var.getMeasuredWidth();
            aj0Var.d = saVar.G1.getMeasuredHeight();
        }
        vd0 vd0Var = saVar.F1;
        if (vd0Var != null) {
            yt0 yt0Var = vd0Var.d;
            yt0Var.f42553a = vd0Var.getMeasuredWidth();
            yt0Var.f42554b = saVar.F1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f15454w2;
        if (r02 != 0) {
            r02.i(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
