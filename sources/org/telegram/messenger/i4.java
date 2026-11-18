package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
public final class i4 {
    public static final SparseArray f24547e = new SparseArray();
    public static final ArrayList f24548f = new ArrayList();
    public final int f24549a;
    public final int f24550b;
    public final int f24551c;
    public final boolean d;

    public i4(int i7, int i10) {
        if (i7 == -2) {
            this.d = true;
            i7 = -1;
        }
        this.f24549a = i7;
        Integer valueOf = Integer.valueOf(i7);
        this.f24550b = i10;
        this.f24551c = Objects.hash(0, valueOf, Integer.valueOf(i10));
    }

    public final void a() {
        if (f24547e.indexOfKey(this.f24551c) >= 0) {
            return;
        }
        ArrayList arrayList = f24548f;
        if (arrayList.contains(Integer.valueOf(this.f24551c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.f24551c));
        Utilities.f22779e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.f24551c;
    }
}
