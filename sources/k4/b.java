package k4;

import android.os.Parcel;
import android.os.Parcelable;
import j3.d1;
import j3.n0;
import j8.t;
import k7.z7;
public final class b implements e4.b {
    public static final Parcelable.Creator<b> CREATOR = new t(12);
    public final long f9720a;
    public final long f9721b;
    public final long f9722c;
    public final long d;
    public final long e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f9720a = j10;
        this.f9721b = j11;
        this.f9722c = j12;
        this.d = j13;
        this.e = j14;
    }

    @Override
    public final n0 b() {
        return null;
    }

    @Override
    public final byte[] d() {
        return null;
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
            if (this.f9720a == bVar.f9720a && this.f9721b == bVar.f9721b && this.f9722c == bVar.f9722c && this.d == bVar.d && this.e == bVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a2 = z7.a(this.f9721b);
        int a10 = z7.a(this.f9722c);
        int a11 = z7.a(this.d);
        return z7.a(this.e) + ((a11 + ((a10 + ((a2 + ((z7.a(this.f9720a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f9720a + ", photoSize=" + this.f9721b + ", photoPresentationTimestampUs=" + this.f9722c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9720a);
        parcel.writeLong(this.f9721b);
        parcel.writeLong(this.f9722c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
    }

    public b(Parcel parcel) {
        this.f9720a = parcel.readLong();
        this.f9721b = parcel.readLong();
        this.f9722c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
    }

    @Override
    public final void c(d1 d1Var) {
    }
}
