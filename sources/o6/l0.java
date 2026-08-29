package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l0 extends a6.a {
    public static final Parcelable.Creator<l0> CREATOR = new n0(21);
    public final int f19402a;
    public final short f19403b;
    public final short f19404c;

    public l0(int i10, short s10, short s11) {
        this.f19402a = i10;
        this.f19403b = s10;
        this.f19404c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f19402a != l0Var.f19402a || this.f19403b != l0Var.f19403b || this.f19404c != l0Var.f19404c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19402a), Short.valueOf(this.f19403b), Short.valueOf(this.f19404c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f19402a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f19403b);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f19404c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
