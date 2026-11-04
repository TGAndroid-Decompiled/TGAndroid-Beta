package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class e1 extends q6.a {
    public static final Parcelable.Creator<e1> CREATOR = new n0(12);
    public final boolean f191a;
    public final List f192b;

    public e1(ArrayList arrayList, boolean z10) {
        this.f191a = z10;
        this.f192b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (this.f191a == e1Var.f191a && ((list2 = this.f192b) == (list = e1Var.f192b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f191a), this.f192b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f192b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f191a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f191a ? 1 : 0);
        j8.a.o(parcel, 2, this.f192b);
        j8.a.t(parcel, s6);
    }
}
