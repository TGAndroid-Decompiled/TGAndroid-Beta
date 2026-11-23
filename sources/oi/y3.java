package oi;

import android.os.Bundle;
import java.util.ArrayList;
public final class y3 implements z2.a {
    public ArrayList f22529a;

    public y3(wf.e eVar) {
        ArrayList arrayList = new ArrayList(1);
        this.f22529a = arrayList;
        arrayList.add(eVar);
    }

    @Override
    public long a(long j3) {
        ArrayList arrayList = this.f22529a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((c4.a) arrayList.get(0)).f4368b) {
            return ((c4.a) arrayList.get(0)).f4368b;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            c4.a aVar = (c4.a) arrayList.get(i7);
            long j10 = aVar.f4368b;
            long j11 = aVar.f4368b;
            if (j3 < j10) {
                long j12 = ((c4.a) arrayList.get(i7 - 1)).d;
                if (j12 != -9223372036854775807L && j12 > j3 && j12 < j11) {
                    return j12;
                }
                return j11;
            }
        }
        long j13 = ((c4.a) h9.o.n(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override
    public h9.i0 b(long j3) {
        int i7 = i(j3);
        if (i7 == 0) {
            h9.g0 g0Var = h9.i0.f13998b;
            return h9.t1.f14066e;
        }
        c4.a aVar = (c4.a) this.f22529a.get(i7 - 1);
        long j10 = aVar.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            h9.g0 g0Var2 = h9.i0.f13998b;
            return h9.t1.f14066e;
        }
        return aVar.f4367a;
    }

    @Override
    public boolean c(c4.a r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: oi.y3.c(c4.a, long):boolean");
    }

    @Override
    public void clear() {
        this.f22529a.clear();
    }

    @Override
    public long d(long j3) {
        ArrayList arrayList = this.f22529a;
        if (arrayList.isEmpty() || j3 < ((c4.a) arrayList.get(0)).f4368b) {
            return -9223372036854775807L;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            long j10 = ((c4.a) arrayList.get(i7)).f4368b;
            int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
            if (i10 == 0) {
                return j10;
            }
            if (i10 < 0) {
                c4.a aVar = (c4.a) arrayList.get(i7 - 1);
                long j11 = aVar.d;
                if (j11 != -9223372036854775807L && j11 <= j3) {
                    return j11;
                }
                return aVar.f4368b;
            }
        }
        c4.a aVar2 = (c4.a) h9.o.n(arrayList);
        long j12 = aVar2.d;
        if (j12 != -9223372036854775807L && j3 >= j12) {
            return j12;
        }
        return aVar2.f4368b;
    }

    @Override
    public void e(long j3) {
        ArrayList arrayList = this.f22529a;
        int i7 = i(j3);
        if (i7 == 0) {
            return;
        }
        long j10 = ((c4.a) arrayList.get(i7 - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            i7--;
        }
        arrayList.subList(0, i7).clear();
    }

    public s4.r f() {
        if (this.f22529a == null) {
            return s4.r.f57032c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f22529a);
        return new s4.r(bundle, this.f22529a);
    }

    public void g(StringBuilder sb2) {
        String str;
        if (((Boolean) p5.c.g(1, this.f22529a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void h(StringBuilder sb2) {
        while (!this.f22529a.isEmpty()) {
            g(sb2);
        }
    }

    public int i(long j3) {
        ArrayList arrayList = this.f22529a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (j3 < ((c4.a) arrayList.get(i7)).f4368b) {
                return i7;
            }
        }
        return arrayList.size();
    }

    public wf.e j(int i7) {
        return (wf.e) this.f22529a.get(i7);
    }

    public y3(int i7) {
        switch (i7) {
            case 3:
                this.f22529a = new ArrayList();
                return;
            default:
                this.f22529a = new ArrayList();
                return;
        }
    }
}
