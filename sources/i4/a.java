package i4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new g8.b(27);
    public final long f8215a;
    public final long f8216b;
    public final byte[] f8217c;

    public a(long j10, long j11, byte[] bArr) {
        this.f8215a = j11;
        this.f8216b = j10;
        this.f8217c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f8215a);
        parcel.writeLong(this.f8216b);
        parcel.writeByteArray(this.f8217c);
    }

    public a(Parcel parcel) {
        this.f8215a = parcel.readLong();
        this.f8216b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i10 = d0.f6579a;
        this.f8217c = createByteArray;
    }
}
