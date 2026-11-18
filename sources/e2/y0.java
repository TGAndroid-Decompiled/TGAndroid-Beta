package e2;

import a8.la;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class y0 {
    public static final y0 f10808b;
    public static final String f10809c;
    public final s f10810a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        la.p(!false);
        f10808b = new y0(new s(sparseBooleanArray));
        String str = h2.l0.f13786a;
        f10809c = Integer.toString(0, 36);
    }

    public y0(s sVar) {
        this.f10810a = sVar;
    }

    public final boolean a(int i7) {
        return this.f10810a.f10696a.get(i7);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            s sVar = this.f10810a;
            if (i7 < sVar.f10696a.size()) {
                arrayList.add(Integer.valueOf(sVar.a(i7)));
                i7++;
            } else {
                bundle.putIntegerArrayList(f10809c, arrayList);
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
        return this.f10810a.equals(((y0) obj).f10810a);
    }

    public final int hashCode() {
        return this.f10810a.hashCode();
    }
}
