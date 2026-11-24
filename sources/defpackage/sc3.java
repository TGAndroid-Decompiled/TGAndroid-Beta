package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
public final class sc3 {
    public static final yq7 l = new to2(new mz2((byte) 4));
    public i64 a;
    public s93 b;
    public ko c;
    public final Context d;
    public final o5f e;
    public nc3 f;
    public nc3 g;
    public volatile Thread h;
    public ska i;
    public nz j;
    public Boolean k;

    public sc3(Context context, o5f o5fVar) {
        Context context2;
        nc3 nc3Var = nc3.F0;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.d = context2;
        this.e = o5fVar;
        if (nc3Var == null) {
            nc3Var.getClass();
            mc3 mc3Var = new mc3(nc3Var);
            mc3Var.d(nc3Var);
            nc3Var = new nc3(mc3Var);
        }
        this.f = nc3Var;
        this.g = nc3Var;
        this.j = nz.i;
        if (nc3Var.A0 && context == null) {
            lad.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(ko koVar, nc3 nc3Var, j64[] j64VarArr) {
        int i = koVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            txb txbVar = ((txb[]) koVar.c)[i2];
            Map map = (Map) nc3Var.D0.get(i2);
            if (map != null && map.containsKey(txbVar)) {
                Map map2 = (Map) nc3Var.D0.get(i2);
                if (map2 != null && map2.get(txbVar) != null) {
                    fyb.g();
                    return;
                }
                j64VarArr[i2] = null;
            }
        }
    }

    public static void b(ko koVar, nc3 nc3Var, j64[] j64VarArr) {
        for (int i = 0; i < koVar.a; i++) {
            int i2 = ((int[]) koVar.b)[i];
            if (nc3Var.E0.get(i) || nc3Var.I.contains(Integer.valueOf(i2))) {
                j64VarArr[i] = null;
            }
        }
    }

    public static void c(ko koVar, nc3 nc3Var, j64[] j64VarArr) {
        j64 j64Var;
        int i = koVar.a;
        txb[] txbVarArr = (txb[]) koVar.c;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            d(txbVarArr[i2], nc3Var, hashMap);
        }
        d((txb) koVar.f, nc3Var, hashMap);
        for (int i3 = 0; i3 < i; i3++) {
            yxb yxbVar = (yxb) hashMap.get(Integer.valueOf(((int[]) koVar.b)[i3]));
            if (yxbVar != null) {
                sxb sxbVar = yxbVar.a;
                mm5 mm5Var = yxbVar.b;
                if (!mm5Var.isEmpty() && txbVarArr[i3].b(sxbVar) != -1) {
                    j64Var = new j64(sxbVar, gle.e(mm5Var));
                } else {
                    j64Var = null;
                }
                j64VarArr[i3] = j64Var;
            }
        }
    }

    public static void d(txb txbVar, nc3 nc3Var, HashMap hashMap) {
        for (int i = 0; i < txbVar.a; i++) {
            yxb yxbVar = (yxb) nc3Var.H.get(txbVar.a(i));
            if (yxbVar != null) {
                sxb sxbVar = yxbVar.a;
                yxb yxbVar2 = (yxb) hashMap.get(Integer.valueOf(sxbVar.c));
                if (yxbVar2 == null || (yxbVar2.b.isEmpty() && !yxbVar.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(sxbVar.c), yxbVar);
                }
            }
        }
    }

