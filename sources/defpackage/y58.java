package defpackage;

import org.telegram.messenger.ImageReceiver;
public final class y58 implements Runnable {
    public final byte a;
    public final lcb b;

    public y58(lcb lcbVar, byte b) {
        this.a = b;
        this.b = lcbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lcb lcbVar = this.b;
        switch (b) {
            case 0:
                lcbVar.U();
                return;
            case 1:
                lcbVar.d0 = true;
                lcbVar.k(true);
                return;
            case 2:
                if (lcbVar.G != null) {
                    acb acbVar = lcbVar.w;
                    if (acbVar != null) {
                        si5.c = true;
                        acbVar.setLayerType(2, null);
                    }
                    lcbVar.G.addListener(new ubb(lcbVar, (byte) 0));
                    lcbVar.G.setDuration(320L);
                    lcbVar.G.setInterpolator(k43.h);
                    lcbVar.G.start();
                    return;
                }
                return;
            case 3:
                lcbVar.w0 = null;
                lcbVar.U();
                return;
            case 4:
                lcbVar.P(true);
                return;
            case 5:
                lcbVar.W();
                icb icbVar = lcbVar.t0;
                ImageReceiver imageReceiver = icbVar.b;
                if (imageReceiver != null) {
                    imageReceiver.v0(false, true);
                }
                ImageReceiver imageReceiver2 = icbVar.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.v0(false, true);
                    return;
                }
                return;
            default:
                lcbVar.i();
                return;
        }
    }
}
