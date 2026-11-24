package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class yt6 {
    public static final yt6 c = new yt6(new Bundle(), null);
    public final Bundle a;
    public List b;

    public yt6(Bundle bundle, ArrayList arrayList) {
        this.a = bundle;
        this.b = arrayList;
    }

    public static yt6 b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new yt6(bundle, null);
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
        if (obj instanceof yt6) {
            yt6 yt6Var = (yt6) obj;
            a();
            yt6Var.a();
            return this.b.equals(yt6Var.b);
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
