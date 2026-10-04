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
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.uk0;
public final class wb extends FrameLayout {
    public final Rect f6251a;
    public final Rect f6252b;
    public RenderNode f6253c;
    public final kc d;

    public wb(kc kcVar, Activity activity) {
        super(activity);
        this.d = kcVar;
        this.f6251a = new Rect();
        this.f6252b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f6253c == null) {
                this.f6253c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f6253c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f6253c.beginRecording();
            z10 = true;
        } else {
            recordingCanvas = canvas;
            z10 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f6253c.endRecording();
            org.telegram.ui.Components.ka kaVar = this.d.f5429r0;
            if (kaVar != null) {
                kaVar.g(this, this.f6253c);
            }
            canvas.drawRenderNode(this.f6253c);
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
            Rect rect = this.f6251a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f6252b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        kc kcVar = this.d;
        mf0 mf0Var = kcVar.F1;
        if (mf0Var != null) {
            uk0 uk0Var = mf0Var.f28615e;
            uk0Var.f31394a = 0.0f;
            uk0Var.f31395b = 0.0f;
            uk0Var.f31396c = mf0Var.getMeasuredWidth();
            uk0Var.d = kcVar.F1.getMeasuredHeight();
        }
        kf0 kf0Var = kcVar.E1;
        if (kf0Var != null) {
            fw0 fw0Var = kf0Var.d;
            fw0Var.f26590a = kf0Var.getMeasuredWidth();
            fw0Var.f26591b = kcVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f5444v2;
        if (r02 != 0) {
            r02.k(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
