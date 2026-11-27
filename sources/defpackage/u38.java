package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class u38 extends sqb {
    public final byte I = 1;

    public u38(Context context, wk5 wk5Var, int i) {
        super(context, wk5Var, i);
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
                    yhc.a(canvas, this, new ji7(this, (byte) 11));
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

    public u38(Context context, wk5 wk5Var, int i, long j, vnb vnbVar) {
        super(context, wk5Var, i, j, vnbVar);
    }
}
