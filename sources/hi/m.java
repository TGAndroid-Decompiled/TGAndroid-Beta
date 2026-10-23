package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.cu0;
import org.telegram.ui.mu0;
public final class m extends cu0 {
    public final o f12214a;

    public m(o oVar) {
        this.f12214a = oVar;
    }

    @Override
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            o oVar = this.f12214a;
            TLRPC.Chat chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.f12224c));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                oVar.f12229w.getLocationInWindow(iArr);
                mu0 mu0Var = new mu0();
                mu0Var.f39693b = iArr[0];
                mu0Var.f39694c = iArr[1];
                w9 w9Var = oVar.f12229w;
                mu0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                mu0Var.f39692a = imageReceiver;
                mu0Var.f39695f = -oVar.f12224c;
                mu0Var.e = imageReceiver.getBitmapSafe();
                mu0Var.f39696g = -1L;
                mu0Var.h = oVar.f12229w.getImageReceiver().getRoundRadius(true);
                mu0Var.f39699k = 1.0f;
                mu0Var.f39704p = true;
                return mu0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f12214a.f12229w.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f12214a.F.p(str, str2, z10);
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
