package ii;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l9;
import org.telegram.ui.mq0;
import org.telegram.ui.vq0;
public final class n extends mq0 {
    public final p f15578a;

    public n(p pVar) {
        this.f15578a = pVar;
    }

    @Override
    public final vq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
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
                vq0 vq0Var = new vq0();
                vq0Var.f50791b = iArr[0];
                vq0Var.f50792c = iArr[1];
                l9 l9Var = pVar.f15589x;
                vq0Var.d = l9Var;
                ImageReceiver imageReceiver = l9Var.getImageReceiver();
                vq0Var.f50790a = imageReceiver;
                vq0Var.f50794f = -pVar.f15582c;
                vq0Var.f50793e = imageReceiver.p();
                vq0Var.f50795g = -1L;
                vq0Var.h = pVar.f15589x.getImageReceiver().E();
                vq0Var.f50798k = 1.0f;
                vq0Var.f50803p = true;
                return vq0Var;
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
