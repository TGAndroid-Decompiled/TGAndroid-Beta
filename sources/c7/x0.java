package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public final class x0 extends o6.a {
    public static final Parcelable.Creator<x0> CREATOR = new r0(21);
    public final List f4699a;

    public x0(ArrayList arrayList) {
        n6.l.h(arrayList);
        this.f4699a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        List list = ((x0) obj).f4699a;
        List list2 = this.f4699a;
        if (!list2.containsAll(list) || !list.containsAll(list2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f4699a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.p(parcel, 1, this.f4699a);
        w7.e0.r(parcel, q6);
    }
}
