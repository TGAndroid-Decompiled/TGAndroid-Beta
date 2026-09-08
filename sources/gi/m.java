package gi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x9;
import org.telegram.ui.cv0;
import org.telegram.ui.su0;
public final class m extends su0 {
    public final p f10754a;

    public m(p pVar) {
        this.f10754a = pVar;
    }

    @Override
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f10754a;
            TLRPC.Chat chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f10769b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.v.getLocationInWindow(iArr);
                cv0 cv0Var = new cv0();
                cv0Var.f35568b = iArr[0];
                cv0Var.f35569c = iArr[1];
                x9 x9Var = pVar.v;
                cv0Var.d = x9Var;
                ImageReceiver imageReceiver = x9Var.getImageReceiver();
                cv0Var.f35567a = imageReceiver;
                cv0Var.f35571f = -pVar.f10769b;
                cv0Var.f35570e = imageReceiver.getBitmapSafe();
                cv0Var.f35572g = -1L;
                cv0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                cv0Var.f35575k = 1.0f;
                cv0Var.f35580p = true;
                return cv0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f10754a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f10754a.E.q(str, str2, z10);
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
