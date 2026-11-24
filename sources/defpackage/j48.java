package defpackage;

import org.telegram.messenger.ImageReceiver;
public final class j48 implements Runnable {
    public final byte a;
    public final oab b;

    public j48(oab oabVar, byte b) {
        this.a = b;
        this.b = oabVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        oab oabVar = this.b;
        switch (b) {
            case 0:
                oabVar.U();
                return;
            case 1:
                oabVar.d0 = true;
                oabVar.k(true);
                return;
            case 2:
                if (oabVar.G != null) {
                    dab dabVar = oabVar.w;
                    if (dabVar != null) {
                        pi5.c = true;
                        dabVar.setLayerType(2, null);
                    }
                    oabVar.G.addListener(new x9b(oabVar, (byte) 0));
                    oabVar.G.setDuration(320L);
                    oabVar.G.setInterpolator(d53.h);
                    oabVar.G.start();
                    return;
                }
                return;
            case 3:
                oabVar.w0 = null;
                oabVar.U();
                return;
            case 4:
                oabVar.P(true);
                return;
            case 5:
                oabVar.W();
                lab labVar = oabVar.t0;
                ImageReceiver imageReceiver = labVar.b;
                if (imageReceiver != null) {
                    imageReceiver.v0(false, true);
                }
                ImageReceiver imageReceiver2 = labVar.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.v0(false, true);
                    return;
                }
                return;
            default:
                oabVar.i();
                return;
        }
    }
}
