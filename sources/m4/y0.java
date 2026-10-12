package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class y0 implements Runnable {
    public final int f15682a = 0;
    public final int f15683b;
    public final int f15684c;
    public final Object d;
    public final Object e;
    public final Object f15685f;
    public final Object h;
    public final Object f15686n;

    public y0(j1 j1Var, w wVar, p1 p1Var, f0 f0Var, int i10, int i11, h1 h1Var) {
        this.d = j1Var;
        this.e = wVar;
        this.f15685f = p1Var;
        this.h = f0Var;
        this.f15683b = i10;
        this.f15684c = i11;
        this.f15686n = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f15682a) {
            case 0:
                w wVar = (w) this.e;
                p1 p1Var = (p1) this.f15685f;
                f0 f0Var = (f0) this.h;
                h1 h1Var = (h1) this.f15686n;
                qi.e eVar = ((j1) this.d).f15475b;
                if (eVar.t(wVar)) {
                    int i10 = this.f15683b;
                    if (p1Var != null) {
                        if (!eVar.x(wVar, p1Var)) {
                            j1.P0(f0Var, wVar, i10, new t1(-4));
                            return;
                        }
                    } else if (!eVar.v(wVar, this.f15684c)) {
                        j1.P0(f0Var, wVar, i10, new t1(-4));
                        return;
                    }
                    h1Var.c(f0Var, wVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f15685f, this.f15683b, this.f15684c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f15686n);
                return;
        }
    }

    public y0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f15685f = stickerSet;
        this.f15683b = i10;
        this.f15684c = i11;
        this.h = tL_messages_stickerSet;
        this.f15686n = runnable;
    }
}
