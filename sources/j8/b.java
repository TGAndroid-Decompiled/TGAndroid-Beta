package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.pa;

public final class b extends z5.a implements i8.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);

    public final String f12747a;

    public final List f12748b;

    public b(String str, ArrayList arrayList) {
        this.f12747a = str;
        this.f12748b = arrayList;
        y5.l.h(str);
        y5.l.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        List list = bVar.f12748b;
        String str = bVar.f12747a;
        String str2 = this.f12747a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.f12748b;
        return list2 == null ? list == null : list2.equals(list);
    }

    public final int hashCode() {
        String str = this.f12747a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List list = this.f12748b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return pa.j("CapabilityInfo{", this.f12747a, ", ", String.valueOf(this.f12748b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f12747a);
        r8.p(parcel, 3, this.f12748b);
        r8.r(parcel, iQ);
    }
}
