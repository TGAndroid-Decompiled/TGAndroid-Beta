package n7;

import android.os.Parcel;
import android.os.Parcelable;
public final class bg extends c6.a {
    public static final Parcelable.Creator<bg> CREATOR = new dg(0);
    public final int f14301a;
    public final int f14302b;
    public final int f14303c;
    public final int d;
    public final long e;

    public bg(int i10, int i11, int i12, long j10, int i13) {
        this.f14301a = i10;
        this.f14302b = i11;
        this.f14303c = i12;
        this.d = i13;
        this.e = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.f5.q(parcel, 20293);
        j7.f5.s(parcel, 1, 4);
        parcel.writeInt(this.f14301a);
        j7.f5.s(parcel, 2, 4);
        parcel.writeInt(this.f14302b);
        j7.f5.s(parcel, 3, 4);
        parcel.writeInt(this.f14303c);
        j7.f5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        j7.f5.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        j7.f5.r(parcel, q10);
    }
}
