package di;

import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y7 implements Runnable {
    public final int f9789a = 0;
    public final long f9790b;
    public final boolean f9791c;
    public final long d;
    public final Object f9792e;
    public final TLObject f9793f;

    public y7(u8 u8Var, TLObject tLObject, long j3, long j10, boolean z10) {
        this.f9792e = u8Var;
        this.f9793f = tLObject;
        this.f9790b = j3;
        this.d = j10;
        this.f9791c = z10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i7 = this.f9789a;
        TLObject tLObject = this.f9793f;
        Object obj = this.f9792e;
        switch (i7) {
            case 0:
                u8 u8Var = (u8) obj;
                int i10 = u8Var.f9529a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.f9790b;
                    int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    long j10 = this.d;
                    if (i11 != 0) {
                        u8Var.a0(-j3, j10, this.f9791c);
                        return;
                    }
                    TLRPC.UserFull b22 = np.s1(i10).b2(j10);
                    if (b22 != null && (peerSettings = b22.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    np.s1(i10).f25273e7.edit().putLong(a8.p0.o(j10, "dialog_bar_paying_"), 0L).apply();
                    np.s1(i10).a3(np.s1(i10).a2(Long.valueOf(j10)), np.s1(i10).M0(Long.valueOf(-j10)), true);
                    org.telegram.messenger.g5.r(i10).D(true);
                    ns.f(i10).k(238, Long.valueOf(j10));
                    return;
                }
                return;
            default:
                ((vr) obj).getMessagesController().B3(this.f9790b, this.f9791c, (TLRPC.InputPeer) tLObject, this.d);
                return;
        }
    }

    public y7(vr vrVar, long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f9792e = vrVar;
        this.f9790b = j3;
        this.f9791c = z10;
        this.f9793f = inputPeer;
        this.d = j10;
    }
}
