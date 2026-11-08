package ii;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l9;
import org.telegram.ui.nq0;
import org.telegram.ui.wq0;
public final class n extends nq0 {
    public final p f15581a;

    public n(p pVar) {
        this.f15581a = pVar;
    }

    @Override
    public final wq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f15581a;
            TLRPC.Chat M0 = pVar.getMessagesController().M0(Long.valueOf(pVar.f15585c));
            if (M0 == null || (chatPhoto = M0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.f15592x.getLocationInWindow(iArr);
                wq0 wq0Var = new wq0();
                wq0Var.f51484b = iArr[0];
                wq0Var.f51485c = iArr[1];
                l9 l9Var = pVar.f15592x;
                wq0Var.d = l9Var;
                ImageReceiver imageReceiver = l9Var.getImageReceiver();
                wq0Var.f51483a = imageReceiver;
                wq0Var.f51487f = -pVar.f15585c;
                wq0Var.f51486e = imageReceiver.p();
                wq0Var.f51488g = -1L;
                wq0Var.h = pVar.f15592x.getImageReceiver().E();
                wq0Var.f51491k = 1.0f;
                wq0Var.f51496p = true;
                return wq0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f15581a.f15592x.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z9) {
        this.f15581a.F.p(str, str2, z9);
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
