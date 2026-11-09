package d6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(26);
    public final int f8184a;
    public final int f8185b;
    public final Bundle f8186c;

    public a(int i7, int i10, Bundle bundle) {
        this.f8184a = i7;
        this.f8185b = i10;
        this.f8186c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f8184a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f8185b);
        xb.b(parcel, 3, this.f8186c);
        xb.s(parcel, r10);
    }
}
