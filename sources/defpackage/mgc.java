package defpackage;

import android.content.Context;
public final class mgc extends vgc {
    public final wgc u0;

    public mgc(wgc wgcVar, Context context, boolean z, int i, ylb ylbVar) {
        super(i, ylbVar, context, z);
        this.u0 = wgcVar;
    }

    @Override
    public final void f(float f, int i, int i2) {
        int i3;
        boolean z;
        super.f(f, i, i2);
        if (f <= 0.5f) {
            i3 = i;
        } else {
            i3 = i2;
        }
        if (i < i2) {
            z = true;
        } else {
            z = false;
        }
        this.u0.z(i3, z);
    }
}
