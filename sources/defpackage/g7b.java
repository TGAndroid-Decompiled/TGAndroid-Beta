package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.Arrays;
public final class g7b extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final t7b d;

    public g7b(t7b t7bVar, Context context) {
        super(context);
        this.d = t7bVar;
        this.a = new Rect();
        this.b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        RecordingCanvas recordingCanvas;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && canvas.isHardwareAccelerated() && !gl.m0) {
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
            sl0 sl0Var = this.d.s0;
            if (sl0Var != null) {
                sl0Var.g(this, this.c);
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
            int L = gl.L(40.0f);
            Rect rect = this.a;
            rect.set(0, i6 - gl.L(120.0f), L, i6);
            Rect rect2 = this.b;
            rect2.set(i5 - gl.L(40.0f), i6 - gl.L(120.0f), i5, i6);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        t7b t7bVar = this.d;
        e58 e58Var = t7bVar.G1;
        if (e58Var != null) {
            l29 l29Var = e58Var.e;
            l29Var.a = 0.0f;
            l29Var.b = 0.0f;
            l29Var.c = e58Var.getMeasuredWidth();
            l29Var.d = t7bVar.G1.getMeasuredHeight();
        }
        c58 c58Var = t7bVar.F1;
        if (c58Var != null) {
            via viaVar = c58Var.d;
            viaVar.a = c58Var.getMeasuredWidth();
            viaVar.b = t7bVar.F1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p7b p7bVar = this.d.w2;
        if (p7bVar != null) {
            p7bVar.h(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
