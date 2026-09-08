package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class w0 implements Runnable {
    public final int f16128a = 0;
    public final int f16129b;
    public final int f16130c;
    public final Object d;
    public final Object f16131e;
    public final Object f16132f;
    public final Object h;
    public final Object f16133n;

    public w0(f1 f1Var, r rVar, l1 l1Var, a0 a0Var, int i10, int i11, e1 e1Var) {
        this.d = f1Var;
        this.f16131e = rVar;
        this.f16132f = l1Var;
        this.h = a0Var;
        this.f16129b = i10;
        this.f16130c = i11;
        this.f16133n = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f16128a) {
            case 0:
                r rVar = (r) this.f16131e;
                l1 l1Var = (l1) this.f16132f;
                a0 a0Var = (a0) this.h;
                e1 e1Var = (e1) this.f16133n;
                fg.f fVar = ((f1) this.d).f15918b;
                if (fVar.B(rVar)) {
                    int i10 = this.f16129b;
                    if (l1Var != null) {
                        if (!fVar.E(rVar, l1Var)) {
                            f1.O0(a0Var, rVar, i10, new p1(-4));
                            return;
                        }
                    } else if (!fVar.D(rVar, this.f16130c)) {
                        f1.O0(a0Var, rVar, i10, new p1(-4));
                        return;
                    }
                    e1Var.h(a0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.f16131e, (TLRPC.StickerSet) this.f16132f, this.f16129b, this.f16130c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f16133n);
                return;
        }
    }

    public w0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.f16131e = zArr;
        this.f16132f = stickerSet;
        this.f16129b = i10;
        this.f16130c = i11;
        this.h = tL_messages_stickerSet;
        this.f16133n = runnable;
    }
}
