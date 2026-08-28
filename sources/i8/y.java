package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.List;
public final class y extends y5.a {
    public static final Parcelable.Creator<y> CREATOR = new c(20);
    public final int f11058a;
    public final List f11059b;

    public y(int i9, ArrayList arrayList) {
        this.f11058a = i9;
        this.f11059b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11058a);
        p8.p(parcel, 3, this.f11059b);
        p8.r(parcel, q10);
    }
}
