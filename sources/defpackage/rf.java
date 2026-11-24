package defpackage;

import org.telegram.ui.ActionBar.d;
public final class rf implements Runnable {
    public final byte a;
    public final hk b;
    public final he c;
    public final d d;

    public rf(hk hkVar, he heVar, d dVar, byte b) {
        this.a = b;
        this.b = hkVar;
        this.c = heVar;
        this.d = dVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        d dVar = this.d;
        he heVar = this.c;
        hk hkVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new rf(hkVar, heVar, dVar, (byte) 1));
                return;
            default:
                ik.b0(hkVar, heVar, dVar);
                return;
        }
    }
}
