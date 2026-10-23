package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(1);
    public final int f8349a;
    public final int f8350b;
    public final int f8351c;

    public b(int i10, int i11, int i12) {
        this.f8349a = i10;
        this.f8350b = i11;
        this.f8351c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f8349a);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f8350b);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f8351c);
        f0.r(parcel, q6);
    }
}
