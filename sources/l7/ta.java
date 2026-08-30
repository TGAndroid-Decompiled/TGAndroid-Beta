package l7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ta extends c6.a {
    public static final Parcelable.Creator<ta> CREATOR = new t5(2);
    public final String f11645a;
    public final float f11646b;
    public final String f11647c;
    public final int d;

    public ta(float f10, int i10, String str, String str2) {
        this.f11645a = str;
        this.f11646b = f10;
        this.f11647c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.f5.q(parcel, 20293);
        j7.f5.l(parcel, 1, this.f11645a);
        j7.f5.s(parcel, 2, 4);
        parcel.writeFloat(this.f11646b);
        j7.f5.l(parcel, 3, this.f11647c);
        j7.f5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        j7.f5.r(parcel, q10);
    }
}
