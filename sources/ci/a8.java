package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vi;
import org.telegram.ui.qb1;
public final class a8 implements Utilities.CallbackReturn {
    public final int f4354a;
    public final KeyEvent.Callback f4355b;

    public a8(KeyEvent.Callback callback, int i10) {
        this.f4354a = i10;
        this.f4355b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f4354a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((g8) this.f4355b).f4715r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.w1.l(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.f4355b;
                return dVar.f7752n[((Integer) obj).intValue() % dVar.f7752n.length];
            case 2:
                return new qb1(26, (org.telegram.ui.k0) this.f4355b, (Integer) obj);
            case 3:
                qg.p0 p0Var = (qg.p0) this.f4355b;
                if (((Integer) obj).intValue() == 2) {
                    vi viVar = new vi(p0Var.getContext(), new qg.y(p0Var), false, false, false, p0Var.Q1);
                    viVar.drawNavigationBar = true;
                    viVar.L1(LocaleController.getString(R.string.AddImage));
                    viVar.Z1 = new qg.z(p0Var, viVar);
                    viVar.setOnDismissListener(new f1(7));
                    viVar.J1(1, false);
                    viVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    viVar.f28757j0.f0();
                    viVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.f4355b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.a7 a7Var = (yh.a7) this.f4355b;
                return a7Var.f47020n[((Integer) obj).intValue() % a7Var.f47020n.length];
        }
    }
}
