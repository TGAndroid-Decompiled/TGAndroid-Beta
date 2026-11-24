package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public final class ycf extends b4 {
    public static final Parcelable.Creator<ycf> CREATOR = new c0f((byte) 25);
    public final ArrayList a;

    public ycf(ArrayList arrayList) {
        fre.h(arrayList);
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ycf) {
            ArrayList arrayList = ((ycf) obj).a;
            ArrayList arrayList2 = this.a;
            if (arrayList2.containsAll(arrayList) && arrayList.containsAll(arrayList2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.p(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
