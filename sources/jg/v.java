package jg;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.dd;
import org.telegram.messenger.kj;
import org.telegram.messenger.m5;
import org.telegram.messenger.s20;
import org.telegram.ui.Components.bi;
import rh.o7;
import vh.f5;
public final class v implements s20 {
    public final int f10299a;
    public final KeyEvent.Callback f10300b;

    public v(KeyEvent.Callback callback, int i10) {
        this.f10299a = i10;
        this.f10300b = callback;
    }

    @Override
    public final Object a(Object obj) {
        int i10 = this.f10299a;
        KeyEvent.Callback callback = this.f10300b;
        switch (i10) {
            case 0:
                r0 r0Var = (r0) callback;
                if (((Integer) obj).intValue() == 2) {
                    bi biVar = new bi(r0Var.getContext(), new f0(r0Var), false, false, false, r0Var.f10204z1);
                    biVar.f21607n = true;
                    biVar.z1(dd.L0(2131754428, null));
                    biVar.T3 = new hf.b(r0Var, biVar, false, 28);
                    biVar.setOnDismissListener(new z(0));
                    biVar.x1(1, false);
                    biVar.d1();
                    MediaController.f14437f2 = true;
                    biVar.a2.g0();
                    biVar.show();
                }
                return Boolean.TRUE;
            case 1:
                Paint[] paintArr = ((og.s) callback).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 2:
                return new org.telegram.ui.Wallet.m2(28, (org.telegram.ui.m0) callback, (Integer) obj);
            case 3:
                o7 o7Var = (o7) callback;
                return o7Var.f47306s[((Integer) obj).intValue() % o7Var.f47306s.length];
            case 4:
                kj kjVar = (kj) obj;
                ((f5) callback).f51160i2 = kjVar;
                return Boolean.valueOf(MediaController.B().o0(m5.j(kjVar), kjVar, 0L, true, null));
            default:
                o7 o7Var2 = (o7) callback;
                return o7Var2.f47306s[((Integer) obj).intValue() % o7Var2.f47306s.length];
        }
    }
}
