package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class u {

    public static final u f2348c = new u(new Bundle(), null);

    public final Bundle f2349a;

    public List f2350b;

    public u(Bundle bundle, ArrayList arrayList) {
        this.f2349a = bundle;
        this.f2350b = arrayList;
    }

    public static u b(Bundle bundle) {
        if (bundle != null) {
            return new u(bundle, null);
        }
        return null;
    }

    public final void a() {
        if (this.f2350b == null) {
            ArrayList<String> stringArrayList = this.f2349a.getStringArrayList("controlCategories");
            this.f2350b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f2350b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f2350b);
    }

    public final boolean d() {
        a();
        return this.f2350b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        a();
        uVar.a();
        return this.f2350b.equals(uVar.f2350b);
    }

    public final int hashCode() {
        a();
        return this.f2350b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
