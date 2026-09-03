package a8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import j7.f5;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new w.a(7);
    public String f129a;
    public DataHolder f130b;
    public ParcelFileDescriptor f131c;
    public long d;
    public byte[] e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f129a);
        f5.k(parcel, 3, this.f130b, i10);
        f5.k(parcel, 4, this.f131c, i10);
        long j10 = this.d;
        f5.s(parcel, 5, 8);
        parcel.writeLong(j10);
        f5.c(parcel, 6, this.e);
        f5.r(parcel, q10);
        this.f131c = null;
    }
}
