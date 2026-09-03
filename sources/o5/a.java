package o5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new l4.j(16);
    public final int f16417a;
    public final int f16418b;
    public final Bundle f16419c;

    public a(int i10, int i11, Bundle bundle) {
        this.f16417a = i10;
        this.f16418b = i11;
        this.f16419c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f16417a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f16418b);
        f5.b(parcel, 3, this.f16419c);
        f5.r(parcel, q10);
    }
}
