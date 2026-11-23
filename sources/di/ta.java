package di;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.ti;
public final class ta implements x10 {
    public final int f9820a;
    public final KeyEvent.Callback f9821b;

    public ta(KeyEvent.Callback callback, int i7) {
        this.f9820a = i7;
        this.f9821b = callback;
    }

    @Override
    public final Object a(Object obj) {
        hi.a0 a0Var;
        int i7 = this.f9820a;
        KeyEvent.Callback callback = this.f9821b;
        switch (i7) {
            case 0:
                ua uaVar = (ua) callback;
                return uaVar.f9879s[((Integer) obj).intValue() % uaVar.f9879s.length];
            case 1:
                fj fjVar = (fj) obj;
                ((hi.e7) callback).f14386m2 = fjVar;
                return Boolean.valueOf(MediaController.B().o0(org.telegram.messenger.f3.i(fjVar), fjVar, 0L, true, null, 0L));
            case 2:
                ua uaVar2 = (ua) callback;
                return uaVar2.f9879s[((Integer) obj).intValue() % uaVar2.f9879s.length];
            case 3:
                return new org.telegram.ui.Wallet.r(28, (org.telegram.ui.l0) callback, (Integer) obj);
            case 4:
                tg.l0 l0Var = (tg.l0) callback;
                Integer num = (Integer) obj;
                if (num.intValue() == 2) {
                    ti tiVar = new ti(l0Var.getContext(), new tg.c0(l0Var), false, false, false, l0Var.A1);
                    tiVar.f30251n = true;
                    tiVar.B1(gd.N0(2131754425, null));
                    tiVar.X3 = new t1.a(l0Var, tiVar);
                    tiVar.setOnDismissListener(new hi.n1(8));
                    tiVar.z1(1, false);
                    tiVar.f1();
                    MediaController.f22790h2 = true;
                    tiVar.f39967e2.i0();
                    tiVar.show();
                } else if (num.intValue() == 6 && (a0Var = l0Var.J1) != null) {
                    a0Var.a();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((yg.r) callback).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
