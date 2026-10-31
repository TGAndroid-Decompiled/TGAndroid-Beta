package b2;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import v7.t6;
public final class b1 {
    public static final b1 f1982b;
    public static final String f1983c;
    public final v f1984a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        t6.p(!false);
        f1982b = new b1(new v(sparseBooleanArray));
        String str = e2.l0.f6165a;
        f1983c = Integer.toString(0, 36);
    }

    public b1(v vVar) {
        this.f1984a = vVar;
    }

    public final boolean a(int i10) {
        return this.f1984a.f2347a.get(i10);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            v vVar = this.f1984a;
            if (i10 < vVar.f2347a.size()) {
                arrayList.add(Integer.valueOf(vVar.a(i10)));
                i10++;
            } else {
                bundle.putIntegerArrayList(f1983c, arrayList);
                return bundle;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        return this.f1984a.equals(((b1) obj).f1984a);
    }

    public final int hashCode() {
        return this.f1984a.hashCode();
    }
}
