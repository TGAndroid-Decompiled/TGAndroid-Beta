package i7;

import android.os.Parcel;
import android.os.Parcelable;

public final class s6 extends z5.a {
    public static final Parcelable.Creator<s6> CREATOR = new s5(1);

    public final int f10818a;

    public final float f10819b;

    public final int f10820c;

    public s6(int i10, int i11, float f10, int i12) {
        if (i10 != 1) {
            throw new IllegalArgumentException("Unknown language.");
        }
        this.f10818a = i11;
        this.f10819b = f10;
        this.f10820c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = h7.r8.q(parcel, 20293);
        h7.r8.s(parcel, 2, 4);
        parcel.writeInt(1);
        h7.r8.s(parcel, 3, 4);
        parcel.writeInt(this.f10818a);
        h7.r8.s(parcel, 4, 4);
        parcel.writeFloat(this.f10819b);
        h7.r8.s(parcel, 5, 4);
        parcel.writeInt(this.f10820c);
        h7.r8.r(parcel, iQ);
    }
}
