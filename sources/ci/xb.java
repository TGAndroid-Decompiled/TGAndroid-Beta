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
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.xv0;
public final class xb extends FrameLayout {
    public final Rect f5861a;
    public final Rect f5862b;
    public RenderNode f5863c;
    public final lc d;

    public xb(lc lcVar, Activity activity) {
        super(activity);
        this.d = lcVar;
        this.f5861a = new Rect();
        this.f5862b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f5863c == null) {
                this.f5863c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f5863c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f5863c.beginRecording();
            z10 = true;
        } else {
            recordingCanvas = canvas;
            z10 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f5863c.endRecording();
            org.telegram.ui.Components.ka kaVar = this.d.f5087r0;
            if (kaVar != null) {
                kaVar.g(this, this.f5863c);
            }
            canvas.drawRenderNode(this.f5863c);
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
            Rect rect = this.f5861a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f5862b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        lc lcVar = this.d;
        nf0 nf0Var = lcVar.F1;
        if (nf0Var != null) {
            vk0 vk0Var = nf0Var.e;
            vk0Var.f29132a = 0.0f;
            vk0Var.f29133b = 0.0f;
            vk0Var.f29134c = nf0Var.getMeasuredWidth();
            vk0Var.d = lcVar.F1.getMeasuredHeight();
        }
        lf0 lf0Var = lcVar.E1;
        if (lf0Var != null) {
            xv0 xv0Var = lf0Var.d;
            xv0Var.f30521a = lf0Var.getMeasuredWidth();
            xv0Var.f30522b = lcVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f5102v2;
        if (r02 != 0) {
            r02.m(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
