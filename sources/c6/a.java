package c6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(17);
    public final int f4212a;
    public final int f4213b;
    public final Bundle f4214c;

    public a(int i3, int i10, Bundle bundle) {
        this.f4212a = i3;
        this.f4213b = i10;
        this.f4214c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f4212a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f4213b);
        j8.a.c(parcel, 3, this.f4214c);
        j8.a.t(parcel, s6);
    }
}
