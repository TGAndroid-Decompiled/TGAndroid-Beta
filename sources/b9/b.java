package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
import java.util.List;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);
    public final String f2987a;
    public final List f2988b;

    public b(String str, ArrayList arrayList) {
        this.f2987a = str;
        this.f2988b = arrayList;
        q6.m.h(str);
        q6.m.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        List list = bVar.f2988b;
        String str = bVar.f2987a;
        String str2 = this.f2987a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.f2988b;
        if (list2 == null ? list == null : list2.equals(list)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = 0;
        String str = this.f2987a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (i7 + 31) * 31;
        List list = this.f2988b;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return p5.c.l("CapabilityInfo{", this.f2987a, ", ", String.valueOf(this.f2988b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f2987a);
        bc.p(parcel, 3, this.f2988b);
        bc.s(parcel, r10);
    }
}
