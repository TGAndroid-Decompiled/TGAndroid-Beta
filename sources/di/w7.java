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
    public final int f8055a;
    public final KeyEvent.Callback f8056b;

    public w7(KeyEvent.Callback callback, int i10) {
        this.f8055a = i10;
        this.f8056b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f8055a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                ((c8) this.f8056b).f6727r0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.q.l(messageObject), messageObject, 0L));
            case 1:
                ei.d dVar = (ei.d) this.f8056b;
                return dVar.f8789n[((Integer) obj).intValue() % dVar.f8789n.length];
            case 2:
                return new org.telegram.ui.Wallet.t8(10, (org.telegram.ui.m0) this.f8056b, (Integer) obj);
            case 3:
                rg.o0 o0Var = (rg.o0) this.f8056b;
                if (((Integer) obj).intValue() == 2) {
                    vi viVar = new vi(o0Var.getContext(), new rg.x(o0Var), false, false, false, o0Var.Q1);
                    viVar.drawNavigationBar = true;
                    viVar.P1(LocaleController.getString(R.string.AddImage));
                    viVar.f29993c2 = new rg.y(o0Var, viVar);
                    viVar.setOnDismissListener(new e1(7));
                    viVar.N1(1, false);
                    viVar.t1();
                    MediaController.forceBroadcastNewPhotos = true;
                    viVar.f30013j0.f0();
                    viVar.show();
                }
                return Boolean.TRUE;
            case 4:
                Paint[] paintArr = ((wg.r) this.f8056b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            default:
                zh.r6 r6Var = (zh.r6) this.f8056b;
                return r6Var.f51116n[((Integer) obj).intValue() % r6Var.f51116n.length];
        }
    }
}
