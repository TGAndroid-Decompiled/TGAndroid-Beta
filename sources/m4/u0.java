package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class u0 implements Runnable {
    public final int f15982a = 0;
    public final int f15983b;
    public final int f15984c;
    public final Object d;
    public final Object f15985e;
    public final Object f15986f;
    public final Object h;
    public final Object f15987n;

    public u0(c1 c1Var, r rVar, i1 i1Var, c0 c0Var, int i10, int i11, b1 b1Var) {
        this.d = c1Var;
        this.f15985e = rVar;
        this.f15986f = i1Var;
        this.h = c0Var;
        this.f15983b = i10;
        this.f15984c = i11;
        this.f15987n = b1Var;
    }

    @Override
    public final void run() {
        switch (this.f15982a) {
            case 0:
                r rVar = (r) this.f15985e;
                i1 i1Var = (i1) this.f15986f;
                c0 c0Var = (c0) this.h;
                b1 b1Var = (b1) this.f15987n;
                oi.f fVar = ((c1) this.d).f15756b;
                if (fVar.A(rVar)) {
                    int i10 = this.f15983b;
                    if (i1Var != null) {
                        if (!fVar.D(rVar, i1Var)) {
                            c1.N0(c0Var, rVar, i10, new m1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f15984c)) {
                        c1.N0(c0Var, rVar, i10, new m1(-4));
                        return;
                    }
                    b1Var.h(c0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.f15985e, (TLRPC.StickerSet) this.f15986f, this.f15983b, this.f15984c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f15987n);
                return;
        }
    }

    public u0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.f15985e = zArr;
        this.f15986f = stickerSet;
        this.f15983b = i10;
        this.f15984c = i11;
        this.h = tL_messages_stickerSet;
        this.f15987n = runnable;
    }
}
