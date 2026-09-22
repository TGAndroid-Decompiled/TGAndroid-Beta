package c5;

import e9.a1;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class m implements w2.a {
    public final ArrayList f3909a;

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
        this.f3909a = arrayList;
    }

    @Override
    public long a(long j3) {
        ArrayList arrayList = this.f3909a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((z3.b) arrayList.get(0)).f48074b) {
            return ((z3.b) arrayList.get(0)).f48074b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.b bVar = (z3.b) arrayList.get(i10);
            long j10 = bVar.f48074b;
            long j11 = bVar.f48074b;
            if (j3 < j10) {
                long j12 = ((z3.b) arrayList.get(i10 - 1)).d;
                if (j12 != -9223372036854775807L && j12 > j3 && j12 < j11) {
                    return j12;
                }
                return j11;
            }
        }
        long j13 = ((z3.b) e9.q.l(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override
    public e9.i0 b(long j3) {
        int f7 = f(j3);
        if (f7 == 0) {
            e9.g0 g0Var = e9.i0.f8081b;
            return a1.e;
        }
        z3.b bVar = (z3.b) this.f3909a.get(f7 - 1);
        long j10 = bVar.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            e9.g0 g0Var2 = e9.i0.f8081b;
            return a1.e;
        }
        return bVar.f48073a;
    }

    @Override
    public boolean c(z3.b r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: c5.m.c(z3.b, long):boolean");
    }

    @Override
    public void clear() {
        this.f3909a.clear();
    }

    @Override
    public long d(long j3) {
        ArrayList arrayList = this.f3909a;
        if (arrayList.isEmpty() || j3 < ((z3.b) arrayList.get(0)).f48074b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((z3.b) arrayList.get(i10)).f48074b;
            int i11 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
            if (i11 == 0) {
                return j10;
            }
            if (i11 < 0) {
                z3.b bVar = (z3.b) arrayList.get(i10 - 1);
                long j11 = bVar.d;
                if (j11 != -9223372036854775807L && j11 <= j3) {
                    return j11;
                }
                return bVar.f48074b;
            }
        }
        z3.b bVar2 = (z3.b) e9.q.l(arrayList);
        long j12 = bVar2.d;
        if (j12 != -9223372036854775807L && j3 >= j12) {
            return j12;
        }
        return bVar2.f48074b;
    }

    @Override
    public void e(long j3) {
        int f7 = f(j3);
        if (f7 == 0) {
            return;
        }
        ArrayList arrayList = this.f3909a;
        long j10 = ((z3.b) arrayList.get(f7 - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            f7--;
        }
        arrayList.subList(0, f7).clear();
    }

    public int f(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3909a;
            if (i10 < arrayList.size()) {
                if (j3 < ((z3.b) arrayList.get(i10)).f48074b) {
                    return i10;
                }
                i10++;
            } else {
                return arrayList.size();
            }
        }
    }

    public m() {
        this.f3909a = new ArrayList();
    }
}
