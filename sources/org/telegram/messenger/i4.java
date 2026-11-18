package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
public final class i4 {
    public static final SparseArray f24550e = new SparseArray();
    public static final ArrayList f24551f = new ArrayList();
    public final int f24552a;
    public final int f24553b;
    public final int f24554c;
    public final boolean d;

    public i4(int i7, int i10) {
        if (i7 == -2) {
            this.d = true;
            i7 = -1;
        }
        this.f24552a = i7;
        Integer valueOf = Integer.valueOf(i7);
        this.f24553b = i10;
        this.f24554c = Objects.hash(0, valueOf, Integer.valueOf(i10));
    }

    public final void a() {
        if (f24550e.indexOfKey(this.f24554c) >= 0) {
            return;
        }
        ArrayList arrayList = f24551f;
        if (arrayList.contains(Integer.valueOf(this.f24554c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.f24554c));
        Utilities.f22782e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.f24554c;
    }
}
