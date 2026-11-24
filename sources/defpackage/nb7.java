package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nb7 implements Runnable {
    public final byte a = 0;
    public final long b;
    public final long c;
    public final boolean d;
    public final Object e;
    public final TLObject f;

    public nb7(ad7 ad7Var, long j, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        this.e = ad7Var;
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
                ((ad7) obj).getMessagesController().C3(this.b, this.d, (TLRPC.InputPeer) tLObject, this.c);
                return;
            default:
                gta gtaVar = (gta) obj;
                int i = gtaVar.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j = this.b;
                    int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    long j2 = this.c;
                    if (i2 != 0) {
                        gtaVar.Z(-j, j2, this.d);
                        return;
                    }
                    TLRPC.UserFull W1 = na7.q1(i).W1(j2);
                    if (W1 != null && (peerSettings = W1.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    na7.q1(i).W3.edit().putLong(ls6.n(j2, "dialog_bar_paying_"), 0L).apply();
                    na7.q1(i).b3(na7.q1(i).V1(Long.valueOf(j2)), na7.q1(i).K0(Long.valueOf(-j2)), true);
                    qu2.r(i).D(true);
                    kk7.f(i).k(241, Long.valueOf(j2));
                    return;
                }
                return;
        }
    }

    public nb7(gta gtaVar, TLObject tLObject, long j, long j2, boolean z) {
        this.e = gtaVar;
        this.f = tLObject;
        this.b = j;
        this.c = j2;
        this.d = z;
    }
}
