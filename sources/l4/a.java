package l4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j8.t;
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new t(26);
    public final long f11676a;
    public final long f11677b;
    public final byte[] f11678c;

    public a(long j10, long j11, byte[] bArr) {
        this.f11676a = j11;
        this.f11677b = j10;
        this.f11678c = bArr;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f11676a);
        sb.append(", identifier= ");
        return android.support.v4.media.a.q(sb, this.f11677b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f11676a);
        parcel.writeLong(this.f11677b);
        parcel.writeByteArray(this.f11678c);
    }

    public a(Parcel parcel) {
        this.f11676a = parcel.readLong();
        this.f11677b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i10 = d0.f7237a;
        this.f11678c = createByteArray;
    }
}
