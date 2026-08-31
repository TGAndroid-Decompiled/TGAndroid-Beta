package l7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ua extends c6.a {
    public static final Parcelable.Creator<ua> CREATOR = new t5(3);
    public final float f12062a;
    public final int f12063b;

    public ua(float f10, int i10) {
        this.f12062a = f10;
        this.f12063b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.g5.q(parcel, 20293);
        j7.g5.s(parcel, 1, 4);
        parcel.writeFloat(this.f12062a);
        j7.g5.s(parcel, 2, 4);
        parcel.writeInt(this.f12063b);
        j7.g5.r(parcel, q10);
    }
}
