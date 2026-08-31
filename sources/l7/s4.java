package l7;

import android.os.Parcel;
import android.os.Parcelable;
public final class s4 extends c6.a {
    public static final Parcelable.Creator<s4> CREATOR = new t5(0);
    public final String f12013a;
    public final String f12014b;
    public final float f12015c;
    public final int d;

    public s4(float f10, int i10, String str, String str2) {
        this.f12014b = str2;
        this.f12015c = f10;
        this.f12013a = str;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.g5.q(parcel, 20293);
        j7.g5.l(parcel, 2, this.f12014b);
        j7.g5.s(parcel, 3, 4);
        parcel.writeFloat(this.f12015c);
        j7.g5.l(parcel, 4, this.f12013a);
        j7.g5.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        j7.g5.r(parcel, q10);
    }
}
