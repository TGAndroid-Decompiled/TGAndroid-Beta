package m4;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class x0 implements Runnable {
    public final int f16764a = 0;
    public final int f16765b;
    public final int f16766c;
    public final Object d;
    public final Object e;
    public final Object f16767f;
    public final Object h;
    public final Object f16768n;

    public x0(i1 i1Var, v vVar, o1 o1Var, f0 f0Var, int i10, int i11, g1 g1Var) {
        this.d = i1Var;
        this.e = vVar;
        this.f16767f = o1Var;
        this.h = f0Var;
        this.f16765b = i10;
        this.f16766c = i11;
        this.f16768n = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f16764a) {
            case 0:
                v vVar = (v) this.e;
                o1 o1Var = (o1) this.f16767f;
                f0 f0Var = (f0) this.h;
                g1 g1Var = (g1) this.f16768n;
                qi.e eVar = ((i1) this.d).f16558b;
                if (eVar.w(vVar)) {
                    int i10 = this.f16765b;
                    if (o1Var != null) {
                        if (!eVar.z(vVar, o1Var)) {
                            i1.P0(f0Var, vVar, i10, new s1(-4));
                            return;
                        }
                    } else if (!eVar.y(vVar, this.f16766c)) {
                        i1.P0(f0Var, vVar, i10, new s1(-4));
                        return;
                    }
                    g1Var.e(f0Var, vVar, i10);
                    return;
                }
                return;
            default:
                ((MediaDataController) this.d).lambda$toggleStickerSet$108((boolean[]) this.e, (TLRPC.StickerSet) this.f16767f, this.f16765b, this.f16766c, (TLRPC.TL_messages_stickerSet) this.h, (Runnable) this.f16768n);
                return;
        }
    }

    public x0(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = mediaDataController;
        this.e = zArr;
        this.f16767f = stickerSet;
        this.f16765b = i10;
        this.f16766c = i11;
        this.h = tL_messages_stickerSet;
        this.f16768n = runnable;
    }
}
