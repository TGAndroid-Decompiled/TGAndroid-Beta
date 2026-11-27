package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class i32 extends d79 {
    public final byte f3;
    public final Paint g3;
    public final u32 h3;

    public i32(u32 u32Var, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.f3 = b;
        switch (b) {
            case 1:
                this.h3 = u32Var;
                super(context, vnbVar);
                this.g3 = new Paint();
                return;
            default:
                this.h3 = u32Var;
                this.g3 = new Paint();
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.f3;
        Paint paint = this.g3;
        float f = 2.1474836E9f;
        u32 u32Var = this.h3;
        switch (b) {
            case 0:
                if (u32Var.n == 2 && getChildCount() > 0) {
                    for (int i = 0; i < getChildCount(); i++) {
                        if (getChildAt(i).getY() < f) {
                            f = getChildAt(i).getY();
                        }
                    }
                    paint.setColor(aob.w0(null, aob.h5, false));
                }
                super.dispatchDraw(canvas);
                return;
            default:
                if (u32Var.n == 1 && getChildCount() > 0) {
                    for (int i2 = 0; i2 < getChildCount(); i2++) {
                        if (getChildAt(i2).getY() < f) {
                            f = getChildAt(i2).getY();
                        }
                    }
                    paint.setColor(aob.w0(null, aob.h5, false));
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
