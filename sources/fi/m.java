package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.lu0;
import org.telegram.ui.vu0;
public final class m extends lu0 {
    public final p f9122a;

    public m(p pVar) {
        this.f9122a = pVar;
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f9122a;
            TLRPC.Chat chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f9135b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.v.getLocationInWindow(iArr);
                vu0 vu0Var = new vu0();
                vu0Var.f38819b = iArr[0];
                vu0Var.f38820c = iArr[1];
                w9 w9Var = pVar.v;
                vu0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                vu0Var.f38818a = imageReceiver;
                vu0Var.f38821f = -pVar.f9135b;
                vu0Var.e = imageReceiver.getBitmapSafe();
                vu0Var.f38822g = -1L;
                vu0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                vu0Var.f38825k = 1.0f;
                vu0Var.f38830p = true;
                return vu0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f9122a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f9122a.E.q(str, str2, z10);
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
