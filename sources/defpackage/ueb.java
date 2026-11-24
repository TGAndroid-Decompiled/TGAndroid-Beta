package defpackage;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class ueb {
    public final boolean a;
    public vk9 d;
    public vk9 f;
    public vk9 h;
    public int[] j;
    public int[] l;
    public seb[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final efb x;
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
    public final afb v = new afb(0);
    public final afb w = new afb(-100000);

    public ueb(efb efbVar, boolean z) {
        this.x = efbVar;
        this.a = z;
    }

    public static void j(ArrayList arrayList, yeb yebVar, afb afbVar, boolean z) {
        if (yebVar.a() != 0) {
            if (z) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((seb) obj).a.equals(yebVar)) {
                        return;
                    }
                }
            }
            arrayList.add(new seb(yebVar, afbVar));
        }
    }

    public static boolean m(int[] iArr, seb sebVar) {
        if (sebVar.c) {
            yeb yebVar = sebVar.a;
            int i = yebVar.a;
            int i2 = yebVar.b;
            int i3 = iArr[i] + sebVar.b.a;
            if (i3 > iArr[i2]) {
                iArr[i2] = i3;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(vk9 vk9Var, boolean z) {
        for (afb afbVar : (afb[]) ((Object[]) vk9Var.d)) {
            afbVar.a = Integer.MIN_VALUE;
        }
        veb[] vebVarArr = (veb[]) ((Object[]) f().d);
        for (int i = 0; i < vebVarArr.length; i++) {
            int d = vebVarArr[i].d(z);
            afb afbVar2 = (afb) ((Object[]) vk9Var.d)[((int[]) vk9Var.b)[i]];
            int i2 = afbVar2.a;
            if (!z) {
                d = -d;
            }
            afbVar2.a = Math.max(i2, d);
        }
    }

    public final void b(boolean z) {
        int[] iArr;
        bfb bfbVar;
        int i;
        if (z) {
            iArr = this.j;
        } else {
            iArr = this.l;
        }
        efb efbVar = this.x;
        int childCount = efbVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            xeb d = efbVar.d(i2);
            zeb zebVar = d.a;
            boolean z2 = this.a;
            if (z2) {
                bfbVar = zebVar.b;
            } else {
                bfbVar = zebVar.a;
            }
            yeb yebVar = bfbVar.b;
            if (z) {
                i = yebVar.a;
            } else {
                i = yebVar.b;
            }
            iArr[i] = Math.max(iArr[i], efbVar.f(d, z2, z));
        }
    }

    public final vk9 c(boolean z) {
        yeb yebVar;
        teb tebVar = new teb(yeb.class, afb.class);
        bfb[] bfbVarArr = (bfb[]) ((Object[]) f().c);
        int length = bfbVarArr.length;
        for (int i = 0; i < length; i++) {
            if (z) {
                yebVar = bfbVarArr[i].b;
            } else {
                yeb yebVar2 = bfbVarArr[i].b;
                yebVar = new yeb(yebVar2.b, yebVar2.a);
            }
            ?? obj = new Object();
            obj.a = Integer.MIN_VALUE;
            tebVar.add(Pair.create(yebVar, obj));
        }
        return tebVar.h();
    }

    public final seb[] d() {
        if (this.n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            vk9 vk9Var = this.f;
            if (vk9Var == null) {
                vk9Var = c(true);
                this.f = vk9Var;
            }
            if (!this.g) {
                a(vk9Var, true);
                this.g = true;
            }
            vk9 vk9Var2 = this.f;
            int i = 0;
            while (true) {
                yeb[] yebVarArr = (yeb[]) ((Object[]) vk9Var2.c);
                if (i >= yebVarArr.length) {
                    break;
                }
                j(arrayList, yebVarArr[i], ((afb[]) ((Object[]) vk9Var2.d))[i], false);
                i++;
            }
            vk9 vk9Var3 = this.h;
            if (vk9Var3 == null) {
                vk9Var3 = c(false);
                this.h = vk9Var3;
            }
            if (!this.i) {
                a(vk9Var3, false);
                this.i = true;
            }
            vk9 vk9Var4 = this.h;
            int i2 = 0;
            while (true) {
                yeb[] yebVarArr2 = (yeb[]) ((Object[]) vk9Var4.c);
                if (i2 >= yebVarArr2.length) {
                    break;
                }
                j(arrayList2, yebVarArr2[i2], ((afb[]) ((Object[]) vk9Var4.d))[i2], false);
                i2++;
            }
            if (this.u) {
                int i3 = 0;
                while (i3 < e()) {
                    int i4 = i3 + 1;
                    j(arrayList, new yeb(i3, i4), new afb(0), true);
                    i3 = i4;
                }
            }
            int e = e();
            j(arrayList, new yeb(0, e), this.v, false);
            j(arrayList2, new yeb(e, 0), this.w, false);
            seb[] q = q(arrayList);
            seb[] q2 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(seb[].class.getComponentType(), q.length + q2.length);
            System.arraycopy(q, 0, objArr, 0, q.length);
            System.arraycopy(q2, 0, objArr, q.length, q2.length);
            this.n = (seb[]) objArr;
        }
        if (!this.o) {
            vk9 vk9Var5 = this.f;
            if (vk9Var5 == null) {
                vk9Var5 = c(true);
                this.f = vk9Var5;
            }
            if (!this.g) {
                a(vk9Var5, true);
                this.g = true;
            }
            vk9 vk9Var6 = this.h;
            if (vk9Var6 == null) {
                vk9Var6 = c(false);
                this.h = vk9Var6;
            }
            if (!this.i) {
                a(vk9Var6, false);
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
        efb.g("Table grid count out of bounds");
        throw null;
    }

    public final vk9 f() {
        bfb bfbVar;
        int i;
        int i2;
        int i3;
        bfb bfbVar2;
        veb vebVar;
        vk9 vk9Var = this.d;
        boolean z = this.a;
        efb efbVar = this.x;
        if (vk9Var == null) {
            teb tebVar = new teb(bfb.class, veb.class);
            int childCount = efbVar.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                zeb zebVar = efbVar.d(i4).a;
                if (z) {
                    bfbVar2 = zebVar.b;
                } else {
                    bfbVar2 = zebVar.a;
                }
                bfb bfbVar3 = bfb.e;
                switch (bfbVar2.a(z).a) {
                    case 3:
                        vebVar = new veb();
                        break;
                    default:
                        vebVar = new veb();
                        break;
                }
                tebVar.add(Pair.create(bfbVar2, vebVar));
            }
            vk9Var = tebVar.h();
            this.d = vk9Var;
        }
        if (!this.e) {
            for (veb vebVar2 : (veb[]) ((Object[]) vk9Var.d)) {
                vebVar2.c();
            }
            int childCount2 = efbVar.getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                xeb d = efbVar.d(i5);
                zeb zebVar2 = d.a;
                if (z) {
                    bfbVar = zebVar2.b;
                    i = d.k;
                } else {
                    bfbVar = zebVar2.a;
                    i = d.l;
                }
                int e = efbVar.e(d, z, false) + efbVar.e(d, z, true) + i;
                float f = bfbVar.d;
                if (f == 0.0f) {
                    i2 = 0;
                } else {
                    i2 = this.t[i5];
                }
                int i6 = e + i2;
                vk9 vk9Var2 = this.d;
                veb vebVar3 = (veb) ((Object[]) vk9Var2.d)[((int[]) vk9Var2.b)[i5]];
                int i7 = vebVar3.c;
                if (bfbVar.c == efb.T && f == 0.0f) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                vebVar3.c = i7 & i3;
                int a = bfbVar.a(z).a(d, i6);
                vebVar3.b(a, i6 - a);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        bfb bfbVar;
        boolean z;
        bfb bfbVar2;
        int[] iArr = this.p;
        if (iArr == null) {
            iArr = new int[e() + 1];
            this.p = iArr;
        }
        if (!this.q) {
            boolean z2 = this.s;
            float f = 0.0f;
            boolean z3 = this.a;
            efb efbVar = this.x;
            if (!z2) {
                int childCount = efbVar.getChildCount();
                int i = 0;
                while (true) {
                    if (i < childCount) {
                        zeb zebVar = efbVar.d(i).a;
                        if (z3) {
                            bfbVar2 = zebVar.b;
                        } else {
                            bfbVar2 = zebVar.a;
                        }
                        if (bfbVar2.d != 0.0f) {
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
                    iArr2 = new int[efbVar.getChildCount()];
                    this.t = iArr2;
                }
                Arrays.fill(iArr2, 0);
                p(d(), iArr, true);
                int childCount2 = (efbVar.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = efbVar.getChildCount();
                    for (int i2 = 0; i2 < childCount3; i2++) {
                        zeb zebVar2 = efbVar.d(i2).a;
                        if (z3) {
                            bfbVar = zebVar2.b;
                        } else {
                            bfbVar = zebVar2.a;
                        }
                        f += bfbVar.d;
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
        bfb bfbVar;
        int i = this.c;
        int i2 = Integer.MIN_VALUE;
        if (i == Integer.MIN_VALUE) {
            efb efbVar = this.x;
            int childCount = efbVar.getChildCount();
            int i3 = -1;
            for (int i4 = 0; i4 < childCount; i4++) {
                zeb zebVar = efbVar.d(i4).a;
                if (this.a) {
                    bfbVar = zebVar.b;
                } else {
                    bfbVar = zebVar.a;
                }
                yeb yebVar = bfbVar.b;
                i3 = Math.max(Math.max(Math.max(i3, yebVar.a), yebVar.b), yebVar.a());
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
        afb afbVar = this.w;
        afb afbVar2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                afbVar2.a = size;
                afbVar.a = -size;
                this.q = false;
                return g()[e()];
            }
            afbVar2.a = 0;
            afbVar.a = -100000;
            this.q = false;
            return g()[e()];
        }
        afbVar2.a = 0;
        afbVar.a = -size;
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
            efb.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.b = i;
    }

    public final void o(float f, int i) {
        bfb bfbVar;
        Arrays.fill(this.t, 0);
        efb efbVar = this.x;
        int childCount = efbVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            zeb zebVar = efbVar.d(i2).a;
            if (this.a) {
                bfbVar = zebVar.b;
            } else {
                bfbVar = zebVar.a;
            }
            float f2 = bfbVar.d;
            if (f2 != 0.0f) {
                int round = Math.round((i * f2) / f);
                this.t[i2] = round;
                i -= round;
                f -= f2;
            }
        }
    }

    public final boolean p(seb[] sebVarArr, int[] iArr, boolean z) {
        int e = e() + 1;
        loop0: for (int i = 0; i < sebVarArr.length; i++) {
            Arrays.fill(iArr, 0);
            for (int i2 = 0; i2 < e; i2++) {
                boolean z2 = false;
                for (seb sebVar : sebVarArr) {
                    z2 |= m(iArr, sebVar);
                }
                if (!z2) {
                    break loop0;
                }
            }
            if (!z) {
                return false;
            }
            boolean[] zArr = new boolean[sebVarArr.length];
            for (int i3 = 0; i3 < e; i3++) {
                int length = sebVarArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    zArr[i4] = zArr[i4] | m(iArr, sebVarArr[i4]);
                }
            }
            int i5 = 0;
            while (true) {
                if (i5 >= sebVarArr.length) {
                    break;
                }
                if (zArr[i5]) {
                    seb sebVar2 = sebVarArr[i5];
                    yeb yebVar = sebVar2.a;
                    if (yebVar.a >= yebVar.b) {
                        sebVar2.c = false;
                        break;
                    }
                }
                i5++;
            }
        }
        return true;
    }

    public final seb[] q(ArrayList arrayList) {
        cyb cybVar = new cyb(this, (seb[]) arrayList.toArray(new seb[0]));
        int length = ((seb[][]) cybVar.d).length;
        for (int i = 0; i < length; i++) {
            cybVar.w(i);
        }
        return (seb[]) cybVar.c;
    }
}
