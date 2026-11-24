package defpackage;

import android.media.VolumeProvider;
public final class tjc extends VolumeProvider {
    public final tx3 a;

    public tjc(tx3 tx3Var, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = tx3Var;
    }

    @Override
    public final void onAdjustVolume(int i) {
        tx3 tx3Var = this.a;
        ((ux4) ((xl3) tx3Var.f).d).a.post(new sx4(tx3Var, i, (byte) 1));
    }

    @Override
    public final void onSetVolumeTo(int i) {
        tx3 tx3Var = this.a;
        ((ux4) ((xl3) tx3Var.f).d).a.post(new sx4(tx3Var, i, (byte) 0));
    }
}
