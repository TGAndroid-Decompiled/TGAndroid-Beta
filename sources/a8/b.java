package a8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import j7.g5;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new w.a(7);
    public String f141a;
    public DataHolder f142b;
    public ParcelFileDescriptor f143c;
    public long d;
    public byte[] f144e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f141a);
        g5.k(parcel, 3, this.f142b, i10);
        g5.k(parcel, 4, this.f143c, i10);
        long j10 = this.d;
        g5.s(parcel, 5, 8);
        parcel.writeLong(j10);
        g5.c(parcel, 6, this.f144e);
        g5.r(parcel, q10);
        this.f143c = null;
    }
}
