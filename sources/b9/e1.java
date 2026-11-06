package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class e1 extends r6.a {
    public static final Parcelable.Creator<e1> CREATOR = new n0(12);
    public final boolean f3044a;
    public final List f3045b;

    public e1(ArrayList arrayList, boolean z9) {
        this.f3044a = z9;
        this.f3045b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (this.f3044a == e1Var.f3044a && ((list2 = this.f3045b) == (list = e1Var.f3045b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3044a), this.f3045b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3045b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f3044a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f3044a ? 1 : 0);
        wb.n(parcel, 2, this.f3045b);
        wb.s(parcel, r10);
    }
}
