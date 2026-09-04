package m8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new h(2);
    public String f16131a;
    public DataHolder f16132b;
    public ParcelFileDescriptor f16133c;
    public long d;
    public byte[] f16134e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f16131a);
        e0.k(parcel, 3, this.f16132b, i10);
        e0.k(parcel, 4, this.f16133c, i10);
        long j3 = this.d;
        e0.s(parcel, 5, 8);
        parcel.writeLong(j3);
        e0.c(parcel, 6, this.f16134e);
        e0.r(parcel, q6);
        this.f16133c = null;
    }
}
