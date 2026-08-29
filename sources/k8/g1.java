package k8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class g1 extends a6.a {
    public static final Parcelable.Creator<g1> CREATOR = new p0(12);
    public final boolean f13510a;
    public final List f13511b;

    public g1(ArrayList arrayList, boolean z10) {
        this.f13510a = z10;
        this.f13511b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && g1.class == obj.getClass()) {
            g1 g1Var = (g1) obj;
            if (this.f13510a == g1Var.f13510a && ((list2 = this.f13511b) == (list = g1Var.f13511b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f13510a), this.f13511b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13511b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f13510a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f13510a ? 1 : 0);
        com.google.android.gms.internal.cast.o.n(parcel, 2, this.f13511b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
