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
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.wv0;
public final class wb extends FrameLayout {
    public final Rect f5803a;
    public final Rect f5804b;
    public RenderNode f5805c;
    public final kc d;

    public wb(kc kcVar, Activity activity) {
        super(activity);
        this.d = kcVar;
        this.f5803a = new Rect();
        this.f5804b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f5805c == null) {
                this.f5805c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f5805c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f5805c.beginRecording();
            z10 = true;
        } else {
            recordingCanvas = canvas;
            z10 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f5805c.endRecording();
            org.telegram.ui.Components.ja jaVar = this.d.f5036r0;
            if (jaVar != null) {
                jaVar.g(this, this.f5805c);
            }
            canvas.drawRenderNode(this.f5805c);
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
            Rect rect = this.f5803a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f5804b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        kc kcVar = this.d;
        kf0 kf0Var = kcVar.F1;
        if (kf0Var != null) {
            uk0 uk0Var = kf0Var.e;
            uk0Var.f28894a = 0.0f;
            uk0Var.f28895b = 0.0f;
            uk0Var.f28896c = kf0Var.getMeasuredWidth();
            uk0Var.d = kcVar.F1.getMeasuredHeight();
        }
        if0 if0Var = kcVar.E1;
        if (if0Var != null) {
            wv0 wv0Var = if0Var.d;
            wv0Var.f30196a = if0Var.getMeasuredWidth();
            wv0Var.f30197b = kcVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f5051v2;
        if (r02 != 0) {
            r02.m(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
