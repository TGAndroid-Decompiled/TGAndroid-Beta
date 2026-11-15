package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
public final class g4 {
    public static final SparseArray f23661e = new SparseArray();
    public static final ArrayList f23662f = new ArrayList();
    public final int f23663a;
    public final int f23664b;
    public final int f23665c;
    public final boolean d;

    public g4(int i7, int i10) {
        if (i7 == -2) {
            this.d = true;
            i7 = -1;
        }
        this.f23663a = i7;
        Integer valueOf = Integer.valueOf(i7);
        this.f23664b = i10;
        this.f23665c = Objects.hash(0, valueOf, Integer.valueOf(i10));
    }

    public final void a() {
        if (f23661e.indexOfKey(this.f23665c) >= 0) {
            return;
        }
        ArrayList arrayList = f23662f;
        if (arrayList.contains(Integer.valueOf(this.f23665c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.f23665c));
        Utilities.f22416e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.f23665c;
    }
}
