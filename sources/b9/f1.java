package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class f1 extends r6.a {
    public static final Parcelable.Creator<f1> CREATOR = new o0(12);
    public final boolean f3007a;
    public final List f3008b;

    public f1(ArrayList arrayList, boolean z10) {
        this.f3007a = z10;
        this.f3008b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (this.f3007a == f1Var.f3007a && ((list2 = this.f3008b) == (list = f1Var.f3008b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3007a), this.f3008b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3008b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f3007a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f3007a ? 1 : 0);
        yb.n(parcel, 2, this.f3008b);
        yb.s(parcel, r10);
    }
}
