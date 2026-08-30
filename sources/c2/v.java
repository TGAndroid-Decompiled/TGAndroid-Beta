package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class v {
    public static final v f2010c = new v(new Bundle(), null);
    public final Bundle f2011a;
    public List f2012b;

    public v(Bundle bundle, ArrayList arrayList) {
        this.f2011a = bundle;
        this.f2012b = arrayList;
    }

    public static v b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new v(bundle, null);
    }

    public final void a() {
        if (this.f2012b == null) {
            ArrayList<String> stringArrayList = this.f2011a.getStringArrayList("controlCategories");
            this.f2012b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f2012b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f2012b);
    }

    public final boolean d() {
        a();
        return this.f2012b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            a();
            vVar.a();
            return this.f2012b.equals(vVar.f2012b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f2012b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
