package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
import java.util.List;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);
    public final String f2939a;
    public final List f2940b;

    public b(String str, ArrayList arrayList) {
        this.f2939a = str;
        this.f2940b = arrayList;
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
        List list = bVar.f2940b;
        String str = bVar.f2939a;
        String str2 = this.f2939a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.f2940b;
        if (list2 == null ? list == null : list2.equals(list)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = 0;
        String str = this.f2939a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (i7 + 31) * 31;
        List list = this.f2940b;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return p5.c.l("CapabilityInfo{", this.f2939a, ", ", String.valueOf(this.f2940b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f2939a);
        cc.p(parcel, 3, this.f2940b);
        cc.s(parcel, r10);
    }
}
