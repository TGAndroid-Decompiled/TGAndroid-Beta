package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
public final class ys6 {
    public final Bundle a;
    public final ArrayList b;
    public final ArrayList c;
    public final HashSet d;

    public ys6(String str, String str2) {
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
                fvc.f("name must not be null");
                throw null;
            }
        }
        fvc.f("id must not be null");
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
        w26.j("filters must not be null");
    }

    public final zs6 b() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.c);
        Bundle bundle = this.a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new zs6(bundle);
    }

    public ys6(zs6 zs6Var) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        this.a = new Bundle(zs6Var.a);
        this.b = zs6Var.c();
        this.c = zs6Var.b();
        this.d = zs6Var.a();
    }
}
