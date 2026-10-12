package a6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(1);
    public final int f283a;
    public final int f284b;
    public final Bundle f285c;

    public a(int i10, int i11, Bundle bundle) {
        this.f283a = i10;
        this.f284b = i11;
        this.f285c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f283a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f284b);
        g0.b(parcel, 3, this.f285c);
        g0.r(parcel, q6);
    }
}
