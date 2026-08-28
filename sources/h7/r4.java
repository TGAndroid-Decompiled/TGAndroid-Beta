package h7;

import android.os.Parcel;
import android.os.Parcelable;
public final class r4 extends y5.a {
    public static final Parcelable.Creator<r4> CREATOR = new s5(0);
    public final String f10084a;
    public final String f10085b;
    public final float f10086c;
    public final int d;

    public r4(float f10, int i9, String str, String str2) {
        this.f10085b = str2;
        this.f10086c = f10;
        this.f10084a = str;
        this.d = i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = g7.p8.q(parcel, 20293);
        g7.p8.l(parcel, 2, this.f10085b);
        g7.p8.s(parcel, 3, 4);
        parcel.writeFloat(this.f10086c);
        g7.p8.l(parcel, 4, this.f10084a);
        g7.p8.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        g7.p8.r(parcel, q10);
    }
}
