package ei;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ev0;
import org.telegram.ui.tu0;
public final class m extends tu0 {
    public final p f7584a;

    public m(p pVar) {
        this.f7584a = pVar;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f7584a;
            TLRPC.Chat chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f7597b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.v.getLocationInWindow(iArr);
                ev0 ev0Var = new ev0();
                ev0Var.f32617b = iArr[0];
                ev0Var.f32618c = iArr[1];
                w9 w9Var = pVar.v;
                ev0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                ev0Var.f32616a = imageReceiver;
                ev0Var.f32619f = -pVar.f7597b;
                ev0Var.e = imageReceiver.getBitmapSafe();
                ev0Var.f32620g = -1L;
                ev0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                ev0Var.f32623k = 1.0f;
                ev0Var.f32628p = true;
                return ev0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f7584a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f7584a.E.q(str, str2, z10);
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
