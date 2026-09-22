package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vi;
import org.telegram.ui.pb1;
public final class a8 implements Utilities.CallbackReturn {
    public final int f4351a;
    public final KeyEvent.Callback f4352b;

    public a8(KeyEvent.Callback callback, int i10) {
        this.f4351a = i10;
        this.f4352b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f4351a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((g8) this.f4352b).f4712r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.y0.k(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.f4352b;
                return dVar.f7749n[((Integer) obj).intValue() % dVar.f7749n.length];
            case 2:
                return new pb1(26, (org.telegram.ui.k0) this.f4352b, (Integer) obj);
            case 3:
                qg.p0 p0Var = (qg.p0) this.f4352b;
                if (((Integer) obj).intValue() == 2) {
                    vi viVar = new vi(p0Var.getContext(), new qg.y(p0Var), false, false, false, p0Var.Q1);
                    viVar.drawNavigationBar = true;
                    viVar.L1(LocaleController.getString(R.string.AddImage));
                    viVar.Z1 = new qg.z(p0Var, viVar);
                    viVar.setOnDismissListener(new f1(7));
                    viVar.J1(1, false);
                    viVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    viVar.f28759j0.f0();
                    viVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.f4352b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.z6 z6Var = (yh.z6) this.f4352b;
                return z6Var.f48058n[((Integer) obj).intValue() % z6Var.f48058n.length];
        }
    }
}
