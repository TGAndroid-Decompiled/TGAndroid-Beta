package k5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new h5.h(17);

    public final int f14457a;

    public final int f14458b;

    public final Bundle f14459c;

    public a(int i10, int i11, Bundle bundle) {
        this.f14457a = i10;
        this.f14458b = i11;
        this.f14459c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f14457a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f14458b);
        r8.b(parcel, 3, this.f14459c);
        r8.r(parcel, iQ);
    }
}
