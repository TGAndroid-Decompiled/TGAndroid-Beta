package l7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ta extends c6.a {
    public static final Parcelable.Creator<ta> CREATOR = new t5(2);
    public final String f12045a;
    public final float f12046b;
    public final String f12047c;
    public final int d;

    public ta(float f10, int i10, String str, String str2) {
        this.f12045a = str;
        this.f12046b = f10;
        this.f12047c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.g5.q(parcel, 20293);
        j7.g5.l(parcel, 1, this.f12045a);
        j7.g5.s(parcel, 2, 4);
        parcel.writeFloat(this.f12046b);
        j7.g5.l(parcel, 3, this.f12047c);
        j7.g5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        j7.g5.r(parcel, q10);
    }
}
