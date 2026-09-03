package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.List;
public final class o extends c6.a {
    public static final Parcelable.Creator<o> CREATOR = new c(10);
    public final int f13821a;
    public final List f13822b;

    public o(int i10, ArrayList arrayList) {
        this.f13821a = i10;
        this.f13822b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13821a);
        f5.p(parcel, 3, this.f13822b);
        f5.r(parcel, q10);
    }
}
