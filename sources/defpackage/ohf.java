package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public final class ohf extends c4 {
    public static final Parcelable.Creator<ohf> CREATOR = new t4f((byte) 25);
    public final ArrayList a;

    public ohf(ArrayList arrayList) {
        xve.h(arrayList);
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ohf) {
            ArrayList arrayList = ((ohf) obj).a;
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
        int r = bye.r(parcel, 20293);
        bye.p(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
