package bi;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.tv0;
public final class kd extends FrameLayout {
    public final Rect f3019a;
    public final Rect f3020b;
    public RenderNode f3021c;
    public final ce d;

    public kd(ce ceVar, Activity activity) {
        super(activity);
        this.d = ceVar;
        this.f3019a = new Rect();
        this.f3020b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f3021c == null) {
                this.f3021c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f3021c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f3021c.beginRecording();
            z10 = true;
        } else {
            recordingCanvas = canvas;
            z10 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f3021c.endRecording();
            org.telegram.ui.Components.ia iaVar = this.d.f2484r0;
            if (iaVar != null) {
                iaVar.g(this, this.f3021c);
            }
            canvas.drawRenderNode(this.f3021c);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT >= 29) {
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            int dp = AndroidUtilities.dp(40.0f);
            Rect rect = this.f3019a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f3020b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ce ceVar = this.d;
        jf0 jf0Var = ceVar.F1;
        if (jf0Var != null) {
            rk0 rk0Var = jf0Var.e;
            rk0Var.f26681a = 0.0f;
            rk0Var.f26682b = 0.0f;
            rk0Var.f26683c = jf0Var.getMeasuredWidth();
            rk0Var.d = ceVar.F1.getMeasuredHeight();
        }
        hf0 hf0Var = ceVar.E1;
        if (hf0Var != null) {
            tv0 tv0Var = hf0Var.d;
            tv0Var.f27499a = hf0Var.getMeasuredWidth();
            tv0Var.f27500b = ceVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f2499v2;
        if (r02 != 0) {
            r02.k(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
