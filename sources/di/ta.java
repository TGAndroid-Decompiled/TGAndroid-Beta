package di;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.si;
public final class ta implements y10 {
    public final int f9821a;
    public final KeyEvent.Callback f9822b;

    public ta(KeyEvent.Callback callback, int i7) {
        this.f9821a = i7;
        this.f9822b = callback;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f9821a;
        KeyEvent.Callback callback = this.f9822b;
        switch (i7) {
            case 0:
                ua uaVar = (ua) callback;
                return uaVar.f9885s[((Integer) obj).intValue() % uaVar.f9885s.length];
            case 1:
                fj fjVar = (fj) obj;
                ((hi.v6) callback).f15588m2 = fjVar;
                return Boolean.valueOf(MediaController.B().o0(org.telegram.messenger.f3.i(fjVar), fjVar, 0L, true, null, 0L));
            case 2:
                ua uaVar2 = (ua) callback;
                return uaVar2.f9885s[((Integer) obj).intValue() % uaVar2.f9885s.length];
            case 3:
                return new org.telegram.ui.Wallet.c5(22, (org.telegram.ui.l0) callback, (Integer) obj);
            case 4:
                tg.g0 g0Var = (tg.g0) callback;
                if (((Integer) obj).intValue() == 2) {
                    si siVar = new si(g0Var.getContext(), new tg.w(g0Var), false, false, false, g0Var.A1);
                    siVar.f30215n = true;
                    siVar.B1(gd.M0(2131754426, null));
                    siVar.X3 = new tg.x(g0Var, siVar);
                    siVar.setOnDismissListener(new hi.f1(8));
                    siVar.z1(1, false);
                    siVar.f1();
                    MediaController.f22692h2 = true;
                    siVar.f39670e2.i0();
                    siVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((yg.r) callback).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
