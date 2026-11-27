package defpackage;

import org.telegram.tgnet.TLRPC;
public final class d92 extends yc8 {
    public final g92 a;

    public d92(g92 g92Var) {
        this.a = g92Var;
    }

    @Override
    public final void F() {
        this.a.e.getImageReceiver().v0(true, true);
    }

    @Override
    public final defpackage.fd8 M(defpackage.r47 r7, org.telegram.tgnet.TLRPC.FileLocation r8, int r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d92.M(r47, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):fd8");
    }

    @Override
    public final boolean N() {
        g92 g92Var = this.a;
        long j = g92Var.C0;
        if (j == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = g92Var.getMessagesController().o1(j);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        g92Var.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ye(this, (byte) 12));
        return false;
    }

    @Override
    public final void g(String str, String str2, boolean z) {
        this.a.s.p(str, str2, z);
    }

    @Override
    public final int x() {
        return 1;
    }
}
