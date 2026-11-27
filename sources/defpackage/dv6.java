package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
public final class dv6 {
    public final Bundle a;
    public final ArrayList b;
    public final ArrayList c;
    public final HashSet d;

    public dv6(String str, String str2) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        Bundle bundle = new Bundle();
        this.a = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            } else {
                p3d.h("name must not be null");
                throw null;
            }
        }
        p3d.h("id must not be null");
        throw null;
    }

    public final void a(ArrayList arrayList) {
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        ArrayList arrayList2 = this.c;
                        if (!arrayList2.contains(intentFilter)) {
                            arrayList2.add(intentFilter);
                        }
                    }
                }
                return;
            }
            return;
        }
        lq5.j("filters must not be null");
    }

    public final ev6 b() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.c);
        Bundle bundle = this.a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new ev6(bundle);
    }

    public dv6(ev6 ev6Var) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        this.a = new Bundle(ev6Var.a);
        this.b = ev6Var.c();
        this.c = ev6Var.b();
        this.d = ev6Var.a();
    }
}
