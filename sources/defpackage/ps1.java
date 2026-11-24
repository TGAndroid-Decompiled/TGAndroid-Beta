package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ps1 extends i98 {
    public final k27 a;
    public final jm6 b;
    public final qs1 c;

    public ps1(qs1 qs1Var, k27 k27Var, jm6 jm6Var) {
        this.c = qs1Var;
        this.a = k27Var;
        this.b = jm6Var;
    }

    @Override
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        vs1 vs1Var = this.c.a;
        k27 k27Var = this.a;
        k27Var.q = true;
        jm6 jm6Var = this.b;
        if (jm6Var.h == null && !jm6Var.b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
            TLRPC.Photo photo = k27Var.k.action.photo;
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            vs1Var.R.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new pl(this, k27Var, (byte) 17));
            return;
        }
        mu1 mu1Var = vs1Var.R;
        os1 os1Var = new os1(k27Var, (byte) 0);
        ui5 parentLayout = mu1Var.getParentLayout();
        int currentAccount = mu1Var.getCurrentAccount();
        wl5 wl5Var = new wl5(0, true, true);
        wl5Var.a = mu1Var;
        wl5Var.s(jm6Var);
        wl5Var.b = new zm(currentAccount, os1Var, parentLayout, wl5Var);
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        return this.c.a.R.db.M(this.a, fileLocation, i, z, false);
    }
}
