package nh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o9;
import org.telegram.ui.bu0;
import org.telegram.ui.rt0;
public final class m extends rt0 {
    public final o f18677a;

    public m(o oVar) {
        this.f18677a = oVar;
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            o oVar = this.f18677a;
            TLRPC.Chat chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.f18683b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                oVar.v.getLocationInWindow(iArr);
                bu0 bu0Var = new bu0();
                bu0Var.f36979b = iArr[0];
                bu0Var.f36980c = iArr[1];
                o9 o9Var = oVar.v;
                bu0Var.d = o9Var;
                ImageReceiver imageReceiver = o9Var.getImageReceiver();
                bu0Var.f36978a = imageReceiver;
                bu0Var.f36982f = -oVar.f18683b;
                bu0Var.f36981e = imageReceiver.getBitmapSafe();
                bu0Var.f36983g = -1L;
                bu0Var.h = oVar.v.getImageReceiver().getRoundRadius(true);
                bu0Var.f36986k = 1.0f;
                bu0Var.f36991p = true;
                return bu0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f18677a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f18677a.A.q(str, str2, z10);
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
