package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public final class x0 extends y5.a {
    public static final Parcelable.Creator<x0> CREATOR = new r0(21);
    public final List f17602a;

    public x0(ArrayList arrayList) {
        x5.l.h(arrayList);
        this.f17602a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        List list = ((x0) obj).f17602a;
        List list2 = this.f17602a;
        if (!list2.containsAll(list) || !list.containsAll(list2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f17602a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.p(parcel, 1, this.f17602a);
        p8.r(parcel, q10);
    }
}
