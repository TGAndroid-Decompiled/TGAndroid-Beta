package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class s0 implements Runnable {
    public final int f16295a = 0;
    public final int f16296b;
    public final int f16297c;
    public final Object d;
    public final Object f16298e;
    public final Object f16299f;
    public final Object h;
    public final Object f16300n;

    public s0(a1 a1Var, r rVar, g1 g1Var, a0 a0Var, int i10, int i11, z0 z0Var) {
        this.d = a1Var;
        this.f16298e = rVar;
        this.f16299f = g1Var;
        this.h = a0Var;
        this.f16296b = i10;
        this.f16297c = i11;
        this.f16300n = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f16295a) {
            case 0:
                r rVar = (r) this.f16298e;
                g1 g1Var = (g1) this.f16299f;
                a0 a0Var = (a0) this.h;
                z0 z0Var = (z0) this.f16300n;
                qi.f fVar = ((a1) this.d).f16069b;
                if (fVar.A(rVar)) {
                    int i10 = this.f16296b;
                    if (g1Var != null) {
                        if (!fVar.D(rVar, g1Var)) {
                            a1.O0(a0Var, rVar, i10, new k1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f16297c)) {
                        a1.O0(a0Var, rVar, i10, new k1(-4));
                        return;
                    }
                    z0Var.h(a0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.f16298e, (TLRPC.StickerSet) this.f16299f, this.f16296b, this.f16297c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f16300n);
                return;
        }
    }

    public s0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.f16298e = zArr;
        this.f16299f = stickerSet;
        this.f16296b = i10;
        this.f16297c = i11;
        this.h = tL_messages_stickerSet;
        this.f16300n = runnable;
    }
}
