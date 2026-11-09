package bi;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d20;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.di;
public final class fc implements d20 {
    public final int f3890a;
    public final KeyEvent.Callback f3891b;

    public fc(KeyEvent.Callback callback, int i7) {
        this.f3890a = i7;
        this.f3891b = callback;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f3890a;
        KeyEvent.Callback callback = this.f3891b;
        switch (i7) {
            case 0:
                gc gcVar = (gc) callback;
                return gcVar.f3961s[((Integer) obj).intValue() % gcVar.f3961s.length];
            case 1:
                ij ijVar = (ij) obj;
                ((fi.w6) callback).f13040i2 = ijVar;
                return Boolean.valueOf(MediaController.B().o0(org.telegram.messenger.k5.k(ijVar), ijVar, 0L, true, null, 0L));
            case 2:
                gc gcVar2 = (gc) callback;
                return gcVar2.f3961s[((Integer) obj).intValue() % gcVar2.f3961s.length];
            case 3:
                return new org.telegram.ui.web.s(5, (org.telegram.ui.l0) callback, (Integer) obj);
            case 4:
                tg.g0 g0Var = (tg.g0) callback;
                if (((Integer) obj).intValue() == 2) {
                    di diVar = new di(g0Var.getContext(), new tg.w(g0Var), false, false, false, g0Var.f55717z1);
                    diVar.f28645n = true;
                    diVar.A1(org.telegram.messenger.id.M0(2131754428, null));
                    diVar.T3 = new m4.d0(g0Var, diVar, false);
                    diVar.setOnDismissListener(new fi.d1(8));
                    diVar.y1(1, false);
                    diVar.e1();
                    MediaController.f21249g2 = true;
                    diVar.f32987a2.i0();
                    diVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((yg.r) callback).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
