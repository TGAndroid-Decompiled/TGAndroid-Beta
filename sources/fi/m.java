package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.mu0;
import org.telegram.ui.wu0;
public final class m extends mu0 {
    public final p f9123a;

    public m(p pVar) {
        this.f9123a = pVar;
    }

    @Override
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f9123a;
            TLRPC.Chat chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f9136b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.v.getLocationInWindow(iArr);
                wu0 wu0Var = new wu0();
                wu0Var.f39095b = iArr[0];
                wu0Var.f39096c = iArr[1];
                w9 w9Var = pVar.v;
                wu0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                wu0Var.f39094a = imageReceiver;
                wu0Var.f39097f = -pVar.f9136b;
                wu0Var.e = imageReceiver.getBitmapSafe();
                wu0Var.f39098g = -1L;
                wu0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                wu0Var.f39101k = 1.0f;
                wu0Var.f39106p = true;
                return wu0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f9123a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f9123a.E.q(str, str2, z10);
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
