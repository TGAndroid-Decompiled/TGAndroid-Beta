package h4;

import android.os.Parcel;
import android.os.Parcelable;
import i7.q7;
import j3.g1;
import j3.t0;
public final class b implements b4.b {
    public static final Parcelable.Creator<b> CREATOR = new g8.b(5);
    public final long f7527a;
    public final long f7528b;
    public final long f7529c;
    public final long d;
    public final long f7530e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f7527a = j10;
        this.f7528b = j11;
        this.f7529c = j12;
        this.d = j13;
        this.f7530e = j14;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f7527a == bVar.f7527a && this.f7528b == bVar.f7528b && this.f7529c == bVar.f7529c && this.d == bVar.d && this.f7530e == bVar.f7530e) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override
    public final t0 getWrappedMetadataFormat() {
        return null;
    }

    public final int hashCode() {
        int a2 = q7.a(this.f7528b);
        int a10 = q7.a(this.f7529c);
        int a11 = q7.a(this.d);
        return q7.a(this.f7530e) + ((a11 + ((a10 + ((a2 + ((q7.a(this.f7527a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f7527a + ", photoSize=" + this.f7528b + ", photoPresentationTimestampUs=" + this.f7529c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f7530e;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f7527a);
        parcel.writeLong(this.f7528b);
        parcel.writeLong(this.f7529c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.f7530e);
    }

    public b(Parcel parcel) {
        this.f7527a = parcel.readLong();
        this.f7528b = parcel.readLong();
        this.f7529c = parcel.readLong();
        this.d = parcel.readLong();
        this.f7530e = parcel.readLong();
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
