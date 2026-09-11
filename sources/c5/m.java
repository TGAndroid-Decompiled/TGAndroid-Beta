package c5;

import e9.a1;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class m implements w2.a {
    public final ArrayList f4417a;

    public m(int i10) {
        switch (i10) {
            case 2:
                this.f4417a = new ArrayList();
                return;
            default:
                this.f4417a = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
        }
    }

    @Override
    public long a(long j3) {
        ArrayList arrayList = this.f4417a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((z3.a) arrayList.get(0)).f50683b) {
            return ((z3.a) arrayList.get(0)).f50683b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j10 = aVar.f50683b;
            long j11 = aVar.f50683b;
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
        int f7 = f(j3);
        if (f7 == 0) {
            e9.g0 g0Var = e9.i0.f8957b;
            return a1.f8920e;
        }
        z3.a aVar = (z3.a) this.f4417a.get(f7 - 1);
        long j10 = aVar.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            e9.g0 g0Var2 = e9.i0.f8957b;
            return a1.f8920e;
        }
        return aVar.f50682a;
    }

    @Override
    public boolean c(z3.a r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: c5.m.c(z3.a, long):boolean");
    }

    @Override
    public void clear() {
        this.f4417a.clear();
    }

    @Override
    public long d(long j3) {
        ArrayList arrayList = this.f4417a;
        if (arrayList.isEmpty() || j3 < ((z3.a) arrayList.get(0)).f50683b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((z3.a) arrayList.get(i10)).f50683b;
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
                return aVar.f50683b;
            }
        }
        z3.a aVar2 = (z3.a) e9.q.l(arrayList);
        long j12 = aVar2.d;
        if (j12 != -9223372036854775807L && j3 >= j12) {
            return j12;
        }
        return aVar2.f50683b;
    }

    @Override
    public void e(long j3) {
        int f7 = f(j3);
        if (f7 == 0) {
            return;
        }
        ArrayList arrayList = this.f4417a;
        long j10 = ((z3.a) arrayList.get(f7 - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            f7--;
        }
        arrayList.subList(0, f7).clear();
    }

    public int f(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f4417a;
            if (i10 < arrayList.size()) {
                if (j3 < ((z3.a) arrayList.get(i10)).f50683b) {
                    return i10;
                }
                i10++;
            } else {
                return arrayList.size();
            }
        }
    }

    public m(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new l(optJSONObject));
                }
            }
        }
        this.f4417a = arrayList;
    }
}
