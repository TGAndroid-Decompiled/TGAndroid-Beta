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
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.xf0;
public final class hb extends FrameLayout {
    public final Rect f9177a;
    public final Rect f9178b;
    public RenderNode f9179c;
    public final vb d;

    public hb(vb vbVar, Activity activity) {
        super(activity);
        this.d = vbVar;
        this.f9177a = new Rect();
        this.f9178b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f9179c == null) {
                this.f9179c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f9179c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f9179c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f9179c.endRecording();
            org.telegram.ui.Components.ja jaVar = this.d.f10018r0;
            if (jaVar != null) {
                jaVar.g(this, this.f9179c);
            }
            canvas.drawRenderNode(this.f9179c);
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
            Rect rect = this.f9177a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f9178b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        vb vbVar = this.d;
        xf0 xf0Var = vbVar.F1;
        if (xf0Var != null) {
            il0 il0Var = xf0Var.e;
            il0Var.f27364a = 0.0f;
            il0Var.f27365b = 0.0f;
            il0Var.f27366c = xf0Var.getMeasuredWidth();
            il0Var.d = vbVar.F1.getMeasuredHeight();
        }
        vf0 vf0Var = vbVar.E1;
        if (vf0Var != null) {
            iw0 iw0Var = vf0Var.d;
            iw0Var.f27465a = vf0Var.getMeasuredWidth();
            iw0Var.f27466b = vbVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f10033v2;
        if (r02 != 0) {
            r02.k(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
