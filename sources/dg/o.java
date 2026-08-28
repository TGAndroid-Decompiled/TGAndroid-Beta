package dg;

import android.graphics.Paint;
import android.view.KeyEvent;
import gh.n9;
import kh.g1;
import kh.s7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.l0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.ai1;
import org.telegram.ui.n0;
public final class o implements Utilities.CallbackReturn {
    public final int f4540a;
    public final KeyEvent.Callback f4541b;

    public o(KeyEvent.Callback callback, int i9) {
        this.f4540a = i9;
        this.f4541b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f4540a) {
            case 0:
                Paint[] paintArr = ((u) this.f4541b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 1:
                n9 n9Var = (n9) this.f4541b;
                return n9Var.f8633n[((Integer) obj).intValue() % n9Var.f8633n.length];
            case 2:
                MessageObject messageObject = (MessageObject) obj;
                ((s7) this.f4541b).f16045n0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(l0.k(messageObject), messageObject, 0L));
            case 3:
                lh.c cVar = (lh.c) this.f4541b;
                return cVar.f16875n[((Integer) obj).intValue() % cVar.f16875n.length];
            case 4:
                return new ai1(7, (n0) this.f4541b, (Integer) obj);
            default:
                yf.l0 l0Var = (yf.l0) this.f4541b;
                if (((Integer) obj).intValue() == 2) {
                    ki kiVar = new ki(l0Var.getContext(), new yf.w(l0Var), false, false, false, l0Var.M1);
                    kiVar.drawNavigationBar = true;
                    kiVar.L1(LocaleController.getString(R.string.AddImage));
                    kiVar.V1 = new yf.x(l0Var, kiVar);
                    kiVar.setOnDismissListener(new g1(7));
                    kiVar.J1(1, false);
                    kiVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    kiVar.f30114f0.e0();
                    kiVar.show();
                }
                return Boolean.TRUE;
        }
    }
}
