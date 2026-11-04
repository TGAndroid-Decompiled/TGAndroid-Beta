package d2;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import b8.zb;
import java.util.ArrayList;
public final class a1 {
    public static final a1 f8024b;
    public static final String f8025c;
    public final t f8026a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        zb.p(!false);
        f8024b = new a1(new t(sparseBooleanArray));
        String str = g2.n0.f11873a;
        f8025c = Integer.toString(0, 36);
    }

    public a1(t tVar) {
        this.f8026a = tVar;
    }

    public final boolean a(int i3) {
        return this.f8026a.f8412a.get(i3);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i3 = 0;
        while (true) {
            t tVar = this.f8026a;
            if (i3 < tVar.f8412a.size()) {
                arrayList.add(Integer.valueOf(tVar.a(i3)));
                i3++;
            } else {
                bundle.putIntegerArrayList(f8025c, arrayList);
                return bundle;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        return this.f8026a.equals(((a1) obj).f8026a);
    }

    public final int hashCode() {
        return this.f8026a.hashCode();
    }
}
