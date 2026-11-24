package defpackage;

import android.os.SystemClock;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
public final class pa4 {
    public static final Random g = new Random();
    public final String a;
    public final ha4 b;
    public boolean e;
    public final HashMap c = new HashMap();
    public ArrayList d = new ArrayList();
    public long f = SystemClock.uptimeMillis();

    public pa4(h64 h64Var, String str, ha4 ha4Var) {
        this.a = str;
        this.b = ha4Var;
    }

    public final void a(oa4 oa4Var, long j) {
        oa4Var.a(j);
        oa4Var.f = -1L;
        ka4 ka4Var = oa4Var.a;
        this.c.remove(ka4Var.a());
        ma4 ma4Var = null;
        if (!oa4Var.h && oa4Var.d >= 300) {
            ArrayList arrayList = new ArrayList(oa4Var.i);
            arrayList.add(new float[]{oa4Var.l, oa4Var.m});
            float f = oa4Var.j;
            Collections.sort(arrayList, new x03((byte) 16));
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
            ma4 ma4Var2 = new ma4(ka4Var.c, ka4Var.e, oa4Var.b, (int) Math.min(oa4Var.d, 300000L), (int) Math.min(oa4Var.e, 300000L), Math.round((oa4Var.j / oa4Var.k) * 1000.0f), Math.round((f2 / oa4Var.j) * 1000.0f), ka4Var.j, oa4Var.q.a);
            ma4Var2.a = ka4Var.a;
            ma4Var2.b = ka4Var.b;
            ma4Var = ma4Var2;
        }
        if (ma4Var != null) {
            ha4 ha4Var = this.b;
            ma4Var.l = ia4.d(ha4Var.b);
            ArrayList arrayList2 = ha4Var.d;
            if (arrayList2.isEmpty()) {
                gm.d3(ha4Var.e, 1000L);
            }
            arrayList2.add(ma4Var);
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
                    a((oa4) obj, uptimeMillis);
                }
                return;
            }
            this.f = SystemClock.uptimeMillis();
            c(this.d);
        }
    }

    public final void c(ArrayList arrayList) {
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
                hashSet.add(((ka4) obj).a());
            }
            HashMap hashMap = this.c;
            for (oa4 oa4Var : hashMap.values()) {
                if (oa4Var.f >= 0 && !hashSet.contains(oa4Var.a.a())) {
                    oa4Var.a(uptimeMillis);
                    oa4Var.f = -1L;
                    oa4Var.g = uptimeMillis;
                }
            }
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                ka4 ka4Var = (ka4) obj2;
                oa4 oa4Var2 = (oa4) hashMap.get(ka4Var.a());
                if (oa4Var2 != null && !Objects.equals(oa4Var2.a.j, ka4Var.j)) {
                    a(oa4Var2, uptimeMillis);
                    oa4Var2 = null;
                }
                if (oa4Var2 == null) {
                    hashMap.put(ka4Var.a(), new oa4(this, ka4Var, uptimeMillis));
                } else {
                    if (oa4Var2.f < 0) {
                        oa4Var2.f = uptimeMillis;
                    }
                    oa4Var2.b(ka4Var, uptimeMillis);
                }
            }
        }
    }
}
