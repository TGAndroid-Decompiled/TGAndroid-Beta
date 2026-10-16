package di;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vi;
public final class w7 implements Utilities.CallbackReturn {
    public final int f8058a;
    public final KeyEvent.Callback f8059b;

    public w7(KeyEvent.Callback callback, int i10) {
        this.f8058a = i10;
        this.f8059b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f8058a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((c8) this.f8059b).f6730r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.g0.k(messageObject), messageObject, 0L));
            case 1:
                ei.d dVar = (ei.d) this.f8059b;
                return dVar.f8792n[((Integer) obj).intValue() % dVar.f8792n.length];
            case 2:
                return new org.telegram.ui.web.v(5, (org.telegram.ui.m0) this.f8059b, (Integer) obj);
            case 3:
                rg.o0 o0Var = (rg.o0) this.f8059b;
                if (((Integer) obj).intValue() == 2) {
                    vi viVar = new vi(o0Var.getContext(), new rg.x(o0Var), false, false, false, o0Var.Q1);
                    viVar.drawNavigationBar = true;
                    viVar.P1(LocaleController.getString(R.string.AddImage));
                    viVar.f29664c2 = new rg.y(o0Var, viVar);
                    viVar.setOnDismissListener(new e1(7));
                    viVar.N1(1, false);
                    viVar.t1();
                    MediaController.forceBroadcastNewPhotos = true;
                    viVar.f29684j0.f0();
                    viVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((wg.r) this.f8059b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                zh.r6 r6Var = (zh.r6) this.f8059b;
                return r6Var.f51117n[((Integer) obj).intValue() % r6Var.f51117n.length];
        }
    }
}
