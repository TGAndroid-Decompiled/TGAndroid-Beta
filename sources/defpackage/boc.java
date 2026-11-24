package defpackage;

import android.view.animation.OvershootInterpolator;
public final class boc implements Runnable {
    public final byte a;
    public final ync b;

    public boc(ync yncVar, byte b) {
        this.a = b;
        this.b = yncVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ync yncVar = this.b;
        switch (b) {
            case 0:
                yncVar.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                yncVar.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
