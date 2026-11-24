package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class xf1 implements Runnable {
    public final vg1 a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final View e;
    public final float f;
    public final float h;

    public xf1(vg1 vg1Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f, float f2) {
        this.a = vg1Var;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f = f;
        this.h = f2;
    }

    @Override
    public final void run() {
        this.a.T0(this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
