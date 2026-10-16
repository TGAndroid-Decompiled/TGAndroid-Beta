package b2;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import v7.u6;
public final class c1 {
    public static final c1 f2095b;
    public static final String f2096c;
    public final v f2097a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        u6.p(!false);
        f2095b = new c1(new v(sparseBooleanArray));
        String str = e2.m0.f8375a;
        f2096c = Integer.toString(0, 36);
    }

    public c1(v vVar) {
        this.f2097a = vVar;
    }

    public final boolean a(int i10) {
        return this.f2097a.f2447a.get(i10);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            v vVar = this.f2097a;
            if (i10 < vVar.f2447a.size()) {
                arrayList.add(Integer.valueOf(vVar.a(i10)));
                i10++;
            } else {
                bundle.putIntegerArrayList(f2096c, arrayList);
                return bundle;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        return this.f2097a.equals(((c1) obj).f2097a);
    }

    public final int hashCode() {
        return this.f2097a.hashCode();
    }
}
