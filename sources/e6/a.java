package e6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.n;
import com.google.android.gms.internal.cast.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import z5.l;
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new Object();
    public final List f5829a;
    public final boolean f5830b;
    public final String f5831c;
    public final String d;

    public a(ArrayList arrayList, boolean z10, String str, String str2) {
        l.h(arrayList);
        this.f5829a = arrayList;
        this.f5830b = z10;
        this.f5831c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(b.f5832a);
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
        if (this.f5830b != aVar.f5830b || !l.l(this.f5829a, aVar.f5829a) || !l.l(this.f5831c, aVar.f5831c) || !l.l(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5830b), this.f5829a, this.f5831c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.p(parcel, 1, this.f5829a);
        o.s(parcel, 2, 4);
        parcel.writeInt(this.f5830b ? 1 : 0);
        o.l(parcel, 3, this.f5831c);
        o.l(parcel, 4, this.d);
        o.r(parcel, q6);
    }
}
