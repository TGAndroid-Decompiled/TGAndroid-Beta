package c5;

import android.os.Bundle;
import e9.a1;
import hg.k0;
import java.util.ArrayList;
public final class m implements w2.a {
    public ArrayList f4223a;

    public m(int i10) {
        switch (i10) {
            case 3:
                this.f4223a = new ArrayList();
                return;
            default:
                this.f4223a = new ArrayList();
                return;
        }
    }

    @Override
    public long a(long j3) {
        ArrayList arrayList = this.f4223a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((z3.a) arrayList.get(0)).f52354b) {
            return ((z3.a) arrayList.get(0)).f52354b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j10 = aVar.f52354b;
            long j11 = aVar.f52354b;
            if (j3 < j10) {
                long j12 = ((z3.a) arrayList.get(i10 - 1)).d;
                if (j12 != -9223372036854775807L && j12 > j3 && j12 < j11) {
                    return j12;
                }
                return j11;
            }
        }
        long j13 = ((z3.a) e9.q.l(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override
    public e9.i0 b(long j3) {
        int i10 = i(j3);
        if (i10 == 0) {
            e9.g0 g0Var = e9.i0.f8757b;
            return a1.f8720e;
        }
        z3.a aVar = (z3.a) this.f4223a.get(i10 - 1);
        long j10 = aVar.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            e9.g0 g0Var2 = e9.i0.f8757b;
            return a1.f8720e;
        }
        return aVar.f52353a;
    }

    @Override
    public boolean c(z3.a r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: c5.m.c(z3.a, long):boolean");
    }

    @Override
    public void clear() {
        this.f4223a.clear();
    }

    @Override
    public long d(long j3) {
        ArrayList arrayList = this.f4223a;
        if (arrayList.isEmpty() || j3 < ((z3.a) arrayList.get(0)).f52354b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((z3.a) arrayList.get(i10)).f52354b;
            int i11 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
            if (i11 == 0) {
                return j10;
            }
            if (i11 < 0) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j11 = aVar.d;
                if (j11 != -9223372036854775807L && j11 <= j3) {
                    return j11;
                }
                return aVar.f52354b;
            }
        }
        z3.a aVar2 = (z3.a) e9.q.l(arrayList);
        long j12 = aVar2.d;
        if (j12 != -9223372036854775807L && j3 >= j12) {
            return j12;
        }
        return aVar2.f52354b;
    }

    @Override
    public void e(long j3) {
        ArrayList arrayList = this.f4223a;
        int i10 = i(j3);
        if (i10 == 0) {
            return;
        }
        long j10 = ((z3.a) arrayList.get(i10 - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            i10--;
        }
        arrayList.subList(0, i10).clear();
    }

    public p4.r f() {
        if (this.f4223a == null) {
            return p4.r.f44241c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f4223a);
        return new p4.r(bundle, this.f4223a);
    }

    public void g(StringBuilder sb2) {
        String str;
        if (((Boolean) k0.w(1, this.f4223a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void h(StringBuilder sb2) {
        while (!this.f4223a.isEmpty()) {
            g(sb2);
        }
    }

    public int i(long j3) {
        ArrayList arrayList = this.f4223a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j3 < ((z3.a) arrayList.get(i10)).f52354b) {
                return i10;
            }
        }
        return arrayList.size();
    }
}
