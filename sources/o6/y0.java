package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public final class y0 extends a6.a {
    public static final Parcelable.Creator<y0> CREATOR = new w0(3);
    public final List f19466a;

    public y0(ArrayList arrayList) {
        z5.l.h(arrayList);
        this.f19466a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        List list = ((y0) obj).f19466a;
        List list2 = this.f19466a;
        if (!list2.containsAll(list) || !list.containsAll(list2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f19466a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.p(parcel, 1, this.f19466a);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
