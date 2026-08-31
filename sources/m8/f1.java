package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class f1 extends c6.a {
    public static final Parcelable.Creator<f1> CREATOR = new o0(12);
    public final boolean f13522a;
    public final List f13523b;

    public f1(ArrayList arrayList, boolean z4) {
        this.f13522a = z4;
        this.f13523b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (this.f13522a == f1Var.f13522a && ((list2 = this.f13523b) == (list = f1Var.f13523b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f13522a), this.f13523b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13523b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f13522a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f13522a ? 1 : 0);
        g5.n(parcel, 2, this.f13523b);
        g5.r(parcel, q10);
    }
}
