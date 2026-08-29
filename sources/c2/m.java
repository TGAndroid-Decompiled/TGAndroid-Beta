package c2;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
public final class m {
    public final Bundle f2866a;
    public final ArrayList f2867b;
    public final ArrayList f2868c;
    public final HashSet d;

    public m(String str, String str2) {
        this.f2867b = new ArrayList();
        this.f2868c = new ArrayList();
        this.d = new HashSet();
        Bundle bundle = new Bundle();
        this.f2866a = bundle;
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
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        ArrayList arrayList2 = this.f2868c;
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
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f2868c);
        Bundle bundle = this.f2866a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.f2867b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new n(bundle);
    }

    public m(n nVar) {
        this.f2867b = new ArrayList();
        this.f2868c = new ArrayList();
        this.d = new HashSet();
        this.f2866a = new Bundle(nVar.f2869a);
        this.f2867b = nVar.c();
        this.f2868c = nVar.b();
        this.d = nVar.a();
    }
}
