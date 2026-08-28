package h7;

import android.os.Parcel;
import android.os.Parcelable;
public final class sa extends y5.a {
    public static final Parcelable.Creator<sa> CREATOR = new s5(2);
    public final String f10116a;
    public final float f10117b;
    public final String f10118c;
    public final int d;

    public sa(float f10, int i9, String str, String str2) {
        this.f10116a = str;
        this.f10117b = f10;
        this.f10118c = str2;
        this.d = i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = g7.p8.q(parcel, 20293);
        g7.p8.l(parcel, 1, this.f10116a);
        g7.p8.s(parcel, 2, 4);
        parcel.writeFloat(this.f10117b);
        g7.p8.l(parcel, 3, this.f10118c);
        g7.p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g7.p8.r(parcel, q10);
    }
}
