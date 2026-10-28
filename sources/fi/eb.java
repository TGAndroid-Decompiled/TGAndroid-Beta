package fi;

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
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.vf0;
public final class eb extends FrameLayout {
    public final Rect f10839a;
    public final Rect f10840b;
    public RenderNode f10841c;
    public final sb d;

    public eb(sb sbVar, Activity activity) {
        super(activity);
        this.d = sbVar;
        this.f10839a = new Rect();
        this.f10840b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f10841c == null) {
                this.f10841c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f10841c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f10841c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f10841c.endRecording();
            org.telegram.ui.Components.la laVar = this.d.f11658r0;
            if (laVar != null) {
                laVar.g(this, this.f10841c);
            }
            canvas.drawRenderNode(this.f10841c);
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
            Rect rect = this.f10839a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f10840b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        sb sbVar = this.d;
        vf0 vf0Var = sbVar.F1;
        if (vf0Var != null) {
            il0 il0Var = vf0Var.e;
            il0Var.f29381a = 0.0f;
            il0Var.f29382b = 0.0f;
            il0Var.f29383c = vf0Var.getMeasuredWidth();
            il0Var.d = sbVar.F1.getMeasuredHeight();
        }
        tf0 tf0Var = sbVar.E1;
        if (tf0Var != null) {
            rw0 rw0Var = tf0Var.d;
            rw0Var.f32392a = tf0Var.getMeasuredWidth();
            rw0Var.f32393b = sbVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f11673v2;
        if (r02 != 0) {
            r02.j(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
