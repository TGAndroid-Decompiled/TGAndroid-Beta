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
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.zf0;
public final class xb extends FrameLayout {
    public final Rect f6323a;
    public final Rect f6324b;
    public RenderNode f6325c;
    public final lc d;

    public xb(lc lcVar, Activity activity) {
        super(activity);
        this.d = lcVar;
        this.f6323a = new Rect();
        this.f6324b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f6325c == null) {
                this.f6325c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f6325c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f6325c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f6325c.endRecording();
            org.telegram.ui.Components.ma maVar = this.d.f5513r0;
            if (maVar != null) {
                maVar.g(this, this.f6325c);
            }
            canvas.drawRenderNode(this.f6325c);
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
            Rect rect = this.f6323a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f6324b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        lc lcVar = this.d;
        bg0 bg0Var = lcVar.F1;
        if (bg0Var != null) {
            ml0 ml0Var = bg0Var.f25006e;
            ml0Var.f28854a = 0.0f;
            ml0Var.f28855b = 0.0f;
            ml0Var.f28856c = bg0Var.getMeasuredWidth();
            ml0Var.d = lcVar.F1.getMeasuredHeight();
        }
        zf0 zf0Var = lcVar.E1;
        if (zf0Var != null) {
            mw0 mw0Var = zf0Var.d;
            mw0Var.f28963a = zf0Var.getMeasuredWidth();
            mw0Var.f28964b = lcVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f5528v2;
        if (r02 != 0) {
            r02.m(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
