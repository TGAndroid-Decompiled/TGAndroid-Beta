package dg;

import android.graphics.Paint;
import android.view.KeyEvent;
import lh.j9;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.li;
import org.telegram.ui.sg1;
import ph.l6;
public final class a0 implements Utilities.CallbackReturn {
    public final int f4351a;
    public final KeyEvent.Callback f4352b;

    public a0(KeyEvent.Callback callback, int i10) {
        this.f4351a = i10;
        this.f4352b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f4351a) {
            case 0:
                e1 e1Var = (e1) this.f4352b;
                if (((Integer) obj).intValue() == 2) {
                    li liVar = new li(e1Var.getContext(), new n0(e1Var), false, false, false, e1Var.N1);
                    liVar.drawNavigationBar = true;
                    liVar.L1(LocaleController.getString(R.string.AddImage));
                    liVar.W1 = new o0(e1Var, liVar);
                    liVar.setOnDismissListener(new e0(0));
                    liVar.J1(1, false);
                    liVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    liVar.f26698g0.f0();
                    liVar.show();
                }
                return Boolean.TRUE;
            case 1:
                Paint[] paintArr = ((ig.s) this.f4352b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 2:
                j9 j9Var = (j9) this.f4352b;
                return j9Var.f12664n[((Integer) obj).intValue() % j9Var.f12664n.length];
            case 3:
                return new sg1(13, (org.telegram.ui.o0) this.f4352b, (Integer) obj);
            case 4:
                MessageObject messageObject = (MessageObject) obj;
                ((l6) this.f4352b).f41959o0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.y3.m(messageObject), messageObject, 0L));
            default:
                qh.c cVar = (qh.c) this.f4352b;
                return cVar.f43095n[((Integer) obj).intValue() % cVar.f43095n.length];
        }
    }
}
