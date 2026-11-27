package defpackage;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class pib {
    public final boolean a;
    public ko9 d;
    public ko9 f;
    public ko9 h;
    public int[] j;
    public int[] l;
    public nib[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final zib x;
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
    public final vib v = new vib(0);
    public final vib w = new vib(-100000);

    public pib(zib zibVar, boolean z) {
        this.x = zibVar;
        this.a = z;
    }

    public static void j(ArrayList arrayList, tib tibVar, vib vibVar, boolean z) {
        if (tibVar.a() != 0) {
            if (z) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((nib) obj).a.equals(tibVar)) {
                        return;
                    }
                }
            }
            arrayList.add(new nib(tibVar, vibVar));
        }
    }

    public static boolean m(int[] iArr, nib nibVar) {
        if (nibVar.c) {
            tib tibVar = nibVar.a;
            int i = tibVar.a;
            int i2 = tibVar.b;
            int i3 = iArr[i] + nibVar.b.a;
            if (i3 > iArr[i2]) {
                iArr[i2] = i3;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(ko9 ko9Var, boolean z) {
        for (vib vibVar : (vib[]) ((Object[]) ko9Var.d)) {
            vibVar.a = Integer.MIN_VALUE;
        }
        qib[] qibVarArr = (qib[]) ((Object[]) f().d);
        for (int i = 0; i < qibVarArr.length; i++) {
            int d = qibVarArr[i].d(z);
            vib vibVar2 = (vib) ((Object[]) ko9Var.d)[((int[]) ko9Var.b)[i]];
            int i2 = vibVar2.a;
            if (!z) {
                d = -d;
            }
            vibVar2.a = Math.max(i2, d);
        }
    }

    public final void b(boolean z) {
        int[] iArr;
        wib wibVar;
        int i;
        if (z) {
            iArr = this.j;
        } else {
            iArr = this.l;
        }
        zib zibVar = this.x;
        int childCount = zibVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            sib d = zibVar.d(i2);
            uib uibVar = d.a;
            boolean z2 = this.a;
            if (z2) {
                wibVar = uibVar.b;
            } else {
                wibVar = uibVar.a;
            }
            tib tibVar = wibVar.b;
            if (z) {
                i = tibVar.a;
            } else {
                i = tibVar.b;
            }
            iArr[i] = Math.max(iArr[i], zibVar.f(d, z2, z));
        }
    }

    public final ko9 c(boolean z) {
        tib tibVar;
        oib oibVar = new oib(tib.class, vib.class);
        wib[] wibVarArr = (wib[]) ((Object[]) f().c);
        int length = wibVarArr.length;
        for (int i = 0; i < length; i++) {
            if (z) {
                tibVar = wibVarArr[i].b;
            } else {
                tib tibVar2 = wibVarArr[i].b;
                tibVar = new tib(tibVar2.b, tibVar2.a);
            }
            ?? obj = new Object();
            obj.a = Integer.MIN_VALUE;
            oibVar.add(Pair.create(tibVar, obj));
        }
        return oibVar.h();
    }

    public final nib[] d() {
        if (this.n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ko9 ko9Var = this.f;
            if (ko9Var == null) {
                ko9Var = c(true);
                this.f = ko9Var;
            }
            if (!this.g) {
                a(ko9Var, true);
                this.g = true;
            }
            ko9 ko9Var2 = this.f;
            int i = 0;
            while (true) {
                tib[] tibVarArr = (tib[]) ((Object[]) ko9Var2.c);
                if (i >= tibVarArr.length) {
                    break;
                }
                j(arrayList, tibVarArr[i], ((vib[]) ((Object[]) ko9Var2.d))[i], false);
                i++;
            }
            ko9 ko9Var3 = this.h;
            if (ko9Var3 == null) {
                ko9Var3 = c(false);
                this.h = ko9Var3;
            }
            if (!this.i) {
                a(ko9Var3, false);
                this.i = true;
            }
            ko9 ko9Var4 = this.h;
            int i2 = 0;
            while (true) {
                tib[] tibVarArr2 = (tib[]) ((Object[]) ko9Var4.c);
                if (i2 >= tibVarArr2.length) {
                    break;
                }
                j(arrayList2, tibVarArr2[i2], ((vib[]) ((Object[]) ko9Var4.d))[i2], false);
                i2++;
            }
            if (this.u) {
                int i3 = 0;
                while (i3 < e()) {
                    int i4 = i3 + 1;
                    j(arrayList, new tib(i3, i4), new vib(0), true);
                    i3 = i4;
                }
            }
            int e = e();
            j(arrayList, new tib(0, e), this.v, false);
            j(arrayList2, new tib(e, 0), this.w, false);
            nib[] q = q(arrayList);
            nib[] q2 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(nib[].class.getComponentType(), q.length + q2.length);
            System.arraycopy(q, 0, objArr, 0, q.length);
            System.arraycopy(q2, 0, objArr, q.length, q2.length);
            this.n = (nib[]) objArr;
        }
        if (!this.o) {
            ko9 ko9Var5 = this.f;
            if (ko9Var5 == null) {
                ko9Var5 = c(true);
                this.f = ko9Var5;
            }
            if (!this.g) {
                a(ko9Var5, true);
                this.g = true;
            }
            ko9 ko9Var6 = this.h;
            if (ko9Var6 == null) {
                ko9Var6 = c(false);
                this.h = ko9Var6;
            }
            if (!this.i) {
                a(ko9Var6, false);
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
        zib.g("Table grid count out of bounds");
        throw null;
    }

    public final ko9 f() {
        wib wibVar;
        int i;
        int i2;
        int i3;
        wib wibVar2;
        qib qibVar;
        ko9 ko9Var = this.d;
        boolean z = this.a;
        zib zibVar = this.x;
        if (ko9Var == null) {
            oib oibVar = new oib(wib.class, qib.class);
            int childCount = zibVar.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                uib uibVar = zibVar.d(i4).a;
                if (z) {
                    wibVar2 = uibVar.b;
                } else {
                    wibVar2 = uibVar.a;
                }
                wib wibVar3 = wib.e;
                switch (wibVar2.a(z).a) {
                    case 3:
                        qibVar = new qib();
                        break;
                    default:
                        qibVar = new qib();
                        break;
                }
                oibVar.add(Pair.create(wibVar2, qibVar));
            }
            ko9Var = oibVar.h();
            this.d = ko9Var;
        }
        if (!this.e) {
            for (qib qibVar2 : (qib[]) ((Object[]) ko9Var.d)) {
                qibVar2.c();
            }
            int childCount2 = zibVar.getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                sib d = zibVar.d(i5);
                uib uibVar2 = d.a;
                if (z) {
                    wibVar = uibVar2.b;
                    i = d.k;
                } else {
                    wibVar = uibVar2.a;
                    i = d.l;
                }
                int e = zibVar.e(d, z, false) + zibVar.e(d, z, true) + i;
                float f = wibVar.d;
                if (f == 0.0f) {
                    i2 = 0;
                } else {
                    i2 = this.t[i5];
                }
                int i6 = e + i2;
                ko9 ko9Var2 = this.d;
                qib qibVar3 = (qib) ((Object[]) ko9Var2.d)[((int[]) ko9Var2.b)[i5]];
                int i7 = qibVar3.c;
                if (wibVar.c == zib.T && f == 0.0f) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                qibVar3.c = i7 & i3;
                int a = wibVar.a(z).a(d, i6);
                qibVar3.b(a, i6 - a);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        wib wibVar;
        boolean z;
        wib wibVar2;
        int[] iArr = this.p;
        if (iArr == null) {
            iArr = new int[e() + 1];
            this.p = iArr;
        }
        if (!this.q) {
            boolean z2 = this.s;
            float f = 0.0f;
            boolean z3 = this.a;
            zib zibVar = this.x;
            if (!z2) {
                int childCount = zibVar.getChildCount();
                int i = 0;
                while (true) {
                    if (i < childCount) {
                        uib uibVar = zibVar.d(i).a;
                        if (z3) {
                            wibVar2 = uibVar.b;
                        } else {
                            wibVar2 = uibVar.a;
                        }
                        if (wibVar2.d != 0.0f) {
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
                    iArr2 = new int[zibVar.getChildCount()];
                    this.t = iArr2;
                }
                Arrays.fill(iArr2, 0);
                p(d(), iArr, true);
                int childCount2 = (zibVar.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = zibVar.getChildCount();
                    for (int i2 = 0; i2 < childCount3; i2++) {
                        uib uibVar2 = zibVar.d(i2).a;
                        if (z3) {
                            wibVar = uibVar2.b;
                        } else {
                            wibVar = uibVar2.a;
                        }
                        f += wibVar.d;
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
        wib wibVar;
        int i = this.c;
        int i2 = Integer.MIN_VALUE;
        if (i == Integer.MIN_VALUE) {
            zib zibVar = this.x;
            int childCount = zibVar.getChildCount();
            int i3 = -1;
            for (int i4 = 0; i4 < childCount; i4++) {
                uib uibVar = zibVar.d(i4).a;
                if (this.a) {
                    wibVar = uibVar.b;
                } else {
                    wibVar = uibVar.a;
                }
                tib tibVar = wibVar.b;
                i3 = Math.max(Math.max(Math.max(i3, tibVar.a), tibVar.b), tibVar.a());
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
        vib vibVar = this.w;
        vib vibVar2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                vibVar2.a = size;
                vibVar.a = -size;
                this.q = false;
                return g()[e()];
            }
            vibVar2.a = 0;
            vibVar.a = -100000;
            this.q = false;
            return g()[e()];
        }
        vibVar2.a = 0;
        vibVar.a = -size;
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
            zib.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.b = i;
    }

    public final void o(float f, int i) {
        wib wibVar;
        Arrays.fill(this.t, 0);
        zib zibVar = this.x;
        int childCount = zibVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            uib uibVar = zibVar.d(i2).a;
            if (this.a) {
                wibVar = uibVar.b;
            } else {
                wibVar = uibVar.a;
            }
            float f2 = wibVar.d;
            if (f2 != 0.0f) {
                int round = Math.round((i * f2) / f);
                this.t[i2] = round;
                i -= round;
                f -= f2;
            }
        }
    }

    public final boolean p(nib[] nibVarArr, int[] iArr, boolean z) {
        int e = e() + 1;
        loop0: for (int i = 0; i < nibVarArr.length; i++) {
            Arrays.fill(iArr, 0);
            for (int i2 = 0; i2 < e; i2++) {
                boolean z2 = false;
                for (nib nibVar : nibVarArr) {
                    z2 |= m(iArr, nibVar);
                }
                if (!z2) {
                    break loop0;
                }
            }
            if (!z) {
                return false;
            }
            boolean[] zArr = new boolean[nibVarArr.length];
            for (int i3 = 0; i3 < e; i3++) {
                int length = nibVarArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    zArr[i4] = zArr[i4] | m(iArr, nibVarArr[i4]);
                }
            }
            int i5 = 0;
            while (true) {
                if (i5 >= nibVarArr.length) {
                    break;
                }
                if (zArr[i5]) {
                    nib nibVar2 = nibVarArr[i5];
                    tib tibVar = nibVar2.a;
                    if (tibVar.a >= tibVar.b) {
                        nibVar2.c = false;
                        break;
                    }
                }
                i5++;
            }
        }
        return true;
    }

    public final nib[] q(ArrayList arrayList) {
        d2c d2cVar = new d2c(this, (nib[]) arrayList.toArray(new nib[0]));
        int length = ((nib[][]) d2cVar.d).length;
        for (int i = 0; i < length; i++) {
            d2cVar.w(i);
        }
        return (nib[]) d2cVar.c;
    }
}
