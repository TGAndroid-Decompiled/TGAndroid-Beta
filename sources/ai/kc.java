package ai;

import android.graphics.Paint;
import android.view.KeyEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ri;
public final class kc implements Utilities.CallbackReturn {
    public final int f1639a;
    public final KeyEvent.Callback f1640b;

    public kc(KeyEvent.Callback callback, int i10) {
        this.f1639a = i10;
        this.f1640b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f1639a) {
            case 0:
                lc lcVar = (lc) this.f1640b;
                return lcVar.f1780r[((Integer) obj).intValue() % lcVar.f1780r.length];
            case 1:
                MessageObject messageObject = (MessageObject) obj;
                ((ei.s7) this.f1640b).f9824s0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.v0.k(messageObject), messageObject, 0L));
            case 2:
                fi.c cVar = (fi.c) this.f1640b;
                return cVar.f10619r[((Integer) obj).intValue() % cVar.f10619r.length];
            case 3:
                return new org.telegram.ui.Wallet.y3(26, (org.telegram.ui.m0) this.f1640b, (Integer) obj);
            case 4:
                rg.m0 m0Var = (rg.m0) this.f1640b;
                if (((Integer) obj).intValue() == 2) {
                    ri riVar = new ri(m0Var.getContext(), new rg.x(m0Var), false, false, false, m0Var.Q1);
                    riVar.drawNavigationBar = true;
                    riVar.T1(LocaleController.getString(R.string.AddImage));
                    riVar.f30138c2 = new rg.y(m0Var, riVar);
                    riVar.setOnDismissListener(new ei.e1(7));
                    riVar.R1(1, false);
                    riVar.w1();
                    MediaController.forceBroadcastNewPhotos = true;
                    riVar.f30158j0.f0();
                    riVar.show();
                }
                return Boolean.TRUE;
            default:
                Paint[] paintArr = ((wg.r) this.f1640b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
        }
    }
}
