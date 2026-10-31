package jg;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.r20;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Wallet.k3;
import rh.o7;
import vh.f5;
public final class v implements r20 {
    public final int f10298a;
    public final KeyEvent.Callback f10299b;

    public v(KeyEvent.Callback callback, int i10) {
        this.f10298a = i10;
        this.f10299b = callback;
    }

    @Override
    public final Object a(Object obj) {
        int i10 = this.f10298a;
        KeyEvent.Callback callback = this.f10299b;
        switch (i10) {
            case 0:
                r0 r0Var = (r0) callback;
                if (((Integer) obj).intValue() == 2) {
                    bi biVar = new bi(r0Var.getContext(), new f0(r0Var), false, false, false, r0Var.f10203z1);
                    biVar.f21606n = true;
                    biVar.z1(cd.L0(2131754428, null));
                    biVar.T3 = new hf.b(r0Var, biVar, false, 28);
                    biVar.setOnDismissListener(new z(0));
                    biVar.x1(1, false);
                    biVar.d1();
                    MediaController.f14436f2 = true;
                    biVar.a2.g0();
                    biVar.show();
                }
                return Boolean.TRUE;
            case 1:
                Paint[] paintArr = ((og.s) callback).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 2:
                return new k3(27, (org.telegram.ui.m0) callback, (Integer) obj);
            case 3:
                o7 o7Var = (o7) callback;
                return o7Var.f47292s[((Integer) obj).intValue() % o7Var.f47292s.length];
            case 4:
                jj jjVar = (jj) obj;
                ((f5) callback).f51145i2 = jjVar;
                return Boolean.valueOf(MediaController.B().o0(m5.j(jjVar), jjVar, 0L, true, null));
            default:
                o7 o7Var2 = (o7) callback;
                return o7Var2.f47292s[((Integer) obj).intValue() % o7Var2.f47292s.length];
        }
    }
}
