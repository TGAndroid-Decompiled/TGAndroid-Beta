package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wi;
public final class x7 implements Utilities.CallbackReturn {
    public final int f5836a;
    public final KeyEvent.Callback f5837b;

    public x7(KeyEvent.Callback callback, int i10) {
        this.f5836a = i10;
        this.f5837b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f5836a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((d8) this.f5837b).f4536r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.f0.k(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.f5837b;
                return dVar.f7734n[((Integer) obj).intValue() % dVar.f7734n.length];
            case 2:
                return new org.telegram.ui.web.o1(1, (org.telegram.ui.l0) this.f5837b, (Integer) obj);
            case 3:
                qg.n0 n0Var = (qg.n0) this.f5837b;
                if (((Integer) obj).intValue() == 2) {
                    wi wiVar = new wi(n0Var.getContext(), new qg.y(n0Var), false, false, false, n0Var.Q1);
                    wiVar.drawNavigationBar = true;
                    wiVar.L1(LocaleController.getString(R.string.AddImage));
                    wiVar.Z1 = new qg.z(n0Var, wiVar);
                    wiVar.setOnDismissListener(new f1(7));
                    wiVar.J1(1, false);
                    wiVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    wiVar.f30018j0.f0();
                    wiVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.f5837b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.y6 y6Var = (yh.y6) this.f5837b;
                return y6Var.f48302n[((Integer) obj).intValue() % y6Var.f48302n.length];
        }
    }
}
