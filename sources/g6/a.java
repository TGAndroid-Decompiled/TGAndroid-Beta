package g6;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import com.google.android.gms.common.api.n;
import j7.g5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new Object();
    public final List f6969a;
    public final boolean f6970b;
    public final String f6971c;
    public final String d;

    public a(ArrayList arrayList, boolean z4, String str, String str2) {
        m.h(arrayList);
        this.f6969a = arrayList;
        this.f6970b = z4;
        this.f6971c = str;
        this.d = str2;
    }

    public static a e(List list, boolean z4) {
        TreeSet treeSet = new TreeSet(b.f6972a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((n) it.next()).c());
        }
        return new a(new ArrayList(treeSet), z4, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f6970b != aVar.f6970b || !m.l(this.f6969a, aVar.f6969a) || !m.l(this.f6971c, aVar.f6971c) || !m.l(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f6970b), this.f6969a, this.f6971c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.p(parcel, 1, this.f6969a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f6970b ? 1 : 0);
        g5.l(parcel, 3, this.f6971c);
        g5.l(parcel, 4, this.d);
        g5.r(parcel, q10);
    }
}
