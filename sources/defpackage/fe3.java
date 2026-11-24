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
public final class fe3 {
    public static final at7 l = new eq2(new x03((byte) 4));
    public r74 a;
    public eb3 b;
    public kp c;
    public final Context d;
    public final q7f e;
    public ae3 f;
    public ae3 g;
    public volatile Thread h;
    public tma i;
    public o00 j;
    public Boolean k;

    public fe3(Context context, q7f q7fVar) {
        Context context2;
        ae3 ae3Var = ae3.F0;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.d = context2;
        this.e = q7fVar;
        if (ae3Var == null) {
            ae3Var.getClass();
            zd3 zd3Var = new zd3(ae3Var);
            zd3Var.d(ae3Var);
            ae3Var = new ae3(zd3Var);
        }
        this.f = ae3Var;
        this.g = ae3Var;
        this.j = o00.i;
        if (ae3Var.A0 && context == null) {
            ncd.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(kp kpVar, ae3 ae3Var, s74[] s74VarArr) {
        int i = kpVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            vzb vzbVar = ((vzb[]) kpVar.c)[i2];
            Map map = (Map) ae3Var.D0.get(i2);
            if (map != null && map.containsKey(vzbVar)) {
                Map map2 = (Map) ae3Var.D0.get(i2);
                if (map2 != null && map2.get(vzbVar) != null) {
                    rjb.p();
                    return;
                }
                s74VarArr[i2] = null;
            }
        }
    }

    public static void b(kp kpVar, ae3 ae3Var, s74[] s74VarArr) {
        for (int i = 0; i < kpVar.a; i++) {
            int i2 = ((int[]) kpVar.b)[i];
            if (ae3Var.E0.get(i) || ae3Var.I.contains(Integer.valueOf(i2))) {
                s74VarArr[i] = null;
            }
        }
    }

    public static void c(kp kpVar, ae3 ae3Var, s74[] s74VarArr) {
        s74 s74Var;
        int i = kpVar.a;
        vzb[] vzbVarArr = (vzb[]) kpVar.c;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            d(vzbVarArr[i2], ae3Var, hashMap);
        }
        d((vzb) kpVar.f, ae3Var, hashMap);
        for (int i3 = 0; i3 < i; i3++) {
            a0c a0cVar = (a0c) hashMap.get(Integer.valueOf(((int[]) kpVar.b)[i3]));
            if (a0cVar != null) {
                uzb uzbVar = a0cVar.a;
                mo5 mo5Var = a0cVar.b;
                if (!mo5Var.isEmpty() && vzbVarArr[i3].b(uzbVar) != -1) {
                    s74Var = new s74(uzbVar, ine.e(mo5Var));
                } else {
                    s74Var = null;
                }
                s74VarArr[i3] = s74Var;
            }
        }
    }

    public static void d(vzb vzbVar, ae3 ae3Var, HashMap hashMap) {
        for (int i = 0; i < vzbVar.a; i++) {
            a0c a0cVar = (a0c) ae3Var.H.get(vzbVar.a(i));
            if (a0cVar != null) {
                uzb uzbVar = a0cVar.a;
                a0c a0cVar2 = (a0c) hashMap.get(Integer.valueOf(uzbVar.c));
                if (a0cVar2 == null || (a0cVar2.b.isEmpty() && !a0cVar.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(uzbVar.c), a0cVar);
                }
            }
        }
    }

