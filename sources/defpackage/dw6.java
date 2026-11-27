package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class dw6 {
    public static final dw6 c = new dw6(new Bundle(), null);
    public final Bundle a;
    public List b;

    public dw6(Bundle bundle, ArrayList arrayList) {
        this.a = bundle;
        this.b = arrayList;
    }

    public static dw6 b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new dw6(bundle, null);
    }

    public final void a() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("controlCategories");
            this.b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.b);
    }

    public final boolean d() {
        a();
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dw6) {
            dw6 dw6Var = (dw6) obj;
            a();
            dw6Var.a();
            return this.b.equals(dw6Var.b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
