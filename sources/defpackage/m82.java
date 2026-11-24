package defpackage;

import org.telegram.tgnet.TLRPC;
public final class m82 extends i98 {
    public final p82 a;

    public m82(p82 p82Var) {
        this.a = p82Var;
    }

    @Override
    public final void F() {
        this.a.e.getImageReceiver().v0(true, true);
    }

    @Override
    public final defpackage.p98 M(defpackage.k27 r7, org.telegram.tgnet.TLRPC.FileLocation r8, int r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m82.M(k27, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):p98");
    }

    @Override
    public final boolean N() {
        p82 p82Var = this.a;
        long j = p82Var.C0;
        if (j == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = p82Var.getMessagesController().m1(j);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        p82Var.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new uf(this, (byte) 12));
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
