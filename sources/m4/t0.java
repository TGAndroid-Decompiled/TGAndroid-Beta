package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class t0 implements Runnable {
    public final int f16255a = 0;
    public final int f16256b;
    public final int f16257c;
    public final Object d;
    public final Object f16258e;
    public final Object f16259f;
    public final Object h;
    public final Object f16260n;

    public t0(c1 c1Var, r rVar, i1 i1Var, b0 b0Var, int i10, int i11, b1 b1Var) {
        this.d = c1Var;
        this.f16258e = rVar;
        this.f16259f = i1Var;
        this.h = b0Var;
        this.f16256b = i10;
        this.f16257c = i11;
        this.f16260n = b1Var;
    }

    @Override
    public final void run() {
        switch (this.f16255a) {
            case 0:
                r rVar = (r) this.f16258e;
                i1 i1Var = (i1) this.f16259f;
                b0 b0Var = (b0) this.h;
                b1 b1Var = (b1) this.f16260n;
                pi.f fVar = ((c1) this.d).f16033b;
                if (fVar.A(rVar)) {
                    int i10 = this.f16256b;
                    if (i1Var != null) {
                        if (!fVar.D(rVar, i1Var)) {
                            c1.N0(b0Var, rVar, i10, new m1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f16257c)) {
                        c1.N0(b0Var, rVar, i10, new m1(-4));
                        return;
                    }
                    b1Var.h(b0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.f16258e, (TLRPC.StickerSet) this.f16259f, this.f16256b, this.f16257c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f16260n);
                return;
        }
    }

    public t0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.f16258e = zArr;
        this.f16259f = stickerSet;
        this.f16256b = i10;
        this.f16257c = i11;
        this.h = tL_messages_stickerSet;
        this.f16260n = runnable;
    }
}
