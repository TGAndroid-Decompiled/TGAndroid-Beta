package o5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new p(0);
    public final int f18955a;
    public final int f18956b;
    public final int f18957c;

    public b(int i9, int i10, int i11) {
        this.f18955a = i9;
        this.f18956b = i10;
        this.f18957c = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f18955a);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f18956b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.f18957c);
        p8.r(parcel, q10);
    }
}
