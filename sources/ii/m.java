package ii;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y9;
import org.telegram.ui.gu0;
import org.telegram.ui.qu0;
public final class m extends gu0 {
    public final o f14382a;

    public m(o oVar) {
        this.f14382a = oVar;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            o oVar = this.f14382a;
            TLRPC.Chat chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.f14392c));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                oVar.f14397w.getLocationInWindow(iArr);
                qu0 qu0Var = new qu0();
                qu0Var.f42920b = iArr[0];
                qu0Var.f42921c = iArr[1];
                y9 y9Var = oVar.f14397w;
                qu0Var.d = y9Var;
                ImageReceiver imageReceiver = y9Var.getImageReceiver();
                qu0Var.f42919a = imageReceiver;
                qu0Var.f42922f = -oVar.f14392c;
                qu0Var.e = imageReceiver.getBitmapSafe();
                qu0Var.f42923g = -1L;
                qu0Var.h = oVar.f14397w.getImageReceiver().getRoundRadius(true);
                qu0Var.f42926k = 1.0f;
                qu0Var.f42931p = true;
                return qu0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f14382a.f14397w.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f14382a.F.p(str, str2, z10);
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
