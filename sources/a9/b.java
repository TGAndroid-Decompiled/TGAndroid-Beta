package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.f1;
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);
    public final String f163a;
    public final List f164b;

    public b(String str, ArrayList arrayList) {
        this.f163a = str;
        this.f164b = arrayList;
        p6.m.g(str);
        p6.m.g(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        List list = bVar.f164b;
        String str = bVar.f163a;
        String str2 = this.f163a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.f164b;
        if (list2 == null ? list == null : list2.equals(list)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i10 = 0;
        String str = this.f163a;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i3 + 31) * 31;
        List list = this.f164b;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return f1.q("CapabilityInfo{", this.f163a, ", ", String.valueOf(this.f164b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f163a);
        j8.a.q(parcel, 3, this.f164b);
        j8.a.t(parcel, s6);
    }
}
