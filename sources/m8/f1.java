package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class f1 extends c6.a {
    public static final Parcelable.Creator<f1> CREATOR = new o0(12);
    public final boolean f13792a;
    public final List f13793b;

    public f1(ArrayList arrayList, boolean z4) {
        this.f13792a = z4;
        this.f13793b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (this.f13792a == f1Var.f13792a && ((list2 = this.f13793b) == (list = f1Var.f13793b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f13792a), this.f13793b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13793b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f13792a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f13792a ? 1 : 0);
        f5.n(parcel, 2, this.f13793b);
        f5.r(parcel, q10);
    }
}
