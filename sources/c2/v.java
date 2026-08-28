package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class v {
    public static final v f2236c = new v(new Bundle(), null);
    public final Bundle f2237a;
    public List f2238b;

    public v(Bundle bundle, ArrayList arrayList) {
        this.f2237a = bundle;
        this.f2238b = arrayList;
    }

    public static v b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new v(bundle, null);
    }

    public final void a() {
        if (this.f2238b == null) {
            ArrayList<String> stringArrayList = this.f2237a.getStringArrayList("controlCategories");
            this.f2238b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f2238b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f2238b);
    }

    public final boolean d() {
        a();
        return this.f2238b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            a();
            vVar.a();
            return this.f2238b.equals(vVar.f2238b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f2238b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
