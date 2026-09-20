package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vi;
public final class a8 implements Utilities.CallbackReturn {
    public final int f4355a;
    public final KeyEvent.Callback f4356b;

    public a8(KeyEvent.Callback callback, int i10) {
        this.f4355a = i10;
        this.f4356b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f4355a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((g8) this.f4356b).f4716r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.l0.j(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.f4356b;
                return dVar.f7752n[((Integer) obj).intValue() % dVar.f7752n.length];
            case 2:
                return new org.telegram.ui.web.g1(2, (org.telegram.ui.k0) this.f4356b, (Integer) obj);
            case 3:
                qg.n0 n0Var = (qg.n0) this.f4356b;
                if (((Integer) obj).intValue() == 2) {
                    vi viVar = new vi(n0Var.getContext(), new qg.y(n0Var), false, false, false, n0Var.Q1);
                    viVar.drawNavigationBar = true;
                    viVar.L1(LocaleController.getString(R.string.AddImage));
                    viVar.Z1 = new qg.z(n0Var, viVar);
                    viVar.setOnDismissListener(new f1(7));
                    viVar.J1(1, false);
                    viVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    viVar.f29110j0.f0();
                    viVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.f4356b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.y6 y6Var = (yh.y6) this.f4356b;
                return y6Var.f48346n[((Integer) obj).intValue() % y6Var.f48346n.length];
        }
    }
}
