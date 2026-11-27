package defpackage;

import android.os.SystemClock;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
public final class la4 {
    public static final Random g = new Random();
    public final String a;
    public final da4 b;
    public boolean e;
    public final HashMap c = new HashMap();
    public ArrayList d = new ArrayList();
    public long f = SystemClock.uptimeMillis();

    public la4(su3 su3Var, String str, da4 da4Var) {
        this.a = str;
        this.b = da4Var;
    }

    public final void a(ka4 ka4Var, long j) {
        ka4Var.a(j);
        ka4Var.f = -1L;
        ga4 ga4Var = ka4Var.a;
        this.c.remove(ga4Var.a());
        ia4 ia4Var = null;
        if (!ka4Var.h && ka4Var.d >= 300) {
            ArrayList arrayList = new ArrayList(ka4Var.i);
            arrayList.add(new float[]{ka4Var.l, ka4Var.m});
            float f = ka4Var.j;
            Collections.sort(arrayList, new f03((byte) 16));
            int size = arrayList.size();
            float f2 = 0.0f;
            int i = 0;
            float f3 = 0.0f;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                float[] fArr = (float[]) obj;
                float max = Math.max(fArr[0], f3);
                float min = Math.min(fArr[1], f);
                if (min > max) {
                    f2 = (min - max) + f2;
                }
                f3 = Math.max(f3, min);
            }
            ia4 ia4Var2 = new ia4(ga4Var.c, ga4Var.e, ka4Var.b, (int) Math.min(ka4Var.d, 300000L), (int) Math.min(ka4Var.e, 300000L), Math.round((ka4Var.j / ka4Var.k) * 1000.0f), Math.round((f2 / ka4Var.j) * 1000.0f), ga4Var.j, ka4Var.q.a);
            ia4Var2.a = ga4Var.a;
            ia4Var2.b = ga4Var.b;
            ia4Var = ia4Var2;
        }
        if (ia4Var != null) {
            da4 da4Var = this.b;
            ia4Var.l = ea4.g(da4Var.b);
            ArrayList arrayList2 = da4Var.d;
            if (arrayList2.isEmpty()) {
                hl.d3(da4Var.e, 1000L);
            }
            arrayList2.add(ia4Var);
        }
    }

    public final void b(boolean z) {
        if (this.e != z) {
            this.e = z;
            if (!z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = new ArrayList(this.c.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    a((ka4) obj, uptimeMillis);
                }
                return;
            }
            this.f = SystemClock.uptimeMillis();
            d(this.d);
        }
    }

    public final void c() {
        boolean z;
        boolean z2;
        ka4 ka4Var;
        long uptimeMillis = SystemClock.uptimeMillis();
        HashMap hashMap = this.c;
        ArrayList arrayList = new ArrayList(hashMap.values());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ka4 ka4Var2 = (ka4) obj;
            if (!ka4Var2.h && ka4Var2.f >= 0 && uptimeMillis - ka4Var2.c >= 300000) {
                z = true;
            } else {
                z = false;
            }
            if (z || (ka4Var2.f < 0 && uptimeMillis - ka4Var2.g >= 300)) {
                a(ka4Var2, uptimeMillis);
            }
            if (z) {
                ArrayList arrayList2 = this.d;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    ga4 ga4Var = (ga4) obj2;
                    if (ga4Var.a().equals(ka4Var2.a.a())) {
                        if (uptimeMillis - this.f > 15000) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ka4Var2.h = z2;
                        ka4Var2.f = uptimeMillis;
                        String a = ga4Var.a();
                        if (ka4Var2.h) {
                            ka4Var = ka4Var2;
                        } else {
                            ka4Var = new ka4(this, ga4Var, uptimeMillis);
                        }
                        hashMap.put(a, ka4Var);
                    }
                }
            }
        }
    }

    public final void d(ArrayList arrayList) {
        this.d = arrayList;
        if (this.e) {
            long uptimeMillis = SystemClock.uptimeMillis();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                hashSet.add(((ga4) obj).a());
            }
            HashMap hashMap = this.c;
            for (ka4 ka4Var : hashMap.values()) {
                if (ka4Var.f >= 0 && !hashSet.contains(ka4Var.a.a())) {
                    ka4Var.a(uptimeMillis);
                    ka4Var.f = -1L;
                    ka4Var.g = uptimeMillis;
                }
            }
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                ga4 ga4Var = (ga4) obj2;
                ka4 ka4Var2 = (ka4) hashMap.get(ga4Var.a());
                if (ka4Var2 != null && !Objects.equals(ka4Var2.a.j, ga4Var.j)) {
                    a(ka4Var2, uptimeMillis);
                    ka4Var2 = null;
                }
                if (ka4Var2 == null) {
                    hashMap.put(ga4Var.a(), new ka4(this, ga4Var, uptimeMillis));
                } else {
                    if (ka4Var2.f < 0) {
                        ka4Var2.f = uptimeMillis;
                    }
                    ka4Var2.b(ga4Var, uptimeMillis);
                }
            }
        }
    }

    public final void e() {
        long uptimeMillis = SystemClock.uptimeMillis();
        HashMap hashMap = this.c;
        for (ka4 ka4Var : hashMap.values()) {
            ka4Var.a(uptimeMillis);
        }
        this.f = uptimeMillis;
        if (this.e) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ga4 ga4Var = (ga4) obj;
                if (hashMap.get(ga4Var.a()) != null && ((ka4) hashMap.get(ga4Var.a())).h) {
                    hashMap.put(ga4Var.a(), new ka4(this, ga4Var, uptimeMillis));
                }
            }
        }
    }
}
