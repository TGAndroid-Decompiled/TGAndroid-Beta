package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xi;
import org.telegram.ui.e91;
public final class y7 implements Utilities.CallbackReturn {
    public final int f6344a;
    public final KeyEvent.Callback f6345b;

    public y7(KeyEvent.Callback callback, int i10) {
        this.f6344a = i10;
        this.f6345b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f6344a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((c8) this.f6345b).f4825p0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.q.k(messageObject), messageObject, 0L));
            case 1:
                di.g gVar = (di.g) this.f6345b;
                return gVar.f8372n[((Integer) obj).intValue() % gVar.f8372n.length];
            case 2:
                return new e91(29, (org.telegram.ui.l0) this.f6345b, (Integer) obj);
            case 3:
                qg.m0 m0Var = (qg.m0) this.f6345b;
                if (((Integer) obj).intValue() == 2) {
                    xi xiVar = new xi(m0Var.getContext(), new qg.x(m0Var), false, false, false, m0Var.Q1);
                    xiVar.drawNavigationBar = true;
                    xiVar.K1(LocaleController.getString(R.string.AddImage));
                    xiVar.Z1 = new qg.y(m0Var, xiVar);
                    xiVar.setOnDismissListener(new f1(7));
                    xiVar.I1(1, false);
                    xiVar.q1();
                    MediaController.forceBroadcastNewPhotos = true;
                    xiVar.f32922j0.f0();
                    xiVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.f6345b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.c7 c7Var = (yh.c7) this.f6345b;
                return c7Var.f51200n[((Integer) obj).intValue() % c7Var.f51200n.length];
        }
    }
}
