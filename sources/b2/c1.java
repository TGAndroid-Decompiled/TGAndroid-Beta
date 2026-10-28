package b2;

import a8.yb;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class c1 {
    public static final c1 f3158b;
    public static final String f3159c;
    public final v f3160a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        yb.p(!false);
        f3158b = new c1(new v(sparseBooleanArray));
        String str = e2.n0.f9691a;
        f3159c = Integer.toString(0, 36);
    }

    public c1(v vVar) {
        this.f3160a = vVar;
    }

    public final boolean a(int i10) {
        return this.f3160a.f3510a.get(i10);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            v vVar = this.f3160a;
            if (i10 < vVar.f3510a.size()) {
                arrayList.add(Integer.valueOf(vVar.a(i10)));
                i10++;
            } else {
                bundle.putIntegerArrayList(f3159c, arrayList);
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
        return this.f3160a.equals(((c1) obj).f3160a);
    }

    public final int hashCode() {
        return this.f3160a.hashCode();
    }
}
