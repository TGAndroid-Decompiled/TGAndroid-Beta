package m8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new h(2);
    public String f15706a;
    public DataHolder f15707b;
    public ParcelFileDescriptor f15708c;
    public long d;
    public byte[] e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f15706a);
        g0.k(parcel, 3, this.f15707b, i10);
        g0.k(parcel, 4, this.f15708c, i10);
        long j10 = this.d;
        g0.s(parcel, 5, 8);
        parcel.writeLong(j10);
        g0.c(parcel, 6, this.e);
        g0.r(parcel, q6);
        this.f15708c = null;
    }
}
