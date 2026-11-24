package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class r28 extends uob {
    public final byte I = 1;

    public r28(Context context, tk5 tk5Var, int i) {
        super(context, tk5Var, i);
    }

    public final void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.I) {
            case 0:
                if (canvas.isHardwareAccelerated()) {
                    super.draw(canvas);
                    return;
                } else {
                    agc.a(canvas, this, new ci7(this, (byte) 10));
                    return;
                }
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.I) {
            case 1:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public r28(Context context, tk5 tk5Var, int i, long j, ylb ylbVar) {
        super(context, tk5Var, i, j, ylbVar);
    }
}
