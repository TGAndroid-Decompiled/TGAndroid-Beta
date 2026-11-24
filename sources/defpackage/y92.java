package defpackage;

import org.telegram.tgnet.TLRPC;
public final class y92 extends jb8 {
    public final ba2 a;

    public y92(ba2 ba2Var) {
        this.a = ba2Var;
    }

    @Override
    public final void G() {
        this.a.e.getImageReceiver().v0(true, true);
    }

    @Override
    public final defpackage.qb8 N(defpackage.k47 r7, org.telegram.tgnet.TLRPC.FileLocation r8, int r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y92.N(k47, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):qb8");
    }

    @Override
    public final boolean O() {
        ba2 ba2Var = this.a;
        long j = ba2Var.C0;
        if (j == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = ba2Var.getMessagesController().n1(j);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        ba2Var.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new tg(this, (byte) 12));
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
