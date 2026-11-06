package f5;

import h9.g0;
import h9.i0;
import h9.t1;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class j implements z2.a {
    public final ArrayList f11163a;

    public j(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i7);
                if (optJSONObject != null) {
                    arrayList.add(new i(optJSONObject));
                }
            }
        }
        this.f11163a = arrayList;
    }

    @Override
    public long a(long j3) {
        ArrayList arrayList = this.f11163a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((c4.a) arrayList.get(0)).f5270b) {
            return ((c4.a) arrayList.get(0)).f5270b;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            c4.a aVar = (c4.a) arrayList.get(i7);
            long j10 = aVar.f5270b;
            long j11 = aVar.f5270b;
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
        int f10 = f(j3);
        if (f10 == 0) {
            g0 g0Var = i0.f14329b;
            return t1.f14397e;
        }
        c4.a aVar = (c4.a) this.f11163a.get(f10 - 1);
        long j10 = aVar.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            g0 g0Var2 = i0.f14329b;
            return t1.f14397e;
        }
        return aVar.f5269a;
    }

    @Override
    public boolean c(c4.a r10, long r11) {
        throw new UnsupportedOperationException("Method not decompiled: f5.j.c(c4.a, long):boolean");
    }

    @Override
    public void clear() {
        this.f11163a.clear();
    }

    @Override
    public long d(long j3) {
        ArrayList arrayList = this.f11163a;
        if (arrayList.isEmpty() || j3 < ((c4.a) arrayList.get(0)).f5270b) {
            return -9223372036854775807L;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            long j10 = ((c4.a) arrayList.get(i7)).f5270b;
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
                return aVar.f5270b;
            }
        }
        c4.a aVar2 = (c4.a) h9.o.n(arrayList);
        long j12 = aVar2.d;
        if (j12 != -9223372036854775807L && j3 >= j12) {
            return j12;
        }
        return aVar2.f5270b;
    }

    @Override
    public void e(long j3) {
        int f10 = f(j3);
        if (f10 == 0) {
            return;
        }
        ArrayList arrayList = this.f11163a;
        long j10 = ((c4.a) arrayList.get(f10 - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            f10--;
        }
        arrayList.subList(0, f10).clear();
    }

    public int f(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f11163a;
            if (i7 < arrayList.size()) {
                if (j3 < ((c4.a) arrayList.get(i7)).f5270b) {
                    return i7;
                }
                i7++;
            } else {
                return arrayList.size();
            }
        }
    }

    public j() {
        this.f11163a = new ArrayList();
    }
}
