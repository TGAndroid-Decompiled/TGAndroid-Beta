package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xi;
public final class x7 implements Utilities.CallbackReturn {
    public final int f5848a;
    public final KeyEvent.Callback f5849b;

    public x7(KeyEvent.Callback callback, int i10) {
        this.f5848a = i10;
        this.f5849b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f5848a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((d8) this.f5849b).f4543r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.f0.k(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.f5849b;
                return dVar.f7746n[((Integer) obj).intValue() % dVar.f7746n.length];
            case 2:
                return new org.telegram.ui.web.o1(1, (org.telegram.ui.l0) this.f5849b, (Integer) obj);
            case 3:
                qg.n0 n0Var = (qg.n0) this.f5849b;
                if (((Integer) obj).intValue() == 2) {
                    xi xiVar = new xi(n0Var.getContext(), new qg.y(n0Var), false, false, false, n0Var.Q1);
                    xiVar.drawNavigationBar = true;
                    xiVar.L1(LocaleController.getString(R.string.AddImage));
                    xiVar.Z1 = new qg.z(n0Var, xiVar);
                    xiVar.setOnDismissListener(new f1(7));
                    xiVar.J1(1, false);
                    xiVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    xiVar.f30282j0.f0();
                    xiVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.f5849b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.y6 y6Var = (yh.y6) this.f5849b;
                return y6Var.f48409n[((Integer) obj).intValue() % y6Var.f48409n.length];
        }
    }
}
