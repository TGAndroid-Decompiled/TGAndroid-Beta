package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class u0 extends a6.a {
    public static final Parcelable.Creator<u0> CREATOR = new p0(5);
    public final int f13564a;
    public final int f13565b;
    public final byte[] f13566c;

    public u0(int i10, int i11, byte[] bArr) {
        this.f13564a = i10;
        this.f13565b = i11;
        this.f13566c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f13564a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13565b);
        com.google.android.gms.internal.cast.o.c(parcel, 3, this.f13566c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
