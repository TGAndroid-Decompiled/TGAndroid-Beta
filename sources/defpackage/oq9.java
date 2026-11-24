package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
public final class oq9 extends b4 {
    public static final Parcelable.Creator<oq9> CREATOR = new sje((byte) 8);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.k(parcel, 3, this.b, i);
        mve.k(parcel, 4, this.c, i);
        long j = this.d;
        mve.q(parcel, 5, 8);
        parcel.writeLong(j);
        mve.c(parcel, 6, this.e);
        mve.s(parcel, r);
        this.c = null;
    }
}
