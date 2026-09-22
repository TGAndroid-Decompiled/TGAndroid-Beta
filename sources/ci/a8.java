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
    public final int f4353a;
    public final KeyEvent.Callback f4354b;

    public a8(KeyEvent.Callback callback, int i10) {
        this.f4353a = i10;
        this.f4354b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f4353a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((g8) this.f4354b).f4714r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.l0.j(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.f4354b;
                return dVar.f7751n[((Integer) obj).intValue() % dVar.f7751n.length];
            case 2:
                return new org.telegram.ui.web.g1(2, (org.telegram.ui.k0) this.f4354b, (Integer) obj);
            case 3:
                qg.n0 n0Var = (qg.n0) this.f4354b;
                if (((Integer) obj).intValue() == 2) {
                    vi viVar = new vi(n0Var.getContext(), new qg.y(n0Var), false, false, false, n0Var.Q1);
                    viVar.drawNavigationBar = true;
                    viVar.L1(LocaleController.getString(R.string.AddImage));
                    viVar.Z1 = new qg.z(n0Var, viVar);
                    viVar.setOnDismissListener(new f1(7));
                    viVar.J1(1, false);
                    viVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    viVar.f29108j0.f0();
                    viVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.f4354b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.y6 y6Var = (yh.y6) this.f4354b;
                return y6Var.f48367n[((Integer) obj).intValue() % y6Var.f48367n.length];
        }
    }
}
