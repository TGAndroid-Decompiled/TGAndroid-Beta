package li;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q9;
import org.telegram.ui.oq0;
import org.telegram.ui.wq0;
public final class n extends oq0 {
    public final p f20006a;

    public n(p pVar) {
        this.f20006a = pVar;
    }

    @Override
    public final wq0 E(gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f20006a;
            TLRPC.Chat O0 = pVar.getMessagesController().O0(Long.valueOf(pVar.f20010c));
            if (O0 == null || (chatPhoto = O0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.f20017x.getLocationInWindow(iArr);
                wq0 wq0Var = new wq0();
                wq0Var.f53498b = iArr[0];
                wq0Var.f53499c = iArr[1];
                q9 q9Var = pVar.f20017x;
                wq0Var.d = q9Var;
                ImageReceiver imageReceiver = q9Var.getImageReceiver();
                wq0Var.f53497a = imageReceiver;
                wq0Var.f53501f = -pVar.f20010c;
                wq0Var.f53500e = imageReceiver.p();
                wq0Var.f53502g = -1L;
                wq0Var.h = pVar.f20017x.getImageReceiver().E();
                wq0Var.f53505k = 1.0f;
                wq0Var.f53510p = true;
                return wq0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f20006a.f20017x.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f20006a.G.p(str, str2, z10);
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
