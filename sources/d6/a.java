package d6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(26);
    public final int f8189a;
    public final int f8190b;
    public final Bundle f8191c;

    public a(int i7, int i10, Bundle bundle) {
        this.f8189a = i7;
        this.f8190b = i10;
        this.f8191c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f8189a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f8190b);
        xb.b(parcel, 3, this.f8191c);
        xb.s(parcel, r10);
    }
}
