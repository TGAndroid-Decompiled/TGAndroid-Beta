package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class l0 extends y5.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(9);
    public final int f17542a;
    public final short f17543b;
    public final short f17544c;

    public l0(int i9, short s10, short s11) {
        this.f17542a = i9;
        this.f17543b = s10;
        this.f17544c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f17542a != l0Var.f17542a || this.f17543b != l0Var.f17543b || this.f17544c != l0Var.f17544c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17542a), Short.valueOf(this.f17543b), Short.valueOf(this.f17544c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f17542a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f17543b);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f17544c);
        p8.r(parcel, q10);
    }
}
