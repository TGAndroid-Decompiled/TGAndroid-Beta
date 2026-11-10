package e2;

import a8.ia;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class y0 {
    public static final y0 f10659b;
    public static final String f10660c;
    public final s f10661a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        ia.p(!false);
        f10659b = new y0(new s(sparseBooleanArray));
        String str = h2.m0.f14114a;
        f10660c = Integer.toString(0, 36);
    }

    public y0(s sVar) {
        this.f10661a = sVar;
    }

    public final boolean a(int i7) {
        return this.f10661a.f10547a.get(i7);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            s sVar = this.f10661a;
            if (i7 < sVar.f10547a.size()) {
                arrayList.add(Integer.valueOf(sVar.a(i7)));
                i7++;
            } else {
                bundle.putIntegerArrayList(f10660c, arrayList);
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
        return this.f10661a.equals(((y0) obj).f10661a);
    }

    public final int hashCode() {
        return this.f10661a.hashCode();
    }
}
