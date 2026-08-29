package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s extends a6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(14);
    public final int f13554a;
    public final boolean f13555b;

    public s(int i10, boolean z10) {
        this.f13554a = i10;
        this.f13555b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13554a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f13555b ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
