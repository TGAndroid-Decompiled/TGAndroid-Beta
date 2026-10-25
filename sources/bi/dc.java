package bi;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ti;
public final class dc implements Utilities.CallbackReturn {
    public final int f4509a;
    public final KeyEvent.Callback f4510b;

    public dc(KeyEvent.Callback callback, int i10) {
        this.f4509a = i10;
        this.f4510b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f4509a) {
            case 0:
                ec ecVar = (ec) this.f4510b;
                return ecVar.f4576r[((Integer) obj).intValue() % ecVar.f4576r.length];
            case 1:
                MessageObject messageObject = (MessageObject) obj;
                ((fi.o7) this.f4510b).f11411q0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.t.l(messageObject), messageObject, 0L));
            case 2:
                gi.d dVar = (gi.d) this.f4510b;
                return dVar.f12496r[((Integer) obj).intValue() % dVar.f12496r.length];
            case 3:
                return new org.telegram.ui.Wallet.q6(16, (org.telegram.ui.l0) this.f4510b, (Integer) obj);
            case 4:
                sg.n0 n0Var = (sg.n0) this.f4510b;
                if (((Integer) obj).intValue() == 2) {
                    ti tiVar = new ti(n0Var.getContext(), new sg.y(n0Var), false, false, false, n0Var.F1);
                    tiVar.drawNavigationBar = true;
                    tiVar.S1(LocaleController.getString(R.string.AddImage));
                    tiVar.f33010c2 = new sg.z(n0Var, tiVar);
                    tiVar.setOnDismissListener(new fi.e1(8));
                    tiVar.Q1(1, false);
                    tiVar.v1();
                    MediaController.forceBroadcastNewPhotos = true;
                    tiVar.f33030j0.f0();
                    tiVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((xg.r) this.f4510b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
