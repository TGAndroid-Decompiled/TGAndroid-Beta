package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class x0 implements Runnable {
    public final int f14727a = 0;
    public final int f14728b;
    public final int f14729c;
    public final Object d;
    public final Object e;
    public final Object f14730f;
    public final Object h;
    public final Object f14731n;

    public x0(g1 g1Var, r rVar, m1 m1Var, a0 a0Var, int i10, int i11, f1 f1Var) {
        this.d = g1Var;
        this.e = rVar;
        this.f14730f = m1Var;
        this.h = a0Var;
        this.f14728b = i10;
        this.f14729c = i11;
        this.f14731n = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f14727a) {
            case 0:
                r rVar = (r) this.e;
                m1 m1Var = (m1) this.f14730f;
                a0 a0Var = (a0) this.h;
                f1 f1Var = (f1) this.f14731n;
                ni.f fVar = ((g1) this.d).f14548b;
                if (fVar.A(rVar)) {
                    int i10 = this.f14728b;
                    if (m1Var != null) {
                        if (!fVar.D(rVar, m1Var)) {
                            g1.O0(a0Var, rVar, i10, new q1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f14729c)) {
                        g1.O0(a0Var, rVar, i10, new q1(-4));
                        return;
                    }
                    f1Var.h(a0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f14730f, this.f14728b, this.f14729c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f14731n);
                return;
        }
    }

    public x0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f14730f = stickerSet;
        this.f14728b = i10;
        this.f14729c = i11;
        this.h = tL_messages_stickerSet;
        this.f14731n = runnable;
    }
}
