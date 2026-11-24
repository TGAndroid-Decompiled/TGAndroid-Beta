package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class hh1 implements p8c {
    public final byte a;
    public final lh1 b;

    public hh1(lh1 lh1Var, byte b) {
        this.a = b;
        this.b = lh1Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        byte b = this.a;
        lh1 lh1Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                if (view instanceof anb) {
                    view.setBackgroundColor(bkb.v0(bkb.h5, lh1Var.b));
                    return;
                }
                return;
            default:
                if (view instanceof anb) {
                    anb anbVar = (anb) view;
                    if (anbVar.H.a.b) {
                        wallPaper = null;
                    } else {
                        wallPaper = lh1Var.w;
                    }
                    anbVar.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
