package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class e1 extends r6.a {
    public static final Parcelable.Creator<e1> CREATOR = new n0(12);
    public final boolean f2967a;
    public final List f2968b;

    public e1(ArrayList arrayList, boolean z10) {
        this.f2967a = z10;
        this.f2968b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (this.f2967a == e1Var.f2967a && ((list2 = this.f2968b) == (list = e1Var.f2968b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f2967a), this.f2968b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2968b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f2967a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f2967a ? 1 : 0);
        cc.n(parcel, 2, this.f2968b);
        cc.s(parcel, r10);
    }
}
