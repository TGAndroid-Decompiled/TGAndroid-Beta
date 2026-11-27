package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class f57 extends b8 {
    public final byte W;

    public f57(Context context, int i, boolean z, boolean z2, vnb vnbVar, byte b) {
        super(i, vnbVar, context, z, z2);
        this.W = b;
    }

    @Override
    public final void l() {
        switch (this.W) {
            case 0:
                setBackground(null);
                return;
            default:
                setBackground(null);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W) {
            case 0:
                if (getVisibility() == 0 && getAlpha() >= 0.5f) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            default:
                if (getVisibility() == 0 && getAlpha() >= 0.5f) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
