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
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.wv0;
public final class ac extends FrameLayout {
    public final Rect f4366a;
    public final Rect f4367b;
    public RenderNode f4368c;
    public final oc d;

    public ac(oc ocVar, Activity activity) {
        super(activity);
        this.d = ocVar;
        this.f4366a = new Rect();
        this.f4367b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f4368c == null) {
                this.f4368c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f4368c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f4368c.beginRecording();
            z10 = true;
        } else {
            recordingCanvas = canvas;
            z10 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f4368c.endRecording();
            org.telegram.ui.Components.ia iaVar = this.d.f5257r0;
            if (iaVar != null) {
                iaVar.g(this, this.f4368c);
            }
            canvas.drawRenderNode(this.f4368c);
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
            Rect rect = this.f4366a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f4367b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        oc ocVar = this.d;
        lf0 lf0Var = ocVar.F1;
        if (lf0Var != null) {
            uk0 uk0Var = lf0Var.e;
            uk0Var.f28794a = 0.0f;
            uk0Var.f28795b = 0.0f;
            uk0Var.f28796c = lf0Var.getMeasuredWidth();
            uk0Var.d = ocVar.F1.getMeasuredHeight();
        }
        jf0 jf0Var = ocVar.E1;
        if (jf0Var != null) {
            wv0 wv0Var = jf0Var.d;
            wv0Var.f30161a = jf0Var.getMeasuredWidth();
            wv0Var.f30162b = ocVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f5272v2;
        if (r02 != 0) {
            r02.m(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
