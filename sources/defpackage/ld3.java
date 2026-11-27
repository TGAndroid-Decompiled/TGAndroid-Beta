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
public final class ld3 {
    public static final eu7 l = new mp2(new f03((byte) 4));
    public c74 a;
    public la3 b;
    public lo c;
    public final Context d;
    public final faf e;
    public gd3 f;
    public gd3 g;
    public volatile Thread h;
    public moa i;
    public oz j;
    public Boolean k;

    public ld3(Context context, faf fafVar) {
        Context context2;
        gd3 gd3Var = gd3.F0;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.d = context2;
        this.e = fafVar;
        if (gd3Var == null) {
            gd3Var.getClass();
            fd3 fd3Var = new fd3(gd3Var);
            fd3Var.d(gd3Var);
            gd3Var = new gd3(fd3Var);
        }
        this.f = gd3Var;
        this.g = gd3Var;
        this.j = oz.i;
        if (gd3Var.A0 && context == null) {
            efd.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(lo loVar, gd3 gd3Var, d74[] d74VarArr) {
        int i = loVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            u1c u1cVar = ((u1c[]) loVar.c)[i2];
            Map map = (Map) gd3Var.D0.get(i2);
            if (map != null && map.containsKey(u1cVar)) {
                Map map2 = (Map) gd3Var.D0.get(i2);
                if (map2 != null && map2.get(u1cVar) != null) {
                    grb.o();
                    return;
                }
                d74VarArr[i2] = null;
            }
        }
    }

    public static void b(lo loVar, gd3 gd3Var, d74[] d74VarArr) {
        for (int i = 0; i < loVar.a; i++) {
            int i2 = ((int[]) loVar.b)[i];
            if (gd3Var.E0.get(i) || gd3Var.I.contains(Integer.valueOf(i2))) {
                d74VarArr[i] = null;
            }
        }
    }

    public static void c(lo loVar, gd3 gd3Var, d74[] d74VarArr) {
        d74 d74Var;
        int i = loVar.a;
        u1c[] u1cVarArr = (u1c[]) loVar.c;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            d(u1cVarArr[i2], gd3Var, hashMap);
        }
        d((u1c) loVar.f, gd3Var, hashMap);
        for (int i3 = 0; i3 < i; i3++) {
            z1c z1cVar = (z1c) hashMap.get(Integer.valueOf(((int[]) loVar.b)[i3]));
            if (z1cVar != null) {
                t1c t1cVar = z1cVar.a;
                po5 po5Var = z1cVar.b;
                if (!po5Var.isEmpty() && u1cVarArr[i3].b(t1cVar) != -1) {
                    d74Var = new d74(t1cVar, ype.e(po5Var));
                } else {
                    d74Var = null;
                }
                d74VarArr[i3] = d74Var;
            }
        }
    }

    public static void d(u1c u1cVar, gd3 gd3Var, HashMap hashMap) {
        for (int i = 0; i < u1cVar.a; i++) {
            z1c z1cVar = (z1c) gd3Var.H.get(u1cVar.a(i));
            if (z1cVar != null) {
                t1c t1cVar = z1cVar.a;
                z1c z1cVar2 = (z1c) hashMap.get(Integer.valueOf(t1cVar.c));
                if (z1cVar2 == null || (z1cVar2.b.isEmpty() && !z1cVar.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(t1cVar.c), z1cVar);
                }
            }
        }
    }

