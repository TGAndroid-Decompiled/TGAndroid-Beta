package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class ma extends vh0 {
    public final eb3 h;
    public final long i;
    public final long j;
    public final long k;
    public final short l;
    public final short m;
    public final float n;
    public final float o;
    public final mo5 p;
    public final bfb q;
    public float r;
    public int s;
    public int t;
    public long u;
    public dm6 v;

    public ma(uzb uzbVar, int[] iArr, eb3 eb3Var, long j, long j2, long j3, mo5 mo5Var) {
        super(0, uzbVar, iArr);
        if (j3 < j) {
            ncd.f("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.h = eb3Var;
        this.i = j * 1000;
        this.j = j2 * 1000;
        this.k = j3 * 1000;
        this.l = (short) 1279;
        this.m = (short) 719;
        this.n = 0.7f;
        this.o = 0.75f;
        this.p = mo5.q(mo5Var);
        this.q = bfb.a;
        this.r = 1.0f;
        this.t = 0;
        this.u = -9223372036854775807L;
    }

    public static void w(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            jo5 jo5Var = (jo5) arrayList.get(i);
            if (jo5Var != null) {
                jo5Var.c(new la(j, jArr[i]));
            }
        }
    }

    public static long z(List list) {
        if (!list.isEmpty()) {
            dm6 dm6Var = (dm6) lne.b(list);
            long j = dm6Var.h;
            if (j != -9223372036854775807L) {
                long j2 = dm6Var.n;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final void b(long j, long j2, long j3, List list, em6[] em6VarArr) {
        long z;
        int e;
        this.q.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.s;
        if (i < em6VarArr.length && em6VarArr[i].next()) {
            em6 em6Var = em6VarArr[this.s];
            z = em6Var.g() - em6Var.e();
        } else {
            int length = em6VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    em6 em6Var2 = em6VarArr[i2];
                    if (em6Var2.next()) {
                        z = em6Var2.g() - em6Var2.e();
                        break;
                    }
                    i2++;
                } else {
                    z = z(list);
                    break;
                }
            }
        }
        long j4 = z;
        long y = y(j4);
        int i3 = this.t;
        if (i3 == 0) {
            this.t = 1;
            this.s = x(elapsedRealtime, 0, y);
            return;
        }
        int i4 = this.s;
        if (list.isEmpty()) {
            e = -1;
        } else {
            e = e(((dm6) lne.b(list)).d);
        }
        if (e != -1) {
            i3 = ((dm6) lne.b(list)).e;
            i4 = e;
        }
        int x = x(elapsedRealtime, 1, y);
        if (x != i4 && !a(i4, elapsedRealtime)) {
            int i5 = (j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1));
            long j5 = this.i;
            if (i5 != 0) {
                if (j4 != -9223372036854775807L) {
                    j3 -= j4;
                }
                j5 = Math.min(((float) j3) * this.o, j5);
            }
            if ((x < i4 && j2 < j5) || (x > i4 && j2 >= this.j)) {
                x = i4;
            }
        }
        if (x != i4) {
            i3 = 3;
        }
        this.t = i3;
        this.s = x;
    }

    @Override
    public final int d() {
        return this.s;
    }

    @Override
    public final void j() {
        this.u = -9223372036854775807L;
        this.v = null;
    }

    @Override
    public final int l(long j, List list) {
        dm6 dm6Var;
        int i;
        int i2;
        this.q.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.u;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((dm6) lne.b(list)).equals(this.v))) {
            return list.size();
        }
        this.u = elapsedRealtime;
        if (list.isEmpty()) {
            dm6Var = null;
        } else {
            dm6Var = (dm6) lne.b(list);
        }
        this.v = dm6Var;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long H = hac.H(((dm6) list.get(size - 1)).h - j, this.r);
        long j3 = this.k;
        if (H >= j3) {
            go4 go4Var = this.d[x(elapsedRealtime, -1, y(z(list)))];
            for (int i3 = 0; i3 < size; i3++) {
                dm6 dm6Var2 = (dm6) list.get(i3);
                go4 go4Var2 = dm6Var2.d;
                if (hac.H(dm6Var2.h - j, this.r) >= j3 && go4Var2.k < go4Var.k && (i = go4Var2.B) != -1 && i <= this.m && (i2 = go4Var2.A) != -1 && i2 <= this.l && i < go4Var.B) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override
    public final void m() {
        this.v = null;
    }

    @Override
    public final int p() {
        return this.t;
    }

    @Override
    public final void r(float f) {
        this.r = f;
    }

    @Override
    public final Object s() {
        return null;
    }

    public final int x(long j, int i, long j2) {
        go4[] go4VarArr;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.b;
            go4VarArr = this.d;
            if (i3 >= i4) {
                break;
            }
            if (j == Long.MIN_VALUE || !a(i3, j)) {
                go4 go4Var = go4VarArr[i3];
                int max = Math.max(go4Var.A, go4Var.B);
                if (!hashMap.containsKey(Integer.valueOf(max))) {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i3));
                    arrayList.add(Integer.valueOf(i3));
                } else {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    go4 go4Var2 = go4VarArr[num.intValue()];
                    boolean z = go4Var2.o;
                    if ((!z || go4Var.o) && ((!z && go4Var.o) || go4Var.k < go4Var2.k)) {
                        hashMap.put(Integer.valueOf(max), Integer.valueOf(i3));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i3));
                    }
                }
            }
            i3++;
        }
        if (i == 0) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                int intValue = ((Integer) obj).intValue();
                if (go4VarArr[intValue].o) {
                    return intValue;
                }
            }
        }
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            i2 = ((Integer) obj2).intValue();
            go4 go4Var3 = go4VarArr[i2];
            int i7 = go4Var3.k;
            if (!go4Var3.o) {
                if (i7 <= j2) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2;
    }

    public final long y(long j) {
        long j2;
        long b = (((float) this.h.b()) * this.n) / this.r;
        mo5 mo5Var = this.p;
        if (mo5Var.isEmpty()) {
            return b;
        }
        int i = 1;
        while (i < mo5Var.size() - 1 && ((la) mo5Var.get(i)).a < b) {
            i++;
        }
        la laVar = (la) mo5Var.get(i - 1);
        la laVar2 = (la) mo5Var.get(i);
        long j3 = laVar.a;
        return laVar.b + ((((float) (b - j3)) / ((float) (laVar2.a - j3))) * ((float) (laVar2.b - j2)));
    }
}
