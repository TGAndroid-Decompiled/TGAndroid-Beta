package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class t0 implements Runnable {
    public final int f14677a = 0;
    public final int f14678b;
    public final int f14679c;
    public final Object d;
    public final Object e;
    public final Object f14680f;
    public final Object h;
    public final Object f14681n;

    public t0(b1 b1Var, r rVar, h1 h1Var, a0 a0Var, int i10, int i11, a1 a1Var) {
        this.d = b1Var;
        this.e = rVar;
        this.f14680f = h1Var;
        this.h = a0Var;
        this.f14678b = i10;
        this.f14679c = i11;
        this.f14681n = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f14677a) {
            case 0:
                r rVar = (r) this.e;
                h1 h1Var = (h1) this.f14680f;
                a0 a0Var = (a0) this.h;
                a1 a1Var = (a1) this.f14681n;
                ni.f fVar = ((b1) this.d).f14466b;
                if (fVar.A(rVar)) {
                    int i10 = this.f14678b;
                    if (h1Var != null) {
                        if (!fVar.D(rVar, h1Var)) {
                            b1.O0(a0Var, rVar, i10, new l1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f14679c)) {
                        b1.O0(a0Var, rVar, i10, new l1(-4));
                        return;
                    }
                    a1Var.h(a0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f14680f, this.f14678b, this.f14679c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f14681n);
                return;
        }
    }

    public t0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f14680f = stickerSet;
        this.f14678b = i10;
        this.f14679c = i11;
        this.h = tL_messages_stickerSet;
        this.f14681n = runnable;
    }
}
