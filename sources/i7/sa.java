package i7;

import android.os.Parcel;
import android.os.Parcelable;

public final class sa extends z5.a {
    public static final Parcelable.Creator<sa> CREATOR = new s5(2);

    public final String f10825a;

    public final float f10826b;

    public final String f10827c;
    public final int d;

    public sa(float f10, int i10, String str, String str2) {
        this.f10825a = str;
        this.f10826b = f10;
        this.f10827c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = h7.r8.q(parcel, 20293);
        h7.r8.l(parcel, 1, this.f10825a);
        h7.r8.s(parcel, 2, 4);
        parcel.writeFloat(this.f10826b);
        h7.r8.l(parcel, 3, this.f10827c);
        h7.r8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        h7.r8.r(parcel, iQ);
    }
}
