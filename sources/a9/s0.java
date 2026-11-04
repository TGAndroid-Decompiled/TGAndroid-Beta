package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends q6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f248a;
    public final int f249b;
    public final byte[] f250c;

    public s0(int i3, int i10, byte[] bArr) {
        this.f248a = i3;
        this.f249b = i10;
        this.f250c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f248a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f249b);
        j8.a.d(parcel, 3, this.f250c);
        j8.a.t(parcel, s6);
    }
}
