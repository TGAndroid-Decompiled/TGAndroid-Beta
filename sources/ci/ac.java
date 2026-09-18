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
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.ye0;
public final class ac extends FrameLayout {
    public final Rect f4367a;
    public final Rect f4368b;
    public RenderNode f4369c;
    public final oc d;

    public ac(oc ocVar, Activity activity) {
        super(activity);
        this.d = ocVar;
        this.f4367a = new Rect();
        this.f4368b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f4369c == null) {
                this.f4369c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f4369c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f4369c.beginRecording();
            z10 = true;
        } else {
            recordingCanvas = canvas;
            z10 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f4369c.endRecording();
            org.telegram.ui.Components.ha haVar = this.d.f5258r0;
            if (haVar != null) {
                haVar.g(this, this.f4369c);
            }
            canvas.drawRenderNode(this.f4369c);
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
            Rect rect = this.f4367a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f4368b;
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
            ik0 ik0Var = af0Var.e;
            ik0Var.f24953a = 0.0f;
            ik0Var.f24954b = 0.0f;
            ik0Var.f24955c = af0Var.getMeasuredWidth();
            ik0Var.d = ocVar.F1.getMeasuredHeight();
        }
        ye0 ye0Var = ocVar.E1;
        if (ye0Var != null) {
            kv0 kv0Var = ye0Var.d;
            kv0Var.f25698a = ye0Var.getMeasuredWidth();
            kv0Var.f25699b = ocVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f5273v2;
        if (r02 != 0) {
            r02.m(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
