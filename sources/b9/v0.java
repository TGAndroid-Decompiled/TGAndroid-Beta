package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
import java.util.List;
public final class v0 extends r6.a {
    public static final Parcelable.Creator<v0> CREATOR = new o0(7);
    public final int f3068a;
    public final long f3069b;
    public final List f3070c;

    public v0(int i7, long j3, ArrayList arrayList) {
        this.f3068a = i7;
        this.f3069b = j3;
        this.f3070c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3068a);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.f3069b);
        bc.p(parcel, 4, this.f3070c);
        bc.s(parcel, r10);
    }
}
