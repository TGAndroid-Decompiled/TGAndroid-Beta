package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public final class x0 extends q6.a {
    public static final Parcelable.Creator<x0> CREATOR = new r0(25);
    public final List f9904a;

    public x0(ArrayList arrayList) {
        p6.m.g(arrayList);
        this.f9904a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        List list = ((x0) obj).f9904a;
        List list2 = this.f9904a;
        if (!list2.containsAll(list) || !list.containsAll(list2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f9904a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.q(parcel, 1, this.f9904a);
        j8.a.t(parcel, s6);
    }
}
