package defpackage;

import org.telegram.tgnet.TLRPC;
public final class bu1 extends jb8 {
    public final k47 a;
    public final jo6 b;
    public final cu1 c;

    public bu1(cu1 cu1Var, k47 k47Var, jo6 jo6Var) {
        this.c = cu1Var;
        this.a = k47Var;
        this.b = jo6Var;
    }

    @Override
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        hu1 hu1Var = this.c.a;
        k47 k47Var = this.a;
        k47Var.q = true;
        jo6 jo6Var = this.b;
        if (jo6Var.h == null && !jo6Var.b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
            TLRPC.Photo photo = k47Var.k.action.photo;
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            hu1Var.R.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new pm(this, k47Var, (byte) 17));
            return;
        }
        yv1 yv1Var = hu1Var.R;
        au1 au1Var = new au1(k47Var, (byte) 0);
        tk5 parentLayout = yv1Var.getParentLayout();
        int currentAccount = yv1Var.getCurrentAccount();
        wn5 wn5Var = new wn5(0, true, true);
        wn5Var.a = yv1Var;
        wn5Var.s(jo6Var);
        wn5Var.b = new zn(currentAccount, au1Var, parentLayout, wn5Var);
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        return this.c.a.R.db.N(this.a, fileLocation, i, z, false);
    }
}
