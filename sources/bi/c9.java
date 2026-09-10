package bi;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.yi;
import org.telegram.ui.r91;
public final class c9 implements Utilities.CallbackReturn {
    public final int f2418a;
    public final KeyEvent.Callback f2419b;

    public c9(KeyEvent.Callback callback, int i10) {
        this.f2418a = i10;
        this.f2419b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f2418a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((i9) this.f2419b).f2878r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.a2.l(messageObject), messageObject, 0L));
            case 1:
                ci.d dVar = (ci.d) this.f2419b;
                return dVar.f4701n[((Integer) obj).intValue() % dVar.f4701n.length];
            case 2:
                return new r91(29, (org.telegram.ui.l0) this.f2419b, (Integer) obj);
            case 3:
                pg.m0 m0Var = (pg.m0) this.f2419b;
                if (((Integer) obj).intValue() == 2) {
                    yi yiVar = new yi(m0Var.getContext(), new pg.x(m0Var), false, false, false, m0Var.Q1);
                    yiVar.drawNavigationBar = true;
                    yiVar.L1(LocaleController.getString(R.string.AddImage));
                    yiVar.Z1 = new pg.y(m0Var, yiVar);
                    yiVar.setOnDismissListener(new k1(7));
                    yiVar.J1(1, false);
                    yiVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    yiVar.f29378j0.f0();
                    yiVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((ug.r) this.f2419b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                xh.b7 b7Var = (xh.b7) this.f2419b;
                return b7Var.f45283n[((Integer) obj).intValue() % b7Var.f45283n.length];
        }
    }
}
