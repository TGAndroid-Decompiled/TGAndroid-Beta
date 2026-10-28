package n8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new x(6);
    public final long f18735a;
    public final a[] f18736b;
    public final int f18737c;
    public final boolean d;

    public f(long j10, a[] aVarArr, int i10, boolean z10) {
        this.f18735a = j10;
        this.f18736b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f18737c = i10;
        } else {
            this.f18737c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 8);
        parcel.writeLong(this.f18735a);
        df.o(parcel, 3, this.f18736b, i10);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f18737c);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        df.r(parcel, q5);
    }
}
