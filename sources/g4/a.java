package g4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;

public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new f4.e(5);

    public final long f6354a;

    public final long f6355b;

    public final byte[] f6356c;

    public a(long j10, long j11, byte[] bArr) {
        this.f6354a = j11;
        this.f6355b = j10;
        this.f6356c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f6354a);
        parcel.writeLong(this.f6355b);
        parcel.writeByteArray(this.f6356c);
    }

    public a(Parcel parcel) {
        this.f6354a = parcel.readLong();
        this.f6355b = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i10 = g0.f4795a;
        this.f6356c = bArrCreateByteArray;
    }
}
