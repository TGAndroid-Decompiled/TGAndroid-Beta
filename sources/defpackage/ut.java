package defpackage;

import android.view.WindowManager;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a;
import org.telegram.ui.o;
public final class ut implements Runnable {
    public final byte a;
    public final o b;

    public ut(o oVar, byte b) {
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
                oVar.d0();
                return;
            case 1:
                float currentProgress = 0.7f - oVar.i0.e0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f = 0.01f;
                    } else {
                        f = 0.02f;
                    }
                    k46 k46Var = oVar.i0.e0;
                    k46Var.a(true, k46Var.getCurrentProgress() + f);
                    gm.d3(oVar.k0, 100L);
                    return;
                }
                return;
            case 2:
                gm.c3(new ut(oVar, (byte) 0));
                return;
            case 3:
                gm.c3(new ut(oVar, (byte) 0));
                return;
            case 4:
                oVar.L.a(true);
                return;
            case 5:
                oVar.L.a(true);
                return;
            case 6:
                try {
                    if (oVar.g0.getParent() != null) {
                        ((WindowManager) oVar.M.getSystemService("window")).removeView(oVar.g0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 7:
                oVar.a0();
                return;
            case 8:
                oVar.f0();
                return;
            case 9:
                a aVar = oVar.h0;
                if (aVar != null) {
                    aVar.setLayerType(0, null);
                    oVar.a0 = (byte) 0;
                    oVar.K();
                    return;
                }
                return;
            case 10:
                d S = LaunchActivity.S();
                if (S != 0) {
                    ?? obj = new Object();
                    obj.a = true;
                    S.showAsSheet(new uuc(new xt(oVar, (byte) 3)), obj);
                    return;
                }
                return;
            default:
                a aVar2 = oVar.h0;
                if (aVar2 != null && oVar.g0 != null) {
                    aVar2.setLayerType(0, null);
                    oVar.a0 = (byte) 0;
                    gm.t1(oVar.M.getCurrentFocus());
                    return;
                }
                return;
        }
    }
}
