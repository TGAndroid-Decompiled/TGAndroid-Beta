package defpackage;

import android.view.WindowManager;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a;
import org.telegram.ui.o;
public final class ys implements Runnable {
    public final byte a;
    public final o b;

    public ys(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override
    public final void run() {
        float f;
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                float currentProgress = 0.7f - oVar.i0.e0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f = 0.01f;
                    } else {
                        f = 0.02f;
                    }
                    n46 n46Var = oVar.i0.e0;
                    n46Var.a(true, n46Var.getCurrentProgress() + f);
                    hl.d3(oVar.k0, 100L);
                    return;
                }
                return;
            case 1:
                hl.c3(new ys(oVar, (byte) 10));
                return;
            case 2:
                oVar.L.a(true);
                return;
            case 3:
                oVar.L.a(true);
                return;
            case 4:
                hl.c3(new ys(oVar, (byte) 10));
                return;
            case 5:
                oVar.a0();
                return;
            case 6:
                a aVar = oVar.h0;
                if (aVar != null) {
                    aVar.setLayerType(0, null);
                    oVar.a0 = (byte) 0;
                    oVar.K();
                    return;
                }
                return;
            case 7:
                oVar.f0();
                return;
            case 8:
                e S = LaunchActivity.S();
                if (S != 0) {
                    ?? obj = new Object();
                    obj.a = true;
                    S.showAsSheet(new ixc(new vs(oVar, (byte) 3)), obj);
                    return;
                }
                return;
            case 9:
                a aVar2 = oVar.h0;
                if (aVar2 != null && oVar.g0 != null) {
                    aVar2.setLayerType(0, null);
                    oVar.a0 = (byte) 0;
                    hl.t1(oVar.M.getCurrentFocus());
                    return;
                }
                return;
            case 10:
                oVar.d0();
                return;
            default:
                try {
                    if (oVar.g0.getParent() != null) {
                        ((WindowManager) oVar.M.getSystemService("window")).removeView(oVar.g0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
        }
    }
}
