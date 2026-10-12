package di;

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
import org.telegram.ui.Components.xf0;
import org.telegram.ui.Components.zf0;
public final class wb extends FrameLayout {
    public final Rect f8068a;
    public final Rect f8069b;
    public RenderNode f8070c;
    public final kc d;

    public wb(kc kcVar, Activity activity) {
        super(activity);
        this.d = kcVar;
        this.f8068a = new Rect();
        this.f8069b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f8070c == null) {
                this.f8070c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f8070c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f8070c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f8070c.endRecording();
            org.telegram.ui.Components.la laVar = this.d.f7288r0;
            if (laVar != null) {
                laVar.g(this, this.f8070c);
            }
            canvas.drawRenderNode(this.f8070c);
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
            Rect rect = this.f8068a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f8069b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        kc kcVar = this.d;
        zf0 zf0Var = kcVar.F1;
        if (zf0Var != null) {
            il0 il0Var = zf0Var.e;
            il0Var.f25990a = 0.0f;
            il0Var.f25991b = 0.0f;
            il0Var.f25992c = zf0Var.getMeasuredWidth();
            il0Var.d = kcVar.F1.getMeasuredHeight();
        }
        xf0 xf0Var = kcVar.E1;
        if (xf0Var != null) {
            iw0 iw0Var = xf0Var.d;
            iw0Var.f26116a = xf0Var.getMeasuredWidth();
            iw0Var.f26117b = kcVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f7303v2;
        if (r02 != 0) {
            r02.l(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
