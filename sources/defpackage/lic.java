package defpackage;

import android.content.Context;
public final class lic extends uic {
    public final vic u0;

    public lic(vic vicVar, Context context, boolean z, int i, vnb vnbVar) {
        super(i, vnbVar, context, z);
        this.u0 = vicVar;
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
        this.u0.A(i3, z);
    }
}
