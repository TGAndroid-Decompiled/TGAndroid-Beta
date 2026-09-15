package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class x0 implements Runnable {
    public final int f14717a = 0;
    public final int f14718b;
    public final int f14719c;
    public final Object d;
    public final Object e;
    public final Object f14720f;
    public final Object h;
    public final Object f14721n;

    public x0(g1 g1Var, r rVar, m1 m1Var, a0 a0Var, int i10, int i11, f1 f1Var) {
        this.d = g1Var;
        this.e = rVar;
        this.f14720f = m1Var;
        this.h = a0Var;
        this.f14718b = i10;
        this.f14719c = i11;
        this.f14721n = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f14717a) {
            case 0:
                r rVar = (r) this.e;
                m1 m1Var = (m1) this.f14720f;
                a0 a0Var = (a0) this.h;
                f1 f1Var = (f1) this.f14721n;
                ni.f fVar = ((g1) this.d).f14538b;
                if (fVar.A(rVar)) {
                    int i10 = this.f14718b;
                    if (m1Var != null) {
                        if (!fVar.D(rVar, m1Var)) {
                            g1.O0(a0Var, rVar, i10, new q1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f14719c)) {
                        g1.O0(a0Var, rVar, i10, new q1(-4));
                        return;
                    }
                    f1Var.h(a0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f14720f, this.f14718b, this.f14719c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f14721n);
                return;
        }
    }

    public x0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f14720f = stickerSet;
        this.f14718b = i10;
        this.f14719c = i11;
        this.h = tL_messages_stickerSet;
        this.f14721n = runnable;
    }
}
