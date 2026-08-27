package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class f1 extends z5.a {
    public static final Parcelable.Creator<f1> CREATOR = new o0(12);

    public final boolean f12783a;

    public final List f12784b;

    public f1(ArrayList arrayList, boolean z10) {
        this.f12783a = z10;
        this.f12784b = arrayList;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        List list;
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (this.f12783a == f1Var.f12783a && ((list = this.f12784b) == (obj2 = f1Var.f12784b) || (list != null && list.equals(obj2)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f12783a), this.f12784b});
    }

    public final String toString() {
        return "AppWearDetailsParcelable{isWatchface=" + this.f12783a + ", watchfaceCategories=" + String.valueOf(this.f12784b) + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f12783a ? 1 : 0);
        r8.n(parcel, 2, this.f12784b);
        r8.r(parcel, iQ);
    }
}
