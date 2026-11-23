package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
import java.util.List;
public final class v0 extends r6.a {
    public static final Parcelable.Creator<v0> CREATOR = new o0(7);
    public final int f3038a;
    public final long f3039b;
    public final List f3040c;

    public v0(int i7, long j3, ArrayList arrayList) {
        this.f3038a = i7;
        this.f3039b = j3;
        this.f3040c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3038a);
        cc.q(parcel, 3, 8);
        parcel.writeLong(this.f3039b);
        cc.p(parcel, 4, this.f3040c);
        cc.s(parcel, r10);
    }
}
