package d6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(26);
    public final int f7855a;
    public final int f7856b;
    public final Bundle f7857c;

    public a(int i7, int i10, Bundle bundle) {
        this.f7855a = i7;
        this.f7856b = i10;
        this.f7857c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f7855a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f7856b);
        bc.b(parcel, 3, this.f7857c);
        bc.s(parcel, r10);
    }
}
