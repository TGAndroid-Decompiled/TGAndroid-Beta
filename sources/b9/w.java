package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
import java.util.List;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new c(20);
    public final int f3041a;
    public final List f3042b;

    public w(int i7, ArrayList arrayList) {
        this.f3041a = i7;
        this.f3042b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3041a);
        cc.p(parcel, 3, this.f3042b);
        cc.s(parcel, r10);
    }
}
