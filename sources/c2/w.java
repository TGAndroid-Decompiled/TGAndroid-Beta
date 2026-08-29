package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class w {
    public static final w f2914c = new w(new Bundle(), null);
    public final Bundle f2915a;
    public List f2916b;

    public w(Bundle bundle, ArrayList arrayList) {
        this.f2915a = bundle;
        this.f2916b = arrayList;
    }

    public static w b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new w(bundle, null);
    }

    public final void a() {
        if (this.f2916b == null) {
            ArrayList<String> stringArrayList = this.f2915a.getStringArrayList("controlCategories");
            this.f2916b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f2916b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f2916b);
    }

    public final boolean d() {
        a();
        return this.f2916b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            a();
            wVar.a();
            return this.f2916b.equals(wVar.f2916b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f2916b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
