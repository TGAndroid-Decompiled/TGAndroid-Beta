package di;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.ui;
public final class ta implements y10 {
    public final int f9856a;
    public final KeyEvent.Callback f9857b;

    public ta(KeyEvent.Callback callback, int i7) {
        this.f9856a = i7;
        this.f9857b = callback;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f9856a;
        KeyEvent.Callback callback = this.f9857b;
        switch (i7) {
            case 0:
                ua uaVar = (ua) callback;
                return uaVar.f9915s[((Integer) obj).intValue() % uaVar.f9915s.length];
            case 1:
                fj fjVar = (fj) obj;
                ((hi.u6) callback).f15555m2 = fjVar;
                return Boolean.valueOf(MediaController.B().o0(org.telegram.messenger.f3.i(fjVar), fjVar, 0L, true, null, 0L));
            case 2:
                ua uaVar2 = (ua) callback;
                return uaVar2.f9915s[((Integer) obj).intValue() % uaVar2.f9915s.length];
            case 3:
                return new org.telegram.ui.Wallet.u4(24, (org.telegram.ui.l0) callback, (Integer) obj);
            case 4:
                tg.h0 h0Var = (tg.h0) callback;
                if (((Integer) obj).intValue() == 2) {
                    ui uiVar = new ui(h0Var.getContext(), new tg.x(h0Var), false, false, false, h0Var.A1);
                    uiVar.f30198n = true;
                    uiVar.B1(gd.N0(2131754425, null));
                    uiVar.X3 = new tg.y(h0Var, uiVar);
                    uiVar.setOnDismissListener(new hi.f1(8));
                    uiVar.z1(1, false);
                    uiVar.f1();
                    MediaController.f22720h2 = true;
                    uiVar.f40386e2.i0();
                    uiVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((yg.r) callback).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
