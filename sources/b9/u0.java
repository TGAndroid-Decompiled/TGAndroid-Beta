package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
import java.util.List;
public final class u0 extends r6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int f3110a;
    public final long f3111b;
    public final List f3112c;

    public u0(int i7, long j3, ArrayList arrayList) {
        this.f3110a = i7;
        this.f3111b = j3;
        this.f3112c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3110a);
        wb.q(parcel, 3, 8);
        parcel.writeLong(this.f3111b);
        wb.p(parcel, 4, this.f3112c);
        wb.s(parcel, r10);
    }
}
