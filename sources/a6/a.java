package a6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(1);
    public final int f285a;
    public final int f286b;
    public final Bundle f287c;

    public a(int i10, int i11, Bundle bundle) {
        this.f285a = i10;
        this.f286b = i11;
        this.f287c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f285a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f286b);
        f0.b(parcel, 3, this.f287c);
        f0.r(parcel, q6);
    }
}
