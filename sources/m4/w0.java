package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class w0 implements Runnable {
    public final int f16101a = 0;
    public final int f16102b;
    public final int f16103c;
    public final Object d;
    public final Object f16104e;
    public final Object f16105f;
    public final Object h;
    public final Object f16106n;

    public w0(f1 f1Var, r rVar, l1 l1Var, a0 a0Var, int i10, int i11, e1 e1Var) {
        this.d = f1Var;
        this.f16104e = rVar;
        this.f16105f = l1Var;
        this.h = a0Var;
        this.f16102b = i10;
        this.f16103c = i11;
        this.f16106n = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f16101a) {
            case 0:
                r rVar = (r) this.f16104e;
                l1 l1Var = (l1) this.f16105f;
                a0 a0Var = (a0) this.h;
                e1 e1Var = (e1) this.f16106n;
                fg.f fVar = ((f1) this.d).f15891b;
                if (fVar.B(rVar)) {
                    int i10 = this.f16102b;
                    if (l1Var != null) {
                        if (!fVar.E(rVar, l1Var)) {
                            f1.O0(a0Var, rVar, i10, new p1(-4));
                            return;
                        }
                    } else if (!fVar.D(rVar, this.f16103c)) {
                        f1.O0(a0Var, rVar, i10, new p1(-4));
                        return;
                    }
                    e1Var.h(a0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.f16104e, (TLRPC.StickerSet) this.f16105f, this.f16102b, this.f16103c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f16106n);
                return;
        }
    }

    public w0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.f16104e = zArr;
        this.f16105f = stickerSet;
        this.f16102b = i10;
        this.f16103c = i11;
        this.h = tL_messages_stickerSet;
        this.f16106n = runnable;
    }
}
