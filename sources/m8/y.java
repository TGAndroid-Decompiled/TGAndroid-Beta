package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.List;
public final class y extends c6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(20);
    public final int f13878a;
    public final List f13879b;

    public y(int i10, ArrayList arrayList) {
        this.f13878a = i10;
        this.f13879b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13878a);
        f5.p(parcel, 3, this.f13879b);
        f5.r(parcel, q10);
    }
}
