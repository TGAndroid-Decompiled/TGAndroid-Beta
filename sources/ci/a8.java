package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vi;
import org.telegram.ui.nb1;
public final class a8 implements Utilities.CallbackReturn {
    public final int f4349a;
    public final KeyEvent.Callback f4350b;

    public a8(KeyEvent.Callback callback, int i10) {
        this.f4349a = i10;
        this.f4350b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f4349a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((g8) this.f4350b).f4710r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.w1.l(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.f4350b;
                return dVar.f7747n[((Integer) obj).intValue() % dVar.f7747n.length];
            case 2:
                return new nb1(26, (org.telegram.ui.k0) this.f4350b, (Integer) obj);
            case 3:
                qg.p0 p0Var = (qg.p0) this.f4350b;
                if (((Integer) obj).intValue() == 2) {
                    vi viVar = new vi(p0Var.getContext(), new qg.y(p0Var), false, false, false, p0Var.Q1);
                    viVar.drawNavigationBar = true;
                    viVar.L1(LocaleController.getString(R.string.AddImage));
                    viVar.Z1 = new qg.z(p0Var, viVar);
                    viVar.setOnDismissListener(new f1(7));
                    viVar.J1(1, false);
                    viVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    viVar.f28762j0.f0();
                    viVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.f4350b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.a7 a7Var = (yh.a7) this.f4350b;
                return a7Var.f46992n[((Integer) obj).intValue() % a7Var.f46992n.length];
        }
    }
}
