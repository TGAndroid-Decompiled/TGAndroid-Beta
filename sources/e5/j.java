package e5;

import android.os.Bundle;
import g9.g0;
import g9.i0;
import g9.s1;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import org.json.JSONArray;
import org.json.JSONObject;
public final class j implements y2.a {
    public final int f9605a;
    public ArrayList f9606b;

    public j(int i3) {
        this.f9605a = i3;
        switch (i3) {
            case 2:
                return;
            case 3:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f9606b = new ArrayList();
                return;
            case 4:
                this.f9606b = new ArrayList();
                return;
            default:
                this.f9606b = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
        }
    }

    @Override
    public long a(long j10) {
        ArrayList arrayList = this.f9606b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((b4.a) arrayList.get(0)).f2353b) {
            return ((b4.a) arrayList.get(0)).f2353b;
        }
        for (int i3 = 1; i3 < arrayList.size(); i3++) {
            b4.a aVar = (b4.a) arrayList.get(i3);
            long j11 = aVar.f2353b;
            long j12 = aVar.f2353b;
            if (j10 < j11) {
                long j13 = ((b4.a) arrayList.get(i3 - 1)).d;
                if (j13 != -9223372036854775807L && j13 > j10 && j13 < j12) {
                    return j13;
                }
                return j12;
            }
        }
        long j14 = ((b4.a) g9.o.n(arrayList)).d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override
    public boolean b(b4.a r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: e5.j.b(b4.a, long):boolean");
    }

    @Override
    public i0 c(long j10) {
        int g7 = g(j10);
        if (g7 == 0) {
            g0 g0Var = i0.f12083b;
            return s1.f12146e;
        }
        b4.a aVar = (b4.a) this.f9606b.get(g7 - 1);
        long j11 = aVar.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            g0 g0Var2 = i0.f12083b;
            return s1.f12146e;
        }
        return aVar.f2352a;
    }

    @Override
    public void clear() {
        switch (this.f9605a) {
            case 3:
                ArrayList arrayList = this.f9606b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    if (obj == null) {
                        try {
                            throw null;
                            break;
                        } catch (Exception e10) {
                            vc.i.d.log(Level.WARNING, "could not delete file ", (Throwable) e10);
                        }
                    } else {
                        throw new ClassCastException();
                    }
                }
                arrayList.clear();
                return;
            default:
                this.f9606b.clear();
                return;
        }
    }

    @Override
    public long d(long j10) {
        ArrayList arrayList = this.f9606b;
        if (arrayList.isEmpty() || j10 < ((b4.a) arrayList.get(0)).f2353b) {
            return -9223372036854775807L;
        }
        for (int i3 = 1; i3 < arrayList.size(); i3++) {
            long j11 = ((b4.a) arrayList.get(i3)).f2353b;
            int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            if (i10 == 0) {
                return j11;
            }
            if (i10 < 0) {
                b4.a aVar = (b4.a) arrayList.get(i3 - 1);
                long j12 = aVar.d;
                if (j12 != -9223372036854775807L && j12 <= j10) {
                    return j12;
                }
                return aVar.f2353b;
            }
        }
        b4.a aVar2 = (b4.a) g9.o.n(arrayList);
        long j13 = aVar2.d;
        if (j13 != -9223372036854775807L && j10 >= j13) {
            return j13;
        }
        return aVar2.f2353b;
    }

    @Override
    public void e(long j10) {
        ArrayList arrayList = this.f9606b;
        int g7 = g(j10);
        if (g7 == 0) {
            return;
        }
        long j11 = ((b4.a) arrayList.get(g7 - 1)).d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            g7--;
        }
        arrayList.subList(0, g7).clear();
    }

    public r4.r f() {
        if (this.f9606b == null) {
            return r4.r.f54346c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f9606b);
        return new r4.r(bundle, this.f9606b);
    }

    public int g(long j10) {
        ArrayList arrayList = this.f9606b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (j10 < ((b4.a) arrayList.get(i3)).f2353b) {
                return i3;
            }
        }
        return arrayList.size();
    }

    public j(JSONArray jSONArray) {
        this.f9605a = 0;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                if (optJSONObject != null) {
                    arrayList.add(new i(optJSONObject));
                }
            }
        }
        this.f9606b = arrayList;
    }
}
