package o5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new l4.j(16);
    public final int f16592a;
    public final int f16593b;
    public final Bundle f16594c;

    public a(int i10, int i11, Bundle bundle) {
        this.f16592a = i10;
        this.f16593b = i11;
        this.f16594c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f16592a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f16593b);
        g5.b(parcel, 3, this.f16594c);
        g5.r(parcel, q10);
    }
}
