package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
public final class no9 extends b4 {
    public static final Parcelable.Creator<no9> CREATOR = new rhe((byte) 8);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.k(parcel, 3, this.b, i);
        jte.k(parcel, 4, this.c, i);
        long j = this.d;
        jte.q(parcel, 5, 8);
        parcel.writeLong(j);
        jte.c(parcel, 6, this.e);
        jte.s(parcel, r);
        this.c = null;
    }
}
