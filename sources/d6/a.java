package d6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(26);
    public final int f7850a;
    public final int f7851b;
    public final Bundle f7852c;

    public a(int i7, int i10, Bundle bundle) {
        this.f7850a = i7;
        this.f7851b = i10;
        this.f7852c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f7850a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f7851b);
        cc.b(parcel, 3, this.f7852c);
        cc.s(parcel, r10);
    }
}
