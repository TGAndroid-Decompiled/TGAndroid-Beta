package m8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import w7.d0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new h(2);
    public String f16299a;
    public DataHolder f16300b;
    public ParcelFileDescriptor f16301c;
    public long d;
    public byte[] f16302e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f16299a);
        d0.k(parcel, 3, this.f16300b, i10);
        d0.k(parcel, 4, this.f16301c, i10);
        long j3 = this.d;
        d0.s(parcel, 5, 8);
        parcel.writeLong(j3);
        d0.c(parcel, 6, this.f16302e);
        d0.r(parcel, q6);
        this.f16301c = null;
    }
}
