package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ou0;
import org.telegram.ui.yu0;
public final class m extends ou0 {
    public final p f9932a;

    public m(p pVar) {
        this.f9932a = pVar;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f9932a;
            TLRPC.Chat chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f9947b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.v.getLocationInWindow(iArr);
                yu0 yu0Var = new yu0();
                yu0Var.f43628b = iArr[0];
                yu0Var.f43629c = iArr[1];
                w9 w9Var = pVar.v;
                yu0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                yu0Var.f43627a = imageReceiver;
                yu0Var.f43631f = -pVar.f9947b;
                yu0Var.f43630e = imageReceiver.getBitmapSafe();
                yu0Var.f43632g = -1L;
                yu0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                yu0Var.f43635k = 1.0f;
                yu0Var.f43640p = true;
                return yu0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f9932a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f9932a.E.q(str, str2, z10);
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
