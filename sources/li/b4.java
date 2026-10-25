package li;

import android.os.Bundle;
import java.util.ArrayList;
public final class b4 implements w2.a {
    public ArrayList f17155a;

    public b4(int i10) {
        switch (i10) {
            case 2:
                this.f17155a = new ArrayList();
                return;
            default:
                this.f17155a = new ArrayList();
                return;
        }
    }

    @Override
    public long a(long j10) {
        ArrayList arrayList = this.f17155a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((z3.a) arrayList.get(0)).f52640b) {
            return ((z3.a) arrayList.get(0)).f52640b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j11 = aVar.f52640b;
            long j12 = aVar.f52640b;
            if (j10 < j11) {
                long j13 = ((z3.a) arrayList.get(i10 - 1)).d;
                if (j13 != -9223372036854775807L && j13 > j10 && j13 < j12) {
                    return j13;
                }
                return j12;
            }
        }
        long j14 = ((z3.a) f9.o.m(arrayList)).d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override
    public f9.i0 b(long j10) {
        int i10 = i(j10);
        if (i10 == 0) {
            f9.g0 g0Var = f9.i0.f10287b;
            return f9.s1.e;
        }
        z3.a aVar = (z3.a) this.f17155a.get(i10 - 1);
        long j11 = aVar.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            f9.g0 g0Var2 = f9.i0.f10287b;
            return f9.s1.e;
        }
        return aVar.f52639a;
    }

    @Override
    public boolean c(z3.a r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: li.b4.c(z3.a, long):boolean");
    }

    @Override
    public void clear() {
        this.f17155a.clear();
    }

    @Override
    public long d(long j10) {
        ArrayList arrayList = this.f17155a;
        if (arrayList.isEmpty() || j10 < ((z3.a) arrayList.get(0)).f52640b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((z3.a) arrayList.get(i10)).f52640b;
            int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            if (i11 == 0) {
                return j11;
            }
            if (i11 < 0) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j12 = aVar.d;
                if (j12 != -9223372036854775807L && j12 <= j10) {
                    return j12;
                }
                return aVar.f52640b;
            }
        }
        z3.a aVar2 = (z3.a) f9.o.m(arrayList);
        long j13 = aVar2.d;
        if (j13 != -9223372036854775807L && j10 >= j13) {
            return j13;
        }
        return aVar2.f52640b;
    }

    @Override
    public void e(long j10) {
        ArrayList arrayList = this.f17155a;
        int i10 = i(j10);
        if (i10 == 0) {
            return;
        }
        long j11 = ((z3.a) arrayList.get(i10 - 1)).d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            i10--;
        }
        arrayList.subList(0, i10).clear();
    }

    public p4.r f() {
        if (this.f17155a == null) {
            return p4.r.f46745c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f17155a);
        return new p4.r(bundle, this.f17155a);
    }

    public void g(StringBuilder sb2) {
        String str;
        if (((Boolean) ic.a.y(1, this.f17155a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void h(StringBuilder sb2) {
        while (!this.f17155a.isEmpty()) {
            g(sb2);
        }
    }

    public int i(long j10) {
        ArrayList arrayList = this.f17155a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j10 < ((z3.a) arrayList.get(i10)).f52640b) {
                return i10;
            }
        }
        return arrayList.size();
    }
}
