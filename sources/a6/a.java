package a6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(1);
    public final int f281a;
    public final int f282b;
    public final Bundle f283c;

    public a(int i10, int i11, Bundle bundle) {
        this.f281a = i10;
        this.f282b = i11;
        this.f283c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f281a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f282b);
        e0.b(parcel, 3, this.f283c);
        e0.r(parcel, q6);
    }
}
