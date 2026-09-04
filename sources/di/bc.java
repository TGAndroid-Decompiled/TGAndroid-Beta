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
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.ye0;
public final class bc extends FrameLayout {
    public final Rect f6970a;
    public final Rect f6971b;
    public RenderNode f6972c;
    public final pc d;

    public bc(pc pcVar, Activity activity) {
        super(activity);
        this.d = pcVar;
        this.f6970a = new Rect();
        this.f6971b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f6972c == null) {
                this.f6972c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f6972c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f6972c.beginRecording();
            z10 = true;
        } else {
            recordingCanvas = canvas;
            z10 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f6972c.endRecording();
            org.telegram.ui.Components.ja jaVar = this.d.f7896r0;
            if (jaVar != null) {
                jaVar.g(this, this.f6972c);
            }
            canvas.drawRenderNode(this.f6972c);
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
            Rect rect = this.f6970a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f6971b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        pc pcVar = this.d;
        af0 af0Var = pcVar.F1;
        if (af0Var != null) {
            hk0 hk0Var = af0Var.f24356e;
            hk0Var.f26743a = 0.0f;
            hk0Var.f26744b = 0.0f;
            hk0Var.f26745c = af0Var.getMeasuredWidth();
            hk0Var.d = pcVar.F1.getMeasuredHeight();
        }
        ye0 ye0Var = pcVar.E1;
        if (ye0Var != null) {
            iv0 iv0Var = ye0Var.d;
            iv0Var.f27271a = ye0Var.getMeasuredWidth();
            iv0Var.f27272b = pcVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f7911v2;
        if (r02 != 0) {
            r02.l(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
