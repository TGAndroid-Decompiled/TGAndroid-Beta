package ci;

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
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.ye0;
public final class xb extends FrameLayout {
    public final Rect f5849a;
    public final Rect f5850b;
    public RenderNode f5851c;
    public final lc d;

    public xb(lc lcVar, Activity activity) {
        super(activity);
        this.d = lcVar;
        this.f5849a = new Rect();
        this.f5850b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f5851c == null) {
                this.f5851c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f5851c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f5851c.beginRecording();
            z10 = true;
        } else {
            recordingCanvas = canvas;
            z10 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f5851c.endRecording();
            org.telegram.ui.Components.ja jaVar = this.d.f5080r0;
            if (jaVar != null) {
                jaVar.g(this, this.f5851c);
            }
            canvas.drawRenderNode(this.f5851c);
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
            Rect rect = this.f5849a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f5850b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        lc lcVar = this.d;
        af0 af0Var = lcVar.F1;
        if (af0Var != null) {
            ik0 ik0Var = af0Var.e;
            ik0Var.f24988a = 0.0f;
            ik0Var.f24989b = 0.0f;
            ik0Var.f24990c = af0Var.getMeasuredWidth();
            ik0Var.d = lcVar.F1.getMeasuredHeight();
        }
        ye0 ye0Var = lcVar.E1;
        if (ye0Var != null) {
            jv0 jv0Var = ye0Var.d;
            jv0Var.f25428a = ye0Var.getMeasuredWidth();
            jv0Var.f25429b = lcVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f5095v2;
        if (r02 != 0) {
            r02.m(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
