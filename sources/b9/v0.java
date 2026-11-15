package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
import java.util.List;
public final class v0 extends r6.a {
    public static final Parcelable.Creator<v0> CREATOR = new o0(7);
    public final int f3073a;
    public final long f3074b;
    public final List f3075c;

    public v0(int i7, long j3, ArrayList arrayList) {
        this.f3073a = i7;
        this.f3074b = j3;
        this.f3075c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3073a);
        yb.q(parcel, 3, 8);
        parcel.writeLong(this.f3074b);
        yb.p(parcel, 4, this.f3075c);
        yb.s(parcel, r10);
    }
}
