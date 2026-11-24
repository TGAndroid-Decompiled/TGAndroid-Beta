package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
public final class kc8 {
    public static final kc8 b = new jc8().b();
    public static final String c;
    public final gi4 a;

    static {
        String str = g8c.a;
        c = "0";
    }

    public kc8(gi4 gi4Var) {
        this.a = gi4Var;
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            gi4 gi4Var = this.a;
            if (i < gi4Var.a.size()) {
                arrayList.add(Integer.valueOf(gi4Var.a(i)));
                i++;
            } else {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc8)) {
            return false;
        }
        return this.a.equals(((kc8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
