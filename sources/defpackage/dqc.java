package defpackage;

import android.view.animation.OvershootInterpolator;
public final class dqc implements Runnable {
    public final byte a;
    public final aqc b;

    public dqc(aqc aqcVar, byte b) {
        this.a = b;
        this.b = aqcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        aqc aqcVar = this.b;
        switch (b) {
            case 0:
                aqcVar.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                aqcVar.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
