package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
public final class vy4 {
    public static lz4 F;
    public static int G;
    public int A;
    public ry4 a;
    public boolean f;
    public long g;
    public long h;
    public long i;
    public int j;
    public int k;
    public int l;
    public View m;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public int u;
    public boolean y;
    public int z;
    public final my4 b = new my4(this);
    public final ArrayList c = new ArrayList();
    public gz4 d = gz4.b;
    public final RectF e = new RectF();
    public final r89 n = new r89(0, false);
    public final ArrayList o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect w = new Rect();
    public final Rect x = new Rect();
    public final fz4 B = new fz4();
    public final fz4 C = new fz4();
    public final fz4 D = new fz4();
    public final ArrayList E = new ArrayList();

    public static lz4 f() {
        boolean e = i86.e(256);
        boolean e2 = i86.e(262144);
        lz4 lz4Var = F;
        if (lz4Var != null && lz4Var.a == e && lz4Var.b == e2) {
            return lz4Var;
        }
        lz4 lz4Var2 = new lz4(e, e2);
        F = lz4Var2;
        G++;
        return lz4Var2;
    }

    public final void a(tq3 tq3Var) {
        this.o.add(tq3Var);
    }

    public final void b(d79 d79Var) {
        if (d79Var == null) {
            return;
        }
        this.n.add(d79Var);
        d79Var.E2.b.add(new gt3(this, (byte) 1));
        oy4 oy4Var = new oy4(this);
        ArrayList arrayList = d79Var.Q;
        if (arrayList == null) {
            arrayList = new ArrayList();
            d79Var.Q = arrayList;
        }
        arrayList.add(oy4Var);
        d79Var.j(new to2(this, (byte) 14));
    }

    public final void c(vic vicVar) {
        if (vicVar != null) {
            ly4 ly4Var = new ly4(this);
            ArrayList arrayList = vicVar.S;
            if (!arrayList.contains(ly4Var)) {
                arrayList.add(ly4Var);
            }
        }
    }

    public final oz4 d(sy4 sy4Var) {
        oz4 oz4Var = new oz4();
        this.E.add(new ty4(oz4Var, sy4Var));
        oz4Var.a(sy4Var.h());
        return oz4Var;
    }

    public final fz4 e() {
        fz4 fz4Var = this.D;
        fz4 fz4Var2 = this.C;
        if (fz4Var == fz4Var2) {
            fz4Var.getClass();
            return fz4Var;
        }
        fz4Var.b = 0;
        int i = fz4Var2.b;
        for (int i2 = 0; i2 < i; i2++) {
            RectF rectF = (RectF) fz4Var2.a.get(i2);
            fz4Var.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return fz4Var;
    }

    public final void g() {
        this.i++;
    }

    public final void h(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.g++;
        this.k += i;
        this.l += i2;
    }

    public final void i(View view) {
        thc a;
        vhc vhcVar;
        View view2 = this.m;
        if (view2 != view) {
            my4 my4Var = this.b;
            if (view2 != null && (vhcVar = (vhc) view2.getTag(2131296699)) != null) {
                ArrayList arrayList = vhcVar.a;
                if (arrayList.remove(my4Var)) {
                    thc thcVar = vhcVar.b;
                    if (thcVar != null) {
                        ((r89) thcVar.a.b).remove(my4Var);
                    }
                    if (arrayList.isEmpty()) {
                        vhcVar.b = null;
                        view2.removeOnAttachStateChangeListener(vhcVar.c);
                        view2.setTag(2131296699, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    lq5.j("Cannot add OnPostDrawListener to root view");
                    return;
                }
                vhc vhcVar2 = (vhc) view.getTag(2131296699);
                if (vhcVar2 == null) {
                    vhcVar2 = new vhc();
                    view.setTag(2131296699, vhcVar2);
                    view.addOnAttachStateChangeListener(vhcVar2.c);
                }
                ArrayList arrayList2 = vhcVar2.a;
                if (!arrayList2.contains(my4Var)) {
                    arrayList2.add(my4Var);
                    if (view.isAttachedToWindow() && (a = n2f.a(view, vhcVar2)) != null) {
                        ((r89) a.a.b).add(my4Var);
                    }
                }
            }
            this.m = view;
        }
    }
}
