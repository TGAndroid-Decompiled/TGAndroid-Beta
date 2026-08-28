package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.List;
public final class o extends y5.a {
    public static final Parcelable.Creator<o> CREATOR = new c(10);
    public final int f11015a;
    public final List f11016b;

    public o(int i9, ArrayList arrayList) {
        this.f11015a = i9;
        this.f11016b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11015a);
        p8.p(parcel, 3, this.f11016b);
        p8.r(parcel, q10);
    }
}
