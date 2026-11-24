package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
public final class yg2 implements w33 {
    public final byte a;
    public final ArrayList b;

    public yg2(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.b = new ArrayList();
                return;
            case 3:
                this.b = new ArrayList();
                return;
            case 4:
                this.b = new ArrayList();
                return;
            default:
                this.b = new ArrayList();
                return;
        }
    }

    @Override
    public final long a(long j) {
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            if (j < ((x33) arrayList.get(0)).b) {
                return ((x33) arrayList.get(0)).b;
            }
            for (int i = 1; i < arrayList.size(); i++) {
                long j2 = ((x33) arrayList.get(i)).b;
                if (j < j2) {
                    long j3 = ((x33) arrayList.get(i - 1)).d;
                    if (j3 != -9223372036854775807L && j3 > j && j3 < j2) {
                        return j3;
                    }
                    return j2;
                }
            }
            long j4 = ((x33) jle.b(arrayList)).d;
            if (j4 != -9223372036854775807L && j < j4) {
                return j4;
            }
            return Long.MIN_VALUE;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final boolean b(defpackage.x33 r10, long r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg2.b(x33, long):boolean");
    }

    @Override
    public final mm5 c(long j) {
        int f = f(j);
        if (f == 0) {
            km5 km5Var = mm5.b;
            return w59.e;
        }
        x33 x33Var = (x33) this.b.get(f - 1);
        long j2 = x33Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            km5 km5Var2 = mm5.b;
            return w59.e;
        }
        return x33Var.a;
    }

    @Override
    public final void clear() {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 2:
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (obj != null) {
                        fyb.g();
                        return;
                    }
                    try {
                        throw null;
                        break;
                    } catch (Exception e) {
                        ei7.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                    }
                }
                arrayList.clear();
                return;
            default:
                arrayList.clear();
                return;
        }
    }

    @Override
    public final long d(long j) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || j < ((x33) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((x33) arrayList.get(i)).b;
            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i2 == 0) {
                return j2;
            }
            if (i2 < 0) {
                x33 x33Var = (x33) arrayList.get(i - 1);
                long j3 = x33Var.d;
                if (j3 != -9223372036854775807L && j3 <= j) {
                    return j3;
                }
                return x33Var.b;
            }
        }
        x33 x33Var2 = (x33) jle.b(arrayList);
        long j4 = x33Var2.d;
        if (j4 != -9223372036854775807L && j >= j4) {
            return j4;
        }
        return x33Var2.b;
    }

    @Override
    public final void e(long j) {
        int f = f(j);
        if (f == 0) {
            return;
        }
        ArrayList arrayList = this.b;
        long j2 = ((x33) arrayList.get(f - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            f--;
        }
        arrayList.subList(0, f).clear();
    }

    public final int f(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                if (j < ((x33) arrayList.get(i)).b) {
                    return i;
                }
                i++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final synchronized List g() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.b));
    }

    public final xg2 h(int i) {
        return (xg2) this.b.get(i);
    }

    public yg2(ArrayList arrayList) {
        this.a = (byte) 0;
        this.b = arrayList;
    }

    public yg2(xg2 xg2Var) {
        this.a = (byte) 0;
        ArrayList arrayList = new ArrayList(1);
        this.b = arrayList;
        arrayList.add(xg2Var);
    }
}
