package h7;

import android.os.Parcel;
import android.os.Parcelable;
public final class s6 extends y5.a {
    public static final Parcelable.Creator<s6> CREATOR = new s5(1);
    public final int f10109a;
    public final float f10110b;
    public final int f10111c;

    public s6(int i9, int i10, float f10, int i11) {
        if (i9 == 1) {
            this.f10109a = i10;
            this.f10110b = f10;
            this.f10111c = i11;
            return;
        }
        throw new IllegalArgumentException("Unknown language.");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = g7.p8.q(parcel, 20293);
        g7.p8.s(parcel, 2, 4);
        parcel.writeInt(1);
        g7.p8.s(parcel, 3, 4);
        parcel.writeInt(this.f10109a);
        g7.p8.s(parcel, 4, 4);
        parcel.writeFloat(this.f10110b);
        g7.p8.s(parcel, 5, 4);
        parcel.writeInt(this.f10111c);
        g7.p8.r(parcel, q10);
    }
}
