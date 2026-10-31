package m8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import w7.h0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(1);
    public String f13021a;
    public DataHolder f13022b;
    public ParcelFileDescriptor f13023c;
    public long d;
    public byte[] e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f13021a);
        h0.k(parcel, 3, this.f13022b, i10);
        h0.k(parcel, 4, this.f13023c, i10);
        long j10 = this.d;
        h0.s(parcel, 5, 8);
        parcel.writeLong(j10);
        h0.c(parcel, 6, this.e);
        h0.r(parcel, q6);
        this.f13023c = null;
    }
}
