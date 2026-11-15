package li;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i9;
import org.telegram.ui.mq0;
import org.telegram.ui.uq0;
public final class l extends mq0 {
    public final n f19607a;

    public l(n nVar) {
        this.f19607a = nVar;
    }

    @Override
    public final uq0 E(gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            n nVar = this.f19607a;
            TLRPC.Chat M0 = nVar.getMessagesController().M0(Long.valueOf(nVar.f19611c));
            if (M0 == null || (chatPhoto = M0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                nVar.f19618x.getLocationInWindow(iArr);
                uq0 uq0Var = new uq0();
                uq0Var.f51998b = iArr[0];
                uq0Var.f51999c = iArr[1];
                i9 i9Var = nVar.f19618x;
                uq0Var.d = i9Var;
                ImageReceiver imageReceiver = i9Var.getImageReceiver();
                uq0Var.f51997a = imageReceiver;
                uq0Var.f52001f = -nVar.f19611c;
                uq0Var.f52000e = imageReceiver.p();
                uq0Var.f52002g = -1L;
                uq0Var.h = nVar.f19618x.getImageReceiver().E();
                uq0Var.f52005k = 1.0f;
                uq0Var.f52010p = true;
                return uq0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f19607a.f19618x.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f19607a.G.p(str, str2, z10);
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
