package f5;

import android.os.Bundle;
import h9.g0;
import h9.i0;
import h9.s1;
import java.util.ArrayList;
public final class k implements z2.a {
    public ArrayList f10991a;

    public k(int i7) {
        switch (i7) {
            case 4:
                this.f10991a = new ArrayList();
                return;
            default:
                this.f10991a = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
        }
    }

    @Override
    public long a(long j3) {
        ArrayList arrayList = this.f10991a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((c4.a) arrayList.get(0)).f4092b) {
            return ((c4.a) arrayList.get(0)).f4092b;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            c4.a aVar = (c4.a) arrayList.get(i7);
            long j10 = aVar.f4092b;
            long j11 = aVar.f4092b;
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
    public i0 b(long j3) {
        int g10 = g(j3);
        if (g10 == 0) {
            g0 g0Var = i0.f13686b;
            return s1.f13749e;
        }
        c4.a aVar = (c4.a) this.f10991a.get(g10 - 1);
        long j10 = aVar.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            g0 g0Var2 = i0.f13686b;
            return s1.f13749e;
        }
        return aVar.f4091a;
    }

    @Override
    public boolean c(c4.a r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: f5.k.c(c4.a, long):boolean");
    }

    @Override
    public void clear() {
        this.f10991a.clear();
    }

    @Override
    public long d(long j3) {
        ArrayList arrayList = this.f10991a;
        if (arrayList.isEmpty() || j3 < ((c4.a) arrayList.get(0)).f4092b) {
            return -9223372036854775807L;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            long j10 = ((c4.a) arrayList.get(i7)).f4092b;
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
                return aVar.f4092b;
            }
        }
        c4.a aVar2 = (c4.a) h9.o.n(arrayList);
        long j12 = aVar2.d;
        if (j12 != -9223372036854775807L && j3 >= j12) {
            return j12;
        }
        return aVar2.f4092b;
    }

    @Override
    public void e(long j3) {
        ArrayList arrayList = this.f10991a;
        int g10 = g(j3);
        if (g10 == 0) {
            return;
        }
        long j10 = ((c4.a) arrayList.get(g10 - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            g10--;
        }
        arrayList.subList(0, g10).clear();
    }

    public s4.r f() {
        if (this.f10991a == null) {
            return s4.r.f56448c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f10991a);
        return new s4.r(bundle, this.f10991a);
    }

    public int g(long j3) {
        ArrayList arrayList = this.f10991a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (j3 < ((c4.a) arrayList.get(i7)).f4092b) {
                return i7;
            }
        }
        return arrayList.size();
    }

    public wf.e h(int i7) {
        return (wf.e) this.f10991a.get(i7);
    }

    public k(wf.e eVar) {
        ArrayList arrayList = new ArrayList(1);
        this.f10991a = arrayList;
        arrayList.add(eVar);
    }
}
