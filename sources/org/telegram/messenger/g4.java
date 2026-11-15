package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
public final class g4 {
    public static final SparseArray f23659e = new SparseArray();
    public static final ArrayList f23660f = new ArrayList();
    public final int f23661a;
    public final int f23662b;
    public final int f23663c;
    public final boolean d;

    public g4(int i7, int i10) {
        if (i7 == -2) {
            this.d = true;
            i7 = -1;
        }
        this.f23661a = i7;
        Integer valueOf = Integer.valueOf(i7);
        this.f23662b = i10;
        this.f23663c = Objects.hash(0, valueOf, Integer.valueOf(i10));
    }

    public final void a() {
        if (f23659e.indexOfKey(this.f23663c) >= 0) {
            return;
        }
        ArrayList arrayList = f23660f;
        if (arrayList.contains(Integer.valueOf(this.f23663c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.f23663c));
        Utilities.f22416e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.f23663c;
    }
}
