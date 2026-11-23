package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
public final class i4 {
    public static final SparseArray f24585e = new SparseArray();
    public static final ArrayList f24586f = new ArrayList();
    public final int f24587a;
    public final int f24588b;
    public final int f24589c;
    public final boolean d;

    public i4(int i7, int i10) {
        if (i7 == -2) {
            this.d = true;
            i7 = -1;
        }
        this.f24587a = i7;
        Integer valueOf = Integer.valueOf(i7);
        this.f24588b = i10;
        this.f24589c = Objects.hash(0, valueOf, Integer.valueOf(i10));
    }

    public final void a() {
        if (f24585e.indexOfKey(this.f24589c) >= 0) {
            return;
        }
        ArrayList arrayList = f24586f;
        if (arrayList.contains(Integer.valueOf(this.f24589c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.f24589c));
        Utilities.f22810e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.f24589c;
    }
}
