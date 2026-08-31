package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;
import java.util.List;
public final class o extends c6.a {
    public static final Parcelable.Creator<o> CREATOR = new c(10);
    public final int f13553a;
    public final List f13554b;

    public o(int i10, ArrayList arrayList) {
        this.f13553a = i10;
        this.f13554b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13553a);
        g5.p(parcel, 3, this.f13554b);
        g5.r(parcel, q10);
    }
}
