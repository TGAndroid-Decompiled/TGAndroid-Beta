package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y9;
import org.telegram.ui.ev0;
import org.telegram.ui.uu0;
public final class m extends uu0 {
    public final p f10007a;

    public m(p pVar) {
        this.f10007a = pVar;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f10007a;
            TLRPC.Chat chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f10022b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.v.getLocationInWindow(iArr);
                ev0 ev0Var = new ev0();
                ev0Var.f37401b = iArr[0];
                ev0Var.f37402c = iArr[1];
                y9 y9Var = pVar.v;
                ev0Var.d = y9Var;
                ImageReceiver imageReceiver = y9Var.getImageReceiver();
                ev0Var.f37400a = imageReceiver;
                ev0Var.f37404f = -pVar.f10022b;
                ev0Var.f37403e = imageReceiver.getBitmapSafe();
                ev0Var.f37405g = -1L;
                ev0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                ev0Var.f37408k = 1.0f;
                ev0Var.f37413p = true;
                return ev0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f10007a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f10007a.E.p(str, str2, z10);
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
