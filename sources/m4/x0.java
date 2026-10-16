package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class x0 implements Runnable {
    public final int f15412a = 0;
    public final int f15413b;
    public final int f15414c;
    public final Object d;
    public final Object e;
    public final Object f15415f;
    public final Object h;
    public final Object f15416n;

    public x0(i1 i1Var, v vVar, o1 o1Var, e0 e0Var, int i10, int i11, g1 g1Var) {
        this.d = i1Var;
        this.e = vVar;
        this.f15415f = o1Var;
        this.h = e0Var;
        this.f15413b = i10;
        this.f15414c = i11;
        this.f15416n = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f15412a) {
            case 0:
                v vVar = (v) this.e;
                o1 o1Var = (o1) this.f15415f;
                e0 e0Var = (e0) this.h;
                g1 g1Var = (g1) this.f15416n;
                pi.e eVar = ((i1) this.d).f15205b;
                if (eVar.t(vVar)) {
                    int i10 = this.f15413b;
                    if (o1Var != null) {
                        if (!eVar.w(vVar, o1Var)) {
                            i1.P0(e0Var, vVar, i10, new s1(-4));
                            return;
                        }
                    } else if (!eVar.v(vVar, this.f15414c)) {
                        i1.P0(e0Var, vVar, i10, new s1(-4));
                        return;
                    }
                    g1Var.c(e0Var, vVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f15415f, this.f15413b, this.f15414c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f15416n);
                return;
        }
    }

    public x0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f15415f = stickerSet;
        this.f15413b = i10;
        this.f15414c = i11;
        this.h = tL_messages_stickerSet;
        this.f15416n = runnable;
    }
}
