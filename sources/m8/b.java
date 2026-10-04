package m8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new h(2);
    public String f16332a;
    public DataHolder f16333b;
    public ParcelFileDescriptor f16334c;
    public long d;
    public byte[] f16335e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f16332a);
        g0.k(parcel, 3, this.f16333b, i10);
        g0.k(parcel, 4, this.f16334c, i10);
        long j3 = this.d;
        g0.s(parcel, 5, 8);
        parcel.writeLong(j3);
        g0.c(parcel, 6, this.f16335e);
        g0.r(parcel, q6);
        this.f16334c = null;
    }
}
