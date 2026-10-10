package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class t0 implements Runnable {
    public final int f16234a = 0;
    public final int f16235b;
    public final int f16236c;
    public final Object d;
    public final Object f16237e;
    public final Object f16238f;
    public final Object h;
    public final Object f16239n;

    public t0(b1 b1Var, r rVar, h1 h1Var, b0 b0Var, int i10, int i11, a1 a1Var) {
        this.d = b1Var;
        this.f16237e = rVar;
        this.f16238f = h1Var;
        this.h = b0Var;
        this.f16235b = i10;
        this.f16236c = i11;
        this.f16239n = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f16234a) {
            case 0:
                r rVar = (r) this.f16237e;
                h1 h1Var = (h1) this.f16238f;
                b0 b0Var = (b0) this.h;
                a1 a1Var = (a1) this.f16239n;
                oi.f fVar = ((b1) this.d).f16008b;
                if (fVar.A(rVar)) {
                    int i10 = this.f16235b;
                    if (h1Var != null) {
                        if (!fVar.D(rVar, h1Var)) {
                            b1.N0(b0Var, rVar, i10, new l1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f16236c)) {
                        b1.N0(b0Var, rVar, i10, new l1(-4));
                        return;
                    }
                    a1Var.h(b0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.f16237e, (TLRPC.StickerSet) this.f16238f, this.f16235b, this.f16236c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f16239n);
                return;
        }
    }

    public t0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.f16237e = zArr;
        this.f16238f = stickerSet;
        this.f16235b = i10;
        this.f16236c = i11;
        this.h = tL_messages_stickerSet;
        this.f16239n = runnable;
    }
}
