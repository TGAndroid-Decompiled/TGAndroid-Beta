package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public final class x0 extends r6.a {
    public static final Parcelable.Creator<x0> CREATOR = new t0(10);
    public final List f11586a;

    public x0(ArrayList arrayList) {
        q6.m.h(arrayList);
        this.f11586a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        List list = ((x0) obj).f11586a;
        List list2 = this.f11586a;
        if (!list2.containsAll(list) || !list.containsAll(list2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f11586a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.p(parcel, 1, this.f11586a);
        cc.s(parcel, r10);
    }
}
