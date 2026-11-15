package d6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(26);
    public final int f7572a;
    public final int f7573b;
    public final Bundle f7574c;

    public a(int i7, int i10, Bundle bundle) {
        this.f7572a = i7;
        this.f7573b = i10;
        this.f7574c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f7572a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f7573b);
        yb.b(parcel, 3, this.f7574c);
        yb.s(parcel, r10);
    }
}
