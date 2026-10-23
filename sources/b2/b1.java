package b2;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import v7.u6;
public final class b1 {
    public static final b1 f3705b;
    public static final String f3706c;
    public final u f3707a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        u6.p(!false);
        f3705b = new b1(new u(sparseBooleanArray));
        String str = e2.m0.f8259a;
        f3706c = Integer.toString(0, 36);
    }

    public b1(u uVar) {
        this.f3707a = uVar;
    }

    public final boolean a(int i10) {
        return this.f3707a.f4059a.get(i10);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            u uVar = this.f3707a;
            if (i10 < uVar.f4059a.size()) {
                arrayList.add(Integer.valueOf(uVar.a(i10)));
                i10++;
            } else {
                bundle.putIntegerArrayList(f3706c, arrayList);
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
        return this.f3707a.equals(((b1) obj).f3707a);
    }

    public final int hashCode() {
        return this.f3707a.hashCode();
    }
}
