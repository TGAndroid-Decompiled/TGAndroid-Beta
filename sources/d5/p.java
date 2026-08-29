package d5;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import f5.d0;
import j3.q0;
import j3.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import l4.j1;
import l4.k1;
import q8.k0;
import q8.l0;
import q8.z;
public final class p extends u {
    public static final k0 f5363k = new q8.q(new c5.e(6));
    public static final k0 f5364l = new q8.q(new c5.e(7));
    public final Object d;
    public final Context f5365e;
    public final ab.b f5366f;
    public final boolean f5367g;
    public h h;
    public final k f5368i;
    public l3.e f5369j;

    public p(Context context, ab.b bVar) {
        Context context2;
        boolean z10;
        int i10 = h.f5339b0;
        h hVar = new h(new g(context));
        this.d = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f5365e = context2;
        this.f5366f = bVar;
        this.h = hVar;
        this.f5369j = l3.e.h;
        if (context != null && d0.F(context)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5367g = z10;
        if (!z10 && context != null && d0.f6579a >= 32) {
            this.f5368i = k.f(context);
        }
        if (this.h.V && context == null) {
            f5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(k1 k1Var, h hVar, HashMap hashMap) {
        for (int i10 = 0; i10 < k1Var.f14357a; i10++) {
            v vVar = (v) hVar.K.get(k1Var.a(i10));
            if (vVar != null) {
                j1 j1Var = vVar.f5381a;
                v vVar2 = (v) hashMap.get(Integer.valueOf(j1Var.f14349c));
                if (vVar2 == null || (vVar2.f5382b.isEmpty() && !vVar.f5382b.isEmpty())) {
                    hashMap.put(Integer.valueOf(j1Var.f14349c), vVar);
                }
            }
        }
    }

    public static int d(t0 t0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(t0Var.f10799c)) {
            return 4;
        }
        String h = h(str);
        String h10 = h(t0Var.f10799c);
        if (h10 != null && h != null) {
            if (!h10.startsWith(h) && !h.startsWith(h10)) {
                int i10 = d0.f6579a;
                if (!h10.split("-", 2)[0].equals(h.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z10 || h10 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean f(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            if (!z10 || i11 != 3) {
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

    public static Pair i(int i10, t tVar, int[][][] iArr, m mVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        t tVar2 = tVar;
        ArrayList arrayList = new ArrayList();
        int i12 = tVar2.f5372a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == tVar2.f5373b[i13]) {
                k1 k1Var = tVar2.f5374c[i13];
                for (int i14 = 0; i14 < k1Var.f14357a; i14++) {
                    j1 a2 = k1Var.a(i14);
                    l0 c3 = mVar.c(i13, a2, iArr[i13][i14]);
                    int i15 = a2.f14347a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        n nVar = (n) c3.get(i16);
                        int a10 = nVar.a();
                        if (zArr[i16] || a10 == 0) {
                            i11 = i12;
                        } else {
                            if (a10 == 1) {
                                randomAccess = z.y(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    n nVar2 = (n) c3.get(i17);
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
            tVar2 = tVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((n) list.get(i19)).f5354c;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(0, nVar3.f5353b, iArr2), Integer.valueOf(nVar3.f5352a));
    }

    @Override
    public final void a() {
        k kVar;
        synchronized (this.d) {
            try {
                if (d0.f6579a >= 32 && (kVar = this.f5368i) != null) {
                    kVar.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f5377a = null;
        this.f5378b = null;
    }

    @Override
    public final void b(l3.e eVar) {
        boolean equals;
        synchronized (this.d) {
            equals = this.f5369j.equals(eVar);
            this.f5369j = eVar;
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
        boolean z10;
        q0 q0Var;
        k kVar;
        synchronized (this.d) {
            try {
                if (this.h.V && !this.f5367g && d0.f6579a >= 32 && (kVar = this.f5368i) != null && kVar.f5343b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && (q0Var = this.f5377a) != null) {
            q0Var.f10686n.d(10);
        }
    }

    public final void j(x xVar) {
        if (xVar instanceof h) {
            k((h) xVar);
        }
        g gVar = new g(e());
        gVar.a(xVar);
        k(new h(gVar));
    }

    public final void k(h hVar) {
        boolean equals;
        hVar.getClass();
        synchronized (this.d) {
            equals = this.h.equals(hVar);
            this.h = hVar;
        }
        if (!equals) {
            if (hVar.V && this.f5365e == null) {
                f5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            q0 q0Var = this.f5377a;
            if (q0Var != null) {
                q0Var.f10686n.d(10);
            }
        }
    }
}
