package j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class l extends c6.a {
    public static final Parcelable.Creator<l> CREATOR = new f8.o(26);
    public int f9267a;
    public Bundle f9268b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f9267a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.b(parcel, 3, this.f9268b);
        f5.r(parcel, q10);
    }
}
