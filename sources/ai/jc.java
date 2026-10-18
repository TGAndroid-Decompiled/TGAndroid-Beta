package ai;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ti;
public final class jc implements Utilities.CallbackReturn {
    public final int f1580a;
    public final KeyEvent.Callback f1581b;

    public jc(KeyEvent.Callback callback, int i10) {
        this.f1580a = i10;
        this.f1581b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f1580a) {
            case 0:
                kc kcVar = (kc) this.f1581b;
                return kcVar.f1721n[((Integer) obj).intValue() % kcVar.f1721n.length];
            case 1:
                MessageObject messageObject = (MessageObject) obj;
                ((ei.s7) this.f1581b).f9810r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.g0.k(messageObject), messageObject, 0L));
            case 2:
                fi.c cVar = (fi.c) this.f1581b;
                return cVar.f10605n[((Integer) obj).intValue() % cVar.f10605n.length];
            case 3:
                return new org.telegram.ui.Wallet.u3(26, (org.telegram.ui.n0) this.f1581b, (Integer) obj);
            case 4:
                rg.m0 m0Var = (rg.m0) this.f1581b;
                if (((Integer) obj).intValue() == 2) {
                    ti tiVar = new ti(m0Var.getContext(), new rg.w(m0Var), false, false, false, m0Var.Q1);
                    tiVar.drawNavigationBar = true;
                    tiVar.P1(LocaleController.getString(R.string.AddImage));
                    tiVar.f30573c2 = new rg.x(m0Var, tiVar);
                    tiVar.setOnDismissListener(new ei.e1(7));
                    tiVar.N1(1, false);
                    tiVar.t1();
                    MediaController.forceBroadcastNewPhotos = true;
                    tiVar.f30593j0.f0();
                    tiVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((wg.r) this.f1581b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
