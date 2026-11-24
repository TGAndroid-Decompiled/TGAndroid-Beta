package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class ty0 extends av9 {
    public final byte n0;

    public ty0(Context context, slb slbVar) {
        super(slbVar, context, false);
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

    public ty0(Context context, boolean z, wjb wjbVar, byte b) {
        super(wjbVar, context, z);
        this.n0 = b;
    }

    public ty0(Context context) {
        super(context);
        this.n0 = (byte) 1;
    }
}
