package ji;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k9;
import org.telegram.ui.eq0;
import org.telegram.ui.mq0;
public final class l extends eq0 {
    public final n f16340a;

    public l(n nVar) {
        this.f16340a = nVar;
    }

    @Override
    public final mq0 E(zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            n nVar = this.f16340a;
            TLRPC.Chat M0 = nVar.getMessagesController().M0(Long.valueOf(nVar.f16344c));
            if (M0 == null || (chatPhoto = M0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                nVar.f16351x.getLocationInWindow(iArr);
                mq0 mq0Var = new mq0();
                mq0Var.f47752b = iArr[0];
                mq0Var.f47753c = iArr[1];
                k9 k9Var = nVar.f16351x;
                mq0Var.d = k9Var;
                ImageReceiver imageReceiver = k9Var.getImageReceiver();
                mq0Var.f47751a = imageReceiver;
                mq0Var.f47755f = -nVar.f16344c;
                mq0Var.f47754e = imageReceiver.p();
                mq0Var.f47756g = -1L;
                mq0Var.h = nVar.f16351x.getImageReceiver().E();
                mq0Var.f47759k = 1.0f;
                mq0Var.f47764p = true;
                return mq0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f16340a.f16351x.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f16340a.G.p(str, str2, z10);
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
