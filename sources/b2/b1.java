package b2;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import v7.u6;
public final class b1 {
    public static final b1 f3702b;
    public static final String f3703c;
    public final u f3704a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        u6.p(!false);
        f3702b = new b1(new u(sparseBooleanArray));
        String str = e2.m0.f8255a;
        f3703c = Integer.toString(0, 36);
    }

    public b1(u uVar) {
        this.f3704a = uVar;
    }

    public final boolean a(int i10) {
        return this.f3704a.f4056a.get(i10);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            u uVar = this.f3704a;
            if (i10 < uVar.f4056a.size()) {
                arrayList.add(Integer.valueOf(uVar.a(i10)));
                i10++;
            } else {
                bundle.putIntegerArrayList(f3703c, arrayList);
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
        return this.f3704a.equals(((b1) obj).f3704a);
    }

    public final int hashCode() {
        return this.f3704a.hashCode();
    }
}
