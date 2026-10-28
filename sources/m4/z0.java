package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final int f18305a = 0;
    public final int f18306b;
    public final int f18307c;
    public final Object d;
    public final Object e;
    public final Object f18308f;
    public final Object h;
    public final Object f18309n;

    public z0(j1 j1Var, w wVar, p1 p1Var, f0 f0Var, int i10, int i11, h1 h1Var) {
        this.d = j1Var;
        this.e = wVar;
        this.f18308f = p1Var;
        this.h = f0Var;
        this.f18306b = i10;
        this.f18307c = i11;
        this.f18309n = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f18305a) {
            case 0:
                w wVar = (w) this.e;
                p1 p1Var = (p1) this.f18308f;
                f0 f0Var = (f0) this.h;
                h1 h1Var = (h1) this.f18309n;
                com.google.firebase.messaging.q qVar = ((j1) this.d).f18091b;
                if (qVar.u(wVar)) {
                    int i10 = this.f18306b;
                    if (p1Var != null) {
                        if (!qVar.x(wVar, p1Var)) {
                            j1.P0(f0Var, wVar, i10, new t1(-4));
                            return;
                        }
                    } else if (!qVar.w(wVar, this.f18307c)) {
                        j1.P0(f0Var, wVar, i10, new t1(-4));
                        return;
                    }
                    h1Var.c(f0Var, wVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f18308f, this.f18306b, this.f18307c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f18309n);
                return;
        }
    }

    public z0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f18308f = stickerSet;
        this.f18306b = i10;
        this.f18307c = i11;
        this.h = tL_messages_stickerSet;
        this.f18309n = runnable;
    }
}
