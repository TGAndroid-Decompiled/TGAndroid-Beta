package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class f1 extends c6.a {
    public static final Parcelable.Creator<f1> CREATOR = new o0(12);
    public final boolean f13808a;
    public final List f13809b;

    public f1(ArrayList arrayList, boolean z4) {
        this.f13808a = z4;
        this.f13809b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (this.f13808a == f1Var.f13808a && ((list2 = this.f13809b) == (list = f1Var.f13809b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f13808a), this.f13809b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13809b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f13808a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f13808a ? 1 : 0);
        f5.n(parcel, 2, this.f13809b);
        f5.r(parcel, q10);
    }
}
