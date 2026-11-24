package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class lp2 extends FrameLayout {
    public final byte a = 1;
    public final ln b;
    public float c;
    public final Path d;
    public final my0 e;

    public lp2(pp2 pp2Var, Context context) {
        super(context);
        this.e = pp2Var;
        this.b = new ln(250L, this, d53.h);
        this.d = new Path();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp2.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        my0 my0Var = this.e;
        switch (b) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((pp2) my0Var).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((a8b) my0Var).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
                return;
        }
    }

    public lp2(a8b a8bVar, Context context) {
        super(context);
        this.e = a8bVar;
        this.b = new ln(250L, this, d53.h);
        this.d = new Path();
    }
}
