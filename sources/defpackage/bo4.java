package defpackage;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class bo4 {
    public final byte a;
    public final List b;
    public final boolean c;

    public bo4(ArrayList arrayList, boolean z) {
        this.a = (byte) 1;
        if (arrayList.isEmpty()) {
            this.b = Collections.EMPTY_LIST;
        } else {
            this.b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.c = z;
    }

    public static bo4 a(Bundle bundle) {
        zu6 zu6Var;
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                if (bundle2 != null) {
                    zu6Var = new zu6(bundle2);
                } else {
                    zu6Var = null;
                }
                arrayList.add(zu6Var);
            }
        }
        return new bo4(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
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
                        zu6 zu6Var = (zu6) list.get(i);
                        if (zu6Var != null && zu6Var.e()) {
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

    public bo4() {
        this.a = (byte) 0;
        this.c = true;
        this.b = Collections.singletonList(null);
    }

    public bo4(ArrayList arrayList) {
        this.a = (byte) 0;
        this.c = false;
        this.b = arrayList;
    }
}
