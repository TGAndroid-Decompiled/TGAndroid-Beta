package defpackage;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class vn2 extends yc8 {
    public final xn2 a;

    public vn2(xn2 xn2Var) {
        this.a = xn2Var;
    }

    @Override
    public final void F() {
        this.a.x.getImageReceiver().v0(true, true);
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            xn2 xn2Var = this.a;
            TLRPC.Chat M0 = xn2Var.getMessagesController().M0(Long.valueOf(xn2Var.c));
            if (M0 == null || (chatPhoto = M0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                xn2Var.x.getLocationInWindow(iArr);
                fd8 fd8Var = new fd8();
                fd8Var.b = iArr[0];
                fd8Var.c = iArr[1];
                de0 de0Var = xn2Var.x;
                fd8Var.d = de0Var;
                ImageReceiver imageReceiver = de0Var.getImageReceiver();
                fd8Var.a = imageReceiver;
                fd8Var.f = -xn2Var.c;
                fd8Var.e = imageReceiver.p();
                fd8Var.g = -1L;
                fd8Var.h = xn2Var.x.getImageReceiver().z();
                fd8Var.k = 1.0f;
                fd8Var.p = true;
                return fd8Var;
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
