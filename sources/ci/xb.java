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
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.nw0;
public final class xb extends FrameLayout {
    public final Rect f6322a;
    public final Rect f6323b;
    public RenderNode f6324c;
    public final lc d;

    public xb(lc lcVar, Activity activity) {
        super(activity);
        this.d = lcVar;
        this.f6322a = new Rect();
        this.f6323b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f6324c == null) {
                this.f6324c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f6324c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f6324c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f6324c.endRecording();
            org.telegram.ui.Components.la laVar = this.d.f5512r0;
            if (laVar != null) {
                laVar.g(this, this.f6324c);
            }
            canvas.drawRenderNode(this.f6324c);
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
            Rect rect = this.f6322a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f6323b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        lc lcVar = this.d;
        cg0 cg0Var = lcVar.F1;
        if (cg0Var != null) {
            nl0 nl0Var = cg0Var.f25350e;
            nl0Var.f29188a = 0.0f;
            nl0Var.f29189b = 0.0f;
            nl0Var.f29190c = cg0Var.getMeasuredWidth();
            nl0Var.d = lcVar.F1.getMeasuredHeight();
        }
        ag0 ag0Var = lcVar.E1;
        if (ag0Var != null) {
            nw0 nw0Var = ag0Var.d;
            nw0Var.f29302a = ag0Var.getMeasuredWidth();
            nw0Var.f29303b = lcVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f5527v2;
        if (r02 != 0) {
            r02.m(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
