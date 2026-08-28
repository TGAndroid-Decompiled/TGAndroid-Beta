package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.j2;
public final class b extends y5.a implements h8.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);
    public final String f10946a;
    public final List f10947b;

    public b(String str, ArrayList arrayList) {
        this.f10946a = str;
        this.f10947b = arrayList;
        x5.l.h(str);
        x5.l.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        List list = bVar.f10947b;
        String str = bVar.f10946a;
        String str2 = this.f10946a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.f10947b;
        if (list2 == null ? list == null : list2.equals(list)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10 = 0;
        String str = this.f10946a;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = (i9 + 31) * 31;
        List list = this.f10947b;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return j2.h("CapabilityInfo{", this.f10946a, ", ", String.valueOf(this.f10947b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f10946a);
        p8.p(parcel, 3, this.f10947b);
        p8.r(parcel, q10);
    }
}
