package b2;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class x0 {
    public static final x0 f3341b;
    public static final String f3342c;
    public final q f3343a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        e2.d.g(!false);
        f3341b = new x0(new q(sparseBooleanArray));
        String str = e2.d0.f7872a;
        f3342c = Integer.toString(0, 36);
    }

    public x0(q qVar) {
        this.f3343a = qVar;
    }

    public final boolean a(int i10) {
        return this.f3343a.f3196a.get(i10);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            q qVar = this.f3343a;
            if (i10 < qVar.f3196a.size()) {
                arrayList.add(Integer.valueOf(qVar.a(i10)));
                i10++;
            } else {
                bundle.putIntegerArrayList(f3342c, arrayList);
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
        return this.f3343a.equals(((x0) obj).f3343a);
    }

    public final int hashCode() {
        return this.f3343a.hashCode();
    }
}
