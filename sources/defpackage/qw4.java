package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
public final class qw4 {
    public static fx4 F;
    public static int G;
    public int A;
    public mw4 a;
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
    public final hw4 b = new hw4(this);
    public final ArrayList c = new ArrayList();
    public ax4 d = ax4.b;
    public final RectF e = new RectF();
    public final e59 n = new e59(0, false);
    public final ArrayList o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect w = new Rect();
    public final Rect x = new Rect();
    public final zw4 B = new zw4();
    public final zw4 C = new zw4();
    public final zw4 D = new zw4();
    public final ArrayList E = new ArrayList();

    public static fx4 f() {
        boolean e = e66.e(256);
        boolean e2 = e66.e(262144);
        fx4 fx4Var = F;
        if (fx4Var != null && fx4Var.a == e && fx4Var.b == e2) {
            return fx4Var;
        }
        fx4 fx4Var2 = new fx4(e, e2);
        F = fx4Var2;
        G++;
        return fx4Var2;
    }

    public final void a(cq3 cq3Var) {
        this.o.add(cq3Var);
    }

    public final void b(o39 o39Var) {
        if (o39Var == null) {
            return;
        }
        this.n.add(o39Var);
        o39Var.E2.b.add(new os3(this, (byte) 1));
        jw4 jw4Var = new jw4(this);
        ArrayList arrayList = o39Var.Q;
        if (arrayList == null) {
            arrayList = new ArrayList();
            o39Var.Q = arrayList;
        }
        arrayList.add(jw4Var);
        o39Var.j(new ao2(this, (byte) 14));
    }

    public final void c(wec wecVar) {
        if (wecVar != null) {
            gw4 gw4Var = new gw4(this);
            ArrayList arrayList = wecVar.S;
            if (!arrayList.contains(gw4Var)) {
                arrayList.add(gw4Var);
            }
        }
    }

    public final ix4 d(nw4 nw4Var) {
        ix4 ix4Var = new ix4();
        this.E.add(new ow4(ix4Var, nw4Var));
        ix4Var.a(nw4Var.i());
        return ix4Var;
    }

    public final zw4 e() {
        zw4 zw4Var = this.D;
        zw4 zw4Var2 = this.C;
        if (zw4Var == zw4Var2) {
            zw4Var.getClass();
            return zw4Var;
        }
        zw4Var.b = 0;
        int i = zw4Var2.b;
        for (int i2 = 0; i2 < i; i2++) {
            RectF rectF = (RectF) zw4Var2.a.get(i2);
            zw4Var.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return zw4Var;
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
        udc a;
        wdc wdcVar;
        View view2 = this.m;
        if (view2 != view) {
            hw4 hw4Var = this.b;
            if (view2 != null && (wdcVar = (wdc) view2.getTag(2131296699)) != null) {
                ArrayList arrayList = wdcVar.a;
                if (arrayList.remove(hw4Var)) {
                    udc udcVar = wdcVar.b;
                    if (udcVar != null) {
                        ((e59) udcVar.a.b).remove(hw4Var);
                    }
                    if (arrayList.isEmpty()) {
                        wdcVar.b = null;
                        view2.removeOnAttachStateChangeListener(wdcVar.c);
                        view2.setTag(2131296699, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    w26.j("Cannot add OnPostDrawListener to root view");
                    return;
                }
                wdc wdcVar2 = (wdc) view.getTag(2131296699);
                if (wdcVar2 == null) {
                    wdcVar2 = new wdc();
                    view.setTag(2131296699, wdcVar2);
                    view.addOnAttachStateChangeListener(wdcVar2.c);
                }
                ArrayList arrayList2 = wdcVar2.a;
                if (!arrayList2.contains(hw4Var)) {
                    arrayList2.add(hw4Var);
                    if (view.isAttachedToWindow() && (a = uxe.a(view, wdcVar2)) != null) {
                        ((e59) a.a.b).add(hw4Var);
                    }
                }
            }
            this.m = view;
        }
    }
}
