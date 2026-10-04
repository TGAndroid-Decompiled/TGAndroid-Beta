package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class s0 implements Runnable {
    public final int f16285a = 0;
    public final int f16286b;
    public final int f16287c;
    public final Object d;
    public final Object f16288e;
    public final Object f16289f;
    public final Object h;
    public final Object f16290n;

    public s0(a1 a1Var, r rVar, g1 g1Var, a0 a0Var, int i10, int i11, z0 z0Var) {
        this.d = a1Var;
        this.f16288e = rVar;
        this.f16289f = g1Var;
        this.h = a0Var;
        this.f16286b = i10;
        this.f16287c = i11;
        this.f16290n = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f16285a) {
            case 0:
                r rVar = (r) this.f16288e;
                g1 g1Var = (g1) this.f16289f;
                a0 a0Var = (a0) this.h;
                z0 z0Var = (z0) this.f16290n;
                qi.f fVar = ((a1) this.d).f16059b;
                if (fVar.A(rVar)) {
                    int i10 = this.f16286b;
                    if (g1Var != null) {
                        if (!fVar.D(rVar, g1Var)) {
                            a1.O0(a0Var, rVar, i10, new k1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f16287c)) {
                        a1.O0(a0Var, rVar, i10, new k1(-4));
                        return;
                    }
                    z0Var.h(a0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.f16288e, (TLRPC.StickerSet) this.f16289f, this.f16286b, this.f16287c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f16290n);
                return;
        }
    }

    public s0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.f16288e = zArr;
        this.f16289f = stickerSet;
        this.f16286b = i10;
        this.f16287c = i11;
        this.h = tL_messages_stickerSet;
        this.f16290n = runnable;
    }
}
