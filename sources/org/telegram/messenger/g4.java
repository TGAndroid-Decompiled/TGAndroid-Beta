package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
public final class g4 {
    public static final SparseArray f22633e = new SparseArray();
    public static final ArrayList f22634f = new ArrayList();
    public final int f22635a;
    public final int f22636b;
    public final int f22637c;
    public final boolean d;

    public g4(int i3, int i10) {
        if (i3 == -2) {
            this.d = true;
            i3 = -1;
        }
        this.f22635a = i3;
        Integer valueOf = Integer.valueOf(i3);
        this.f22636b = i10;
        this.f22637c = Objects.hash(0, valueOf, Integer.valueOf(i10));
    }

    public final void a() {
        if (f22633e.indexOfKey(this.f22637c) >= 0) {
            return;
        }
        ArrayList arrayList = f22634f;
        if (arrayList.contains(Integer.valueOf(this.f22637c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.f22637c));
        Utilities.f21387e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.f22637c;
    }
}
