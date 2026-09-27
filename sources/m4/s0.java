package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class s0 implements Runnable {
    public final int f14951a = 0;
    public final int f14952b;
    public final int f14953c;
    public final Object d;
    public final Object e;
    public final Object f14954f;
    public final Object h;
    public final Object f14955n;

    public s0(a1 a1Var, r rVar, g1 g1Var, a0 a0Var, int i10, int i11, z0 z0Var) {
        this.d = a1Var;
        this.e = rVar;
        this.f14954f = g1Var;
        this.h = a0Var;
        this.f14952b = i10;
        this.f14953c = i11;
        this.f14955n = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f14951a) {
            case 0:
                r rVar = (r) this.e;
                g1 g1Var = (g1) this.f14954f;
                a0 a0Var = (a0) this.h;
                z0 z0Var = (z0) this.f14955n;
                pi.f fVar = ((a1) this.d).f14741b;
                if (fVar.A(rVar)) {
                    int i10 = this.f14952b;
                    if (g1Var != null) {
                        if (!fVar.D(rVar, g1Var)) {
                            a1.O0(a0Var, rVar, i10, new k1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f14953c)) {
                        a1.O0(a0Var, rVar, i10, new k1(-4));
                        return;
                    }
                    z0Var.h(a0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f14954f, this.f14952b, this.f14953c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f14955n);
                return;
        }
    }

    public s0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f14954f = stickerSet;
        this.f14952b = i10;
        this.f14953c = i11;
        this.h = tL_messages_stickerSet;
        this.f14955n = runnable;
    }
}
