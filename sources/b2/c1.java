package b2;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import v7.u6;
public final class c1 {
    public static final c1 f2091b;
    public static final String f2092c;
    public final v f2093a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        u6.p(!false);
        f2091b = new c1(new v(sparseBooleanArray));
        String str = e2.m0.f8372a;
        f2092c = Integer.toString(0, 36);
    }

    public c1(v vVar) {
        this.f2093a = vVar;
    }

    public final boolean a(int i10) {
        return this.f2093a.f2443a.get(i10);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            v vVar = this.f2093a;
            if (i10 < vVar.f2443a.size()) {
                arrayList.add(Integer.valueOf(vVar.a(i10)));
                i10++;
            } else {
                bundle.putIntegerArrayList(f2092c, arrayList);
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
        return this.f2093a.equals(((c1) obj).f2093a);
    }

    public final int hashCode() {
        return this.f2093a.hashCode();
    }
}
