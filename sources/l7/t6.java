package l7;

import android.os.Parcel;
import android.os.Parcelable;
public final class t6 extends c6.a {
    public static final Parcelable.Creator<t6> CREATOR = new t5(1);
    public final int f12038a;
    public final float f12039b;
    public final int f12040c;

    public t6(int i10, int i11, float f10, int i12) {
        if (i10 == 1) {
            this.f12038a = i11;
            this.f12039b = f10;
            this.f12040c = i12;
            return;
        }
        throw new IllegalArgumentException("Unknown language.");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.g5.q(parcel, 20293);
        j7.g5.s(parcel, 2, 4);
        parcel.writeInt(1);
        j7.g5.s(parcel, 3, 4);
        parcel.writeInt(this.f12038a);
        j7.g5.s(parcel, 4, 4);
        parcel.writeFloat(this.f12039b);
        j7.g5.s(parcel, 5, 4);
        parcel.writeInt(this.f12040c);
        j7.g5.r(parcel, q10);
    }
}
