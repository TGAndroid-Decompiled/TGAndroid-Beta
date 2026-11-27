package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class us1 extends yc8 {
    public final Bitmap a;
    public final ArrayList b;
    public final zu1 c;

    public us1(zu1 zu1Var, Bitmap bitmap, ArrayList arrayList) {
        this.c = zu1Var;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        this.c.G((no6) this.b.get(0), oecVar, z, i2, z2, 0L);
    }

    @Override
    public final mn5 k(int i) {
        return new mn5(this.a, null, 0);
    }
}
