package e2;

import a8.ia;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class y0 {
    public static final y0 f10654b;
    public static final String f10655c;
    public final s f10656a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        ia.p(!false);
        f10654b = new y0(new s(sparseBooleanArray));
        String str = h2.m0.f14112a;
        f10655c = Integer.toString(0, 36);
    }

    public y0(s sVar) {
        this.f10656a = sVar;
    }

    public final boolean a(int i7) {
        return this.f10656a.f10542a.get(i7);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            s sVar = this.f10656a;
            if (i7 < sVar.f10542a.size()) {
                arrayList.add(Integer.valueOf(sVar.a(i7)));
                i7++;
            } else {
                bundle.putIntegerArrayList(f10655c, arrayList);
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
        return this.f10656a.equals(((y0) obj).f10656a);
    }

    public final int hashCode() {
        return this.f10656a.hashCode();
    }
}
