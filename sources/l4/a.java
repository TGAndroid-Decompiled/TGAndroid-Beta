package l4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j8.t;
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new t(26);
    public final long f11303a;
    public final long f11304b;
    public final byte[] f11305c;

    public a(long j10, long j11, byte[] bArr) {
        this.f11303a = j11;
        this.f11304b = j10;
        this.f11305c = bArr;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f11303a);
        sb.append(", identifier= ");
        return android.support.v4.media.a.q(sb, this.f11304b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f11303a);
        parcel.writeLong(this.f11304b);
        parcel.writeByteArray(this.f11305c);
    }

    public a(Parcel parcel) {
        this.f11303a = parcel.readLong();
        this.f11304b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i10 = d0.f6937a;
        this.f11305c = createByteArray;
    }
}
