package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ct1 extends yc8 {
    public final r47 a;
    public final no6 b;
    public final dt1 c;

    public ct1(dt1 dt1Var, r47 r47Var, no6 no6Var) {
        this.c = dt1Var;
        this.a = r47Var;
        this.b = no6Var;
    }

    @Override
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        it1 it1Var = this.c.a;
        r47 r47Var = this.a;
        r47Var.q = true;
        no6 no6Var = this.b;
        if (no6Var.h == null && !no6Var.b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
            TLRPC.Photo photo = r47Var.k.action.photo;
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            it1Var.R.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ql(this, r47Var, (byte) 17));
            return;
        }
        zu1 zu1Var = it1Var.R;
        bt1 bt1Var = new bt1(r47Var, (byte) 0);
        wk5 parentLayout = zu1Var.getParentLayout();
        int currentAccount = zu1Var.getCurrentAccount();
        zn5 zn5Var = new zn5(0, true, true);
        zn5Var.a = zu1Var;
        zn5Var.s(no6Var);
        zn5Var.b = new an(currentAccount, bt1Var, parentLayout, zn5Var);
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        return this.c.a.R.db.M(this.a, fileLocation, i, z, false);
    }
}
