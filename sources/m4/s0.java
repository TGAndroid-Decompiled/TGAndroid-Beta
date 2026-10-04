package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class s0 implements Runnable {
    public final int f16290a = 0;
    public final int f16291b;
    public final int f16292c;
    public final Object d;
    public final Object f16293e;
    public final Object f16294f;
    public final Object h;
    public final Object f16295n;

    public s0(a1 a1Var, r rVar, g1 g1Var, a0 a0Var, int i10, int i11, z0 z0Var) {
        this.d = a1Var;
        this.f16293e = rVar;
        this.f16294f = g1Var;
        this.h = a0Var;
        this.f16291b = i10;
        this.f16292c = i11;
        this.f16295n = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f16290a) {
            case 0:
                r rVar = (r) this.f16293e;
                g1 g1Var = (g1) this.f16294f;
                a0 a0Var = (a0) this.h;
                z0 z0Var = (z0) this.f16295n;
                qi.f fVar = ((a1) this.d).f16064b;
                if (fVar.A(rVar)) {
                    int i10 = this.f16291b;
                    if (g1Var != null) {
                        if (!fVar.D(rVar, g1Var)) {
                            a1.O0(a0Var, rVar, i10, new k1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f16292c)) {
                        a1.O0(a0Var, rVar, i10, new k1(-4));
                        return;
                    }
                    z0Var.h(a0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.f16293e, (TLRPC.StickerSet) this.f16294f, this.f16291b, this.f16292c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f16295n);
                return;
        }
    }

    public s0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.f16293e = zArr;
        this.f16294f = stickerSet;
        this.f16291b = i10;
        this.f16292c = i11;
        this.h = tL_messages_stickerSet;
        this.f16295n = runnable;
    }
}
