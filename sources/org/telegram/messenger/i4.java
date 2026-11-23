package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
public final class i4 {
    public static final SparseArray f24673e = new SparseArray();
    public static final ArrayList f24674f = new ArrayList();
    public final int f24675a;
    public final int f24676b;
    public final int f24677c;
    public final boolean d;

    public i4(int i7, int i10) {
        if (i7 == -2) {
            this.d = true;
            i7 = -1;
        }
        this.f24675a = i7;
        Integer valueOf = Integer.valueOf(i7);
        this.f24676b = i10;
        this.f24677c = Objects.hash(0, valueOf, Integer.valueOf(i10));
    }

    public final void a() {
        if (f24673e.indexOfKey(this.f24677c) >= 0) {
            return;
        }
        ArrayList arrayList = f24674f;
        if (arrayList.contains(Integer.valueOf(this.f24677c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.f24677c));
        Utilities.f22877e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.f24677c;
    }
}
