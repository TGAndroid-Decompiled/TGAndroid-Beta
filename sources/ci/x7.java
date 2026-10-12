package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.aj;
public final class x7 implements Utilities.CallbackReturn {
    public final int f6307a;
    public final KeyEvent.Callback f6308b;

    public x7(KeyEvent.Callback callback, int i10) {
        this.f6307a = i10;
        this.f6308b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f6307a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((d8) this.f6308b).f4960r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.v0.k(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.f6308b;
                return dVar.f8374n[((Integer) obj).intValue() % dVar.f8374n.length];
            case 2:
                return new org.telegram.ui.Wallet.s(27, (org.telegram.ui.l0) this.f6308b, (Integer) obj);
            case 3:
                qg.m0 m0Var = (qg.m0) this.f6308b;
                if (((Integer) obj).intValue() == 2) {
                    aj ajVar = new aj(m0Var.getContext(), new qg.x(m0Var), false, false, false, m0Var.Q1);
                    ajVar.drawNavigationBar = true;
                    ajVar.P1(LocaleController.getString(R.string.AddImage));
                    ajVar.f24329c2 = new qg.y(m0Var, ajVar);
                    ajVar.setOnDismissListener(new e1(7));
                    ajVar.N1(1, false);
                    ajVar.t1();
                    MediaController.forceBroadcastNewPhotos = true;
                    ajVar.f24350j0.f0();
                    ajVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.f6308b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.r6 r6Var = (yh.r6) this.f6308b;
                return r6Var.f53371n[((Integer) obj).intValue() % r6Var.f53371n.length];
        }
    }
}
