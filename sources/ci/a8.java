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
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.q.l(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.f4355b;
                return dVar.f7751n[((Integer) obj).intValue() % dVar.f7751n.length];
            case 2:
                return new org.telegram.ui.web.p1(0, (org.telegram.ui.k0) this.f4355b, (Integer) obj);
            case 3:
                qg.m0 m0Var = (qg.m0) this.f4355b;
                if (((Integer) obj).intValue() == 2) {
                    vi viVar = new vi(m0Var.getContext(), new qg.x(m0Var), false, false, false, m0Var.Q1);
                    viVar.drawNavigationBar = true;
                    viVar.L1(LocaleController.getString(R.string.AddImage));
                    viVar.Z1 = new qg.y(m0Var, viVar);
                    viVar.setOnDismissListener(new f1(7));
                    viVar.J1(1, false);
                    viVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    viVar.f29033j0.f0();
                    viVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.f4355b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.x6 x6Var = (yh.x6) this.f4355b;
                return x6Var.f48220n[((Integer) obj).intValue() % x6Var.f48220n.length];
        }
    }
}
