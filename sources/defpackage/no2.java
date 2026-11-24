package defpackage;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class no2 extends jb8 {
    public final po2 a;

    public no2(po2 po2Var) {
        this.a = po2Var;
    }

    @Override
    public final void G() {
        this.a.x.getImageReceiver().v0(true, true);
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            po2 po2Var = this.a;
            TLRPC.Chat L0 = po2Var.getMessagesController().L0(Long.valueOf(po2Var.c));
            if (L0 == null || (chatPhoto = L0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                po2Var.x.getLocationInWindow(iArr);
                qb8 qb8Var = new qb8();
                qb8Var.b = iArr[0];
                qb8Var.c = iArr[1];
                bf0 bf0Var = po2Var.x;
                qb8Var.d = bf0Var;
                ImageReceiver imageReceiver = bf0Var.getImageReceiver();
                qb8Var.a = imageReceiver;
                qb8Var.f = -po2Var.c;
                qb8Var.e = imageReceiver.p();
                qb8Var.g = -1L;
                qb8Var.h = po2Var.x.getImageReceiver().z();
                qb8Var.k = 1.0f;
                qb8Var.p = true;
                return qb8Var;
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
