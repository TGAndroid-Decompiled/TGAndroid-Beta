package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.dv0;
import org.telegram.ui.tu0;
public final class m extends tu0 {
    public final p f9139a;

    public m(p pVar) {
        this.f9139a = pVar;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f9139a;
            TLRPC.Chat chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f9152b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.v.getLocationInWindow(iArr);
                dv0 dv0Var = new dv0();
                dv0Var.f33093b = iArr[0];
                dv0Var.f33094c = iArr[1];
                w9 w9Var = pVar.v;
                dv0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                dv0Var.f33092a = imageReceiver;
                dv0Var.f33095f = -pVar.f9152b;
                dv0Var.e = imageReceiver.getBitmapSafe();
                dv0Var.f33096g = -1L;
                dv0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                dv0Var.f33099k = 1.0f;
                dv0Var.f33104p = true;
                return dv0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f9139a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f9139a.E.q(str, str2, z10);
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
