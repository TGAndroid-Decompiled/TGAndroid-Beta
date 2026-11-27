package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class no1 implements Runnable {
    public final byte a = 1;
    public final int b;
    public final boolean c;
    public final int d;
    public final Object e;

    public no1(int i, int i2, String str, boolean z) {
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
                zu1 zu1Var = (zu1) obj;
                uc7 messagesController = zu1Var.getMessagesController();
                long j2 = zu1Var.l6;
                if (xc2.T(zu1Var.e)) {
                    j = zu1Var.l6;
                } else {
                    j = 0;
                }
                messagesController.b0(j2, j, this.b, this.d, this.c, new gn1(zu1Var, (byte) 22));
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
                        hl.c3(new e21(tLObject, i, z, i2, str));
                    }
                });
                return;
        }
    }

    public no1(zu1 zu1Var, int i, int i2, boolean z) {
        this.e = zu1Var;
        this.b = i;
        this.d = i2;
        this.c = z;
    }
}
