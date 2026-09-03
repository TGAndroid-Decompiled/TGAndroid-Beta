package l7;

import android.os.Parcel;
import android.os.Parcelable;
public final class s4 extends c6.a {
    public static final Parcelable.Creator<s4> CREATOR = new t5(0);
    public final String f11726a;
    public final String f11727b;
    public final float f11728c;
    public final int d;

    public s4(float f10, int i10, String str, String str2) {
        this.f11727b = str2;
        this.f11728c = f10;
        this.f11726a = str;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.f5.q(parcel, 20293);
        j7.f5.l(parcel, 2, this.f11727b);
        j7.f5.s(parcel, 3, 4);
        parcel.writeFloat(this.f11728c);
        j7.f5.l(parcel, 4, this.f11726a);
        j7.f5.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        j7.f5.r(parcel, q10);
    }
}
