package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class pe1 implements Runnable {
    public final nf1 a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final View e;
    public final float f;
    public final float h;

    public pe1(nf1 nf1Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f, float f2) {
        this.a = nf1Var;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f = f;
        this.h = f2;
    }

    @Override
    public final void run() {
        this.a.S0(this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
