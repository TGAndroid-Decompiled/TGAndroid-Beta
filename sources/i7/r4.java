package i7;

import android.os.Parcel;
import android.os.Parcelable;

public final class r4 extends z5.a {
    public static final Parcelable.Creator<r4> CREATOR = new s5(0);

    public final String f10793a;

    public final String f10794b;

    public final float f10795c;
    public final int d;

    public r4(float f10, int i10, String str, String str2) {
        this.f10794b = str2;
        this.f10795c = f10;
        this.f10793a = str;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = h7.r8.q(parcel, 20293);
        h7.r8.l(parcel, 2, this.f10794b);
        h7.r8.s(parcel, 3, 4);
        parcel.writeFloat(this.f10795c);
        h7.r8.l(parcel, 4, this.f10793a);
        h7.r8.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        h7.r8.r(parcel, iQ);
    }
}
