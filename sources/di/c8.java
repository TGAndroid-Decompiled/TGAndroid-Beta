package di;

import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c8 implements Runnable {
    public final int f8643a = 0;
    public final long f8644b;
    public final boolean f8645c;
    public final long d;
    public final Object f8646e;
    public final TLObject f8647f;

    public c8(y8 y8Var, TLObject tLObject, long j3, long j10, boolean z10) {
        this.f8646e = y8Var;
        this.f8647f = tLObject;
        this.f8644b = j3;
        this.d = j10;
        this.f8645c = z10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i7 = this.f8643a;
        TLObject tLObject = this.f8647f;
        Object obj = this.f8646e;
        switch (i7) {
            case 0:
                y8 y8Var = (y8) obj;
                int i10 = y8Var.f10085a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.f8644b;
                    int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    long j10 = this.d;
                    if (i11 != 0) {
                        y8Var.Z(-j3, j10, this.f8645c);
                        return;
                    }
                    TLRPC.UserFull d2 = np.u1(i10).d2(j10);
                    if (d2 != null && (peerSettings = d2.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    np.u1(i10).f25857g7.edit().putLong(a8.p0.o(j10, "dialog_bar_paying_"), 0L).apply();
                    np.u1(i10).g3(np.u1(i10).c2(Long.valueOf(j10)), np.u1(i10).O0(Long.valueOf(-j10)), true);
                    org.telegram.messenger.i5.r(i10).D(true);
                    ls.f(i10).k(241, Long.valueOf(j10));
                    return;
                }
                return;
            default:
                ((ur) obj).getMessagesController().I3(this.f8644b, this.f8645c, (TLRPC.InputPeer) tLObject, this.d);
                return;
        }
    }

    public c8(ur urVar, long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f8646e = urVar;
        this.f8644b = j3;
        this.f8645c = z10;
        this.f8647f = inputPeer;
        this.d = j10;
    }
}
