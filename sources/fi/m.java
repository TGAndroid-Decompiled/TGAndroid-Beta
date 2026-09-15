package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u9;
import org.telegram.ui.dv0;
import org.telegram.ui.tu0;
public final class m extends tu0 {
    public final p f9135a;

    public m(p pVar) {
        this.f9135a = pVar;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.f9135a;
            TLRPC.Chat chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f9148b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.v.getLocationInWindow(iArr);
                dv0 dv0Var = new dv0();
                dv0Var.f33135b = iArr[0];
                dv0Var.f33136c = iArr[1];
                u9 u9Var = pVar.v;
                dv0Var.d = u9Var;
                ImageReceiver imageReceiver = u9Var.getImageReceiver();
                dv0Var.f33134a = imageReceiver;
                dv0Var.f33137f = -pVar.f9148b;
                dv0Var.e = imageReceiver.getBitmapSafe();
                dv0Var.f33138g = -1L;
                dv0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                dv0Var.f33141k = 1.0f;
                dv0Var.f33146p = true;
                return dv0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f9135a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f9135a.E.q(str, str2, z10);
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
