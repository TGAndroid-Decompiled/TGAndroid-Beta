package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class u0 extends q6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int f257a;
    public final long f258b;
    public final List f259c;

    public u0(int i3, long j10, ArrayList arrayList) {
        this.f257a = i3;
        this.f258b = j10;
        this.f259c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f257a);
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(this.f258b);
        j8.a.q(parcel, 4, this.f259c);
        j8.a.t(parcel, s6);
    }
}
