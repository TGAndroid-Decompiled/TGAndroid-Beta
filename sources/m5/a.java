package m5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new i4.g(23);
    public final int f16857a;
    public final int f16858b;
    public final Bundle f16859c;

    public a(int i10, int i11, Bundle bundle) {
        this.f16857a = i10;
        this.f16858b = i11;
        this.f16859c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.f16857a);
        o.s(parcel, 2, 4);
        parcel.writeInt(this.f16858b);
        o.b(parcel, 3, this.f16859c);
        o.r(parcel, q6);
    }
}
