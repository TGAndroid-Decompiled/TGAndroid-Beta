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
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.ye0;
public final class ac extends FrameLayout {
    public final Rect f4364a;
    public final Rect f4365b;
    public RenderNode f4366c;
    public final oc d;

    public ac(oc ocVar, Activity activity) {
        super(activity);
        this.d = ocVar;
        this.f4364a = new Rect();
        this.f4365b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f4366c == null) {
                this.f4366c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f4366c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f4366c.beginRecording();
            z10 = true;
        } else {
            recordingCanvas = canvas;
            z10 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f4366c.endRecording();
            org.telegram.ui.Components.ha haVar = this.d.f5255r0;
            if (haVar != null) {
                haVar.g(this, this.f4366c);
            }
            canvas.drawRenderNode(this.f4366c);
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
            Rect rect = this.f4364a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f4365b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        oc ocVar = this.d;
        af0 af0Var = ocVar.F1;
        if (af0Var != null) {
            hk0 hk0Var = af0Var.e;
            hk0Var.f24712a = 0.0f;
            hk0Var.f24713b = 0.0f;
            hk0Var.f24714c = af0Var.getMeasuredWidth();
            hk0Var.d = ocVar.F1.getMeasuredHeight();
        }
        ye0 ye0Var = ocVar.E1;
        if (ye0Var != null) {
            jv0 jv0Var = ye0Var.d;
            jv0Var.f25440a = ye0Var.getMeasuredWidth();
            jv0Var.f25441b = ocVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f5270v2;
        if (r02 != 0) {
            r02.m(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
