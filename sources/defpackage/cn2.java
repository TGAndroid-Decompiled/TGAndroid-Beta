package defpackage;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class cn2 extends i98 {
    public final en2 a;

    public cn2(en2 en2Var) {
        this.a = en2Var;
    }

    @Override
    public final void F() {
        this.a.x.getImageReceiver().v0(true, true);
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            en2 en2Var = this.a;
            TLRPC.Chat K0 = en2Var.getMessagesController().K0(Long.valueOf(en2Var.c));
            if (K0 == null || (chatPhoto = K0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                en2Var.x.getLocationInWindow(iArr);
                p98 p98Var = new p98();
                p98Var.b = iArr[0];
                p98Var.c = iArr[1];
                be0 be0Var = en2Var.x;
                p98Var.d = be0Var;
                ImageReceiver imageReceiver = be0Var.getImageReceiver();
                p98Var.a = imageReceiver;
                p98Var.f = -en2Var.c;
                p98Var.e = imageReceiver.p();
                p98Var.g = -1L;
                p98Var.h = en2Var.x.getImageReceiver().z();
                p98Var.k = 1.0f;
                p98Var.p = true;
                return p98Var;
            }
        }
        return null;
    }

    @Override
    public final void g(String str, String str2, boolean z) {
        this.a.G.p(str, str2, z);
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final int x() {
        return 1;
    }
}
