package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class y4 extends r6.a {
    public static final Parcelable.Creator<y4> CREATOR = new z5(0);
    public final String f718a;
    public final String f719b;
    public final float f720c;
    public final int d;

    public y4(float f10, int i7, String str, String str2) {
        this.f719b = str2;
        this.f720c = f10;
        this.f718a = str;
        this.d = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f719b);
        cc.q(parcel, 3, 4);
        parcel.writeFloat(this.f720c);
        cc.l(parcel, 4, this.f718a);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        cc.s(parcel, r10);
    }
}
