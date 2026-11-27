package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
public final class fs9 extends c4 {
    public static final Parcelable.Creator<fs9> CREATOR = new ime((byte) 8);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.k(parcel, 3, this.b, i);
        bye.k(parcel, 4, this.c, i);
        long j = this.d;
        bye.q(parcel, 5, 8);
        parcel.writeLong(j);
        bye.c(parcel, 6, this.e);
        bye.s(parcel, r);
        this.c = null;
    }
}
