package b5;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import d5.f0;
import h3.q0;
import h3.t0;
import j4.i1;
import j4.j1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import o8.k0;
import o8.l0;
public final class r extends w {
    public static final k0 f1489k = new o8.q(new a5.e(3));
    public static final k0 f1490l = new o8.q(new a5.e(4));
    public final Object d;
    public final Context f1491e;
    public final wa.a f1492f;
    public final boolean f1493g;
    public j h;
    public final m f1494i;
    public j3.e f1495j;

    public r(Context context, wa.a aVar) {
        Context context2;
        boolean z10;
        int i9 = j.f1465b0;
        j jVar = new j(new i(context));
        this.d = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f1491e = context2;
        this.f1492f = aVar;
        this.h = jVar;
        this.f1495j = j3.e.h;
        if (context != null && f0.F(context)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1493g = z10;
        if (!z10 && context != null && f0.f4349a >= 32) {
            this.f1494i = m.f(context);
        }
        if (this.h.V && context == null) {
            d5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(j1 j1Var, j jVar, HashMap hashMap) {
        for (int i9 = 0; i9 < j1Var.f13491a; i9++) {
            x xVar = (x) jVar.K.get(j1Var.a(i9));
            if (xVar != null) {
                i1 i1Var = xVar.f1507a;
                x xVar2 = (x) hashMap.get(Integer.valueOf(i1Var.f13483c));
                if (xVar2 == null || (xVar2.f1508b.isEmpty() && !xVar.f1508b.isEmpty())) {
                    hashMap.put(Integer.valueOf(i1Var.f13483c), xVar);
                }
            }
        }
    }

    public static int d(t0 t0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(t0Var.f9762c)) {
            return 4;
        }
        String h = h(str);
        String h10 = h(t0Var.f9762c);
        if (h10 != null && h != null) {
            if (!h10.startsWith(h) && !h.startsWith(h10)) {
                int i9 = f0.f4349a;
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

    public static boolean f(int i9, boolean z10) {
        int i10 = i9 & 7;
        if (i10 != 4) {
            if (!z10 || i10 != 3) {
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

    public static Pair i(int i9, v vVar, int[][][] iArr, o oVar, Comparator comparator) {
        int i10;
        RandomAccess randomAccess;
        v vVar2 = vVar;
        ArrayList arrayList = new ArrayList();
        int i11 = vVar2.f1498a;
        int i12 = 0;
        while (i12 < i11) {
            if (i9 == vVar2.f1499b[i12]) {
                j1 j1Var = vVar2.f1500c[i12];
                for (int i13 = 0; i13 < j1Var.f13491a; i13++) {
                    i1 a2 = j1Var.a(i13);
                    l0 e10 = oVar.e(i12, a2, iArr[i12][i13]);
                    int i14 = a2.f13481a;
                    boolean[] zArr = new boolean[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        p pVar = (p) e10.get(i15);
                        int a3 = pVar.a();
                        if (zArr[i15] || a3 == 0) {
                            i10 = i11;
                        } else {
                            if (a3 == 1) {
                                randomAccess = o8.z.y(pVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(pVar);
                                int i16 = i15 + 1;
                                while (i16 < i14) {
                                    p pVar2 = (p) e10.get(i16);
                                    int i17 = i11;
                                    if (pVar2.a() == 2 && pVar.b(pVar2)) {
                                        arrayList2.add(pVar2);
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
            vVar2 = vVar;
            i11 = i11;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((p) list.get(i18)).f1480c;
        }
        p pVar3 = (p) list.get(0);
        return Pair.create(new s(0, pVar3.f1479b, iArr2), Integer.valueOf(pVar3.f1478a));
    }

    @Override
    public final void a() {
        m mVar;
        synchronized (this.d) {
            try {
                if (f0.f4349a >= 32 && (mVar = this.f1494i) != null) {
                    mVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1503a = null;
        this.f1504b = null;
    }

    @Override
    public final void b(j3.e eVar) {
        boolean equals;
        synchronized (this.d) {
            equals = this.f1495j.equals(eVar);
            this.f1495j = eVar;
        }
        if (!equals) {
            g();
        }
    }

    public final j e() {
        j jVar;
        synchronized (this.d) {
            jVar = this.h;
        }
        return jVar;
    }

    public final void g() {
        boolean z10;
        q0 q0Var;
        m mVar;
        synchronized (this.d) {
            try {
                if (this.h.V && !this.f1493g && f0.f4349a >= 32 && (mVar = this.f1494i) != null && mVar.f1469b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10 && (q0Var = this.f1503a) != null) {
            q0Var.f9649n.d(10);
        }
    }

    public final void j(z zVar) {
        if (zVar instanceof j) {
            k((j) zVar);
        }
        i iVar = new i(e());
        iVar.a(zVar);
        k(new j(iVar));
    }

    public final void k(j jVar) {
        boolean equals;
        jVar.getClass();
        synchronized (this.d) {
            equals = this.h.equals(jVar);
            this.h = jVar;
        }
        if (!equals) {
            if (jVar.V && this.f1491e == null) {
                d5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            q0 q0Var = this.f1503a;
            if (q0Var != null) {
                q0Var.f9649n.d(10);
            }
        }
    }
}
