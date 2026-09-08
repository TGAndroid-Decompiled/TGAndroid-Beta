package di;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vi;
public final class a8 implements Utilities.CallbackReturn {
    public final int f6935a;
    public final KeyEvent.Callback f6936b;

    public a8(KeyEvent.Callback callback, int i10) {
        this.f6935a = i10;
        this.f6936b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f6935a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((g8) this.f6936b).f7316r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.w1.l(messageObject), messageObject, 0L));
            case 1:
                ei.d dVar = (ei.d) this.f6936b;
                return dVar.f9152n[((Integer) obj).intValue() % dVar.f9152n.length];
            case 2:
                return new org.telegram.ui.web.g1(2, (org.telegram.ui.k0) this.f6936b, (Integer) obj);
            case 3:
                rg.o0 o0Var = (rg.o0) this.f6936b;
                if (((Integer) obj).intValue() == 2) {
                    vi viVar = new vi(o0Var.getContext(), new rg.y(o0Var), false, false, false, o0Var.Q1);
                    viVar.drawNavigationBar = true;
                    viVar.L1(LocaleController.getString(R.string.AddImage));
                    viVar.Z1 = new rg.z(o0Var, viVar);
                    viVar.setOnDismissListener(new f1(7));
                    viVar.J1(1, false);
                    viVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    viVar.f31318j0.f0();
                    viVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((wg.r) this.f6936b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                zh.x6 x6Var = (zh.x6) this.f6936b;
                return x6Var.f52882n[((Integer) obj).intValue() % x6Var.f52882n.length];
        }
    }
}
