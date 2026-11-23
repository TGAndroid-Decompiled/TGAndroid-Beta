package li;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p9;
import org.telegram.ui.oq0;
import org.telegram.ui.wq0;
public final class m extends oq0 {
    public final o f20069a;

    public m(o oVar) {
        this.f20069a = oVar;
    }

    @Override
    public final wq0 E(fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            o oVar = this.f20069a;
            TLRPC.Chat O0 = oVar.getMessagesController().O0(Long.valueOf(oVar.f20073c));
            if (O0 == null || (chatPhoto = O0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                oVar.f20080x.getLocationInWindow(iArr);
                wq0 wq0Var = new wq0();
                wq0Var.f53727b = iArr[0];
                wq0Var.f53728c = iArr[1];
                p9 p9Var = oVar.f20080x;
                wq0Var.d = p9Var;
                ImageReceiver imageReceiver = p9Var.getImageReceiver();
                wq0Var.f53726a = imageReceiver;
                wq0Var.f53730f = -oVar.f20073c;
                wq0Var.f53729e = imageReceiver.p();
                wq0Var.f53731g = -1L;
                wq0Var.h = oVar.f20080x.getImageReceiver().F();
                wq0Var.f53734k = 1.0f;
                wq0Var.f53739p = true;
                return wq0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f20069a.f20080x.getImageReceiver().P0(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f20069a.G.p(str, str2, z10);
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
