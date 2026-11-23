package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
import java.util.List;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new c(10);
    public final int f2998a;
    public final List f2999b;

    public m(int i7, ArrayList arrayList) {
        this.f2998a = i7;
        this.f2999b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2998a);
        cc.p(parcel, 3, this.f2999b);
        cc.s(parcel, r10);
    }
}
