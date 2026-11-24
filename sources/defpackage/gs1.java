package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class gs1 extends i98 {
    public final Bitmap a;
    public final ArrayList b;
    public final mu1 c;

    public gs1(mu1 mu1Var, Bitmap bitmap, ArrayList arrayList) {
        this.c = mu1Var;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        this.c.E((jm6) this.b.get(0), oacVar, z, i2, z2, 0L);
    }

    @Override
    public final jl5 k(int i) {
        return new jl5(this.a, null, 0);
    }
}
