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
import org.telegram.ui.kg1;
import ph.m6;
public final class a0 implements Utilities.CallbackReturn {
    public final int f4345a;
    public final KeyEvent.Callback f4346b;

    public a0(KeyEvent.Callback callback, int i10) {
        this.f4345a = i10;
        this.f4346b = callback;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f4345a) {
            case 0:
                e1 e1Var = (e1) this.f4346b;
                if (((Integer) obj).intValue() == 2) {
                    li liVar = new li(e1Var.getContext(), new n0(e1Var), false, false, false, e1Var.N1);
                    liVar.drawNavigationBar = true;
                    liVar.L1(LocaleController.getString(R.string.AddImage));
                    liVar.W1 = new o0(e1Var, liVar);
                    liVar.setOnDismissListener(new e0(0));
                    liVar.J1(1, false);
                    liVar.r1();
                    MediaController.forceBroadcastNewPhotos = true;
                    liVar.f26702g0.f0();
                    liVar.show();
                }
                return Boolean.TRUE;
            case 1:
                Paint[] paintArr = ((ig.s) this.f4346b).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 2:
                j9 j9Var = (j9) this.f4346b;
                return j9Var.f12680n[((Integer) obj).intValue() % j9Var.f12680n.length];
            case 3:
                return new kg1(13, (org.telegram.ui.m0) this.f4346b, (Integer) obj);
            case 4:
                MessageObject messageObject = (MessageObject) obj;
                ((m6) this.f4346b).f41952o0 = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(org.telegram.messenger.y3.m(messageObject), messageObject, 0L));
            default:
                qh.c cVar = (qh.c) this.f4346b;
                return cVar.f43071n[((Integer) obj).intValue() % cVar.f43071n.length];
        }
    }
}
