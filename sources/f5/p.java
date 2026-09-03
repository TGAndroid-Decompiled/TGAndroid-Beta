package f5;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import h5.d0;
import j3.k0;
import j3.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import o4.s0;
import o4.t0;
import s8.h0;
import s8.i0;
public final class p extends t {
    public static final h0 f6052k = new s8.m(new e5.f(3));
    public static final h0 f6053l = new s8.m(new e5.f(4));
    public final Object d;
    public final Context f6054e;
    public final db.a f6055f;
    public final boolean f6056g;
    public h h;
    public final k f6057i;
    public l3.d f6058j;

    public p(Context context, db.a aVar) {
        Context context2;
        boolean z4;
        int i10 = h.f6026d0;
        h hVar = new h(new g(context));
        this.d = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f6054e = context2;
        this.f6055f = aVar;
        this.h = hVar;
        this.f6058j = l3.d.h;
        if (context != null && d0.F(context)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f6056g = z4;
        if (!z4 && context != null && d0.f7237a >= 32) {
            this.f6057i = k.f(context);
        }
        if (this.h.W && context == null) {
            h5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(t0 t0Var, h hVar, HashMap hashMap) {
        for (int i10 = 0; i10 < t0Var.f16578a; i10++) {
            v vVar = (v) hVar.L.get(t0Var.a(i10));
            if (vVar != null) {
                s0 s0Var = vVar.f6071a;
                v vVar2 = (v) hashMap.get(Integer.valueOf(s0Var.f16575c));
                if (vVar2 == null || (vVar2.f6072b.isEmpty() && !vVar.f6072b.isEmpty())) {
                    hashMap.put(Integer.valueOf(s0Var.f16575c), vVar);
                }
            }
        }
    }

    public static int d(n0 n0Var, String str, boolean z4) {
        if (!TextUtils.isEmpty(str) && str.equals(n0Var.f9320c)) {
            return 4;
        }
        String h = h(str);
        String h9 = h(n0Var.f9320c);
        if (h9 != null && h != null) {
            if (!h9.startsWith(h) && !h.startsWith(h9)) {
                int i10 = d0.f7237a;
                if (!h9.split("-", 2)[0].equals(h.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z4 || h9 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean f(int i10, boolean z4) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            if (!z4 || i11 != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static String h(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    public static Pair j(int i10, s sVar, int[][][] iArr, m mVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        s sVar2 = sVar;
        ArrayList arrayList = new ArrayList();
        int i12 = sVar2.f6061a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == sVar2.f6062b[i13]) {
                t0 t0Var = sVar2.f6063c[i13];
                for (int i14 = 0; i14 < t0Var.f16578a; i14++) {
                    s0 a2 = t0Var.a(i14);
                    i0 e6 = mVar.e(i13, a2, iArr[i13][i14]);
                    int i15 = a2.f16573a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        n nVar = (n) e6.get(i16);
                        int a10 = nVar.a();
                        if (zArr[i16] || a10 == 0) {
                            i11 = i12;
                        } else {
                            if (a10 == 1) {
                                randomAccess = s8.v.x(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    n nVar2 = (n) e6.get(i17);
                                    int i18 = i12;
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
                                        zArr[i17] = true;
                                    }
                                    i17++;
                                    i12 = i18;
                                }
                                randomAccess = arrayList2;
                            }
                            i11 = i12;
                            arrayList.add(randomAccess);
                        }
                        i16++;
                        i12 = i11;
                    }
                }
            }
            i13++;
            sVar2 = sVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((n) list.get(i19)).f6043c;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(0, nVar3.f6042b, iArr2), Integer.valueOf(nVar3.f6041a));
    }

    @Override
    public final void a() {
        k kVar;
        synchronized (this.d) {
            try {
                if (d0.f7237a >= 32 && (kVar = this.f6057i) != null) {
                    kVar.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f6066a = null;
        this.f6067b = null;
    }

    @Override
    public final void b(l3.d dVar) {
        boolean equals;
        synchronized (this.d) {
            equals = this.f6058j.equals(dVar);
            this.f6058j = dVar;
        }
        if (!equals) {
            g();
        }
    }

    public final h e() {
        h hVar;
        synchronized (this.d) {
            hVar = this.h;
        }
        return hVar;
    }

    public final void g() {
        boolean z4;
        k0 k0Var;
        k kVar;
        synchronized (this.d) {
            try {
                if (this.h.W && !this.f6056g && d0.f7237a >= 32 && (kVar = this.f6057i) != null && kVar.f6032b) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z4 && (k0Var = this.f6066a) != null) {
            k0Var.f9229n.d(10);
        }
    }

    public final void i() {
        boolean z4;
        k0 k0Var;
        synchronized (this.d) {
            z4 = this.h.f6027a0;
        }
        if (z4 && (k0Var = this.f6066a) != null) {
            k0Var.f9229n.d(26);
        }
    }

    public final void k(x xVar) {
        if (xVar instanceof h) {
            l((h) xVar);
        }
        g gVar = new g(e());
        gVar.a(xVar);
        l(new h(gVar));
    }

    public final void l(h hVar) {
        boolean equals;
        hVar.getClass();
        synchronized (this.d) {
            equals = this.h.equals(hVar);
            this.h = hVar;
        }
        if (!equals) {
            if (hVar.W && this.f6054e == null) {
                h5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            k0 k0Var = this.f6066a;
            if (k0Var != null) {
                k0Var.f9229n.d(10);
            }
        }
    }
}
