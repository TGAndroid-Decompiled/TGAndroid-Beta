package gi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z9;
import org.telegram.ui.jv0;
import org.telegram.ui.zu0;
public final class m extends zu0 {
    public final p f10219a;

    public m(p pVar) {
        this.f10219a = pVar;
    }

    @Override
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f10219a;
            TLRPC.Chat chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f10232b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.v.getLocationInWindow(iArr);
                jv0 jv0Var = new jv0();
                jv0Var.f37146b = iArr[0];
                jv0Var.f37147c = iArr[1];
                z9 z9Var = pVar.v;
                jv0Var.d = z9Var;
                ImageReceiver imageReceiver = z9Var.getImageReceiver();
                jv0Var.f37145a = imageReceiver;
                jv0Var.f37148f = -pVar.f10232b;
                jv0Var.e = imageReceiver.getBitmapSafe();
                jv0Var.f37149g = -1L;
                jv0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                jv0Var.f37152k = 1.0f;
                jv0Var.f37157p = true;
                return jv0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f10219a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f10219a.E.p(str, str2, z10);
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
