package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
import java.util.List;
public final class v0 extends r6.a {
    public static final Parcelable.Creator<v0> CREATOR = new o0(7);
    public final int f3080a;
    public final long f3081b;
    public final List f3082c;

    public v0(int i7, long j3, ArrayList arrayList) {
        this.f3080a = i7;
        this.f3081b = j3;
        this.f3082c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3080a);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.f3081b);
        bc.p(parcel, 4, this.f3082c);
        bc.s(parcel, r10);
    }
}
