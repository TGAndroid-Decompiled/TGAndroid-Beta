package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class lt1 extends FrameLayout {
    public float a;
    public float b;
    public final yv1 c;

    public lt1(yv1 yv1Var, Activity activity) {
        super(activity);
        this.c = yv1Var;
        setOnLongClickListener(new au(this, (byte) 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        yv1 yv1Var = this.c;
        if (view == yv1Var.O2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), gm.L(48.0f));
        }
        lka[] lkaVarArr = yv1Var.S2;
        if (view != lkaVarArr[0] && view != lkaVarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j);
            if (view == yv1Var.O2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - gm.L(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild2;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        yv1 yv1Var = this.c;
        if (yv1Var.P2) {
            int i3 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = yv1Var.W2;
                if (i3 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i3];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i3++;
                } else {
                    yv1Var.P2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.a = motionEvent.getY();
        int action = motionEvent.getAction();
        yv1 yv1Var = this.c;
        if (action == 1) {
            yv1Var.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f = this.b - this.a;
            yv1Var.movePreviewFragment(f);
            if (f < 0.0f) {
                this.b = this.a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
