package ci;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wi;
import org.telegram.ui.fb1;
public final class y7 implements Utilities.CallbackReturn {
    public final int f5887a;
    public final KeyEvent.Callback f5888b;

    public y7(KeyEvent.Callback callback, int i10) {
        this.f5887a = i10;
        this.f5888b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f5887a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((c8) this.f5888b).f4465p0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.l0.j(messageObject), messageObject, 0L));
            case 1:
                di.d dVar = (di.d) this.f5888b;
                return dVar.f7736n[((Integer) obj).intValue() % dVar.f7736n.length];
            case 2:
                return new fb1(27, (org.telegram.ui.m0) this.f5888b, (Integer) obj);
            case 3:
                qg.m0 m0Var = (qg.m0) this.f5888b;
                if (((Integer) obj).intValue() == 2) {
                    wi wiVar = new wi(m0Var.getContext(), new qg.x(m0Var), false, false, false, m0Var.Q1);
                    wiVar.drawNavigationBar = true;
                    wiVar.I1(LocaleController.getString(R.string.AddImage));
                    wiVar.Z1 = new qg.y(m0Var, wiVar);
                    wiVar.setOnDismissListener(new f1(7));
                    wiVar.G1(1, false);
                    wiVar.o1();
                    MediaController.forceBroadcastNewPhotos = true;
                    wiVar.f29974j0.f0();
                    wiVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((vg.r) this.f5888b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                yh.x6 x6Var = (yh.x6) this.f5888b;
                return x6Var.f48324n[((Integer) obj).intValue() % x6Var.f48324n.length];
        }
    }
}
