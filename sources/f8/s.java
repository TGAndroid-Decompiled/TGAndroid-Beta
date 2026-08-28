package f8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class s extends y5.a {
    public static final Parcelable.Creator<s> CREATOR = new r(1);
    public final String f5979a;
    public final String f5980b;
    public final int f5981c;
    public final int d;

    public s(int i9, int i10, String str, String str2) {
        this.f5979a = str;
        this.f5980b = str2;
        this.f5981c = i9;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f5979a);
        p8.l(parcel, 3, this.f5980b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.f5981c);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        p8.r(parcel, q10);
    }
}
