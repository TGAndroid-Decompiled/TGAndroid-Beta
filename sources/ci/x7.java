package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ii1;
public final class x7 implements Utilities.CallbackReturn {
    public final int f6309a;
    public final KeyEvent.Callback f6310b;

    public x7(KeyEvent.Callback callback, int i10) {
        this.f6309a = i10;
        this.f6310b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f6309a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((d8) this.f6310b).f4962r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.q.k(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.f6310b;
                return dVar.f8377n[((Integer) obj).intValue() % dVar.f8377n.length];
            case 2:
                return new ii1(29, (org.telegram.ui.l0) this.f6310b, (Integer) obj);
            case 3:
                qg.m0 m0Var = (qg.m0) this.f6310b;
                if (((Integer) obj).intValue() == 2) {
                    yi yiVar = new yi(m0Var.getContext(), new qg.x(m0Var), false, false, false, m0Var.Q1);
                    yiVar.drawNavigationBar = true;
                    yiVar.P1(LocaleController.getString(R.string.AddImage));
                    yiVar.f33219c2 = new qg.y(m0Var, yiVar);
                    yiVar.setOnDismissListener(new e1(7));
                    yiVar.N1(1, false);
                    yiVar.t1();
                    MediaController.forceBroadcastNewPhotos = true;
                    yiVar.f33240j0.f0();
                    yiVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.f6310b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.r6 r6Var = (yh.r6) this.f6310b;
                return r6Var.f53133n[((Integer) obj).intValue() % r6Var.f53133n.length];
        }
    }
}
