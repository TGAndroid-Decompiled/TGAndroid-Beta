package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public final class y0 extends z5.a {
    public static final Parcelable.Creator<y0> CREATOR = new w0(2);

    public final List f18442a;

    public y0(ArrayList arrayList) {
        y5.l.h(arrayList);
        this.f18442a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        List list = ((y0) obj).f18442a;
        List list2 = this.f18442a;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f18442a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.p(parcel, 1, this.f18442a);
        r8.r(parcel, iQ);
    }
}
