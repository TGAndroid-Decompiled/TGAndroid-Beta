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
                ((fi.o7) this.f4510b).f11410q0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.t.l(messageObject), messageObject, 0L));
            case 2:
                gi.d dVar = (gi.d) this.f4510b;
                return dVar.f12495r[((Integer) obj).intValue() % dVar.f12495r.length];
            case 3:
                return new org.telegram.ui.Wallet.a6(17, (org.telegram.ui.l0) this.f4510b, (Integer) obj);
            case 4:
                sg.m0 m0Var = (sg.m0) this.f4510b;
                if (((Integer) obj).intValue() == 2) {
                    ti tiVar = new ti(m0Var.getContext(), new sg.x(m0Var), false, false, false, m0Var.F1);
                    tiVar.drawNavigationBar = true;
                    tiVar.T1(LocaleController.getString(R.string.AddImage));
                    tiVar.f32982c2 = new sg.y(m0Var, tiVar);
                    tiVar.setOnDismissListener(new fi.e1(8));
                    tiVar.R1(1, false);
                    tiVar.w1();
                    MediaController.forceBroadcastNewPhotos = true;
                    tiVar.f33002j0.g0();
                    tiVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((xg.r) this.f4510b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
