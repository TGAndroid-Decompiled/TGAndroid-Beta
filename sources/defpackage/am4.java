package defpackage;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class am4 {
    public final byte a;
    public final List b;
    public final boolean c;

    public am4(ArrayList arrayList, boolean z) {
        this.a = (byte) 1;
        if (arrayList.isEmpty()) {
            this.b = Collections.EMPTY_LIST;
        } else {
            this.b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.c = z;
    }

    public static am4 a(Bundle bundle) {
        zs6 zs6Var;
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                if (bundle2 != null) {
                    zs6Var = new zs6(bundle2);
                } else {
                    zs6Var = null;
                }
                arrayList.add(zs6Var);
            }
        }
        return new am4(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.b;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i < size) {
                        zs6 zs6Var = (zs6) list.get(i);
                        if (zs6Var != null && zs6Var.e()) {
                            i++;
                        }
                    } else {
                        z = true;
                    }
                }
                sb.append(z);
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public am4() {
        this.a = (byte) 0;
        this.c = true;
        this.b = Collections.singletonList(null);
    }

    public am4(ArrayList arrayList) {
        this.a = (byte) 0;
        this.c = false;
        this.b = arrayList;
    }
}
