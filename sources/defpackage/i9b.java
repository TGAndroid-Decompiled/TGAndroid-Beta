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
public final class i9b extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final v9b d;

    public i9b(v9b v9bVar, Activity activity) {
        super(activity);
        this.d = v9bVar;
        this.a = new Rect();
        this.b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        RecordingCanvas recordingCanvas;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && canvas.isHardwareAccelerated() && !gm.m0) {
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
            sm0 sm0Var = this.d.s0;
            if (sm0Var != null) {
                sm0Var.g(this, this.c);
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
            int L = gm.L(40.0f);
            Rect rect = this.a;
            rect.set(0, i6 - gm.L(120.0f), L, i6);
            Rect rect2 = this.b;
            rect2.set(i5 - gm.L(40.0f), i6 - gm.L(120.0f), i5, i6);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        v9b v9bVar = this.d;
        g78 g78Var = v9bVar.G1;
        if (g78Var != null) {
            o49 o49Var = g78Var.e;
            o49Var.a = 0.0f;
            o49Var.b = 0.0f;
            o49Var.c = g78Var.getMeasuredWidth();
            o49Var.d = v9bVar.G1.getMeasuredHeight();
        }
        e78 e78Var = v9bVar.F1;
        if (e78Var != null) {
            xka xkaVar = e78Var.d;
            xkaVar.a = e78Var.getMeasuredWidth();
            xkaVar.b = v9bVar.F1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r9b r9bVar = this.d.w2;
        if (r9bVar != null) {
            r9bVar.h(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
