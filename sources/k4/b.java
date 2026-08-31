package k4;

import android.os.Parcel;
import android.os.Parcelable;
import j3.d1;
import j3.n0;
import j8.t;
import k7.z7;
public final class b implements e4.b {
    public static final Parcelable.Creator<b> CREATOR = new t(12);
    public final long f10459a;
    public final long f10460b;
    public final long f10461c;
    public final long d;
    public final long f10462e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f10459a = j10;
        this.f10460b = j11;
        this.f10461c = j12;
        this.d = j13;
        this.f10462e = j14;
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
            if (this.f10459a == bVar.f10459a && this.f10460b == bVar.f10460b && this.f10461c == bVar.f10461c && this.d == bVar.d && this.f10462e == bVar.f10462e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a2 = z7.a(this.f10460b);
        int a10 = z7.a(this.f10461c);
        int a11 = z7.a(this.d);
        return z7.a(this.f10462e) + ((a11 + ((a10 + ((a2 + ((z7.a(this.f10459a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f10459a + ", photoSize=" + this.f10460b + ", photoPresentationTimestampUs=" + this.f10461c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f10462e;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f10459a);
        parcel.writeLong(this.f10460b);
        parcel.writeLong(this.f10461c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.f10462e);
    }

    public b(Parcel parcel) {
        this.f10459a = parcel.readLong();
        this.f10460b = parcel.readLong();
        this.f10461c = parcel.readLong();
        this.d = parcel.readLong();
        this.f10462e = parcel.readLong();
    }

    @Override
    public final void c(d1 d1Var) {
    }
}
