package n8;

import a8.df;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import n4.x;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new x(9);
    public String f18730a;
    public DataHolder f18731b;
    public ParcelFileDescriptor f18732c;
    public long d;
    public byte[] e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f18730a);
        df.k(parcel, 3, this.f18731b, i10);
        df.k(parcel, 4, this.f18732c, i10);
        long j10 = this.d;
        df.s(parcel, 5, 8);
        parcel.writeLong(j10);
        df.c(parcel, 6, this.e);
        df.r(parcel, q5);
        this.f18732c = null;
    }
}
