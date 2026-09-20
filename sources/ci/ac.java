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
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.uv0;
public final class ac extends FrameLayout {
    public final Rect f4368a;
    public final Rect f4369b;
    public RenderNode f4370c;
    public final oc d;

    public ac(oc ocVar, Activity activity) {
        super(activity);
        this.d = ocVar;
        this.f4368a = new Rect();
        this.f4369b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f4370c == null) {
                this.f4370c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f4370c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f4370c.beginRecording();
            z10 = true;
        } else {
            recordingCanvas = canvas;
            z10 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f4370c.endRecording();
            org.telegram.ui.Components.ia iaVar = this.d.f5259r0;
            if (iaVar != null) {
                iaVar.g(this, this.f4370c);
            }
            canvas.drawRenderNode(this.f4370c);
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
            Rect rect = this.f4368a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f4369b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        oc ocVar = this.d;
        if0 if0Var = ocVar.F1;
        if (if0Var != null) {
            rk0 rk0Var = if0Var.e;
            rk0Var.f27913a = 0.0f;
            rk0Var.f27914b = 0.0f;
            rk0Var.f27915c = if0Var.getMeasuredWidth();
            rk0Var.d = ocVar.F1.getMeasuredHeight();
        }
        gf0 gf0Var = ocVar.E1;
        if (gf0Var != null) {
            uv0 uv0Var = gf0Var.d;
            uv0Var.f28868a = gf0Var.getMeasuredWidth();
            uv0Var.f28869b = ocVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f5274v2;
        if (r02 != 0) {
            r02.m(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
