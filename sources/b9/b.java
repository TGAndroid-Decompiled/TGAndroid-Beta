package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.f1;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);
    public final String f3016a;
    public final List f3017b;

    public b(String str, ArrayList arrayList) {
        this.f3016a = str;
        this.f3017b = arrayList;
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
        List list = bVar.f3017b;
        String str = bVar.f3016a;
        String str2 = this.f3016a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.f3017b;
        if (list2 == null ? list == null : list2.equals(list)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = 0;
        String str = this.f3016a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (i7 + 31) * 31;
        List list = this.f3017b;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return f1.m("CapabilityInfo{", this.f3016a, ", ", String.valueOf(this.f3017b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f3016a);
        wb.p(parcel, 3, this.f3017b);
        wb.s(parcel, r10);
    }
}
