package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(0);
    public final int f6258a;
    public final int f6259b;
    public final int f6260c;

    public b(int i10, int i11, int i12) {
        this.f6258a = i10;
        this.f6259b = i11;
        this.f6260c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f6258a);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f6259b);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.f6260c);
        h0.r(parcel, q6);
    }
}
