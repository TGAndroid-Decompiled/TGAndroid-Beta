package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import java.util.List;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new c(20);
    public final int f3118a;
    public final List f3119b;

    public w(int i7, ArrayList arrayList) {
        this.f3118a = i7;
        this.f3119b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f3118a);
        xb.p(parcel, 3, this.f3119b);
        xb.s(parcel, r10);
    }
}
