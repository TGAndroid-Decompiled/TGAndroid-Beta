package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od7 implements Runnable {
    public final byte a = 0;
    public final long b;
    public final long c;
    public final boolean d;
    public final Object e;
    public final TLObject f;

    public od7(cf7 cf7Var, long j, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        this.e = cf7Var;
        this.b = j;
        this.d = z;
        this.f = inputPeer;
        this.c = j2;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        byte b = this.a;
        TLObject tLObject = this.f;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((cf7) obj).getMessagesController().F3(this.b, this.d, (TLRPC.InputPeer) tLObject, this.c);
                return;
            default:
                jva jvaVar = (jva) obj;
                int i = jvaVar.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j = this.b;
                    int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    long j2 = this.c;
                    if (i2 != 0) {
                        jvaVar.Z(-j, j2, this.d);
                        return;
                    }
                    TLRPC.UserFull X1 = oc7.r1(i).X1(j2);
                    if (X1 != null && (peerSettings = X1.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    oc7.r1(i).W3.edit().putLong(kt6.n(j2, "dialog_bar_paying_"), 0L).apply();
                    oc7.r1(i).e3(oc7.r1(i).W1(Long.valueOf(j2)), oc7.r1(i).L0(Long.valueOf(-j2)), true);
                    bw2.r(i).D(true);
                    nm7.f(i).k(242, Long.valueOf(j2));
                    return;
                }
                return;
        }
    }

    public od7(jva jvaVar, TLObject tLObject, long j, long j2, boolean z) {
        this.e = jvaVar;
        this.f = tLObject;
        this.b = j;
        this.c = j2;
        this.d = z;
    }
}
