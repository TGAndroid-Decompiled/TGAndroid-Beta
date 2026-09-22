package a6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(1);
    public final int f280a;
    public final int f281b;
    public final Bundle f282c;

    public a(int i10, int i11, Bundle bundle) {
        this.f280a = i10;
        this.f281b = i11;
        this.f282c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f280a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f281b);
        f0.b(parcel, 3, this.f282c);
        f0.r(parcel, q6);
    }
}
