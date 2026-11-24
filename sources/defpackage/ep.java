package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
public final class ep extends b4 {
    public static final Parcelable.Creator<ep> CREATOR = new d3d((byte) 6);
    public final ArrayList a;
    public final boolean b;
    public final String c;
    public final String d;

    public ep(ArrayList arrayList, boolean z, String str, String str2) {
        ite.h(arrayList);
        this.a = arrayList;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public static ep b(List list, boolean z) {
        TreeSet treeSet = new TreeSet(ju6.h);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((vs7) it.next()).a());
        }
        return new ep(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ep)) {
            ep epVar = (ep) obj;
            if (this.b == epVar.b && fse.a(this.a, epVar.a) && fse.a(this.c, epVar.c) && fse.a(this.d, epVar.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.p(parcel, 1, this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        mve.l(parcel, 3, this.c);
        mve.l(parcel, 4, this.d);
        mve.s(parcel, r);
    }
}
