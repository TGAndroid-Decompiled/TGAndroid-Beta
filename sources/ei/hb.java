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
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.uf0;
public final class hb extends FrameLayout {
    public final Rect f9166a;
    public final Rect f9167b;
    public RenderNode f9168c;
    public final vb d;

    public hb(vb vbVar, Activity activity) {
        super(activity);
        this.d = vbVar;
        this.f9166a = new Rect();
        this.f9167b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f9168c == null) {
                this.f9168c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f9168c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f9168c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f9168c.endRecording();
            org.telegram.ui.Components.ja jaVar = this.d.f10001r0;
            if (jaVar != null) {
                jaVar.g(this, this.f9168c);
            }
            canvas.drawRenderNode(this.f9168c);
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
            Rect rect = this.f9166a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f9167b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        vb vbVar = this.d;
        uf0 uf0Var = vbVar.F1;
        if (uf0Var != null) {
            fl0 fl0Var = uf0Var.e;
            fl0Var.f26275a = 0.0f;
            fl0Var.f26276b = 0.0f;
            fl0Var.f26277c = uf0Var.getMeasuredWidth();
            fl0Var.d = vbVar.F1.getMeasuredHeight();
        }
        sf0 sf0Var = vbVar.E1;
        if (sf0Var != null) {
            fw0 fw0Var = sf0Var.d;
            fw0Var.f26431a = sf0Var.getMeasuredWidth();
            fw0Var.f26432b = vbVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f10016v2;
        if (r02 != 0) {
            r02.l(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
