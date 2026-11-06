package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
public final class l0 extends r6.a {
    public static final Parcelable.Creator<l0> CREATOR = new db.k(28);
    public final int f11400a;
    public final short f11401b;
    public final short f11402c;

    public l0(int i7, short s5, short s9) {
        this.f11400a = i7;
        this.f11401b = s5;
        this.f11402c = s9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f11400a != l0Var.f11400a || this.f11401b != l0Var.f11401b || this.f11402c != l0Var.f11402c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11400a), Short.valueOf(this.f11401b), Short.valueOf(this.f11402c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f11400a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f11401b);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f11402c);
        wb.s(parcel, r10);
    }
}
