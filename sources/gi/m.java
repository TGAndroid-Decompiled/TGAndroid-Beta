package gi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z9;
import org.telegram.ui.av0;
import org.telegram.ui.kv0;
public final class m extends av0 {
    public final p f10215a;

    public m(p pVar) {
        this.f10215a = pVar;
    }

    @Override
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f10215a;
            TLRPC.Chat chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f10228b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.v.getLocationInWindow(iArr);
                kv0 kv0Var = new kv0();
                kv0Var.f37752b = iArr[0];
                kv0Var.f37753c = iArr[1];
                z9 z9Var = pVar.v;
                kv0Var.d = z9Var;
                ImageReceiver imageReceiver = z9Var.getImageReceiver();
                kv0Var.f37751a = imageReceiver;
                kv0Var.f37754f = -pVar.f10228b;
                kv0Var.e = imageReceiver.getBitmapSafe();
                kv0Var.f37755g = -1L;
                kv0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                kv0Var.f37758k = 1.0f;
                kv0Var.f37763p = true;
                return kv0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f10215a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f10215a.E.p(str, str2, z10);
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
