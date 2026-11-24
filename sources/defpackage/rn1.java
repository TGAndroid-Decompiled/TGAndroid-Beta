package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class rn1 implements Runnable {
    public final byte a = 1;
    public final int b;
    public final boolean c;
    public final int d;
    public final Object e;

    public rn1(int i, int i2, String str, boolean z) {
        this.e = str;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    @Override
    public final void run() {
        long j;
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj;
                na7 messagesController = mu1Var.getMessagesController();
                long j2 = mu1Var.l6;
                if (hc2.T(mu1Var.e)) {
                    j = mu1Var.l6;
                } else {
                    j = 0;
                }
                messagesController.Z(j2, j, this.b, this.d, this.c, new vm1(mu1Var, (byte) 23));
                return;
            default:
                final String str = (String) obj;
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str;
                final int i = this.b;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
                final int i2 = this.d;
                final boolean z = this.c;
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        gl.d3(new v11(tLObject, i, z, i2, str));
                    }
                });
                return;
        }
    }

    public rn1(mu1 mu1Var, int i, int i2, boolean z) {
        this.e = mu1Var;
        this.b = i;
        this.d = i2;
        this.c = z;
    }
}
