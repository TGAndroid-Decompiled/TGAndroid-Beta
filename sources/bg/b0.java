package bg;

import android.graphics.Paint;
import android.view.KeyEvent;
import jh.i9;
import nh.g7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ni;
public final class b0 implements Utilities.CallbackReturn {
    public final int f2103a;
    public final KeyEvent.Callback f2104b;

    public b0(KeyEvent.Callback callback, int i10) {
        this.f2103a = i10;
        this.f2104b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f2103a) {
            case 0:
                g1 g1Var = (g1) this.f2104b;
                if (((Integer) obj).intValue() == 2) {
                    ni niVar = new ni(g1Var.getContext(), new o0(g1Var), false, false, false, g1Var.M1);
                    niVar.drawNavigationBar = true;
                    niVar.L1(LocaleController.getString(R.string.AddImage));
                    niVar.V1 = new p0(g1Var, niVar);
                    niVar.setOnDismissListener(new f0(0));
                    niVar.J1(1, false);
                    niVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    niVar.f31005f0.f0();
                    niVar.show();
                }
                return Boolean.TRUE;
            case 1:
                Paint[] paintArr = ((gg.s) this.f2104b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 2:
                i9 i9Var = (i9) this.f2104b;
                return i9Var.f12270n[((Integer) obj).intValue() % i9Var.f12270n.length];
            case 3:
                MessageObject messageObject = (MessageObject) obj;
                ((g7) this.f2104b).f17719n0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.x3.n(messageObject), messageObject, 0L));
            case 4:
                oh.c cVar = (oh.c) this.f2104b;
                return cVar.f19569n[((Integer) obj).intValue() % cVar.f19569n.length];
            default:
                return new org.telegram.ui.web.y(4, (org.telegram.ui.o0) this.f2104b, (Integer) obj);
        }
    }
}
