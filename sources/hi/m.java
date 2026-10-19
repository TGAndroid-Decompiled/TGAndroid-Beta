package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ju0;
import org.telegram.ui.zt0;
public final class m extends zt0 {
    public final o f12185a;

    public m(o oVar) {
        this.f12185a = oVar;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            o oVar = this.f12185a;
            TLRPC.Chat chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.f12194b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                oVar.v.getLocationInWindow(iArr);
                ju0 ju0Var = new ju0();
                ju0Var.f38344b = iArr[0];
                ju0Var.f38345c = iArr[1];
                w9 w9Var = oVar.v;
                ju0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                ju0Var.f38343a = imageReceiver;
                ju0Var.f38346f = -oVar.f12194b;
                ju0Var.e = imageReceiver.getBitmapSafe();
                ju0Var.f38347g = -1L;
                ju0Var.h = oVar.v.getImageReceiver().getRoundRadius(true);
                ju0Var.f38350k = 1.0f;
                ju0Var.f38355p = true;
                return ju0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f12185a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f12185a.E.p(str, str2, z10);
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
