package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
public final class g4 {
    public static final SparseArray f22594e = new SparseArray();
    public static final ArrayList f22595f = new ArrayList();
    public final int f22596a;
    public final int f22597b;
    public final int f22598c;
    public final boolean d;

    public g4(int i7, int i10) {
        if (i7 == -2) {
            this.d = true;
            i7 = -1;
        }
        this.f22596a = i7;
        Integer valueOf = Integer.valueOf(i7);
        this.f22597b = i10;
        this.f22598c = Objects.hash(0, valueOf, Integer.valueOf(i10));
    }

    public final void a() {
        if (f22594e.indexOfKey(this.f22598c) >= 0) {
            return;
        }
        ArrayList arrayList = f22595f;
        if (arrayList.contains(Integer.valueOf(this.f22598c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.f22598c));
        Utilities.f21341e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.f22598c;
    }
}
