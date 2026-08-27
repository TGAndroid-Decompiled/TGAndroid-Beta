package c2;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;

public final class m {

    public final Bundle f2306a;

    public final ArrayList f2307b;

    public final ArrayList f2308c;
    public final HashSet d;

    public m(String str, String str2) {
        this.f2307b = new ArrayList();
        this.f2308c = new ArrayList();
        this.d = new HashSet();
        Bundle bundle = new Bundle();
        this.f2306a = bundle;
        if (str == null) {
            throw new NullPointerException("id must not be null");
        }
        bundle.putString("id", str);
        if (str2 == null) {
            throw new NullPointerException("name must not be null");
        }
        bundle.putString("name", str2);
    }

    public final void a(ArrayList arrayList) {
        if (arrayList == null) {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            IntentFilter intentFilter = (IntentFilter) obj;
            if (intentFilter != null) {
                ArrayList arrayList2 = this.f2308c;
                if (!arrayList2.contains(intentFilter)) {
                    arrayList2.add(intentFilter);
                }
            }
        }
    }

    public final n b() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f2308c);
        Bundle bundle = this.f2306a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.f2307b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new n(bundle);
    }

    public m(n nVar) {
        this.f2307b = new ArrayList();
        this.f2308c = new ArrayList();
        this.d = new HashSet();
        this.f2306a = new Bundle(nVar.f2312a);
        this.f2307b = nVar.c();
        this.f2308c = nVar.b();
        this.d = nVar.a();
    }
}
