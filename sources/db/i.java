package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new k(0);
    public final int f8581a;
    public final String f8582b;
    public final int f8583c;

    public i(int i7, int i10, String simOperatorName) {
        kotlin.jvm.internal.j.e(simOperatorName, "simOperatorName");
        this.f8581a = i7;
        this.f8582b = simOperatorName;
        this.f8583c = i10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = wb.r(dest, 20293);
        wb.q(dest, 1, 4);
        dest.writeInt(this.f8581a);
        wb.l(dest, 2, this.f8582b);
        wb.q(dest, 3, 4);
        dest.writeInt(this.f8583c);
        wb.s(dest, r10);
    }
}
