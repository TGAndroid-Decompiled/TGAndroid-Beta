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
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.uf0;
public final class eb extends FrameLayout {
    public final Rect f10840a;
    public final Rect f10841b;
    public RenderNode f10842c;
    public final sb d;

    public eb(sb sbVar, Activity activity) {
        super(activity);
        this.d = sbVar;
        this.f10840a = new Rect();
        this.f10841b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f10842c == null) {
                this.f10842c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f10842c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f10842c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f10842c.endRecording();
            org.telegram.ui.Components.la laVar = this.d.f11659r0;
            if (laVar != null) {
                laVar.g(this, this.f10842c);
            }
            canvas.drawRenderNode(this.f10842c);
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
            Rect rect = this.f10840a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f10841b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        sb sbVar = this.d;
        uf0 uf0Var = sbVar.F1;
        if (uf0Var != null) {
            hl0 hl0Var = uf0Var.e;
            hl0Var.f29009a = 0.0f;
            hl0Var.f29010b = 0.0f;
            hl0Var.f29011c = uf0Var.getMeasuredWidth();
            hl0Var.d = sbVar.F1.getMeasuredHeight();
        }
        sf0 sf0Var = sbVar.E1;
        if (sf0Var != null) {
            qw0 qw0Var = sf0Var.d;
            qw0Var.f32054a = sf0Var.getMeasuredWidth();
            qw0Var.f32055b = sbVar.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f11674v2;
        if (r02 != 0) {
            r02.j(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
