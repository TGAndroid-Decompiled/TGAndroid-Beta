package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class s0 implements Runnable {
    public final int f14909a = 0;
    public final int f14910b;
    public final int f14911c;
    public final Object d;
    public final Object e;
    public final Object f14912f;
    public final Object h;
    public final Object f14913n;

    public s0(a1 a1Var, r rVar, g1 g1Var, a0 a0Var, int i10, int i11, z0 z0Var) {
        this.d = a1Var;
        this.e = rVar;
        this.f14912f = g1Var;
        this.h = a0Var;
        this.f14910b = i10;
        this.f14911c = i11;
        this.f14913n = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f14909a) {
            case 0:
                r rVar = (r) this.e;
                g1 g1Var = (g1) this.f14912f;
                a0 a0Var = (a0) this.h;
                z0 z0Var = (z0) this.f14913n;
                oi.f fVar = ((a1) this.d).f14699b;
                if (fVar.A(rVar)) {
                    int i10 = this.f14910b;
                    if (g1Var != null) {
                        if (!fVar.D(rVar, g1Var)) {
                            a1.O0(a0Var, rVar, i10, new k1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f14911c)) {
                        a1.O0(a0Var, rVar, i10, new k1(-4));
                        return;
                    }
                    z0Var.h(a0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f14912f, this.f14910b, this.f14911c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f14913n);
                return;
        }
    }

    public s0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f14912f = stickerSet;
        this.f14910b = i10;
        this.f14911c = i11;
        this.h = tL_messages_stickerSet;
        this.f14913n = runnable;
    }
}
