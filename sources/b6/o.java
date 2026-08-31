package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class o extends c6.a {
    public static final Parcelable.Creator<o> CREATOR = new w.a(24);
    public final int f1763a;
    public final boolean f1764b;
    public final boolean f1765c;
    public final int d;
    public final int f1766e;

    public o(int i10, int i11, int i12, boolean z4, boolean z10) {
        this.f1763a = i10;
        this.f1764b = z4;
        this.f1765c = z10;
        this.d = i11;
        this.f1766e = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f1763a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f1764b ? 1 : 0);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f1765c ? 1 : 0);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.f1766e);
        g5.r(parcel, q10);
    }
}
