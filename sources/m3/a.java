package m3;

import android.os.Parcel;
import android.os.Parcelable;
import j3.d1;
import j3.n0;
import k7.z7;
import l4.j;
public final class a implements e4.b {
    public static final Parcelable.Creator<a> CREATOR = new j(10);
    public final long f13462a;

    public a(long j10) {
        this.f13462a = j10;
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
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.f13462a == ((a) obj).f13462a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return z7.a(this.f13462a);
    }

    public final String toString() {
        Object valueOf;
        StringBuilder sb = new StringBuilder("Creation time: ");
        long j10 = this.f13462a;
        if (j10 == -2082844800000L) {
            valueOf = "unset";
        } else {
            valueOf = Long.valueOf(j10);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f13462a);
    }

    public a(Parcel parcel) {
        this.f13462a = parcel.readLong();
    }

    @Override
    public final void c(d1 d1Var) {
    }
}
