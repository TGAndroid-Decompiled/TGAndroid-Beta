package defpackage;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class ugb {
    public final boolean a;
    public wm9 d;
    public wm9 f;
    public wm9 h;
    public int[] j;
    public int[] l;
    public sgb[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final ehb x;
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean g = false;
    public boolean i = false;
    public boolean k = false;
    public boolean m = false;
    public boolean o = false;
    public boolean q = false;
    public boolean s = false;
    public boolean u = true;
    public final ahb v = new ahb(0);
    public final ahb w = new ahb(-100000);

    public ugb(ehb ehbVar, boolean z) {
        this.x = ehbVar;
        this.a = z;
    }

    public static void j(ArrayList arrayList, ygb ygbVar, ahb ahbVar, boolean z) {
        if (ygbVar.a() != 0) {
            if (z) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((sgb) obj).a.equals(ygbVar)) {
                        return;
                    }
                }
            }
            arrayList.add(new sgb(ygbVar, ahbVar));
        }
    }

    public static boolean m(int[] iArr, sgb sgbVar) {
        if (sgbVar.c) {
            ygb ygbVar = sgbVar.a;
            int i = ygbVar.a;
            int i2 = ygbVar.b;
            int i3 = iArr[i] + sgbVar.b.a;
            if (i3 > iArr[i2]) {
                iArr[i2] = i3;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(wm9 wm9Var, boolean z) {
        for (ahb ahbVar : (ahb[]) ((Object[]) wm9Var.d)) {
            ahbVar.a = Integer.MIN_VALUE;
        }
        vgb[] vgbVarArr = (vgb[]) ((Object[]) f().d);
        for (int i = 0; i < vgbVarArr.length; i++) {
            int d = vgbVarArr[i].d(z);
            ahb ahbVar2 = (ahb) ((Object[]) wm9Var.d)[((int[]) wm9Var.b)[i]];
            int i2 = ahbVar2.a;
            if (!z) {
                d = -d;
            }
            ahbVar2.a = Math.max(i2, d);
        }
    }

    public final void b(boolean z) {
        int[] iArr;
        bhb bhbVar;
        int i;
        if (z) {
            iArr = this.j;
        } else {
            iArr = this.l;
        }
        ehb ehbVar = this.x;
        int childCount = ehbVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            xgb d = ehbVar.d(i2);
            zgb zgbVar = d.a;
            boolean z2 = this.a;
            if (z2) {
                bhbVar = zgbVar.b;
            } else {
                bhbVar = zgbVar.a;
            }
            ygb ygbVar = bhbVar.b;
            if (z) {
                i = ygbVar.a;
            } else {
                i = ygbVar.b;
            }
            iArr[i] = Math.max(iArr[i], ehbVar.f(d, z2, z));
        }
    }

    public final wm9 c(boolean z) {
        ygb ygbVar;
        tgb tgbVar = new tgb(ygb.class, ahb.class);
        bhb[] bhbVarArr = (bhb[]) ((Object[]) f().c);
        int length = bhbVarArr.length;
        for (int i = 0; i < length; i++) {
            if (z) {
                ygbVar = bhbVarArr[i].b;
            } else {
                ygb ygbVar2 = bhbVarArr[i].b;
                ygbVar = new ygb(ygbVar2.b, ygbVar2.a);
            }
            ?? obj = new Object();
            obj.a = Integer.MIN_VALUE;
            tgbVar.add(Pair.create(ygbVar, obj));
        }
        return tgbVar.h();
    }

    public final sgb[] d() {
        if (this.n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            wm9 wm9Var = this.f;
            if (wm9Var == null) {
                wm9Var = c(true);
                this.f = wm9Var;
            }
            if (!this.g) {
                a(wm9Var, true);
                this.g = true;
            }
            wm9 wm9Var2 = this.f;
            int i = 0;
            while (true) {
                ygb[] ygbVarArr = (ygb[]) ((Object[]) wm9Var2.c);
                if (i >= ygbVarArr.length) {
                    break;
                }
                j(arrayList, ygbVarArr[i], ((ahb[]) ((Object[]) wm9Var2.d))[i], false);
                i++;
            }
            wm9 wm9Var3 = this.h;
            if (wm9Var3 == null) {
                wm9Var3 = c(false);
                this.h = wm9Var3;
            }
            if (!this.i) {
                a(wm9Var3, false);
                this.i = true;
            }
            wm9 wm9Var4 = this.h;
            int i2 = 0;
            while (true) {
                ygb[] ygbVarArr2 = (ygb[]) ((Object[]) wm9Var4.c);
                if (i2 >= ygbVarArr2.length) {
                    break;
                }
                j(arrayList2, ygbVarArr2[i2], ((ahb[]) ((Object[]) wm9Var4.d))[i2], false);
                i2++;
            }
            if (this.u) {
                int i3 = 0;
                while (i3 < e()) {
                    int i4 = i3 + 1;
                    j(arrayList, new ygb(i3, i4), new ahb(0), true);
                    i3 = i4;
                }
            }
            int e = e();
            j(arrayList, new ygb(0, e), this.v, false);
            j(arrayList2, new ygb(e, 0), this.w, false);
            sgb[] q = q(arrayList);
            sgb[] q2 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(sgb[].class.getComponentType(), q.length + q2.length);
            System.arraycopy(q, 0, objArr, 0, q.length);
            System.arraycopy(q2, 0, objArr, q.length, q2.length);
            this.n = (sgb[]) objArr;
        }
        if (!this.o) {
            wm9 wm9Var5 = this.f;
            if (wm9Var5 == null) {
                wm9Var5 = c(true);
                this.f = wm9Var5;
            }
            if (!this.g) {
                a(wm9Var5, true);
                this.g = true;
            }
            wm9 wm9Var6 = this.h;
            if (wm9Var6 == null) {
                wm9Var6 = c(false);
                this.h = wm9Var6;
            }
            if (!this.i) {
                a(wm9Var6, false);
                this.i = true;
            }
            this.o = true;
        }
        return this.n;
    }

    public final int e() {
        int max = Math.max(this.b, h());
        if (max <= 1024) {
            return max;
        }
        ehb.g("Table grid count out of bounds");
        throw null;
    }

    public final wm9 f() {
        bhb bhbVar;
        int i;
        int i2;
        int i3;
        bhb bhbVar2;
        vgb vgbVar;
        wm9 wm9Var = this.d;
        boolean z = this.a;
        ehb ehbVar = this.x;
        if (wm9Var == null) {
            tgb tgbVar = new tgb(bhb.class, vgb.class);
            int childCount = ehbVar.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                zgb zgbVar = ehbVar.d(i4).a;
                if (z) {
                    bhbVar2 = zgbVar.b;
                } else {
                    bhbVar2 = zgbVar.a;
                }
                bhb bhbVar3 = bhb.e;
                switch (bhbVar2.a(z).a) {
                    case 3:
                        vgbVar = new vgb();
                        break;
                    default:
                        vgbVar = new vgb();
                        break;
                }
                tgbVar.add(Pair.create(bhbVar2, vgbVar));
            }
            wm9Var = tgbVar.h();
            this.d = wm9Var;
        }
        if (!this.e) {
            for (vgb vgbVar2 : (vgb[]) ((Object[]) wm9Var.d)) {
                vgbVar2.c();
            }
            int childCount2 = ehbVar.getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                xgb d = ehbVar.d(i5);
                zgb zgbVar2 = d.a;
                if (z) {
                    bhbVar = zgbVar2.b;
                    i = d.k;
                } else {
                    bhbVar = zgbVar2.a;
                    i = d.l;
                }
                int e = ehbVar.e(d, z, false) + ehbVar.e(d, z, true) + i;
                float f = bhbVar.d;
                if (f == 0.0f) {
                    i2 = 0;
                } else {
                    i2 = this.t[i5];
                }
                int i6 = e + i2;
                wm9 wm9Var2 = this.d;
                vgb vgbVar3 = (vgb) ((Object[]) wm9Var2.d)[((int[]) wm9Var2.b)[i5]];
                int i7 = vgbVar3.c;
                if (bhbVar.c == ehb.T && f == 0.0f) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                vgbVar3.c = i7 & i3;
                int a = bhbVar.a(z).a(d, i6);
                vgbVar3.b(a, i6 - a);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        bhb bhbVar;
        boolean z;
        bhb bhbVar2;
        int[] iArr = this.p;
        if (iArr == null) {
            iArr = new int[e() + 1];
            this.p = iArr;
        }
        if (!this.q) {
            boolean z2 = this.s;
            float f = 0.0f;
            boolean z3 = this.a;
            ehb ehbVar = this.x;
            if (!z2) {
                int childCount = ehbVar.getChildCount();
                int i = 0;
                while (true) {
                    if (i < childCount) {
                        zgb zgbVar = ehbVar.d(i).a;
                        if (z3) {
                            bhbVar2 = zgbVar.b;
                        } else {
                            bhbVar2 = zgbVar.a;
                        }
                        if (bhbVar2.d != 0.0f) {
                            z = true;
                            break;
                        }
                        i++;
                    } else {
                        z = false;
                        break;
                    }
                }
                this.r = z;
                this.s = true;
            }
            if (!this.r) {
                p(d(), iArr, true);
            } else {
                int[] iArr2 = this.t;
                if (iArr2 == null) {
                    iArr2 = new int[ehbVar.getChildCount()];
                    this.t = iArr2;
                }
                Arrays.fill(iArr2, 0);
                p(d(), iArr, true);
                int childCount2 = (ehbVar.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = ehbVar.getChildCount();
                    for (int i2 = 0; i2 < childCount3; i2++) {
                        zgb zgbVar2 = ehbVar.d(i2).a;
                        if (z3) {
                            bhbVar = zgbVar2.b;
                        } else {
                            bhbVar = zgbVar2.a;
                        }
                        f += bhbVar.d;
                    }
                    int i3 = -1;
                    boolean z4 = true;
                    int i4 = 0;
                    while (i4 < childCount2) {
                        int i5 = (int) ((i4 + childCount2) / 2);
                        l();
                        o(f, i5);
                        boolean p = p(d(), iArr, false);
                        if (p) {
                            i4 = i5 + 1;
                            i3 = i5;
                        } else {
                            childCount2 = i5;
                        }
                        z4 = p;
                    }
                    if (i3 > 0 && !z4) {
                        l();
                        o(f, i3);
                        p(d(), iArr, true);
                    }
                }
            }
            if (!this.u) {
                int i6 = iArr[0];
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    iArr[i7] = iArr[i7] - i6;
                }
            }
            this.q = true;
        }
        return this.p;
    }

    public final int h() {
        bhb bhbVar;
        int i = this.c;
        int i2 = Integer.MIN_VALUE;
        if (i == Integer.MIN_VALUE) {
            ehb ehbVar = this.x;
            int childCount = ehbVar.getChildCount();
            int i3 = -1;
            for (int i4 = 0; i4 < childCount; i4++) {
                zgb zgbVar = ehbVar.d(i4).a;
                if (this.a) {
                    bhbVar = zgbVar.b;
                } else {
                    bhbVar = zgbVar.a;
                }
                ygb ygbVar = bhbVar.b;
                i3 = Math.max(Math.max(Math.max(i3, ygbVar.a), ygbVar.b), ygbVar.a());
            }
            if (i3 != -1) {
                i2 = i3;
            }
            int max = Math.max(0, i2);
            this.c = max;
            return max;
        }
        return i;
    }

    public final int i(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        ahb ahbVar = this.w;
        ahb ahbVar2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                ahbVar2.a = size;
                ahbVar.a = -size;
                this.q = false;
                return g()[e()];
            }
            ahbVar2.a = 0;
            ahbVar.a = -100000;
            this.q = false;
            return g()[e()];
        }
        ahbVar2.a = 0;
        ahbVar.a = -size;
        this.q = false;
        return g()[e()];
    }

    public final void k() {
        this.c = Integer.MIN_VALUE;
        this.d = null;
        this.f = null;
        this.h = null;
        this.j = null;
        this.l = null;
        this.n = null;
        this.p = null;
        this.t = null;
        this.s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.g = false;
        this.i = false;
        this.k = false;
        this.m = false;
        this.o = false;
        this.q = false;
    }

    public final void n(int i) {
        String str;
        if (i != Integer.MIN_VALUE && i < h()) {
            if (this.a) {
                str = "column";
            } else {
                str = "row";
            }
            ehb.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.b = i;
    }

    public final void o(float f, int i) {
        bhb bhbVar;
        Arrays.fill(this.t, 0);
        ehb ehbVar = this.x;
        int childCount = ehbVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            zgb zgbVar = ehbVar.d(i2).a;
            if (this.a) {
                bhbVar = zgbVar.b;
            } else {
                bhbVar = zgbVar.a;
            }
            float f2 = bhbVar.d;
            if (f2 != 0.0f) {
                int round = Math.round((i * f2) / f);
                this.t[i2] = round;
                i -= round;
                f -= f2;
            }
        }
    }

    public final boolean p(sgb[] sgbVarArr, int[] iArr, boolean z) {
        int e = e() + 1;
        loop0: for (int i = 0; i < sgbVarArr.length; i++) {
            Arrays.fill(iArr, 0);
            for (int i2 = 0; i2 < e; i2++) {
                boolean z2 = false;
                for (sgb sgbVar : sgbVarArr) {
                    z2 |= m(iArr, sgbVar);
                }
                if (!z2) {
                    break loop0;
                }
            }
            if (!z) {
                return false;
            }
            boolean[] zArr = new boolean[sgbVarArr.length];
            for (int i3 = 0; i3 < e; i3++) {
                int length = sgbVarArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    zArr[i4] = zArr[i4] | m(iArr, sgbVarArr[i4]);
                }
            }
            int i5 = 0;
            while (true) {
                if (i5 >= sgbVarArr.length) {
                    break;
                }
                if (zArr[i5]) {
                    sgb sgbVar2 = sgbVarArr[i5];
                    ygb ygbVar = sgbVar2.a;
                    if (ygbVar.a >= ygbVar.b) {
                        sgbVar2.c = false;
                        break;
                    }
                }
                i5++;
            }
        }
        return true;
    }

    public final sgb[] q(ArrayList arrayList) {
        e0c e0cVar = new e0c(this, (sgb[]) arrayList.toArray(new sgb[0]));
        int length = ((sgb[][]) e0cVar.d).length;
        for (int i = 0; i < length; i++) {
            e0cVar.w(i);
        }
        return (sgb[]) e0cVar.c;
    }
}
