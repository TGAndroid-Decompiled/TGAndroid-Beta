package defpackage;

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
public final class fbb extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final sbb d;

    public fbb(sbb sbbVar, Activity activity) {
        super(activity);
        this.d = sbbVar;
        this.a = new Rect();
        this.b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        RecordingCanvas recordingCanvas;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && canvas.isHardwareAccelerated() && !hl.m0) {
            RenderNode renderNode = this.c;
            if (renderNode == null) {
                renderNode = new RenderNode("StoryRecorder.PreviewView");
                this.c = renderNode;
            }
            renderNode.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.c.beginRecording();
            z = true;
        } else {
            z = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z && i >= 31) {
            this.c.endRecording();
            tl0 tl0Var = this.d.s0;
            if (tl0Var != null) {
                tl0Var.g(this, this.c);
            }
            canvas.drawRenderNode(this.c);
        }
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.d.F;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            int L = hl.L(40.0f);
            Rect rect = this.a;
            rect.set(0, i6 - hl.L(120.0f), L, i6);
            Rect rect2 = this.b;
            rect2.set(i5 - hl.L(40.0f), i6 - hl.L(120.0f), i5, i6);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        sbb sbbVar = this.d;
        v88 v88Var = sbbVar.G1;
        if (v88Var != null) {
            a69 a69Var = v88Var.e;
            a69Var.a = 0.0f;
            a69Var.b = 0.0f;
            a69Var.c = v88Var.getMeasuredWidth();
            a69Var.d = sbbVar.G1.getMeasuredHeight();
        }
        t88 t88Var = sbbVar.F1;
        if (t88Var != null) {
            qma qmaVar = t88Var.d;
            qmaVar.a = t88Var.getMeasuredWidth();
            qmaVar.b = sbbVar.F1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        obb obbVar = this.d.w2;
        if (obbVar != null) {
            obbVar.h(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
