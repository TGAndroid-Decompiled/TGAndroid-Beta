package a6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(1);
    public final int f303a;
    public final int f304b;
    public final Bundle f305c;

    public a(int i10, int i11, Bundle bundle) {
        this.f303a = i10;
        this.f304b = i11;
        this.f305c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f303a);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f304b);
        d0.b(parcel, 3, this.f305c);
        d0.r(parcel, q6);
    }
}
