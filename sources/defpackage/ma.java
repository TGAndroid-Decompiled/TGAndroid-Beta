package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class ma extends vg0 {
    public final s93 h;
    public final long i;
    public final long j;
    public final long k;
    public final short l;
    public final short m;
    public final float n;
    public final float o;
    public final mm5 p;
    public final adb q;
    public float r;
    public int s;
    public int t;
    public long u;
    public ak6 v;

    public ma(sxb sxbVar, int[] iArr, s93 s93Var, long j, long j2, long j3, mm5 mm5Var) {
        super(0, sxbVar, iArr);
        if (j3 < j) {
            lad.f("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.h = s93Var;
        this.i = j * 1000;
        this.j = j2 * 1000;
        this.k = j3 * 1000;
        this.l = (short) 1279;
        this.m = (short) 719;
        this.n = 0.7f;
        this.o = 0.75f;
        this.p = mm5.q(mm5Var);
        this.q = adb.a;
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
            jm5 jm5Var = (jm5) arrayList.get(i);
            if (jm5Var != null) {
                jm5Var.c(new la(j, jArr[i]));
            }
        }
    }

    public static long z(List list) {
        if (!list.isEmpty()) {
            ak6 ak6Var = (ak6) jle.b(list);
            long j = ak6Var.h;
            if (j != -9223372036854775807L) {
                long j2 = ak6Var.n;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final void b(long j, long j2, long j3, List list, bk6[] bk6VarArr) {
        long z;
        int e;
        this.q.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.s;
        if (i < bk6VarArr.length && bk6VarArr[i].next()) {
            bk6 bk6Var = bk6VarArr[this.s];
            z = bk6Var.h() - bk6Var.a();
        } else {
            int length = bk6VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    bk6 bk6Var2 = bk6VarArr[i2];
                    if (bk6Var2.next()) {
                        z = bk6Var2.h() - bk6Var2.a();
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
            e = e(((ak6) jle.b(list)).d);
        }
        if (e != -1) {
            i3 = ((ak6) jle.b(list)).e;
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
        ak6 ak6Var;
        int i;
        int i2;
        this.q.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.u;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((ak6) jle.b(list)).equals(this.v))) {
            return list.size();
        }
        this.u = elapsedRealtime;
        if (list.isEmpty()) {
            ak6Var = null;
        } else {
            ak6Var = (ak6) jle.b(list);
        }
        this.v = ak6Var;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long H = g8c.H(((ak6) list.get(size - 1)).h - j, this.r);
        long j3 = this.k;
        if (H >= j3) {
            fm4 fm4Var = this.d[x(elapsedRealtime, -1, y(z(list)))];
            for (int i3 = 0; i3 < size; i3++) {
                ak6 ak6Var2 = (ak6) list.get(i3);
                fm4 fm4Var2 = ak6Var2.d;
                if (g8c.H(ak6Var2.h - j, this.r) >= j3 && fm4Var2.k < fm4Var.k && (i = fm4Var2.B) != -1 && i <= this.m && (i2 = fm4Var2.A) != -1 && i2 <= this.l && i < fm4Var.B) {
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
        fm4[] fm4VarArr;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.b;
            fm4VarArr = this.d;
            if (i3 >= i4) {
                break;
            }
            if (j == Long.MIN_VALUE || !a(i3, j)) {
                fm4 fm4Var = fm4VarArr[i3];
                int max = Math.max(fm4Var.A, fm4Var.B);
                if (!hashMap.containsKey(Integer.valueOf(max))) {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i3));
                    arrayList.add(Integer.valueOf(i3));
                } else {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    fm4 fm4Var2 = fm4VarArr[num.intValue()];
                    boolean z = fm4Var2.o;
                    if ((!z || fm4Var.o) && ((!z && fm4Var.o) || fm4Var.k < fm4Var2.k)) {
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
                if (fm4VarArr[intValue].o) {
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
            fm4 fm4Var3 = fm4VarArr[i2];
            int i7 = fm4Var3.k;
            if (!fm4Var3.o) {
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
        mm5 mm5Var = this.p;
        if (mm5Var.isEmpty()) {
            return b;
        }
        int i = 1;
        while (i < mm5Var.size() - 1 && ((la) mm5Var.get(i)).a < b) {
            i++;
        }
        la laVar = (la) mm5Var.get(i - 1);
        la laVar2 = (la) mm5Var.get(i);
        long j3 = laVar.a;
        return laVar.b + ((((float) (b - j3)) / ((float) (laVar2.a - j3))) * ((float) (laVar2.b - j2)));
    }
}
