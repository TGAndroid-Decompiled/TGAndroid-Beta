package di;

import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f9839a = 0;
    public final long f9840b;
    public final boolean f9841c;
    public final long d;
    public final Object f9842e;
    public final TLObject f9843f;

    public z7(v8 v8Var, TLObject tLObject, long j3, long j10, boolean z10) {
        this.f9842e = v8Var;
        this.f9843f = tLObject;
        this.f9840b = j3;
        this.d = j10;
        this.f9841c = z10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i7 = this.f9839a;
        TLObject tLObject = this.f9843f;
        Object obj = this.f9842e;
        switch (i7) {
            case 0:
                v8 v8Var = (v8) obj;
                int i10 = v8Var.f9598a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.f9840b;
                    int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    long j10 = this.d;
                    if (i11 != 0) {
                        v8Var.a0(-j3, j10, this.f9841c);
                        return;
                    }
                    TLRPC.UserFull b22 = np.s1(i10).b2(j10);
                    if (b22 != null && (peerSettings = b22.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    np.s1(i10).f25270e7.edit().putLong(a8.p0.o(j10, "dialog_bar_paying_"), 0L).apply();
                    np.s1(i10).a3(np.s1(i10).a2(Long.valueOf(j10)), np.s1(i10).M0(Long.valueOf(-j10)), true);
                    org.telegram.messenger.g5.r(i10).D(true);
                    ns.f(i10).k(238, Long.valueOf(j10));
                    return;
                }
                return;
            default:
                ((vr) obj).getMessagesController().B3(this.f9840b, this.f9841c, (TLRPC.InputPeer) tLObject, this.d);
                return;
        }
    }

    public z7(vr vrVar, long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f9842e = vrVar;
        this.f9840b = j3;
        this.f9841c = z10;
        this.f9843f = inputPeer;
        this.d = j10;
    }
}
