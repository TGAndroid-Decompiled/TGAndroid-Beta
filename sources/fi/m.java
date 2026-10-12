package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y9;
import org.telegram.ui.gv0;
import org.telegram.ui.wu0;
public final class m extends wu0 {
    public final p f10005a;

    public m(p pVar) {
        this.f10005a = pVar;
    }

    @Override
    public final gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f10005a;
            TLRPC.Chat chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f10020b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.v.getLocationInWindow(iArr);
                gv0 gv0Var = new gv0();
                gv0Var.f38148b = iArr[0];
                gv0Var.f38149c = iArr[1];
                y9 y9Var = pVar.v;
                gv0Var.d = y9Var;
                ImageReceiver imageReceiver = y9Var.getImageReceiver();
                gv0Var.f38147a = imageReceiver;
                gv0Var.f38151f = -pVar.f10020b;
                gv0Var.f38150e = imageReceiver.getBitmapSafe();
                gv0Var.f38152g = -1L;
                gv0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                gv0Var.f38155k = 1.0f;
                gv0Var.f38160p = true;
                return gv0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f10005a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f10005a.E.p(str, str2, z10);
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
