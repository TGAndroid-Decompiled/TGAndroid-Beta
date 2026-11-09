package a3;

import a8.ia;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import c8.e1;
import e2.m1;
import e2.n1;
import e2.o1;
import h2.m0;
import h9.i0;
import h9.r1;
import h9.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import l2.r0;
import x2.q1;
public final class s extends x {
    public static final r1 f126l = new h9.t(new c(1));
    public final Object d;
    public final Context f127e;
    public final nb.a f128f;
    public n f129g;
    public Thread h;
    public c3.d f130i;
    public e2.e f131j;
    public Boolean f132k;

    public s(Context context, nb.a aVar) {
        Context context2;
        n nVar = n.F0;
        this.d = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f127e = context2;
        this.f128f = aVar;
        if (nVar != null) {
            this.f129g = nVar;
        } else {
            nVar.getClass();
            m mVar = new m(nVar);
            mVar.d(nVar);
            this.f129g = new n(mVar);
        }
        this.f131j = e2.e.f10215i;
        if (this.f129g.A0 && context == null) {
            h2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int c(e2.u uVar, i0 i0Var) {
        for (int i7 = 0; i7 < i0Var.size(); i7++) {
            for (int i10 = 0; i10 < uVar.f10601c.size(); i10++) {
                if (((e2.x) uVar.f10601c.get(i10)).f10643b.equals(i0Var.get(i7))) {
                    return i7;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void d(w wVar, n nVar, t[] tVarArr) {
        int i7 = wVar.f135a;
        for (int i10 = 0; i10 < i7; i10++) {
            q1 q1Var = wVar.f137c[i10];
            Map map = (Map) nVar.D0.get(i10);
            if (map != null && map.containsKey(q1Var)) {
                Map map2 = (Map) nVar.D0.get(i10);
                if (map2 != null && map2.get(q1Var) != null) {
                    throw new ClassCastException();
                }
                tVarArr[i10] = null;
            }
        }
    }

    public static void e(w wVar, n nVar, t[] tVarArr) {
        for (int i7 = 0; i7 < wVar.f135a; i7++) {
            int i10 = wVar.f136b[i7];
            if (nVar.E0.get(i7) || nVar.I.contains(Integer.valueOf(i10))) {
                tVarArr[i7] = null;
            }
        }
    }

    public static void f(w wVar, n nVar, t[] tVarArr) {
        t tVar;
        int i7 = wVar.f135a;
        q1[] q1VarArr = wVar.f137c;
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < i7; i10++) {
            g(q1VarArr[i10], nVar, hashMap);
        }
        g(wVar.f139f, nVar, hashMap);
        for (int i11 = 0; i11 < i7; i11++) {
            n1 n1Var = (n1) hashMap.get(Integer.valueOf(wVar.f136b[i11]));
            if (n1Var != null) {
                m1 m1Var = n1Var.f10401a;
                i0 i0Var = n1Var.f10402b;
                if (!i0Var.isEmpty() && q1VarArr[i11].b(m1Var) != -1) {
                    tVar = new t(m1Var, e1.f(i0Var));
                } else {
                    tVar = null;
                }
                tVarArr[i11] = tVar;
            }
        }
    }

    public static void g(q1 q1Var, e2.q1 q1Var2, HashMap hashMap) {
        for (int i7 = 0; i7 < q1Var.f58458a; i7++) {
            n1 n1Var = (n1) q1Var2.H.get(q1Var.a(i7));
            if (n1Var != null) {
                m1 m1Var = n1Var.f10401a;
                n1 n1Var2 = (n1) hashMap.get(Integer.valueOf(m1Var.f10375c));
                if (n1Var2 == null || (n1Var2.f10402b.isEmpty() && !n1Var.f10402b.isEmpty())) {
                    hashMap.put(Integer.valueOf(m1Var.f10375c), n1Var);
                }
            }
        }
    }

    public static Pair h(t[] tVarArr, int i7) {
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            t tVar = tVarArr[i10];
            if (tVar != null && tVar.f133a.f10375c == i7) {
                return Pair.create(tVar, Integer.valueOf(i10));
            }
        }
        return null;
    }

    public static int i(e2.u uVar, String str, boolean z9) {
        if (!TextUtils.isEmpty(str) && str.equals(uVar.d)) {
            return 4;
        }
        String l10 = l(str);
        String l11 = l(uVar.d);
        if (l11 != null && l10 != null) {
            if (!l11.startsWith(l10) && !l10.startsWith(l11)) {
                String str2 = m0.f14112a;
                if (!l11.split("-", 2)[0].equals(l10.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z9 || l11 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String l(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    public static boolean n(n nVar, int i7, e2.u uVar) {
        boolean z9;
        boolean z10;
        if ((i7 & 3584) == 0) {
            return false;
        }
        o1 o1Var = nVar.f10526w;
        if (o1Var.f10455c && (i7 & 2048) == 0) {
            return false;
        }
        if (o1Var.f10454b) {
            if (uVar.N == 0 && uVar.O == 0) {
                z9 = false;
            } else {
                z9 = true;
            }
            if ((i7 & 1024) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 && !z10) {
                return false;
            }
        }
        return true;
    }

    public static t o(q1 q1Var, int[][] iArr, n nVar) {
        if (nVar.f10526w.f10453a != 2) {
            int i7 = 0;
            m1 m1Var = null;
            k kVar = null;
            for (int i10 = 0; i10 < q1Var.f58458a; i10++) {
                m1 a10 = q1Var.a(i10);
                int[] iArr2 = iArr[i10];
                for (int i11 = 0; i11 < a10.f10373a; i11++) {
                    if (jg.g.c(iArr2[i11], nVar.B0)) {
                        k kVar2 = new k(a10.d[i11], iArr2[i11]);
                        if (kVar != null) {
                            if (h9.w.f14407a.c(kVar2.f101b, kVar.f101b).c(kVar2.f100a, kVar.f100a).e() <= 0) {
                            }
                        }
                        m1Var = a10;
                        i7 = i11;
                        kVar = kVar2;
                    }
                }
            }
            if (m1Var != null) {
                return new t(m1Var, i7);
            }
        }
        return null;
    }

    public static Pair p(int i7, w wVar, int[][][] iArr, p pVar, Comparator comparator) {
        int i10;
        RandomAccess randomAccess;
        w wVar2 = wVar;
        ArrayList arrayList = new ArrayList();
        int i11 = wVar2.f135a;
        int i12 = 0;
        while (i12 < i11) {
            if (i7 == wVar2.f136b[i12]) {
                q1 q1Var = wVar2.f137c[i12];
                for (int i13 = 0; i13 < q1Var.f58458a; i13++) {
                    m1 a10 = q1Var.a(i13);
                    t1 h = pVar.h(i12, a10, iArr[i12][i13]);
                    int i14 = a10.f10373a;
                    boolean[] zArr = new boolean[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        q qVar = (q) h.get(i15);
                        int a11 = qVar.a();
                        if (zArr[i15] || a11 == 0) {
                            i10 = i11;
                        } else {
                            if (a11 == 1) {
                                randomAccess = i0.u(qVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(qVar);
                                int i16 = i15 + 1;
                                while (i16 < i14) {
                                    q qVar2 = (q) h.get(i16);
                                    int i17 = i11;
                                    if (qVar2.a() == 2 && qVar.b(qVar2)) {
                                        arrayList2.add(qVar2);
                                        zArr[i16] = true;
                                    }
                                    i16++;
                                    i11 = i17;
                                }
                                randomAccess = arrayList2;
                            }
                            i10 = i11;
                            arrayList.add(randomAccess);
                        }
                        i15++;
                        i11 = i10;
                    }
                }
            }
            i12++;
            wVar2 = wVar;
            i11 = i11;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((q) list.get(i18)).f117c;
        }
        q qVar3 = (q) list.get(0);
        return Pair.create(new t(qVar3.f116b, iArr2), Integer.valueOf(qVar3.f115a));
    }

    @Override
    public final void a() {
        c3.d dVar;
        boolean z9;
        synchronized (this.d) {
            try {
                Thread thread = this.h;
                if (thread != null) {
                    if (thread == Thread.currentThread()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    ia.o("DefaultTrackSelector is accessed on the wrong thread.", z9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f130i) != null) {
            dVar.e();
            this.f130i = null;
        }
        this.f140a = null;
        this.f141b = null;
    }

    @Override
    public final void b(e2.q1 q1Var) {
        if (q1Var instanceof n) {
            q((n) q1Var);
        }
        m mVar = new m(j());
        mVar.d(q1Var);
        q(new n(mVar));
    }

    public final n j() {
        n nVar;
        synchronized (this.d) {
            nVar = this.f129g;
        }
        return nVar;
    }

    public final void k() {
        boolean z9;
        r0 r0Var;
        c3.d dVar;
        synchronized (this.d) {
            try {
                if (this.f129g.A0 && Build.VERSION.SDK_INT >= 32 && (dVar = this.f130i) != null && dVar.f5265b) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z9 && (r0Var = this.f140a) != null) {
            r0Var.f18019n.f(10);
        }
    }

    public final void m() {
        synchronized (this.d) {
            this.f129g.getClass();
        }
    }

    public final void q(n nVar) {
        boolean equals;
        nVar.getClass();
        synchronized (this.d) {
            equals = this.f129g.equals(nVar);
            this.f129g = nVar;
        }
        if (!equals) {
            if (nVar.A0 && this.f127e == null) {
                h2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            r0 r0Var = this.f140a;
            if (r0Var != null) {
                r0Var.f18019n.f(10);
            }
        }
    }
}
