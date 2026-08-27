package oh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n9;
import org.telegram.ui.cu0;
import org.telegram.ui.st0;

public final class m extends st0 {

    public final o f19526a;

    public m(o oVar) {
        this.f19526a = oVar;
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            o oVar = this.f19526a;
            TLRPC.Chat chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.f19532b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                oVar.v.getLocationInWindow(iArr);
                cu0 cu0Var = new cu0();
                cu0Var.f37154b = iArr[0];
                cu0Var.f37155c = iArr[1];
                n9 n9Var = oVar.v;
                cu0Var.d = n9Var;
                ImageReceiver imageReceiver = n9Var.getImageReceiver();
                cu0Var.f37153a = imageReceiver;
                cu0Var.f37157f = -oVar.f19532b;
                cu0Var.f37156e = imageReceiver.getBitmapSafe();
                cu0Var.f37158g = -1L;
                cu0Var.h = oVar.v.getImageReceiver().getRoundRadius(true);
                cu0Var.f37161k = 1.0f;
                cu0Var.f37166p = true;
                return cu0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f19526a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f19526a.A.q(str, str2, z10);
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
