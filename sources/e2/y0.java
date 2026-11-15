package e2;

import a8.ja;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class y0 {
    public static final y0 f10490b;
    public static final String f10491c;
    public final s f10492a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        ja.p(!false);
        f10490b = new y0(new s(sparseBooleanArray));
        String str = h2.l0.f13471a;
        f10491c = Integer.toString(0, 36);
    }

    public y0(s sVar) {
        this.f10492a = sVar;
    }

    public final boolean a(int i7) {
        return this.f10492a.f10378a.get(i7);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            s sVar = this.f10492a;
            if (i7 < sVar.f10378a.size()) {
                arrayList.add(Integer.valueOf(sVar.a(i7)));
                i7++;
            } else {
                bundle.putIntegerArrayList(f10491c, arrayList);
                return bundle;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        return this.f10492a.equals(((y0) obj).f10492a);
    }

    public final int hashCode() {
        return this.f10492a.hashCode();
    }
}
