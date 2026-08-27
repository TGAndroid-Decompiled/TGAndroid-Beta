package b5;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import d5.g0;
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
import p8.k0;
import p8.l0;

public final class q extends v {

    public static final k0 f1974k = new p8.q(new a5.f(4));

    public static final k0 f1975l = new p8.q(new a5.f(5));
    public final Object d;

    public final Context f1976e;

    public final ab.a f1977f;

    public final boolean f1978g;
    public i h;

    public final l f1979i;

    public j3.e f1980j;

    public q(Context context, ab.a aVar) {
        int i10 = i.f1950b0;
        i iVar = new i(new h(context));
        this.d = new Object();
        this.f1976e = context != null ? context.getApplicationContext() : null;
        this.f1977f = aVar;
        this.h = iVar;
        this.f1980j = j3.e.h;
        boolean z10 = context != null && g0.F(context);
        this.f1978g = z10;
        if (!z10 && context != null && g0.f4795a >= 32) {
            this.f1979i = l.f(context);
        }
        if (this.h.V && context == null) {
            d5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(j1 j1Var, i iVar, HashMap map) {
        for (int i10 = 0; i10 < j1Var.f12593a; i10++) {
            w wVar = (w) iVar.K.get(j1Var.a(i10));
            if (wVar != null) {
                i1 i1Var = wVar.f1992a;
                w wVar2 = (w) map.get(Integer.valueOf(i1Var.f12585c));
                if (wVar2 == null || (wVar2.f1993b.isEmpty() && !wVar.f1993b.isEmpty())) {
                    map.put(Integer.valueOf(i1Var.f12585c), wVar);
                }
            }
        }
    }

    public static int d(t0 t0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(t0Var.f8186c)) {
            return 4;
        }
        String strH = h(str);
        String strH2 = h(t0Var.f8186c);
        if (strH2 == null || strH == null) {
            return (z10 && strH2 == null) ? 1 : 0;
        }
        if (strH2.startsWith(strH) || strH.startsWith(strH2)) {
            return 3;
        }
        int i10 = g0.f4795a;
        return strH2.split("-", 2)[0].equals(strH.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean f(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair i(int i10, u uVar, int[][][] iArr, n nVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccessY;
        u uVar2 = uVar;
        ArrayList arrayList = new ArrayList();
        int i12 = uVar2.f1983a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == uVar2.f1984b[i13]) {
                j1 j1Var = uVar2.f1985c[i13];
                for (int i14 = 0; i14 < j1Var.f12593a; i14++) {
                    i1 i1VarA = j1Var.a(i14);
                    l0 l0VarD = nVar.d(i13, i1VarA, iArr[i13][i14]);
                    int i15 = i1VarA.f12583a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        o oVar = (o) l0VarD.get(i16);
                        int iA = oVar.a();
                        if (zArr[i16] || iA == 0) {
                            i11 = i12;
                        } else {
                            if (iA == 1) {
                                randomAccessY = p8.z.y(oVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    o oVar2 = (o) l0VarD.get(i17);
                                    int i18 = i12;
                                    if (oVar2.a() == 2 && oVar.b(oVar2)) {
                                        arrayList2.add(oVar2);
                                        zArr[i17] = true;
                                    }
                                    i17++;
                                    i12 = i18;
                                }
                                randomAccessY = arrayList2;
                            }
                            i11 = i12;
                            arrayList.add(randomAccessY);
                        }
                        i16++;
                        i12 = i11;
                    }
                }
            }
            i13++;
            uVar2 = uVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((o) list.get(i19)).f1965c;
        }
        o oVar3 = (o) list.get(0);
        return Pair.create(new r(0, oVar3.f1964b, iArr2), Integer.valueOf(oVar3.f1963a));
    }

    @Override
    public final void a() {
        l lVar;
        synchronized (this.d) {
            try {
                if (g0.f4795a >= 32 && (lVar = this.f1979i) != null) {
                    lVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1988a = null;
        this.f1989b = null;
    }

    @Override
    public final void b(j3.e eVar) {
        boolean zEquals;
        synchronized (this.d) {
            zEquals = this.f1980j.equals(eVar);
            this.f1980j = eVar;
        }
        if (zEquals) {
            return;
        }
        g();
    }

    public final i e() {
        i iVar;
        synchronized (this.d) {
            iVar = this.h;
        }
        return iVar;
    }

    public final void g() {
        boolean z10;
        q0 q0Var;
        l lVar;
        synchronized (this.d) {
            try {
                z10 = this.h.V && !this.f1978g && g0.f4795a >= 32 && (lVar = this.f1979i) != null && lVar.f1954b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10 || (q0Var = this.f1988a) == null) {
            return;
        }
        q0Var.f8079n.d(10);
    }

    public final void j(y yVar) {
        if (yVar instanceof i) {
            k((i) yVar);
        }
        h hVar = new h(e());
        hVar.a(yVar);
        k(new i(hVar));
    }

    public final void k(i iVar) {
        boolean zEquals;
        iVar.getClass();
        synchronized (this.d) {
            zEquals = this.h.equals(iVar);
            this.h = iVar;
        }
        if (zEquals) {
            return;
        }
        if (iVar.V && this.f1976e == null) {
            d5.a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        q0 q0Var = this.f1988a;
        if (q0Var != null) {
            q0Var.f8079n.d(10);
        }
    }
}
