package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class y0 implements Runnable {
    public final int f16777a = 0;
    public final int f16778b;
    public final int f16779c;
    public final Object d;
    public final Object e;
    public final Object f16780f;
    public final Object h;
    public final Object f16781n;

    public y0(i1 i1Var, v vVar, o1 o1Var, f0 f0Var, int i10, int i11, g1 g1Var) {
        this.d = i1Var;
        this.e = vVar;
        this.f16780f = o1Var;
        this.h = f0Var;
        this.f16778b = i10;
        this.f16779c = i11;
        this.f16781n = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f16777a) {
            case 0:
                v vVar = (v) this.e;
                o1 o1Var = (o1) this.f16780f;
                f0 f0Var = (f0) this.h;
                g1 g1Var = (g1) this.f16781n;
                qi.e eVar = ((i1) this.d).f16566b;
                if (eVar.w(vVar)) {
                    int i10 = this.f16778b;
                    if (o1Var != null) {
                        if (!eVar.z(vVar, o1Var)) {
                            i1.P0(f0Var, vVar, i10, new s1(-4));
                            return;
                        }
                    } else if (!eVar.y(vVar, this.f16779c)) {
                        i1.P0(f0Var, vVar, i10, new s1(-4));
                        return;
                    }
                    g1Var.e(f0Var, vVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f16780f, this.f16778b, this.f16779c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f16781n);
                return;
        }
    }

    public y0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f16780f = stickerSet;
        this.f16778b = i10;
        this.f16779c = i11;
        this.h = tL_messages_stickerSet;
        this.f16781n = runnable;
    }
}
