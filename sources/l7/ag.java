package l7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ag extends a6.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int f14499a;
    public final int f14500b;
    public final int f14501c;
    public final int d;
    public final long f14502e;

    public ag(int i10, int i11, int i12, long j10, int i13) {
        this.f14499a = i10;
        this.f14500b = i11;
        this.f14501c = i12;
        this.d = i13;
        this.f14502e = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f14499a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f14500b);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f14501c);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 8);
        parcel.writeLong(this.f14502e);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
