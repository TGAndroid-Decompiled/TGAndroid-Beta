package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class hb extends r6.a {
    public static final Parcelable.Creator<hb> CREATOR = new z5(2);
    public final String f483a;
    public final float f484b;
    public final String f485c;
    public final int d;

    public hb(float f10, int i7, String str, String str2) {
        this.f483a = str;
        this.f484b = f10;
        this.f485c = str2;
        this.d = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.f483a);
        yb.q(parcel, 2, 4);
        parcel.writeFloat(this.f484b);
        yb.l(parcel, 3, this.f485c);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        yb.s(parcel, r10);
    }
}
