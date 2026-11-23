package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
public final class i4 {
    public static final SparseArray f24549e = new SparseArray();
    public static final ArrayList f24550f = new ArrayList();
    public final int f24551a;
    public final int f24552b;
    public final int f24553c;
    public final boolean d;

    public i4(int i7, int i10) {
        if (i7 == -2) {
            this.d = true;
            i7 = -1;
        }
        this.f24551a = i7;
        Integer valueOf = Integer.valueOf(i7);
        this.f24552b = i10;
        this.f24553c = Objects.hash(0, valueOf, Integer.valueOf(i10));
    }

    public final void a() {
        if (f24549e.indexOfKey(this.f24553c) >= 0) {
            return;
        }
        ArrayList arrayList = f24550f;
        if (arrayList.contains(Integer.valueOf(this.f24553c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.f24553c));
        Utilities.f22774e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.f24553c;
    }
}
