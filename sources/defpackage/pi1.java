package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class pi1 implements qac {
    public final byte a;
    public final ti1 b;

    public pi1(ti1 ti1Var, byte b) {
        this.a = b;
        this.b = ti1Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        byte b = this.a;
        ti1 ti1Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                if (view instanceof bpb) {
                    view.setBackgroundColor(cmb.v0(cmb.h5, ti1Var.b));
                    return;
                }
                return;
            default:
                if (view instanceof bpb) {
                    bpb bpbVar = (bpb) view;
                    if (bpbVar.H.a.b) {
                        wallPaper = null;
                    } else {
                        wallPaper = ti1Var.w;
                    }
                    bpbVar.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
