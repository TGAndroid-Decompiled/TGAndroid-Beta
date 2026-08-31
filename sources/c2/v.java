package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class v {
    public static final v f2183c = new v(new Bundle(), null);
    public final Bundle f2184a;
    public List f2185b;

    public v(Bundle bundle, ArrayList arrayList) {
        this.f2184a = bundle;
        this.f2185b = arrayList;
    }

    public static v b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new v(bundle, null);
    }

    public final void a() {
        if (this.f2185b == null) {
            ArrayList<String> stringArrayList = this.f2184a.getStringArrayList("controlCategories");
            this.f2185b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f2185b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f2185b);
    }

    public final boolean d() {
        a();
        return this.f2185b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            a();
            vVar.a();
            return this.f2185b.equals(vVar.f2185b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f2185b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
