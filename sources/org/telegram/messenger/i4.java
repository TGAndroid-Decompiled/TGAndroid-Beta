package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
public final class i4 {
    public static final SparseArray f24575e = new SparseArray();
    public static final ArrayList f24576f = new ArrayList();
    public final int f24577a;
    public final int f24578b;
    public final int f24579c;
    public final boolean d;

    public i4(int i7, int i10) {
        if (i7 == -2) {
            this.d = true;
            i7 = -1;
        }
        this.f24577a = i7;
        Integer valueOf = Integer.valueOf(i7);
        this.f24578b = i10;
        this.f24579c = Objects.hash(0, valueOf, Integer.valueOf(i10));
    }

    public final void a() {
        if (f24575e.indexOfKey(this.f24579c) >= 0) {
            return;
        }
        ArrayList arrayList = f24576f;
        if (arrayList.contains(Integer.valueOf(this.f24579c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.f24579c));
        Utilities.f22807e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.f24579c;
    }
}
