package l7;

import android.os.Parcel;
import android.os.Parcelable;
public final class t6 extends c6.a {
    public static final Parcelable.Creator<t6> CREATOR = new t5(1);
    public final int f11749a;
    public final float f11750b;
    public final int f11751c;

    public t6(int i10, int i11, float f10, int i12) {
        if (i10 == 1) {
            this.f11749a = i11;
            this.f11750b = f10;
            this.f11751c = i12;
            return;
        }
        throw new IllegalArgumentException("Unknown language.");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.f5.q(parcel, 20293);
        j7.f5.s(parcel, 2, 4);
        parcel.writeInt(1);
        j7.f5.s(parcel, 3, 4);
        parcel.writeInt(this.f11749a);
        j7.f5.s(parcel, 4, 4);
        parcel.writeFloat(this.f11750b);
        j7.f5.s(parcel, 5, 4);
        parcel.writeInt(this.f11751c);
        j7.f5.r(parcel, q10);
    }
}
