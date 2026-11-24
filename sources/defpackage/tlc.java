package defpackage;

import android.media.VolumeProvider;
public final class tlc extends VolumeProvider {
    public final dz3 a;

    public tlc(dz3 dz3Var, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = dz3Var;
    }

    @Override
    public final void onAdjustVolume(int i) {
        dz3 dz3Var = this.a;
        ((wz4) ((in3) dz3Var.f).d).a.post(new uz4(dz3Var, i, (byte) 1));
    }

    @Override
    public final void onSetVolumeTo(int i) {
        dz3 dz3Var = this.a;
        ((wz4) ((in3) dz3Var.f).d).a.post(new uz4(dz3Var, i, (byte) 0));
    }
}
