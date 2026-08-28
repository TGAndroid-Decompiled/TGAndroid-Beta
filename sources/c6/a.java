package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.n;
import g7.p8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import x5.l;
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new Object();
    public final List f2317a;
    public final boolean f2318b;
    public final String f2319c;
    public final String d;

    public a(ArrayList arrayList, boolean z10, String str, String str2) {
        l.h(arrayList);
        this.f2317a = arrayList;
        this.f2318b = z10;
        this.f2319c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(b.f2320a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((n) it.next()).c());
        }
        return new a(new ArrayList(treeSet), z10, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2318b != aVar.f2318b || !l.l(this.f2317a, aVar.f2317a) || !l.l(this.f2319c, aVar.f2319c) || !l.l(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f2318b), this.f2317a, this.f2319c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.p(parcel, 1, this.f2317a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f2318b ? 1 : 0);
        p8.l(parcel, 3, this.f2319c);
        p8.l(parcel, 4, this.d);
        p8.r(parcel, q10);
    }
}
