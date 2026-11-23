package d6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(26);
    public final int f7849a;
    public final int f7850b;
    public final Bundle f7851c;

    public a(int i7, int i10, Bundle bundle) {
        this.f7849a = i7;
        this.f7850b = i10;
        this.f7851c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f7849a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f7850b);
        cc.b(parcel, 3, this.f7851c);
        cc.s(parcel, r10);
    }
}
