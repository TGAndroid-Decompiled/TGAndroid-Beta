package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
public final class g4 {
    public static final SparseArray f22590e = new SparseArray();
    public static final ArrayList f22591f = new ArrayList();
    public final int f22592a;
    public final int f22593b;
    public final int f22594c;
    public final boolean d;

    public g4(int i7, int i10) {
        if (i7 == -2) {
            this.d = true;
            i7 = -1;
        }
        this.f22592a = i7;
        Integer valueOf = Integer.valueOf(i7);
        this.f22593b = i10;
        this.f22594c = Objects.hash(0, valueOf, Integer.valueOf(i10));
    }

    public final void a() {
        if (f22590e.indexOfKey(this.f22594c) >= 0) {
            return;
        }
        ArrayList arrayList = f22591f;
        if (arrayList.contains(Integer.valueOf(this.f22594c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.f22594c));
        Utilities.f21336e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.f22594c;
    }
}
