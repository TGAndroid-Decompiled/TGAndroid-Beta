package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
import java.util.List;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new c(10);
    public final int f3047a;
    public final List f3048b;

    public m(int i7, ArrayList arrayList) {
        this.f3047a = i7;
        this.f3048b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3047a);
        bc.p(parcel, 3, this.f3048b);
        bc.s(parcel, r10);
    }
}
