package bi;

import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Runnable {
    public final int f4006a = 0;
    public final long f4007b;
    public final boolean f4008c;
    public final long d;
    public final Object f4009e;
    public final TLObject f4010f;

    public h9(ea eaVar, TLObject tLObject, long j3, long j10, boolean z9) {
        this.f4009e = eaVar;
        this.f4010f = tLObject;
        this.f4007b = j3;
        this.d = j10;
        this.f4008c = z9;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i7 = this.f4006a;
        TLObject tLObject = this.f4010f;
        Object obj = this.f4009e;
        switch (i7) {
            case 0:
                ea eaVar = (ea) obj;
                int i10 = eaVar.f3807a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.f4007b;
                    int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    long j10 = this.d;
                    if (i11 != 0) {
                        eaVar.a0(-j3, j10, this.f4008c);
                        return;
                    }
                    TLRPC.UserFull b22 = qp.s1(i10).b2(j10);
                    if (b22 != null && (peerSettings = b22.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    qp.s1(i10).f24764d7.edit().putLong(a8.p0.o(j10, "dialog_bar_paying_"), 0L).apply();
                    qp.s1(i10).a3(qp.s1(i10).a2(Long.valueOf(j10)), qp.s1(i10).M0(Long.valueOf(-j10)), true);
                    org.telegram.messenger.g5.r(i10).D(true);
                    qs.f(i10).k(238, Long.valueOf(j10));
                    return;
                }
                return;
            default:
                ((yr) obj).getMessagesController().B3(this.f4007b, this.f4008c, (TLRPC.InputPeer) tLObject, this.d);
                return;
        }
    }

    public h9(yr yrVar, long j3, boolean z9, TLRPC.InputPeer inputPeer, long j10) {
        this.f4009e = yrVar;
        this.f4007b = j3;
        this.f4008c = z9;
        this.f4010f = inputPeer;
        this.d = j10;
    }
}
