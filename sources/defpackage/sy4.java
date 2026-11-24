package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
public final class sy4 {
    public static hz4 F;
    public static int G;
    public int A;
    public oy4 a;
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
    public final jy4 b = new jy4(this);
    public final ArrayList c = new ArrayList();
    public cz4 d = cz4.b;
    public final RectF e = new RectF();
    public final g79 n = new g79(0, false);
    public final ArrayList o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect w = new Rect();
    public final Rect x = new Rect();
    public final bz4 B = new bz4();
    public final bz4 C = new bz4();
    public final bz4 D = new bz4();
    public final ArrayList E = new ArrayList();

    public static hz4 f() {
        boolean e = e86.e(256);
        boolean e2 = e86.e(262144);
        hz4 hz4Var = F;
        if (hz4Var != null && hz4Var.a == e && hz4Var.b == e2) {
            return hz4Var;
        }
        hz4 hz4Var2 = new hz4(e, e2);
        F = hz4Var2;
        G++;
        return hz4Var2;
    }

    public final void a(mr3 mr3Var) {
        this.o.add(mr3Var);
    }

    public final void b(r59 r59Var) {
        if (r59Var == null) {
            return;
        }
        this.n.add(r59Var);
        r59Var.E2.b.add(new yt3(this, (byte) 1));
        ly4 ly4Var = new ly4(this);
        ArrayList arrayList = r59Var.Q;
        if (arrayList == null) {
            arrayList = new ArrayList();
            r59Var.Q = arrayList;
        }
        arrayList.add(ly4Var);
        r59Var.j(new ip2(this, (byte) 15));
    }

    public final void c(wgc wgcVar) {
        if (wgcVar != null) {
            iy4 iy4Var = new iy4(this);
            ArrayList arrayList = wgcVar.S;
            if (!arrayList.contains(iy4Var)) {
                arrayList.add(iy4Var);
            }
        }
    }

    public final kz4 d(py4 py4Var) {
        kz4 kz4Var = new kz4();
        this.E.add(new qy4(kz4Var, py4Var));
        kz4Var.a(py4Var.i());
        return kz4Var;
    }

    public final bz4 e() {
        bz4 bz4Var = this.D;
        bz4 bz4Var2 = this.C;
        if (bz4Var == bz4Var2) {
            bz4Var.getClass();
            return bz4Var;
        }
        bz4Var.b = 0;
        int i = bz4Var2.b;
        for (int i2 = 0; i2 < i; i2++) {
            RectF rectF = (RectF) bz4Var2.a.get(i2);
            bz4Var.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return bz4Var;
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
        vfc a;
        xfc xfcVar;
        View view2 = this.m;
        if (view2 != view) {
            jy4 jy4Var = this.b;
            if (view2 != null && (xfcVar = (xfc) view2.getTag(2131296699)) != null) {
                ArrayList arrayList = xfcVar.a;
                if (arrayList.remove(jy4Var)) {
                    vfc vfcVar = xfcVar.b;
                    if (vfcVar != null) {
                        ((g79) vfcVar.a.b).remove(jy4Var);
                    }
                    if (arrayList.isEmpty()) {
                        xfcVar.b = null;
                        view2.removeOnAttachStateChangeListener(xfcVar.c);
                        view2.setTag(2131296699, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    u36.j("Cannot add OnPostDrawListener to root view");
                    return;
                }
                xfc xfcVar2 = (xfc) view.getTag(2131296699);
                if (xfcVar2 == null) {
                    xfcVar2 = new xfc();
                    view.setTag(2131296699, xfcVar2);
                    view.addOnAttachStateChangeListener(xfcVar2.c);
                }
                ArrayList arrayList2 = xfcVar2.a;
                if (!arrayList2.contains(jy4Var)) {
                    arrayList2.add(jy4Var);
                    if (view.isAttachedToWindow() && (a = wze.a(view, xfcVar2)) != null) {
                        ((g79) a.a.b).add(jy4Var);
                    }
                }
            }
            this.m = view;
        }
    }
}
