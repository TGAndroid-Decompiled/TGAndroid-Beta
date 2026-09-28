package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class s0 implements Runnable {
    public final int f14924a = 0;
    public final int f14925b;
    public final int f14926c;
    public final Object d;
    public final Object e;
    public final Object f14927f;
    public final Object h;
    public final Object f14928n;

    public s0(a1 a1Var, r rVar, g1 g1Var, a0 a0Var, int i10, int i11, z0 z0Var) {
        this.d = a1Var;
        this.e = rVar;
        this.f14927f = g1Var;
        this.h = a0Var;
        this.f14925b = i10;
        this.f14926c = i11;
        this.f14928n = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f14924a) {
            case 0:
                r rVar = (r) this.e;
                g1 g1Var = (g1) this.f14927f;
                a0 a0Var = (a0) this.h;
                z0 z0Var = (z0) this.f14928n;
                oi.f fVar = ((a1) this.d).f14714b;
                if (fVar.A(rVar)) {
                    int i10 = this.f14925b;
                    if (g1Var != null) {
                        if (!fVar.D(rVar, g1Var)) {
                            a1.O0(a0Var, rVar, i10, new k1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f14926c)) {
                        a1.O0(a0Var, rVar, i10, new k1(-4));
                        return;
                    }
                    z0Var.h(a0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f14927f, this.f14925b, this.f14926c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f14928n);
                return;
        }
    }

    public s0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f14927f = stickerSet;
        this.f14925b = i10;
        this.f14926c = i11;
        this.h = tL_messages_stickerSet;
        this.f14928n = runnable;
    }
}