    public static Pair e(j64[] j64VarArr, int i) {
        for (int i2 = 0; i2 < j64VarArr.length; i2++) {
            j64 j64Var = j64VarArr[i2];
            if (j64Var != null && j64Var.a.c == i) {
                return Pair.create(j64Var, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static int f(fm4 fm4Var, w59 w59Var) {
        for (int i = 0; i < w59Var.d; i++) {
            for (int i2 = 0; i2 < fm4Var.c.size(); i2++) {
                if (((sw5) fm4Var.c.get(i2)).b.equals(w59Var.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int g(fm4 fm4Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(fm4Var.d)) {
            return 4;
        }
        String h = h(str);
        String h2 = h(fm4Var.d);
        if (h2 != null && h != null) {
            if (!h2.startsWith(h) && !h.startsWith(h2)) {
                String str2 = g8c.a;
                if (!h2.split("-", 2)[0].equals(h.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z || h2 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String h(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    public static boolean j(nc3 nc3Var, int i, fm4 fm4Var) {
        boolean z;
        boolean z2;
        if ((i & 3584) == 0) {
            return false;
        }
        zxb zxbVar = nc3Var.w;
        if (zxbVar.c && (i & 2048) == 0) {
            return false;
        }
        if (zxbVar.b) {
            if (fm4Var.R == 0 && fm4Var.S == 0) {
                z = false;
            } else {
                z = true;
            }
            if ((i & 1024) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    public static j64 k(txb txbVar, int[][] iArr, nc3 nc3Var) {
        if (nc3Var.w.a != 2) {
            int i = 0;
            sxb sxbVar = null;
            lc3 lc3Var = null;
            for (int i2 = 0; i2 < txbVar.a; i2++) {
                sxb a = txbVar.a(i2);
                int[] iArr2 = iArr[i2];
                for (int i3 = 0; i3 < a.a; i3++) {
                    if (ls6.c(iArr2[i3], nc3Var.B0)) {
                        lc3 lc3Var2 = new lc3(a.d[i3], iArr2[i3]);
                        if (lc3Var != null) {
                            if (wo2.a.c(lc3Var2.b, lc3Var.b).c(lc3Var2.a, lc3Var.a).e() <= 0) {
                            }
                        }
                        sxbVar = a;
                        i = i3;
                        lc3Var = lc3Var2;
                    }
                }
            }
            if (sxbVar != null) {
                return new j64(sxbVar, i);
            }
        }
        return null;
    }

    public static Pair l(int i, ko koVar, int[][][] iArr, pc3 pc3Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccess;
        ko koVar2 = koVar;
        ArrayList arrayList = new ArrayList();
        int i3 = koVar2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == ((int[]) koVar2.b)[i4]) {
                txb txbVar = ((txb[]) koVar2.c)[i4];
                for (int i5 = 0; i5 < txbVar.a; i5++) {
                    sxb a = txbVar.a(i5);
                    w59 j = pc3Var.j(i4, a, iArr[i4][i5]);
                    int i6 = a.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        qc3 qc3Var = (qc3) j.get(i7);
                        int a2 = qc3Var.a();
                        if (!zArr[i7] && a2 != 0) {
                            if (a2 == 1) {
                                randomAccess = mm5.u(qc3Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(qc3Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    qc3 qc3Var2 = (qc3) j.get(i8);
                                    int i9 = i3;
                                    if (qc3Var2.a() == 2 && qc3Var.b(qc3Var2)) {
                                        arrayList2.add(qc3Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccess = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccess);
                        } else {
                            i2 = i3;
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            koVar2 = koVar;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((qc3) list.get(i10)).c;
        }
        qc3 qc3Var3 = (qc3) list.get(0);
        return Pair.create(new j64(qc3Var3.b, iArr2), Integer.valueOf(qc3Var3.a));
    }

    public final void i(byb bybVar) {
        if (bybVar == null) {
            return;
        }
        if (bybVar instanceof nc3) {
            this.g = (nc3) bybVar;
            return;
        }
        mc3 mc3Var = new mc3(this.g);
        mc3Var.d(bybVar);
        this.g = new nc3(mc3Var);
    }

    public final void m(byb bybVar) {
        if (bybVar instanceof nc3) {
            n((nc3) bybVar);
        }
        mc3 mc3Var = new mc3(this.f);
        mc3Var.d(bybVar);
        n(new nc3(mc3Var));
    }

    public final void n(nc3 nc3Var) {
        boolean equals = this.f.equals(nc3Var);
        this.f = nc3Var;
        if (!equals) {
            if (nc3Var.A0 && this.d == null) {
                lad.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            i64 i64Var = this.a;
            if (i64Var != null) {
                i64Var.h.c(10, nc3Var).b();
            }
        }
    }
}
