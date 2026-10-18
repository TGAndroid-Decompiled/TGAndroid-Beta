package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.bu0;
import org.telegram.ui.lu0;
public final class m extends bu0 {
    public final o f12184a;

    public m(o oVar) {
        this.f12184a = oVar;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            o oVar = this.f12184a;
            TLRPC.Chat chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.f12193b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                oVar.v.getLocationInWindow(iArr);
                lu0 lu0Var = new lu0();
                lu0Var.f38918b = iArr[0];
                lu0Var.f38919c = iArr[1];
                w9 w9Var = oVar.v;
                lu0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                lu0Var.f38917a = imageReceiver;
                lu0Var.f38920f = -oVar.f12193b;
                lu0Var.e = imageReceiver.getBitmapSafe();
                lu0Var.f38921g = -1L;
                lu0Var.h = oVar.v.getImageReceiver().getRoundRadius(true);
                lu0Var.f38924k = 1.0f;
                lu0Var.f38929p = true;
                return lu0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f12184a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f12184a.E.p(str, str2, z10);
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
