package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;
import java.util.List;
public final class o extends c6.a {
    public static final Parcelable.Creator<o> CREATOR = new c(10);
    public final int f13555a;
    public final List f13556b;

    public o(int i10, ArrayList arrayList) {
        this.f13555a = i10;
        this.f13556b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13555a);
        g5.p(parcel, 3, this.f13556b);
        g5.r(parcel, q10);
    }
}
