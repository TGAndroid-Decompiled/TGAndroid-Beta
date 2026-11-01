package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tq implements Runnable {
    public final int f18295a = 0;
    public final long f18296b;
    public final long f18297c;
    public final boolean d;
    public final Object e;
    public final TLObject f18298f;

    public tq(is isVar, long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.e = isVar;
        this.f18296b = j10;
        this.d = z10;
        this.f18298f = inputPeer;
        this.f18297c = j11;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.f18295a;
        TLObject tLObject = this.f18298f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                ((is) obj).getMessagesController().y3(this.f18296b, this.d, (TLRPC.InputPeer) tLObject, this.f18297c);
                return;
            default:
                rh.e6 e6Var = (rh.e6) obj;
                int i11 = e6Var.f46863a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j10 = this.f18296b;
                    int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    long j11 = this.f18297c;
                    if (i12 != 0) {
                        e6Var.a0(-j10, j11, this.d);
                        return;
                    }
                    TLRPC.UserFull a2 = wp.r1(i11).a2(j11);
                    if (a2 != null && (peerSettings = a2.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    wp.r1(i11).e7.edit().putLong(a1.g.l(j11, "dialog_bar_paying_"), 0L).apply();
                    wp.r1(i11).Y2(wp.r1(i11).Z1(Long.valueOf(j11)), wp.r1(i11).L0(Long.valueOf(-j11)), true);
                    i5.r(i11).D(true);
                    at.f(i11).k(238, Long.valueOf(j11));
                    return;
                }
                return;
        }
    }

    public tq(rh.e6 e6Var, TLObject tLObject, long j10, long j11, boolean z10) {
        this.e = e6Var;
        this.f18298f = tLObject;
        this.f18296b = j10;
        this.f18297c = j11;
        this.d = z10;
    }
}
