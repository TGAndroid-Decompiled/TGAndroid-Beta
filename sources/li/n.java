package li;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q9;
import org.telegram.ui.oq0;
import org.telegram.ui.wq0;
public final class n extends oq0 {
    public final p f19978a;

    public n(p pVar) {
        this.f19978a = pVar;
    }

    @Override
    public final wq0 E(fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f19978a;
            TLRPC.Chat O0 = pVar.getMessagesController().O0(Long.valueOf(pVar.f19982c));
            if (O0 == null || (chatPhoto = O0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.f19989x.getLocationInWindow(iArr);
                wq0 wq0Var = new wq0();
                wq0Var.f53497b = iArr[0];
                wq0Var.f53498c = iArr[1];
                q9 q9Var = pVar.f19989x;
                wq0Var.d = q9Var;
                ImageReceiver imageReceiver = q9Var.getImageReceiver();
                wq0Var.f53496a = imageReceiver;
                wq0Var.f53500f = -pVar.f19982c;
                wq0Var.f53499e = imageReceiver.p();
                wq0Var.f53501g = -1L;
                wq0Var.h = pVar.f19989x.getImageReceiver().E();
                wq0Var.f53504k = 1.0f;
                wq0Var.f53509p = true;
                return wq0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f19978a.f19989x.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f19978a.G.p(str, str2, z10);
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final int y() {
        return 1;
    }
}
