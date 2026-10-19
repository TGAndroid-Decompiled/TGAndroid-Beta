package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class y0 implements Runnable {
    public final int f16775a = 0;
    public final int f16776b;
    public final int f16777c;
    public final Object d;
    public final Object e;
    public final Object f16778f;
    public final Object h;
    public final Object f16779n;

    public y0(i1 i1Var, v vVar, o1 o1Var, f0 f0Var, int i10, int i11, g1 g1Var) {
        this.d = i1Var;
        this.e = vVar;
        this.f16778f = o1Var;
        this.h = f0Var;
        this.f16776b = i10;
        this.f16777c = i11;
        this.f16779n = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f16775a) {
            case 0:
                v vVar = (v) this.e;
                o1 o1Var = (o1) this.f16778f;
                f0 f0Var = (f0) this.h;
                g1 g1Var = (g1) this.f16779n;
                qi.e eVar = ((i1) this.d).f16564b;
                if (eVar.w(vVar)) {
                    int i10 = this.f16776b;
                    if (o1Var != null) {
                        if (!eVar.z(vVar, o1Var)) {
                            i1.P0(f0Var, vVar, i10, new s1(-4));
                            return;
                        }
                    } else if (!eVar.y(vVar, this.f16777c)) {
                        i1.P0(f0Var, vVar, i10, new s1(-4));
                        return;
                    }
                    g1Var.e(f0Var, vVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f16778f, this.f16776b, this.f16777c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f16779n);
                return;
        }
    }

    public y0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f16778f = stickerSet;
        this.f16776b = i10;
        this.f16777c = i11;
        this.h = tL_messages_stickerSet;
        this.f16779n = runnable;
    }
}
