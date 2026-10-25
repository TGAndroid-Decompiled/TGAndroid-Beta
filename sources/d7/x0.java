package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public final class x0 extends p6.a {
    public static final Parcelable.Creator<x0> CREATOR = new r0(22);
    public final List f8258a;

    public x0(ArrayList arrayList) {
        o6.l.h(arrayList);
        this.f8258a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        List list = ((x0) obj).f8258a;
        List list2 = this.f8258a;
        if (!list2.containsAll(list) || !list.containsAll(list2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f8258a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.p(parcel, 1, this.f8258a);
        df.r(parcel, q5);
    }
}