    public static Pair e(s74[] s74VarArr, int i) {
        for (int i2 = 0; i2 < s74VarArr.length; i2++) {
            s74 s74Var = s74VarArr[i2];
            if (s74Var != null && s74Var.a.c == i) {
                return Pair.create(s74Var, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static int f(go4 go4Var, y79 y79Var) {
        for (int i = 0; i < y79Var.d; i++) {
            for (int i2 = 0; i2 < go4Var.c.size(); i2++) {
                if (((sy5) go4Var.c.get(i2)).b.equals(y79Var.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int g(go4 go4Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(go4Var.d)) {
            return 4;
        }
        String h = h(str);
        String h2 = h(go4Var.d);
        if (h2 != null && h != null) {
            if (!h2.startsWith(h) && !h.startsWith(h2)) {
                String str2 = hac.a;
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

    public static boolean j(ae3 ae3Var, int i, go4 go4Var) {
        boolean z;
        boolean z2;
        if ((i & 3584) == 0) {
            return false;
        }
        b0c b0cVar = ae3Var.w;
        if (b0cVar.c && (i & 2048) == 0) {
            return false;
        }
        if (b0cVar.b) {
            if (go4Var.R == 0 && go4Var.S == 0) {
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

    public static s74 k(vzb vzbVar, int[][] iArr, ae3 ae3Var) {
        if (ae3Var.w.a != 2) {
            int i = 0;
            uzb uzbVar = null;
            yd3 yd3Var = null;
            for (int i2 = 0; i2 < vzbVar.a; i2++) {
                uzb a = vzbVar.a(i2);
                int[] iArr2 = iArr[i2];
                for (int i3 = 0; i3 < a.a; i3++) {
                    if (kt6.c(iArr2[i3], ae3Var.B0)) {
                        yd3 yd3Var2 = new yd3(a.d[i3], iArr2[i3]);
                        if (yd3Var != null) {
                            if (hq2.a.c(yd3Var2.b, yd3Var.b).c(yd3Var2.a, yd3Var.a).e() <= 0) {
                            }
                        }
                        uzbVar = a;
                        i = i3;
                        yd3Var = yd3Var2;
                    }
                }
            }
            if (uzbVar != null) {
                return new s74(uzbVar, i);
            }
        }
        return null;
    }

    public static Pair l(int i, kp kpVar, int[][][] iArr, ce3 ce3Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccess;
        kp kpVar2 = kpVar;
        ArrayList arrayList = new ArrayList();
        int i3 = kpVar2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == ((int[]) kpVar2.b)[i4]) {
                vzb vzbVar = ((vzb[]) kpVar2.c)[i4];
                for (int i5 = 0; i5 < vzbVar.a; i5++) {
                    uzb a = vzbVar.a(i5);
                    y79 n = ce3Var.n(i4, a, iArr[i4][i5]);
                    int i6 = a.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        de3 de3Var = (de3) n.get(i7);
                        int a2 = de3Var.a();
                        if (!zArr[i7] && a2 != 0) {
                            if (a2 == 1) {
                                randomAccess = mo5.u(de3Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(de3Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    de3 de3Var2 = (de3) n.get(i8);
                                    int i9 = i3;
                                    if (de3Var2.a() == 2 && de3Var.b(de3Var2)) {
                                        arrayList2.add(de3Var2);
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
            kpVar2 = kpVar;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((de3) list.get(i10)).c;
        }
        de3 de3Var3 = (de3) list.get(0);
        return Pair.create(new s74(de3Var3.b, iArr2), Integer.valueOf(de3Var3.a));
    }

    public final void i(d0c d0cVar) {
        if (d0cVar == null) {
            return;
        }
        if (d0cVar instanceof ae3) {
            this.g = (ae3) d0cVar;
            return;
        }
        zd3 zd3Var = new zd3(this.g);
        zd3Var.d(d0cVar);
        this.g = new ae3(zd3Var);
    }

    public final void m(d0c d0cVar) {
        if (d0cVar instanceof ae3) {
            n((ae3) d0cVar);
        }
        zd3 zd3Var = new zd3(this.f);
        zd3Var.d(d0cVar);
        n(new ae3(zd3Var));
    }

    public final void n(ae3 ae3Var) {
        boolean equals = this.f.equals(ae3Var);
        this.f = ae3Var;
        if (!equals) {
            if (ae3Var.A0 && this.d == null) {
                ncd.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            r74 r74Var = this.a;
            if (r74Var != null) {
                r74Var.h.c(10, ae3Var).b();
            }
        }
    }
}
