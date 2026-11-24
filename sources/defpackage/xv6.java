package defpackage;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class xv6 implements h53 {
    public ArrayList a;

    public xv6(byte b) {
        switch (b) {
            case 2:
                this.a = new ArrayList();
                return;
            default:
                this.a = new ArrayList();
                return;
        }
    }

    @Override
    public final long a(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j < ((i53) arrayList.get(0)).b) {
                return ((i53) arrayList.get(0)).b;
            }
            for (int i = 1; i < arrayList.size(); i++) {
                long j2 = ((i53) arrayList.get(i)).b;
                if (j < j2) {
                    long j3 = ((i53) arrayList.get(i - 1)).d;
                    if (j3 != -9223372036854775807L && j3 > j && j3 < j2) {
                        return j3;
                    }
                    return j2;
                }
            }
            long j4 = ((i53) lne.b(arrayList)).d;
            if (j4 != -9223372036854775807L && j < j4) {
                return j4;
            }
            return Long.MIN_VALUE;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final boolean b(defpackage.i53 r10, long r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv6.b(i53, long):boolean");
    }

    @Override
    public final mo5 c(long j) {
        int h = h(j);
        if (h == 0) {
            ko5 ko5Var = mo5.b;
            return y79.e;
        }
        i53 i53Var = (i53) this.a.get(h - 1);
        long j2 = i53Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            ko5 ko5Var2 = mo5.b;
            return y79.e;
        }
        return i53Var.a;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((i53) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((i53) arrayList.get(i)).b;
            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i2 == 0) {
                return j2;
            }
            if (i2 < 0) {
                i53 i53Var = (i53) arrayList.get(i - 1);
                long j3 = i53Var.d;
                if (j3 != -9223372036854775807L && j3 <= j) {
                    return j3;
                }
                return i53Var.b;
            }
        }
        i53 i53Var2 = (i53) lne.b(arrayList);
        long j4 = i53Var2.d;
        if (j4 != -9223372036854775807L && j >= j4) {
            return j4;
        }
        return i53Var2.b;
    }

    @Override
    public final void e(long j) {
        ArrayList arrayList = this.a;
        int h = h(j);
        if (h == 0) {
            return;
        }
        long j2 = ((i53) arrayList.get(h - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            h--;
        }
        arrayList.subList(0, h).clear();
    }

    public final void f(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                if (str != null) {
                    ArrayList arrayList2 = this.a;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        this.a = arrayList2;
                    }
                    if (!arrayList2.contains(str)) {
                        this.a.add(str);
                    }
                } else {
                    u36.j("category must not be null");
                    return;
                }
            }
        }
    }

    public final yv6 g() {
        if (this.a == null) {
            return yv6.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new yv6(bundle, this.a);
    }

    public final int h(long j) {
        ArrayList arrayList = this.a;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((i53) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    public final synchronized List i() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.a));
    }
}
