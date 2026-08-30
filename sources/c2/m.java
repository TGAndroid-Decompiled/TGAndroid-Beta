package c2;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
public final class m {
    public final Bundle f1966a;
    public final ArrayList f1967b;
    public final ArrayList f1968c;
    public final HashSet d;

    public m(String str, String str2) {
        this.f1967b = new ArrayList();
        this.f1968c = new ArrayList();
        this.d = new HashSet();
        Bundle bundle = new Bundle();
        this.f1966a = bundle;
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
                        ArrayList arrayList2 = this.f1968c;
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
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f1968c);
        Bundle bundle = this.f1966a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.f1967b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new n(bundle);
    }

    public m(n nVar) {
        this.f1967b = new ArrayList();
        this.f1968c = new ArrayList();
        this.d = new HashSet();
        this.f1966a = new Bundle(nVar.f1970a);
        this.f1967b = nVar.c();
        this.f1968c = nVar.b();
        this.d = nVar.a();
    }
}
