package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class a01 extends dx9 {
    public final byte n0;

    public a01(Context context, tnb tnbVar) {
        super(tnbVar, context, false);
        this.n0 = (byte) 3;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.n0) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return d(motionEvent);
            case 1:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return d(motionEvent);
            case 2:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return d(motionEvent);
            default:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return d(motionEvent);
        }
    }

    public a01(Context context, boolean z, ylb ylbVar, byte b) {
        super(ylbVar, context, z);
        this.n0 = b;
    }

    public a01(Context context) {
        super(context);
        this.n0 = (byte) 1;
    }
}
