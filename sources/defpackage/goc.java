package defpackage;

import android.media.VolumeProvider;
public final class goc extends VolumeProvider {
    public final oy3 a;

    public goc(oy3 oy3Var, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = oy3Var;
    }

    @Override
    public final void onAdjustVolume(int i) {
        oy3 oy3Var = this.a;
        ((a05) ((pm3) oy3Var.f).d).a.post(new yz4(oy3Var, i, (byte) 1));
    }

    @Override
    public final void onSetVolumeTo(int i) {
        oy3 oy3Var = this.a;
        ((a05) ((pm3) oy3Var.f).d).a.post(new yz4(oy3Var, i, (byte) 0));
    }
}
