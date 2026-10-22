package ad;

import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
public final class e implements w2.a {
    public final int f506a;
    public final ArrayList f507b;

    public e(int i10) {
        this.f506a = i10;
        switch (i10) {
            case 1:
                this.f507b = new ArrayList();
                return;
            case 2:
                this.f507b = new ArrayList();
                return;
            default:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f507b = new ArrayList();
                return;
        }
    }

    @Override
    public long a(long j10) {
        ArrayList arrayList = this.f507b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((z3.a) arrayList.get(0)).f50645b) {
            return ((z3.a) arrayList.get(0)).f50645b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j11 = aVar.f50645b;
            long j12 = aVar.f50645b;
            if (j10 < j11) {
                long j13 = ((z3.a) arrayList.get(i10 - 1)).d;
                if (j13 != -9223372036854775807L && j13 > j10 && j13 < j12) {
                    return j13;
                }
                return j12;
            }
        }
        long j14 = ((z3.a) s.m(arrayList)).d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override
    public n0 b(long j10) {
        int h = h(j10);
        if (h == 0) {
            l0 l0Var = n0.f8474b;
            return x1.e;
        }
        z3.a aVar = (z3.a) this.f507b.get(h - 1);
        long j11 = aVar.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            l0 l0Var2 = n0.f8474b;
            return x1.e;
        }
        return aVar.f50644a;
    }

    @Override
    public boolean c(z3.a r10, long r11) {
        throw new UnsupportedOperationException("Method not decompiled: ad.e.c(z3.a, long):boolean");
    }

    @Override
    public void clear() {
        switch (this.f506a) {
            case 0:
                ArrayList arrayList = this.f507b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (obj == null) {
                        try {
                            throw null;
                            break;
                        } catch (Exception e) {
                            m.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                        }
                    } else {
                        throw new ClassCastException();
                    }
                }
                arrayList.clear();
                return;
            default:
                this.f507b.clear();
                return;
        }
    }

    @Override
    public long d(long j10) {
        ArrayList arrayList = this.f507b;
        if (arrayList.isEmpty() || j10 < ((z3.a) arrayList.get(0)).f50645b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((z3.a) arrayList.get(i10)).f50645b;
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
                return aVar.f50645b;
            }
        }
        z3.a aVar2 = (z3.a) s.m(arrayList);
        long j13 = aVar2.d;
        if (j13 != -9223372036854775807L && j10 >= j13) {
            return j13;
        }
        return aVar2.f50645b;
    }

    @Override
    public void e(long j10) {
        int h = h(j10);
        if (h == 0) {
            return;
        }
        ArrayList arrayList = this.f507b;
        long j11 = ((z3.a) arrayList.get(h - 1)).d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            h--;
        }
        arrayList.subList(0, h).clear();
    }

    public void f(StringBuilder sb2) {
        String str;
        if (((Boolean) i2.e.A(1, this.f507b)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void g(StringBuilder sb2) {
        while (!this.f507b.isEmpty()) {
            f(sb2);
        }
    }

    public int h(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f507b;
            if (i10 < arrayList.size()) {
                if (j10 < ((z3.a) arrayList.get(i10)).f50645b) {
                    return i10;
                }
                i10++;
            } else {
                return arrayList.size();
            }
        }
    }
}
