package li;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q9;
import org.telegram.ui.pq0;
import org.telegram.ui.xq0;
public final class n extends pq0 {
    public final p f19972a;

    public n(p pVar) {
        this.f19972a = pVar;
    }

    @Override
    public final xq0 E(gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f19972a;
            TLRPC.Chat O0 = pVar.getMessagesController().O0(Long.valueOf(pVar.f19976c));
            if (O0 == null || (chatPhoto = O0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.f19983x.getLocationInWindow(iArr);
                xq0 xq0Var = new xq0();
                xq0Var.f53899b = iArr[0];
                xq0Var.f53900c = iArr[1];
                q9 q9Var = pVar.f19983x;
                xq0Var.d = q9Var;
                ImageReceiver imageReceiver = q9Var.getImageReceiver();
                xq0Var.f53898a = imageReceiver;
                xq0Var.f53902f = -pVar.f19976c;
                xq0Var.f53901e = imageReceiver.p();
                xq0Var.f53903g = -1L;
                xq0Var.h = pVar.f19983x.getImageReceiver().E();
                xq0Var.f53906k = 1.0f;
                xq0Var.f53911p = true;
                return xq0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f19972a.f19983x.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f19972a.G.p(str, str2, z10);
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
