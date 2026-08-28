package h7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ta extends y5.a {
    public static final Parcelable.Creator<ta> CREATOR = new s5(3);
    public final float f10134a;
    public final int f10135b;

    public ta(float f10, int i9) {
        this.f10134a = f10;
        this.f10135b = i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = g7.p8.q(parcel, 20293);
        g7.p8.s(parcel, 1, 4);
        parcel.writeFloat(this.f10134a);
        g7.p8.s(parcel, 2, 4);
        parcel.writeInt(this.f10135b);
        g7.p8.r(parcel, q10);
    }
}
