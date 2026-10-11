package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.yi;
public final class x7 implements Utilities.CallbackReturn {
    public final int f6308a;
    public final KeyEvent.Callback f6309b;

    public x7(KeyEvent.Callback callback, int i10) {
        this.f6308a = i10;
        this.f6309b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f6308a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((d8) this.f6309b).f4961r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.q.k(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.f6309b;
                return dVar.f8376n[((Integer) obj).intValue() % dVar.f8376n.length];
            case 2:
                return new org.telegram.ui.Wallet.i(28, (org.telegram.ui.k0) this.f6309b, (Integer) obj);
            case 3:
                qg.m0 m0Var = (qg.m0) this.f6309b;
                if (((Integer) obj).intValue() == 2) {
                    yi yiVar = new yi(m0Var.getContext(), new qg.x(m0Var), false, false, false, m0Var.Q1);
                    yiVar.drawNavigationBar = true;
                    yiVar.P1(LocaleController.getString(R.string.AddImage));
                    yiVar.f33207c2 = new qg.y(m0Var, yiVar);
                    yiVar.setOnDismissListener(new e1(7));
                    yiVar.N1(1, false);
                    yiVar.t1();
                    MediaController.forceBroadcastNewPhotos = true;
                    yiVar.f33228j0.f0();
                    yiVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.f6309b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.r6 r6Var = (yh.r6) this.f6309b;
                return r6Var.f53222n[((Integer) obj).intValue() % r6Var.f53222n.length];
        }
    }
}
