package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class s0 implements Runnable {
    public final int f16286a = 0;
    public final int f16287b;
    public final int f16288c;
    public final Object d;
    public final Object f16289e;
    public final Object f16290f;
    public final Object h;
    public final Object f16291n;

    public s0(a1 a1Var, r rVar, g1 g1Var, a0 a0Var, int i10, int i11, z0 z0Var) {
        this.d = a1Var;
        this.f16289e = rVar;
        this.f16290f = g1Var;
        this.h = a0Var;
        this.f16287b = i10;
        this.f16288c = i11;
        this.f16291n = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f16286a) {
            case 0:
                r rVar = (r) this.f16289e;
                g1 g1Var = (g1) this.f16290f;
                a0 a0Var = (a0) this.h;
                z0 z0Var = (z0) this.f16291n;
                qi.f fVar = ((a1) this.d).f16060b;
                if (fVar.A(rVar)) {
                    int i10 = this.f16287b;
                    if (g1Var != null) {
                        if (!fVar.D(rVar, g1Var)) {
                            a1.O0(a0Var, rVar, i10, new k1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f16288c)) {
                        a1.O0(a0Var, rVar, i10, new k1(-4));
                        return;
                    }
                    z0Var.h(a0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.f16289e, (TLRPC.StickerSet) this.f16290f, this.f16287b, this.f16288c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f16291n);
                return;
        }
    }

    public s0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.f16289e = zArr;
        this.f16290f = stickerSet;
        this.f16287b = i10;
        this.f16288c = i11;
        this.h = tL_messages_stickerSet;
        this.f16291n = runnable;
    }
}
