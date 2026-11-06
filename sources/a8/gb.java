package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class gb extends r6.a {
    public static final Parcelable.Creator<gb> CREATOR = new z5(2);
    public final String f456a;
    public final float f457b;
    public final String f458c;
    public final int d;

    public gb(float f10, int i7, String str, String str2) {
        this.f456a = str;
        this.f457b = f10;
        this.f458c = str2;
        this.d = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f456a);
        xb.q(parcel, 2, 4);
        parcel.writeFloat(this.f457b);
        xb.l(parcel, 3, this.f458c);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.s(parcel, r10);
    }
}
