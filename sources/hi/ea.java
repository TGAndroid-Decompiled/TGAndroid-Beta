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
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.pi0;
public final class ea extends FrameLayout {
    public final Rect f14249a;
    public final Rect f14250b;
    public RenderNode f14251c;
    public final sa d;

    public ea(sa saVar, Activity activity) {
        super(activity);
        this.d = saVar;
        this.f14249a = new Rect();
        this.f14250b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.g0.m0) {
            if (this.f14251c == null) {
                this.f14251c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f14251c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f14251c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i7 >= 31) {
            this.f14251c.endRecording();
            org.telegram.ui.Components.u9 u9Var = this.d.f15093s0;
            if (u9Var != null) {
                u9Var.g(this, this.f14251c);
            }
            canvas.drawRenderNode(this.f14251c);
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
            Rect rect = this.f14249a;
            rect.set(0, i14 - org.telegram.messenger.g0.L(120.0f), L, i14);
            Rect rect2 = this.f14250b;
            rect2.set(i13 - org.telegram.messenger.g0.L(40.0f), i14 - org.telegram.messenger.g0.L(120.0f), i13, i14);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        sa saVar = this.d;
        md0 md0Var = saVar.G1;
        if (md0Var != null) {
            pi0 pi0Var = md0Var.f37230e;
            pi0Var.f38312a = 0.0f;
            pi0Var.f38313b = 0.0f;
            pi0Var.f38314c = md0Var.getMeasuredWidth();
            pi0Var.d = saVar.G1.getMeasuredHeight();
        }
        kd0 kd0Var = saVar.F1;
        if (kd0Var != null) {
            nt0 nt0Var = kd0Var.d;
            nt0Var.f37702a = kd0Var.getMeasuredWidth();
            nt0Var.f37703b = saVar.F1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f15108w2;
        if (r02 != 0) {
            r02.i(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
