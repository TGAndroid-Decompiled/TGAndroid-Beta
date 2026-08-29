package k8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.th;
public final class b extends a6.a implements j8.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);
    public final String f13469a;
    public final List f13470b;

    public b(String str, ArrayList arrayList) {
        this.f13469a = str;
        this.f13470b = arrayList;
        z5.l.h(str);
        z5.l.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        List list = bVar.f13470b;
        String str = bVar.f13469a;
        String str2 = this.f13469a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.f13470b;
        if (list2 == null ? list == null : list2.equals(list)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f13469a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (i10 + 31) * 31;
        List list = this.f13470b;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return th.j("CapabilityInfo{", this.f13469a, ", ", String.valueOf(this.f13470b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f13469a);
        com.google.android.gms.internal.cast.o.p(parcel, 3, this.f13470b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
