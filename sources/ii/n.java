package ii;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k9;
import org.telegram.ui.qq0;
import org.telegram.ui.zq0;
public final class n extends qq0 {
    public final p f15580a;

    public n(p pVar) {
        this.f15580a = pVar;
    }

    @Override
    public final zq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f15580a;
            TLRPC.Chat M0 = pVar.getMessagesController().M0(Long.valueOf(pVar.f15584c));
            if (M0 == null || (chatPhoto = M0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.f15591x.getLocationInWindow(iArr);
                zq0 zq0Var = new zq0();
                zq0Var.f52504b = iArr[0];
                zq0Var.f52505c = iArr[1];
                k9 k9Var = pVar.f15591x;
                zq0Var.d = k9Var;
                ImageReceiver imageReceiver = k9Var.getImageReceiver();
                zq0Var.f52503a = imageReceiver;
                zq0Var.f52507f = -pVar.f15584c;
                zq0Var.f52506e = imageReceiver.p();
                zq0Var.f52508g = -1L;
                zq0Var.h = pVar.f15591x.getImageReceiver().E();
                zq0Var.f52511k = 1.0f;
                zq0Var.f52516p = true;
                return zq0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f15580a.f15591x.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z9) {
        this.f15580a.F.p(str, str2, z9);
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
