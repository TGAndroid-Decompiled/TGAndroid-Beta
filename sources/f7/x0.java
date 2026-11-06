package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public final class x0 extends r6.a {
    public static final Parcelable.Creator<x0> CREATOR = new t0(10);
    public final List f11461a;

    public x0(ArrayList arrayList) {
        q6.m.g(arrayList);
        this.f11461a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        List list = ((x0) obj).f11461a;
        List list2 = this.f11461a;
        if (!list2.containsAll(list) || !list.containsAll(list2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f11461a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.p(parcel, 1, this.f11461a);
        wb.s(parcel, r10);
    }
}
