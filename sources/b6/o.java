package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class o extends c6.a {
    public static final Parcelable.Creator<o> CREATOR = new w.a(24);
    public final int f1641a;
    public final boolean f1642b;
    public final boolean f1643c;
    public final int d;
    public final int e;

    public o(int i10, int i11, int i12, boolean z4, boolean z10) {
        this.f1641a = i10;
        this.f1642b = z4;
        this.f1643c = z10;
        this.d = i11;
        this.e = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f1641a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f1642b ? 1 : 0);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f1643c ? 1 : 0);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f5.r(parcel, q10);
    }
}
