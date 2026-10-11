package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y9;
import org.telegram.ui.dv0;
import org.telegram.ui.tu0;
public final class m extends tu0 {
    public final p f10006a;

    public m(p pVar) {
        this.f10006a = pVar;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f10006a;
            TLRPC.Chat chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f10021b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.v.getLocationInWindow(iArr);
                dv0 dv0Var = new dv0();
                dv0Var.f37148b = iArr[0];
                dv0Var.f37149c = iArr[1];
                y9 y9Var = pVar.v;
                dv0Var.d = y9Var;
                ImageReceiver imageReceiver = y9Var.getImageReceiver();
                dv0Var.f37147a = imageReceiver;
                dv0Var.f37151f = -pVar.f10021b;
                dv0Var.f37150e = imageReceiver.getBitmapSafe();
                dv0Var.f37152g = -1L;
                dv0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                dv0Var.f37155k = 1.0f;
                dv0Var.f37160p = true;
                return dv0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f10006a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f10006a.E.p(str, str2, z10);
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
