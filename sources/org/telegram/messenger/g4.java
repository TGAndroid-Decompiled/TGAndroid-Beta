package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
public final class g4 {
    public static final SparseArray f22564e = new SparseArray();
    public static final ArrayList f22565f = new ArrayList();
    public final int f22566a;
    public final int f22567b;
    public final int f22568c;
    public final boolean d;

    public g4(int i7, int i10) {
        if (i7 == -2) {
            this.d = true;
            i7 = -1;
        }
        this.f22566a = i7;
        Integer valueOf = Integer.valueOf(i7);
        this.f22567b = i10;
        this.f22568c = Objects.hash(0, valueOf, Integer.valueOf(i10));
    }

    public final void a() {
        if (f22564e.indexOfKey(this.f22568c) >= 0) {
            return;
        }
        ArrayList arrayList = f22565f;
        if (arrayList.contains(Integer.valueOf(this.f22568c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.f22568c));
        Utilities.f21333e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.f22568c;
    }
}
