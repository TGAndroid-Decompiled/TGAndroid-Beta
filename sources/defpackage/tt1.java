package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class tt1 extends jb8 {
    public final Bitmap a;
    public final ArrayList b;
    public final yv1 c;

    public tt1(yv1 yv1Var, Bitmap bitmap, ArrayList arrayList) {
        this.c = yv1Var;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        this.c.G((jo6) this.b.get(0), rccVar, z, i2, z2, 0L);
    }

    @Override
    public final jn5 k(int i) {
        return new jn5(this.a, null, 0);
    }
}
