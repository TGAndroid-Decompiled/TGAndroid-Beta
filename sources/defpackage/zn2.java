package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class zn2 extends FrameLayout {
    public final byte a = 0;
    public final lm b;
    public float c;
    public final Path d;
    public final fx0 e;

    public zn2(eo2 eo2Var, Context context) {
        super(context);
        this.e = eo2Var;
        this.b = new lm(250L, this, s33.h);
        this.d = new Path();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn2.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        fx0 fx0Var = this.e;
        switch (b) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((eo2) fx0Var).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((y5b) fx0Var).dismiss();
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

    public zn2(y5b y5bVar, Context context) {
        super(context);
        this.e = y5bVar;
        this.b = new lm(250L, this, s33.h);
        this.d = new Path();
    }
}
