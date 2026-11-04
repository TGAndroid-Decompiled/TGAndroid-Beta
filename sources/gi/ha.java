package gi;

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
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.ni0;
public final class ha extends FrameLayout {
    public final Rect f12923a;
    public final Rect f12924b;
    public RenderNode f12925c;
    public final va d;

    public ha(va vaVar, Activity activity) {
        super(activity);
        this.d = vaVar;
        this.f12923a = new Rect();
        this.f12924b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.g0.m0) {
            if (this.f12925c == null) {
                this.f12925c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f12925c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f12925c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i3 >= 31) {
            this.f12925c.endRecording();
            org.telegram.ui.Components.x9 x9Var = this.d.f13756s0;
            if (x9Var != null) {
                x9Var.g(this, this.f12925c);
            }
            canvas.drawRenderNode(this.f12925c);
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (Build.VERSION.SDK_INT >= 29) {
            int i13 = i11 - i3;
            int i14 = i12 - i10;
            int L = org.telegram.messenger.g0.L(40.0f);
            Rect rect = this.f12923a;
            rect.set(0, i14 - org.telegram.messenger.g0.L(120.0f), L, i14);
            Rect rect2 = this.f12924b;
            rect2.set(i13 - org.telegram.messenger.g0.L(40.0f), i14 - org.telegram.messenger.g0.L(120.0f), i13, i14);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        va vaVar = this.d;
        gd0 gd0Var = vaVar.G1;
        if (gd0Var != null) {
            ni0 ni0Var = gd0Var.f34063e;
            ni0Var.f36563a = 0.0f;
            ni0Var.f36564b = 0.0f;
            ni0Var.f36565c = gd0Var.getMeasuredWidth();
            ni0Var.d = vaVar.G1.getMeasuredHeight();
        }
        ed0 ed0Var = vaVar.F1;
        if (ed0Var != null) {
            lt0 lt0Var = ed0Var.d;
            lt0Var.f35877a = ed0Var.getMeasuredWidth();
            lt0Var.f35878b = vaVar.F1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f13771w2;
        if (r02 != 0) {
            r02.j(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
