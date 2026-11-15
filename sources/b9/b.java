package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
import java.util.List;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);
    public final String f2973a;
    public final List f2974b;

    public b(String str, ArrayList arrayList) {
        this.f2973a = str;
        this.f2974b = arrayList;
        q6.m.g(str);
        q6.m.g(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        List list = bVar.f2974b;
        String str = bVar.f2973a;
        String str2 = this.f2973a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.f2974b;
        if (list2 == null ? list == null : list2.equals(list)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = 0;
        String str = this.f2973a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (i7 + 31) * 31;
        List list = this.f2974b;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return r.b.l("CapabilityInfo{", this.f2973a, ", ", String.valueOf(this.f2974b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f2973a);
        yb.p(parcel, 3, this.f2974b);
        yb.s(parcel, r10);
    }
}
