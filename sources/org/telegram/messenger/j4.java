package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
public final class j4 {
    public static final SparseArray e = new SparseArray();
    public static final ArrayList f16412f = new ArrayList();
    public final int f16413a;
    public final int f16414b;
    public final int f16415c;
    public final boolean d;

    public j4(int i10, int i11) {
        if (i10 == -2) {
            this.d = true;
            i10 = -1;
        }
        this.f16413a = i10;
        Integer valueOf = Integer.valueOf(i10);
        this.f16414b = i11;
        this.f16415c = Objects.hash(0, valueOf, Integer.valueOf(i11));
    }

    public final void a() {
        if (e.indexOfKey(this.f16415c) >= 0) {
            return;
        }
        ArrayList arrayList = f16412f;
        if (arrayList.contains(Integer.valueOf(this.f16415c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.f16415c));
        Utilities.e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.f16415c;
    }
}
