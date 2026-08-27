package f4;

import android.os.Parcel;
import android.os.Parcelable;
import c8.o;
import h3.g1;
import h3.t0;
import h7.v6;

public final class b implements z3.b {
    public static final Parcelable.Creator<b> CREATOR = new o(27);

    public final long f5872a;

    public final long f5873b;

    public final long f5874c;
    public final long d;

    public final long f5875e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f5872a = j10;
        this.f5873b = j11;
        this.f5874c = j12;
        this.d = j13;
        this.f5875e = j14;
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
            if (this.f5872a == bVar.f5872a && this.f5873b == bVar.f5873b && this.f5874c == bVar.f5874c && this.d == bVar.d && this.f5875e == bVar.f5875e) {
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
        return v6.a(this.f5875e) + ((v6.a(this.d) + ((v6.a(this.f5874c) + ((v6.a(this.f5873b) + ((v6.a(this.f5872a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f5872a + ", photoSize=" + this.f5873b + ", photoPresentationTimestampUs=" + this.f5874c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f5875e;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f5872a);
        parcel.writeLong(this.f5873b);
        parcel.writeLong(this.f5874c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.f5875e);
    }

    public b(Parcel parcel) {
        this.f5872a = parcel.readLong();
        this.f5873b = parcel.readLong();
        this.f5874c = parcel.readLong();
        this.d = parcel.readLong();
        this.f5875e = parcel.readLong();
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
