package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xi;
import org.telegram.ui.g91;
public final class y7 implements Utilities.CallbackReturn {
    public final int f6343a;
    public final KeyEvent.Callback f6344b;

    public y7(KeyEvent.Callback callback, int i10) {
        this.f6343a = i10;
        this.f6344b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f6343a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((c8) this.f6344b).f4824p0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.f0.k(messageObject), messageObject, 0L));
            case 1:
                di.g gVar = (di.g) this.f6344b;
                return gVar.f8371n[((Integer) obj).intValue() % gVar.f8371n.length];
            case 2:
                return new g91(29, (org.telegram.ui.l0) this.f6344b, (Integer) obj);
            case 3:
                qg.m0 m0Var = (qg.m0) this.f6344b;
                if (((Integer) obj).intValue() == 2) {
                    xi xiVar = new xi(m0Var.getContext(), new qg.x(m0Var), false, false, false, m0Var.Q1);
                    xiVar.drawNavigationBar = true;
                    xiVar.I1(LocaleController.getString(R.string.AddImage));
                    xiVar.Z1 = new qg.y(m0Var, xiVar);
                    xiVar.setOnDismissListener(new f1(7));
                    xiVar.G1(1, false);
                    xiVar.o1();
                    MediaController.forceBroadcastNewPhotos = true;
                    xiVar.f32824j0.f0();
                    xiVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.f6344b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.b7 b7Var = (yh.b7) this.f6344b;
                return b7Var.f51135n[((Integer) obj).intValue() % b7Var.f51135n.length];
        }
    }
}
