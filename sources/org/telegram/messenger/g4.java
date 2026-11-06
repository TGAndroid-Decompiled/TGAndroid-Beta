package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
public final class g4 {
    public static final SparseArray f22571e = new SparseArray();
    public static final ArrayList f22572f = new ArrayList();
    public final int f22573a;
    public final int f22574b;
    public final int f22575c;
    public final boolean d;

    public g4(int i7, int i10) {
        if (i7 == -2) {
            this.d = true;
            i7 = -1;
        }
        this.f22573a = i7;
        Integer valueOf = Integer.valueOf(i7);
        this.f22574b = i10;
        this.f22575c = Objects.hash(0, valueOf, Integer.valueOf(i10));
    }

    public final void a() {
        if (f22571e.indexOfKey(this.f22575c) >= 0) {
            return;
        }
        ArrayList arrayList = f22572f;
        if (arrayList.contains(Integer.valueOf(this.f22575c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.f22575c));
        Utilities.f21333e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.f22575c;
    }
}
