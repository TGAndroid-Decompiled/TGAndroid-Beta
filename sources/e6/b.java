package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(1);
    public final int f8847a;
    public final int f8848b;
    public final int f8849c;

    public b(int i10, int i11, int i12) {
        this.f8847a = i10;
        this.f8848b = i11;
        this.f8849c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f8847a);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f8848b);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.f8849c);
        e0.r(parcel, q6);
    }
}
