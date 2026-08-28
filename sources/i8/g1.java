package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class g1 extends y5.a {
    public static final Parcelable.Creator<g1> CREATOR = new p0(12);
    public final boolean f10987a;
    public final List f10988b;

    public g1(ArrayList arrayList, boolean z10) {
        this.f10987a = z10;
        this.f10988b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && g1.class == obj.getClass()) {
            g1 g1Var = (g1) obj;
            if (this.f10987a == g1Var.f10987a && ((list2 = this.f10988b) == (list = g1Var.f10988b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10987a), this.f10988b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10988b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f10987a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f10987a ? 1 : 0);
        p8.n(parcel, 2, this.f10988b);
        p8.r(parcel, q10);
    }
}
