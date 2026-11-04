package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 extends q6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(24);
    public final int f158a;
    public final l0 f159b;

    public a0(int i3, l0 l0Var) {
        this.f158a = i3;
        this.f159b = l0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f158a);
        j8.a.l(parcel, 3, this.f159b, i3);
        j8.a.t(parcel, s6);
    }
}
