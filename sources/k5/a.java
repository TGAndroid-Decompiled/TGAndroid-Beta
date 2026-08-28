package k5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new h5.h(9);
    public final int f14636a;
    public final int f14637b;
    public final Bundle f14638c;

    public a(int i9, int i10, Bundle bundle) {
        this.f14636a = i9;
        this.f14637b = i10;
        this.f14638c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f14636a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f14637b);
        p8.b(parcel, 3, this.f14638c);
        p8.r(parcel, q10);
    }
}
