package m8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new h(2);
    public String f14976a;
    public DataHolder f14977b;
    public ParcelFileDescriptor f14978c;
    public long d;
    public byte[] e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f14976a);
        f0.k(parcel, 3, this.f14977b, i10);
        f0.k(parcel, 4, this.f14978c, i10);
        long j3 = this.d;
        f0.s(parcel, 5, 8);
        parcel.writeLong(j3);
        f0.c(parcel, 6, this.e);
        f0.r(parcel, q6);
        this.f14978c = null;
    }
}
