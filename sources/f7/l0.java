package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class l0 extends r6.a {
    public static final Parcelable.Creator<l0> CREATOR = new db.k(28);
    public final int f11214a;
    public final short f11215b;
    public final short f11216c;

    public l0(int i7, short s5, short s9) {
        this.f11214a = i7;
        this.f11215b = s5;
        this.f11216c = s9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f11214a != l0Var.f11214a || this.f11215b != l0Var.f11215b || this.f11216c != l0Var.f11216c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11214a), Short.valueOf(this.f11215b), Short.valueOf(this.f11216c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f11214a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f11215b);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f11216c);
        yb.s(parcel, r10);
    }
}
