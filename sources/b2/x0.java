package b2;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class x0 {
    public static final x0 f2040b;
    public static final String f2041c;
    public final q f2042a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        e2.d.g(!false);
        f2040b = new x0(new q(sparseBooleanArray));
        String str = e2.d0.f7188a;
        f2041c = Integer.toString(0, 36);
    }

    public x0(q qVar) {
        this.f2042a = qVar;
    }

    public final boolean a(int i10) {
        return this.f2042a.f1895a.get(i10);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            q qVar = this.f2042a;
            if (i10 < qVar.f1895a.size()) {
                arrayList.add(Integer.valueOf(qVar.a(i10)));
                i10++;
            } else {
                bundle.putIntegerArrayList(f2041c, arrayList);
                return bundle;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        return this.f2042a.equals(((x0) obj).f2042a);
    }

    public final int hashCode() {
        return this.f2042a.hashCode();
    }
}
