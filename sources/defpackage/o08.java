package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class o08 extends tmb {
    public final byte I = 1;

    public o08(Context context, ui5 ui5Var, int i) {
        super(context, ui5Var, i);
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
                    zdc.a(canvas, this, new zf7(this, (byte) 10));
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

    public o08(Context context, ui5 ui5Var, int i, long j, wjb wjbVar) {
        super(context, ui5Var, i, j, wjbVar);
    }
}
