package kh;

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
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.wj0;
public final class ib extends FrameLayout {
    public final Rect f15439a;
    public final Rect f15440b;
    public RenderNode f15441c;
    public final wb d;

    public ib(wb wbVar, Activity activity) {
        super(activity);
        this.d = wbVar;
        this.f15439a = new Rect();
        this.f15440b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z10;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f15441c == null) {
                this.f15441c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f15441c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f15441c.beginRecording();
            z10 = true;
        } else {
            recordingCanvas = canvas;
            z10 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i9 >= 31) {
            this.f15441c.endRecording();
            org.telegram.ui.Components.ba baVar = this.d.f16288n0;
            if (baVar != null) {
                baVar.g(this, this.f15441c);
            }
            canvas.drawRenderNode(this.f15441c);
        }
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.d.A;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (Build.VERSION.SDK_INT >= 29) {
            int i13 = i11 - i9;
            int i14 = i12 - i10;
            int dp = AndroidUtilities.dp(40.0f);
            Rect rect = this.f15439a;
            rect.set(0, i14 - AndroidUtilities.dp(120.0f), dp, i14);
            Rect rect2 = this.f15440b;
            rect2.set(i13 - AndroidUtilities.dp(40.0f), i14 - AndroidUtilities.dp(120.0f), i13, i14);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        wb wbVar = this.d;
        he0 he0Var = wbVar.B1;
        if (he0Var != null) {
            wj0 wj0Var = he0Var.f29058e;
            wj0Var.f34233a = 0.0f;
            wj0Var.f34234b = 0.0f;
            wj0Var.f34235c = he0Var.getMeasuredWidth();
            wj0Var.d = wbVar.B1.getMeasuredHeight();
        }
        fe0 fe0Var = wbVar.A1;
        if (fe0Var != null) {
            qu0 qu0Var = fe0Var.d;
            qu0Var.f32026a = fe0Var.getMeasuredWidth();
            qu0Var.f32027b = wbVar.A1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f16303r2;
        if (r02 != 0) {
            r02.m(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
