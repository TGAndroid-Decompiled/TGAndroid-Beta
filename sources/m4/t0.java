package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class t0 implements Runnable {
    public final int f16291a = 0;
    public final int f16292b;
    public final int f16293c;
    public final Object d;
    public final Object f16294e;
    public final Object f16295f;
    public final Object h;
    public final Object f16296n;

    public t0(c1 c1Var, r rVar, i1 i1Var, b0 b0Var, int i10, int i11, b1 b1Var) {
        this.d = c1Var;
        this.f16294e = rVar;
        this.f16295f = i1Var;
        this.h = b0Var;
        this.f16292b = i10;
        this.f16293c = i11;
        this.f16296n = b1Var;
    }

    @Override
    public final void run() {
        switch (this.f16291a) {
            case 0:
                r rVar = (r) this.f16294e;
                i1 i1Var = (i1) this.f16295f;
                b0 b0Var = (b0) this.h;
                b1 b1Var = (b1) this.f16296n;
                pi.f fVar = ((c1) this.d).f16069b;
                if (fVar.A(rVar)) {
                    int i10 = this.f16292b;
                    if (i1Var != null) {
                        if (!fVar.D(rVar, i1Var)) {
                            c1.N0(b0Var, rVar, i10, new m1(-4));
                            return;
                        }
                    } else if (!fVar.C(rVar, this.f16293c)) {
                        c1.N0(b0Var, rVar, i10, new m1(-4));
                        return;
                    }
                    b1Var.h(b0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.f16294e, (TLRPC.StickerSet) this.f16295f, this.f16292b, this.f16293c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f16296n);
                return;
        }
    }

    public t0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.f16294e = zArr;
        this.f16295f = stickerSet;
        this.f16292b = i10;
        this.f16293c = i11;
        this.h = tL_messages_stickerSet;
        this.f16296n = runnable;
    }
}
