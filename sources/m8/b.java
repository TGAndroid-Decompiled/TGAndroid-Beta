package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.yh;
public final class b extends c6.a implements l8.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);
    public final String f13774a;
    public final List f13775b;

    public b(String str, ArrayList arrayList) {
        this.f13774a = str;
        this.f13775b = arrayList;
        b6.m.h(str);
        b6.m.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        List list = bVar.f13775b;
        String str = bVar.f13774a;
        String str2 = this.f13774a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.f13775b;
        if (list2 == null ? list == null : list2.equals(list)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f13774a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (i10 + 31) * 31;
        List list = this.f13775b;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return yh.l("CapabilityInfo{", this.f13774a, ", ", String.valueOf(this.f13775b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f13774a);
        f5.p(parcel, 3, this.f13775b);
        f5.r(parcel, q10);
    }
}
