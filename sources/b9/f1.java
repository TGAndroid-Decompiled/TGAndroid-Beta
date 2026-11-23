package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class f1 extends r6.a {
    public static final Parcelable.Creator<f1> CREATOR = new o0(12);
    public final boolean f2972a;
    public final List f2973b;

    public f1(ArrayList arrayList, boolean z10) {
        this.f2972a = z10;
        this.f2973b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (this.f2972a == f1Var.f2972a && ((list2 = this.f2973b) == (list = f1Var.f2973b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f2972a), this.f2973b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2973b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f2972a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f2972a ? 1 : 0);
        cc.n(parcel, 2, this.f2973b);
        cc.s(parcel, r10);
    }
}
