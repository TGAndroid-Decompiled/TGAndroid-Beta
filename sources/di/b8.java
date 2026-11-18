package di;

import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b8 implements Runnable {
    public final int f8565a = 0;
    public final long f8566b;
    public final boolean f8567c;
    public final long d;
    public final Object f8568e;
    public final TLObject f8569f;

    public b8(x8 x8Var, TLObject tLObject, long j3, long j10, boolean z10) {
        this.f8568e = x8Var;
        this.f8569f = tLObject;
        this.f8566b = j3;
        this.d = j10;
        this.f8567c = z10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i7 = this.f8565a;
        TLObject tLObject = this.f8569f;
        Object obj = this.f8568e;
        switch (i7) {
            case 0:
                x8 x8Var = (x8) obj;
                int i10 = x8Var.f10015a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.f8566b;
                    int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    long j10 = this.d;
                    if (i11 != 0) {
                        x8Var.Z(-j3, j10, this.f8567c);
                        return;
                    }
                    TLRPC.UserFull d2 = mp.u1(i10).d2(j10);
                    if (d2 != null && (peerSettings = d2.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    mp.u1(i10).f25658g7.edit().putLong(a8.p0.o(j10, "dialog_bar_paying_"), 0L).apply();
                    mp.u1(i10).g3(mp.u1(i10).c2(Long.valueOf(j10)), mp.u1(i10).O0(Long.valueOf(-j10)), true);
                    org.telegram.messenger.i5.r(i10).D(true);
                    ks.f(i10).k(241, Long.valueOf(j10));
                    return;
                }
                return;
            default:
                ((tr) obj).getMessagesController().I3(this.f8566b, this.f8567c, (TLRPC.InputPeer) tLObject, this.d);
                return;
        }
    }

    public b8(tr trVar, long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f8568e = trVar;
        this.f8566b = j3;
        this.f8567c = z10;
        this.f8569f = inputPeer;
        this.d = j10;
    }
}