    public static Pair e(d74[] d74VarArr, int i) {
        for (int i2 = 0; i2 < d74VarArr.length; i2++) {
            d74 d74Var = d74VarArr[i2];
            if (d74Var != null && d74Var.a.c == i) {
                return Pair.create(d74Var, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static int f(ko4 ko4Var, j99 j99Var) {
        for (int i = 0; i < j99Var.d; i++) {
            for (int i2 = 0; i2 < ko4Var.c.size(); i2++) {
                if (((xy5) ko4Var.c.get(i2)).b.equals(j99Var.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int g(ko4 ko4Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(ko4Var.d)) {
            return 4;
        }
        String h = h(str);
        String h2 = h(ko4Var.d);
        if (h2 != null && h != null) {
            if (!h2.startsWith(h) && !h.startsWith(h2)) {
                String str2 = gcc.a;
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

    public static boolean j(gd3 gd3Var, int i, ko4 ko4Var) {
        boolean z;
        boolean z2;
        if ((i & 3584) == 0) {
            return false;
        }
        a2c a2cVar = gd3Var.w;
        if (a2cVar.c && (i & 2048) == 0) {
            return false;
        }
        if (a2cVar.b) {
            if (ko4Var.R == 0 && ko4Var.S == 0) {
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

    public static d74 k(u1c u1cVar, int[][] iArr, gd3 gd3Var) {
        if (gd3Var.w.a != 2) {
            int i = 0;
            t1c t1cVar = null;
            ed3 ed3Var = null;
            for (int i2 = 0; i2 < u1cVar.a; i2++) {
                t1c a = u1cVar.a(i2);
                int[] iArr2 = iArr[i2];
                for (int i3 = 0; i3 < a.a; i3++) {
                    if (qu6.c(iArr2[i3], gd3Var.B0)) {
                        ed3 ed3Var2 = new ed3(a.d[i3], iArr2[i3]);
                        if (ed3Var != null) {
                            if (pp2.a.c(ed3Var2.b, ed3Var.b).c(ed3Var2.a, ed3Var.a).e() <= 0) {
                            }
                        }
                        t1cVar = a;
                        i = i3;
                        ed3Var = ed3Var2;
                    }
                }
            }
            if (t1cVar != null) {
                return new d74(t1cVar, i);
            }
        }
        return null;
    }

    public static Pair l(int i, lo loVar, int[][][] iArr, id3 id3Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccess;
        lo loVar2 = loVar;
        ArrayList arrayList = new ArrayList();
        int i3 = loVar2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == ((int[]) loVar2.b)[i4]) {
                u1c u1cVar = ((u1c[]) loVar2.c)[i4];
                for (int i5 = 0; i5 < u1cVar.a; i5++) {
                    t1c a = u1cVar.a(i5);
                    j99 l2 = id3Var.l(i4, a, iArr[i4][i5]);
                    int i6 = a.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        jd3 jd3Var = (jd3) l2.get(i7);
                        int a2 = jd3Var.a();
                        if (!zArr[i7] && a2 != 0) {
                            if (a2 == 1) {
                                randomAccess = po5.u(jd3Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(jd3Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    jd3 jd3Var2 = (jd3) l2.get(i8);
                                    int i9 = i3;
                                    if (jd3Var2.a() == 2 && jd3Var.b(jd3Var2)) {
                                        arrayList2.add(jd3Var2);
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
            loVar2 = loVar;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((jd3) list.get(i10)).c;
        }
        jd3 jd3Var3 = (jd3) list.get(0);
        return Pair.create(new d74(jd3Var3.b, iArr2), Integer.valueOf(jd3Var3.a));
    }

    public final void i(c2c c2cVar) {
        if (c2cVar == null) {
            return;
        }
        if (c2cVar instanceof gd3) {
            this.g = (gd3) c2cVar;
            return;
        }
        fd3 fd3Var = new fd3(this.g);
        fd3Var.d(c2cVar);
        this.g = new gd3(fd3Var);
    }

    public final void m(c2c c2cVar) {
        if (c2cVar instanceof gd3) {
            n((gd3) c2cVar);
        }
        fd3 fd3Var = new fd3(this.f);
        fd3Var.d(c2cVar);
        n(new gd3(fd3Var));
    }

    public final void n(gd3 gd3Var) {
        boolean equals = this.f.equals(gd3Var);
        this.f = gd3Var;
        if (!equals) {
            if (gd3Var.A0 && this.d == null) {
                efd.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            c74 c74Var = this.a;
            if (c74Var != null) {
                c74Var.h.c(10, gd3Var).b();
            }
        }
    }
}
