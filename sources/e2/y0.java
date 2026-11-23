package e2;

import a8.ma;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class y0 {
    public static final y0 f10800b;
    public static final String f10801c;
    public final s f10802a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        ma.p(!false);
        f10800b = new y0(new s(sparseBooleanArray));
        String str = h2.l0.f13778a;
        f10801c = Integer.toString(0, 36);
    }

    public y0(s sVar) {
        this.f10802a = sVar;
    }

    public final boolean a(int i7) {
        return this.f10802a.f10688a.get(i7);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            s sVar = this.f10802a;
            if (i7 < sVar.f10688a.size()) {
                arrayList.add(Integer.valueOf(sVar.a(i7)));
                i7++;
            } else {
                bundle.putIntegerArrayList(f10801c, arrayList);
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
        return this.f10802a.equals(((y0) obj).f10802a);
    }

    public final int hashCode() {
        return this.f10802a.hashCode();
    }
}
