package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
import java.util.List;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new c(10);
    public final int f3075a;
    public final List f3076b;

    public m(int i7, ArrayList arrayList) {
        this.f3075a = i7;
        this.f3076b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3075a);
        wb.p(parcel, 3, this.f3076b);
        wb.s(parcel, r10);
    }
}
