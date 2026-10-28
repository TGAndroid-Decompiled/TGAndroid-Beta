package ii;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y9;
import org.telegram.ui.iu0;
import org.telegram.ui.su0;
public final class m extends iu0 {
    public final o f14381a;

    public m(o oVar) {
        this.f14381a = oVar;
    }

    @Override
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            o oVar = this.f14381a;
            TLRPC.Chat chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.f14391c));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                oVar.f14396w.getLocationInWindow(iArr);
                su0 su0Var = new su0();
                su0Var.f43407b = iArr[0];
                su0Var.f43408c = iArr[1];
                y9 y9Var = oVar.f14396w;
                su0Var.d = y9Var;
                ImageReceiver imageReceiver = y9Var.getImageReceiver();
                su0Var.f43406a = imageReceiver;
                su0Var.f43409f = -oVar.f14391c;
                su0Var.e = imageReceiver.getBitmapSafe();
                su0Var.f43410g = -1L;
                su0Var.h = oVar.f14396w.getImageReceiver().getRoundRadius(true);
                su0Var.f43413k = 1.0f;
                su0Var.f43418p = true;
                return su0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f14381a.f14396w.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f14381a.F.p(str, str2, z10);
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
