package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
import java.util.List;
public final class v0 extends r6.a {
    public static final Parcelable.Creator<v0> CREATOR = new o0(7);
    public final int f3070a;
    public final long f3071b;
    public final List f3072c;

    public v0(int i7, long j3, ArrayList arrayList) {
        this.f3070a = i7;
        this.f3071b = j3;
        this.f3072c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3070a);
        yb.q(parcel, 3, 8);
        parcel.writeLong(this.f3071b);
        yb.p(parcel, 4, this.f3072c);
        yb.s(parcel, r10);
    }
}
