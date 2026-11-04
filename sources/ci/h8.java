package ci;

import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h8 implements Runnable {
    public final int f5248a = 0;
    public final long f5249b;
    public final boolean f5250c;
    public final long d;
    public final Object f5251e;
    public final TLObject f5252f;

    public h8(e9 e9Var, TLObject tLObject, long j10, long j11, boolean z10) {
        this.f5251e = e9Var;
        this.f5252f = tLObject;
        this.f5249b = j10;
        this.d = j11;
        this.f5250c = z10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i3 = this.f5248a;
        TLObject tLObject = this.f5252f;
        Object obj = this.f5251e;
        switch (i3) {
            case 0:
                e9 e9Var = (e9) obj;
                int i10 = e9Var.f5029a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j10 = this.f5249b;
                    int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    long j11 = this.d;
                    if (i11 != 0) {
                        e9Var.a0(-j10, j11, this.f5250c);
                        return;
                    }
                    TLRPC.UserFull b22 = hp.s1(i10).b2(j11);
                    if (b22 != null && (peerSettings = b22.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    hp.s1(i10).f22989d7.edit().putLong(a1.g.p(j11, "dialog_bar_paying_"), 0L).apply();
                    hp.s1(i10).a3(hp.s1(i10).a2(Long.valueOf(j11)), hp.s1(i10).M0(Long.valueOf(-j11)), true);
                    org.telegram.messenger.g5.r(i10).D(true);
                    hs.f(i10).k(238, Long.valueOf(j11));
                    return;
                }
                return;
            default:
                ((qr) obj).getMessagesController().B3(this.f5249b, this.f5250c, (TLRPC.InputPeer) tLObject, this.d);
                return;
        }
    }

    public h8(qr qrVar, long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.f5251e = qrVar;
        this.f5249b = j10;
        this.f5250c = z10;
        this.f5252f = inputPeer;
        this.d = j11;
    }
}
