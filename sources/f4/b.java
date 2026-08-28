package f4;

import android.os.Parcel;
import android.os.Parcelable;
import g7.s6;
import h3.g1;
import h3.t0;
public final class b implements z3.b {
    public static final Parcelable.Creator<b> CREATOR = new c.c(23);
    public final long f5577a;
    public final long f5578b;
    public final long f5579c;
    public final long d;
    public final long f5580e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f5577a = j10;
        this.f5578b = j11;
        this.f5579c = j12;
        this.d = j13;
        this.f5580e = j14;
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
            if (this.f5577a == bVar.f5577a && this.f5578b == bVar.f5578b && this.f5579c == bVar.f5579c && this.d == bVar.d && this.f5580e == bVar.f5580e) {
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
        int a2 = s6.a(this.f5578b);
        int a3 = s6.a(this.f5579c);
        int a10 = s6.a(this.d);
        return s6.a(this.f5580e) + ((a10 + ((a3 + ((a2 + ((s6.a(this.f5577a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f5577a + ", photoSize=" + this.f5578b + ", photoPresentationTimestampUs=" + this.f5579c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f5580e;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f5577a);
        parcel.writeLong(this.f5578b);
        parcel.writeLong(this.f5579c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.f5580e);
    }

    public b(Parcel parcel) {
        this.f5577a = parcel.readLong();
        this.f5578b = parcel.readLong();
        this.f5579c = parcel.readLong();
        this.d = parcel.readLong();
        this.f5580e = parcel.readLong();
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
