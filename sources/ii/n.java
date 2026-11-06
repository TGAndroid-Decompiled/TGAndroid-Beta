package ii;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l9;
import org.telegram.ui.nq0;
import org.telegram.ui.wq0;
public final class n extends nq0 {
    public final p f15578a;

    public n(p pVar) {
        this.f15578a = pVar;
    }

    @Override
    public final wq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f15578a;
            TLRPC.Chat M0 = pVar.getMessagesController().M0(Long.valueOf(pVar.f15582c));
            if (M0 == null || (chatPhoto = M0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.f15589x.getLocationInWindow(iArr);
                wq0 wq0Var = new wq0();
                wq0Var.f51477b = iArr[0];
                wq0Var.f51478c = iArr[1];
                l9 l9Var = pVar.f15589x;
                wq0Var.d = l9Var;
                ImageReceiver imageReceiver = l9Var.getImageReceiver();
                wq0Var.f51476a = imageReceiver;
                wq0Var.f51480f = -pVar.f15582c;
                wq0Var.f51479e = imageReceiver.p();
                wq0Var.f51481g = -1L;
                wq0Var.h = pVar.f15589x.getImageReceiver().E();
                wq0Var.f51484k = 1.0f;
                wq0Var.f51489p = true;
                return wq0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f15578a.f15589x.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z9) {
        this.f15578a.F.p(str, str2, z9);
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
