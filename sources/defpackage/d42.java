package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class d42 extends r59 {
    public final byte f3;
    public final Paint g3;
    public final p42 h3;

    public d42(p42 p42Var, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.f3 = b;
        switch (b) {
            case 1:
                this.h3 = p42Var;
                super(context, ylbVar);
                this.g3 = new Paint();
                return;
            default:
                this.h3 = p42Var;
                this.g3 = new Paint();
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.f3;
        Paint paint = this.g3;
        float f = 2.1474836E9f;
        p42 p42Var = this.h3;
        switch (b) {
            case 0:
                if (p42Var.n == 2 && getChildCount() > 0) {
                    for (int i = 0; i < getChildCount(); i++) {
                        if (getChildAt(i).getY() < f) {
                            f = getChildAt(i).getY();
                        }
                    }
                    paint.setColor(cmb.w0(null, cmb.g5, false));
                }
                super.dispatchDraw(canvas);
                return;
            default:
                if (p42Var.n == 1 && getChildCount() > 0) {
                    for (int i2 = 0; i2 < getChildCount(); i2++) {
                        if (getChildAt(i2).getY() < f) {
                            f = getChildAt(i2).getY();
                        }
                    }
                    paint.setColor(cmb.w0(null, cmb.g5, false));
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 0:
                if (this.h3.n != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
