package ei;

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
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.tf0;
public final class hb extends FrameLayout {
    public final Rect f9168a;
    public final Rect f9169b;
    public RenderNode f9170c;
    public final vb d;

    public hb(vb vbVar, Activity activity) {
        super(activity);
        this.d = vbVar;
        this.f9168a = new Rect();
        this.f9169b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f9170c == null) {
                this.f9170c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f9170c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f9170c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f9170c.endRecording();
            org.telegram.ui.Components.ja jaVar = this.d.f10003r0;
            if (jaVar != null) {
                jaVar.g(this, this.f9170c);
            }
            canvas.drawRenderNode(this.f9170c);
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
            Rect rect = this.f9168a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f9169b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        vb vbVar = this.d;
        tf0 tf0Var = vbVar.F1;
        if (tf0Var != null) {
            el0 el0Var = tf0Var.e;
            el0Var.f25947a = 0.0f;
            el0Var.f25948b = 0.0f;
            el0Var.f25949c = tf0Var.getMeasuredWidth();
            el0Var.d = vbVar.F1.getMeasuredHeight();
        }
        rf0 rf0Var = vbVar.E1;
        if (rf0Var != null) {
            ew0 ew0Var = rf0Var.d;
            ew0Var.f26040a = rf0Var.getMeasuredWidth();
            ew0Var.f26041b = vbVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f10018v2;
        if (r02 != 0) {
            r02.l(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
