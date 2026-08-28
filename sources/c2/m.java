package c2;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
public final class m {
    public final Bundle f2192a;
    public final ArrayList f2193b;
    public final ArrayList f2194c;
    public final HashSet d;

    public m(String str, String str2) {
        this.f2193b = new ArrayList();
        this.f2194c = new ArrayList();
        this.d = new HashSet();
        Bundle bundle = new Bundle();
        this.f2192a = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            }
            throw new NullPointerException("name must not be null");
        }
        throw new NullPointerException("id must not be null");
    }

    public final void a(ArrayList arrayList) {
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        ArrayList arrayList2 = this.f2194c;
                        if (!arrayList2.contains(intentFilter)) {
                            arrayList2.add(intentFilter);
                        }
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("filters must not be null");
    }

    public final n b() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f2194c);
        Bundle bundle = this.f2192a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.f2193b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new n(bundle);
    }

    public m(n nVar) {
        this.f2193b = new ArrayList();
        this.f2194c = new ArrayList();
        this.d = new HashSet();
        this.f2192a = new Bundle(nVar.f2196a);
        this.f2193b = nVar.c();
        this.f2194c = nVar.b();
        this.d = nVar.a();
    }
}
