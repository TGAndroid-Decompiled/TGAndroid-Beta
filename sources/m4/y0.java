package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class y0 implements Runnable {
    public final int f13559a = 0;
    public final int f13560b;
    public final int f13561c;
    public final Object d;
    public final Object e;
    public final Object f13562f;
    public final Object h;
    public final Object f13563n;

    public y0(h1 h1Var, r rVar, n1 n1Var, b0 b0Var, int i10, int i11, g1 g1Var) {
        this.d = h1Var;
        this.e = rVar;
        this.f13562f = n1Var;
        this.h = b0Var;
        this.f13560b = i10;
        this.f13561c = i11;
        this.f13563n = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f13559a) {
            case 0:
                r rVar = (r) this.e;
                n1 n1Var = (n1) this.f13562f;
                b0 b0Var = (b0) this.h;
                g1 g1Var = (g1) this.f13563n;
                ki.f fVar = ((h1) this.d).f13376b;
                if (fVar.z(rVar)) {
                    int i10 = this.f13560b;
                    if (n1Var != null) {
                        if (!fVar.C(rVar, n1Var)) {
                            h1.O0(b0Var, rVar, i10, new r1(-4));
                            return;
                        }
                    } else if (!fVar.B(rVar, this.f13561c)) {
                        h1.O0(b0Var, rVar, i10, new r1(-4));
                        return;
                    }
                    g1Var.i(b0Var, rVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f13562f, this.f13560b, this.f13561c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f13563n);
                return;
        }
    }

    public y0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f13562f = stickerSet;
        this.f13560b = i10;
        this.f13561c = i11;
        this.h = tL_messages_stickerSet;
        this.f13563n = runnable;
    }
}
