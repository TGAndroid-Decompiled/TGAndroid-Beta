package b2;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import v7.u6;
public final class b1 {
    public static final b1 f3700b;
    public static final String f3701c;
    public final u f3702a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        u6.p(!false);
        f3700b = new b1(new u(sparseBooleanArray));
        String str = e2.m0.f8254a;
        f3701c = Integer.toString(0, 36);
    }

    public b1(u uVar) {
        this.f3702a = uVar;
    }

    public final boolean a(int i10) {
        return this.f3702a.f4054a.get(i10);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            u uVar = this.f3702a;
            if (i10 < uVar.f4054a.size()) {
                arrayList.add(Integer.valueOf(uVar.a(i10)));
                i10++;
            } else {
                bundle.putIntegerArrayList(f3701c, arrayList);
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
        return this.f3702a.equals(((b1) obj).f3702a);
    }

    public final int hashCode() {
        return this.f3702a.hashCode();
    }
}
