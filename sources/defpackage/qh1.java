package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qh1 implements pcc {
    public final byte a;
    public final uh1 b;

    public qh1(uh1 uh1Var, byte b) {
        this.a = b;
        this.b = uh1Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        byte b = this.a;
        uh1 uh1Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                if (view instanceof zqb) {
                    view.setBackgroundColor(aob.v0(aob.i5, uh1Var.b));
                    return;
                }
                return;
            default:
                if (view instanceof zqb) {
                    zqb zqbVar = (zqb) view;
                    if (zqbVar.H.a.b) {
                        wallPaper = null;
                    } else {
                        wallPaper = uh1Var.w;
                    }
                    zqbVar.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
