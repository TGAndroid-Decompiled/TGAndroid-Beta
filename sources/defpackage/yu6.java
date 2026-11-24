package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
public final class yu6 {
    public final Bundle a;
    public final ArrayList b;
    public final ArrayList c;
    public final HashSet d;

    public yu6(String str, String str2) {
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
                gxc.d("name must not be null");
                throw null;
            }
        }
        gxc.d("id must not be null");
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
        u36.j("filters must not be null");
    }

    public final zu6 b() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.c);
        Bundle bundle = this.a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new zu6(bundle);
    }

    public yu6(zu6 zu6Var) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        this.a = new Bundle(zu6Var.a);
        this.b = zu6Var.c();
        this.c = zu6Var.b();
        this.d = zu6Var.a();
    }
}
