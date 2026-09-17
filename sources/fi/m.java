package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u9;
import org.telegram.ui.fv0;
import org.telegram.ui.vu0;
public final class m extends vu0 {
    public final p f9140a;

    public m(p pVar) {
        this.f9140a = pVar;
    }

    @Override
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f9140a;
            TLRPC.Chat chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f9153b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.v.getLocationInWindow(iArr);
                fv0 fv0Var = new fv0();
                fv0Var.f33764b = iArr[0];
                fv0Var.f33765c = iArr[1];
                u9 u9Var = pVar.v;
                fv0Var.d = u9Var;
                ImageReceiver imageReceiver = u9Var.getImageReceiver();
                fv0Var.f33763a = imageReceiver;
                fv0Var.f33766f = -pVar.f9153b;
                fv0Var.e = imageReceiver.getBitmapSafe();
                fv0Var.f33767g = -1L;
                fv0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                fv0Var.f33770k = 1.0f;
                fv0Var.f33775p = true;
                return fv0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f9140a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f9140a.E.q(str, str2, z10);
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
