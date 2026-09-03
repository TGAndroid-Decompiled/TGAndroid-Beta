package eg;

import android.graphics.Paint;
import android.view.KeyEvent;
import mh.j9;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mi;
import org.telegram.ui.bh1;
import qh.i6;
public final class y implements Utilities.CallbackReturn {
    public final int f5547a;
    public final KeyEvent.Callback f5548b;

    public y(KeyEvent.Callback callback, int i10) {
        this.f5547a = i10;
        this.f5548b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f5547a) {
            case 0:
                c1 c1Var = (c1) this.f5548b;
                if (((Integer) obj).intValue() == 2) {
                    mi miVar = new mi(c1Var.getContext(), new l0(c1Var), false, false, false, c1Var.N1);
                    miVar.drawNavigationBar = true;
                    miVar.L1(LocaleController.getString(R.string.AddImage));
                    miVar.W1 = new m0(c1Var, miVar);
                    miVar.setOnDismissListener(new c0(0));
                    miVar.J1(1, false);
                    miVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    miVar.f29072g0.f0();
                    miVar.show();
                }
                return Boolean.TRUE;
            case 1:
                Paint[] paintArr = ((jg.s) this.f5548b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 2:
                j9 j9Var = (j9) this.f5548b;
                return j9Var.f14313n[((Integer) obj).intValue() % j9Var.f14313n.length];
            case 3:
                return new bh1(11, (org.telegram.ui.m0) this.f5548b, (Integer) obj);
            case 4:
                MessageObject messageObject = (MessageObject) obj;
                ((i6) this.f5548b).f45479o0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.y3.m(messageObject), messageObject, 0L));
            default:
                rh.c cVar = (rh.c) this.f5548b;
                return cVar.f46851n[((Integer) obj).intValue() % cVar.f46851n.length];
        }
    }
}
