package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class u0 implements Runnable {
    public final int f15981a = 0;
    public final int f15982b;
    public final int f15983c;
    public final Object d;
    public final Object f15984e;
    public final Object f15985f;
    public final Object h;
    public final Object f15986n;

    public u0(c1 c1Var, r rVar, i1 i1Var, c0 c0Var, int i10, int i11, b1 b1Var) {
        this.d = c1Var;
        this.f15984e = rVar;
        this.f15985f = i1Var;
        this.h = c0Var;
        this.f15982b = i10;
        this.f15983c = i11;
        this.f15986n = b1Var;
    }

    @Override
    public final void run() {
        switch (this.f15981a) {
            case 0:
                r rVar = (r) this.f15984e;
                i1 i1Var = (i1) this.f15985f;
                c0 c0Var = (c0) this.h;
                b1 b1Var = (b1) this.f15986n;
                oi.f fVar = ((c1) this.d).f15755b;
                if (fVar.A(rVar)) {
                    int i10 = this.f15982b;
                    if (i1Var != null) {
                        if (!fVar.D(rVar, i1Var)) {
                            c1.N0(c0Var, rVar, i10, new m1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f15983c)) {
                        c1.N0(c0Var, rVar, i10, new m1(-4));
                        return;
                    }
                    b1Var.h(c0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.f15984e, (TLRPC.StickerSet) this.f15985f, this.f15982b, this.f15983c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f15986n);
                return;
        }
    }

    public u0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.f15984e = zArr;
        this.f15985f = stickerSet;
        this.f15982b = i10;
        this.f15983c = i11;
        this.h = tL_messages_stickerSet;
        this.f15986n = runnable;
    }
}
