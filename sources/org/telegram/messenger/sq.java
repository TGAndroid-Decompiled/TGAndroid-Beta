package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sq implements Runnable {
    public final int f17944a = 0;
    public final long f17945b;
    public final long f17946c;
    public final boolean d;
    public final Object e;
    public final TLObject f17947f;

    public sq(hs hsVar, long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.e = hsVar;
        this.f17945b = j10;
        this.d = z10;
        this.f17947f = inputPeer;
        this.f17946c = j11;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.f17944a;
        TLObject tLObject = this.f17947f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                ((hs) obj).getMessagesController().y3(this.f17945b, this.d, (TLRPC.InputPeer) tLObject, this.f17946c);
                return;
            default:
                rh.e6 e6Var = (rh.e6) obj;
                int i11 = e6Var.f46849a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j10 = this.f17945b;
                    int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    long j11 = this.f17946c;
                    if (i12 != 0) {
                        e6Var.a0(-j10, j11, this.d);
                        return;
                    }
                    TLRPC.UserFull a2 = vp.r1(i11).a2(j11);
                    if (a2 != null && (peerSettings = a2.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    vp.r1(i11).e7.edit().putLong(a1.g.l(j11, "dialog_bar_paying_"), 0L).apply();
                    vp.r1(i11).Y2(vp.r1(i11).Z1(Long.valueOf(j11)), vp.r1(i11).L0(Long.valueOf(-j11)), true);
                    i5.r(i11).D(true);
                    zs.f(i11).k(238, Long.valueOf(j11));
                    return;
                }
                return;
        }
    }

    public sq(rh.e6 e6Var, TLObject tLObject, long j10, long j11, boolean z10) {
        this.e = e6Var;
        this.f17947f = tLObject;
        this.f17945b = j10;
        this.f17946c = j11;
        this.d = z10;
    }
}
