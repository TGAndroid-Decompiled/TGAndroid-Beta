package nh;

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
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.ve0;
public final class ta extends FrameLayout {
    public final Rect f18688a;
    public final Rect f18689b;
    public RenderNode f18690c;
    public final gb d;

    public ta(gb gbVar, Activity activity) {
        super(activity);
        this.d = gbVar;
        this.f18688a = new Rect();
        this.f18689b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f18690c == null) {
                this.f18690c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f18690c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f18690c.beginRecording();
            z10 = true;
        } else {
            recordingCanvas = canvas;
            z10 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f18690c.endRecording();
            org.telegram.ui.Components.ga gaVar = this.d.f17778n0;
            if (gaVar != null) {
                gaVar.g(this, this.f18690c);
            }
            canvas.drawRenderNode(this.f18690c);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT >= 29) {
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            int dp = AndroidUtilities.dp(40.0f);
            Rect rect = this.f18688a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f18689b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        gb gbVar = this.d;
        ve0 ve0Var = gbVar.B1;
        if (ve0Var != null) {
            hk0 hk0Var = ve0Var.f33541e;
            hk0Var.f29195a = 0.0f;
            hk0Var.f29196b = 0.0f;
            hk0Var.f29197c = ve0Var.getMeasuredWidth();
            hk0Var.d = gbVar.B1.getMeasuredHeight();
        }
        te0 te0Var = gbVar.A1;
        if (te0Var != null) {
            bv0 bv0Var = te0Var.d;
            bv0Var.f27238a = te0Var.getMeasuredWidth();
            bv0Var.f27239b = gbVar.A1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f17793r2;
        if (r02 != 0) {
            r02.l(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
