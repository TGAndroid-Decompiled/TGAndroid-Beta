package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qd7 implements Runnable {
    public final byte a = 0;
    public final long b;
    public final long c;
    public final boolean d;
    public final Object e;
    public final TLObject f;

    public qd7(jf7 jf7Var, long j, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        this.e = jf7Var;
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
                ((jf7) obj).getMessagesController().K3(this.b, this.d, (TLRPC.InputPeer) tLObject, this.c);
                return;
            default:
                jxa jxaVar = (jxa) obj;
                int i = jxaVar.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j = this.b;
                    int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    long j2 = this.c;
                    if (i2 != 0) {
                        jxaVar.a0(-j, j2, this.d);
                        return;
                    }
                    TLRPC.UserFull Y1 = uc7.s1(i).Y1(j2);
                    if (Y1 != null && (peerSettings = Y1.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    uc7.s1(i).W3.edit().putLong(qu6.n(j2, "dialog_bar_paying_"), 0L).apply();
                    uc7.s1(i).i3(uc7.s1(i).X1(Long.valueOf(j2)), uc7.s1(i).M0(Long.valueOf(-j2)), true);
                    lv2.r(i).D(true);
                    jn7.f(i).k(242, Long.valueOf(j2));
                    return;
                }
                return;
        }
    }

    public qd7(jxa jxaVar, TLObject tLObject, long j, long j2, boolean z) {
        this.e = jxaVar;
        this.f = tLObject;
        this.b = j;
        this.c = j2;
        this.d = z;
    }
}
