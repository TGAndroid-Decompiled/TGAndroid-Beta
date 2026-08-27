package d6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.n;
import h7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import y5.l;

public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new c();

    public final List f4861a;

    public final boolean f4862b;

    public final String f4863c;
    public final String d;

    public a(ArrayList arrayList, boolean z10, String str, String str2) {
        l.h(arrayList);
        this.f4861a = arrayList;
        this.f4862b = z10;
        this.f4863c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(b.f4864a);
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
        return this.f4862b == aVar.f4862b && l.l(this.f4861a, aVar.f4861a) && l.l(this.f4863c, aVar.f4863c) && l.l(this.d, aVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4862b), this.f4861a, this.f4863c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.p(parcel, 1, this.f4861a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f4862b ? 1 : 0);
        r8.l(parcel, 3, this.f4863c);
        r8.l(parcel, 4, this.d);
        r8.r(parcel, iQ);
    }
}
