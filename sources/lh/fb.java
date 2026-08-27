package lh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.yj0;

public final class fb extends FrameLayout {

    public final Rect f16016a;

    public final Rect f16017b;

    public RenderNode f16018c;
    public final sb d;

    public fb(sb sbVar, Activity activity) {
        super(activity);
        this.d = sbVar;
        this.f16016a = new Rect();
        this.f16017b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvasBeginRecording;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 || !canvas.isHardwareAccelerated() || AndroidUtilities.makingGlobalBlurBitmap) {
            canvasBeginRecording = canvas;
            z10 = false;
        } else {
            if (this.f16018c == null) {
                this.f16018c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f16018c.setPosition(0, 0, getWidth(), getHeight());
            canvasBeginRecording = this.f16018c.beginRecording();
            z10 = true;
        }
        super.dispatchDraw(canvasBeginRecording);
        if (!z10 || i10 < 31) {
            return;
        }
        this.f16018c.endRecording();
        org.telegram.ui.Components.z9 z9Var = this.d.f16784n0;
        if (z9Var != null) {
            z9Var.g(this, this.f16018c);
        }
        canvas.drawRenderNode(this.f16018c);
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.d.A;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT >= 29) {
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            int iDp = i15 - AndroidUtilities.dp(120.0f);
            int iDp2 = AndroidUtilities.dp(40.0f);
            Rect rect = this.f16016a;
            rect.set(0, iDp, iDp2, i15);
            int iDp3 = i14 - AndroidUtilities.dp(40.0f);
            int iDp4 = i15 - AndroidUtilities.dp(120.0f);
            Rect rect2 = this.f16017b;
            rect2.set(iDp3, iDp4, i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        sb sbVar = this.d;
        me0 me0Var = sbVar.B1;
        if (me0Var != null) {
            float measuredWidth = me0Var.getMeasuredWidth();
            float measuredHeight = sbVar.B1.getMeasuredHeight();
            yj0 yj0Var = me0Var.f30659e;
            yj0Var.f34911a = 0.0f;
            yj0Var.f34912b = 0.0f;
            yj0Var.f34913c = measuredWidth;
            yj0Var.d = measuredHeight;
        }
        ke0 ke0Var = sbVar.A1;
        if (ke0Var != null) {
            float measuredWidth2 = ke0Var.getMeasuredWidth();
            float measuredHeight2 = sbVar.A1.getMeasuredHeight();
            tu0 tu0Var = ke0Var.d;
            tu0Var.f32893a = measuredWidth2;
            tu0Var.f32894b = measuredHeight2;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r10 = this.d.f16799r2;
        if (r10 == 0) {
            return super.onTouchEvent(motionEvent);
        }
        r10.n(motionEvent);
        return true;
    }
}
