package d6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(26);
    public final int f7575a;
    public final int f7576b;
    public final Bundle f7577c;

    public a(int i7, int i10, Bundle bundle) {
        this.f7575a = i7;
        this.f7576b = i10;
        this.f7577c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f7575a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f7576b);
        yb.b(parcel, 3, this.f7577c);
        yb.s(parcel, r10);
    }
}
