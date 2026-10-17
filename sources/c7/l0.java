package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l0 extends o6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(9);
    public final int f4975a;
    public final short f4976b;
    public final short f4977c;

    public l0(int i10, short s10, short s11) {
        this.f4975a = i10;
        this.f4976b = s10;
        this.f4977c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f4975a != l0Var.f4975a || this.f4976b != l0Var.f4976b || this.f4977c != l0Var.f4977c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4975a), Short.valueOf(this.f4976b), Short.valueOf(this.f4977c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f4975a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f4976b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f4977c);
        w7.f0.r(parcel, q6);
    }
}
