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
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sw0;
public final class xb extends FrameLayout {
    public final Rect f6321a;
    public final Rect f6322b;
    public RenderNode f6323c;
    public final lc d;

    public xb(lc lcVar, Activity activity) {
        super(activity);
        this.d = lcVar;
        this.f6321a = new Rect();
        this.f6322b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f6323c == null) {
                this.f6323c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f6323c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f6323c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f6323c.endRecording();
            org.telegram.ui.Components.la laVar = this.d.f5511r0;
            if (laVar != null) {
                laVar.g(this, this.f6323c);
            }
            canvas.drawRenderNode(this.f6323c);
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
            Rect rect = this.f6321a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f6322b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        lc lcVar = this.d;
        fg0 fg0Var = lcVar.F1;
        if (fg0Var != null) {
            sl0 sl0Var = fg0Var.f26062e;
            sl0Var.f30587a = 0.0f;
            sl0Var.f30588b = 0.0f;
            sl0Var.f30589c = fg0Var.getMeasuredWidth();
            sl0Var.d = lcVar.F1.getMeasuredHeight();
        }
        dg0 dg0Var = lcVar.E1;
        if (dg0Var != null) {
            sw0 sw0Var = dg0Var.d;
            sw0Var.f30696a = dg0Var.getMeasuredWidth();
            sw0Var.f30697b = lcVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f5526v2;
        if (r02 != 0) {
            r02.m(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
