package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
import java.util.List;
public final class u0 extends r6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int f3033a;
    public final long f3034b;
    public final List f3035c;

    public u0(int i7, long j3, ArrayList arrayList) {
        this.f3033a = i7;
        this.f3034b = j3;
        this.f3035c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3033a);
        cc.q(parcel, 3, 8);
        parcel.writeLong(this.f3034b);
        cc.p(parcel, 4, this.f3035c);
        cc.s(parcel, r10);
    }
}
