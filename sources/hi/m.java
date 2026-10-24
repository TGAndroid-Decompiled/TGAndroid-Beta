package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u9;
import org.telegram.ui.bu0;
import org.telegram.ui.lu0;
public final class m extends bu0 {
    public final o f12214a;

    public m(o oVar) {
        this.f12214a = oVar;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            o oVar = this.f12214a;
            TLRPC.Chat chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.f12224c));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                oVar.f12229w.getLocationInWindow(iArr);
                lu0 lu0Var = new lu0();
                lu0Var.f39382b = iArr[0];
                lu0Var.f39383c = iArr[1];
                u9 u9Var = oVar.f12229w;
                lu0Var.d = u9Var;
                ImageReceiver imageReceiver = u9Var.getImageReceiver();
                lu0Var.f39381a = imageReceiver;
                lu0Var.f39384f = -oVar.f12224c;
                lu0Var.e = imageReceiver.getBitmapSafe();
                lu0Var.f39385g = -1L;
                lu0Var.h = oVar.f12229w.getImageReceiver().getRoundRadius(true);
                lu0Var.f39388k = 1.0f;
                lu0Var.f39393p = true;
                return lu0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f12214a.f12229w.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f12214a.F.p(str, str2, z10);
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
