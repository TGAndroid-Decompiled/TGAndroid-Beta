package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class w0 implements Runnable {
    public final int f14944a = 0;
    public final int f14945b;
    public final int f14946c;
    public final Object d;
    public final Object e;
    public final Object f14947f;
    public final Object h;
    public final Object f14948n;

    public w0(f1 f1Var, r rVar, l1 l1Var, a0 a0Var, int i10, int i11, e1 e1Var) {
        this.d = f1Var;
        this.e = rVar;
        this.f14947f = l1Var;
        this.h = a0Var;
        this.f14945b = i10;
        this.f14946c = i11;
        this.f14948n = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f14944a) {
            case 0:
                r rVar = (r) this.e;
                l1 l1Var = (l1) this.f14947f;
                a0 a0Var = (a0) this.h;
                e1 e1Var = (e1) this.f14948n;
                oi.f fVar = ((f1) this.d).f14747b;
                if (fVar.A(rVar)) {
                    int i10 = this.f14945b;
                    if (l1Var != null) {
                        if (!fVar.D(rVar, l1Var)) {
                            f1.O0(a0Var, rVar, i10, new p1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f14946c)) {
                        f1.O0(a0Var, rVar, i10, new p1(-4));
                        return;
                    }
                    e1Var.h(a0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f14947f, this.f14945b, this.f14946c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f14948n);
                return;
        }
    }

    public w0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f14947f = stickerSet;
        this.f14945b = i10;
        this.f14946c = i11;
        this.h = tL_messages_stickerSet;
        this.f14948n = runnable;
    }
}
