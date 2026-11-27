package defpackage;

import android.view.animation.OvershootInterpolator;
public final class nsc implements Runnable {
    public final byte a;
    public final ksc b;

    public nsc(ksc kscVar, byte b) {
        this.a = b;
        this.b = kscVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ksc kscVar = this.b;
        switch (b) {
            case 0:
                kscVar.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                kscVar.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
