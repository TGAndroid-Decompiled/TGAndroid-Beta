package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class j extends r6.a {
    public final long f11431a;
    public final long f11432b;
    public final boolean f11433c;
    public final boolean d;
    public static final j6.b f11430e = new j6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j3, long j10, boolean z10, boolean z11) {
        this.f11431a = Math.max(j3, 0L);
        this.f11432b = Math.max(j10, 0L);
        this.f11433c = z10;
        this.d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f11431a == jVar.f11431a && this.f11432b == jVar.f11432b && this.f11433c == jVar.f11433c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11431a), Long.valueOf(this.f11432b), Boolean.valueOf(this.f11433c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f11431a);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.f11432b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f11433c ? 1 : 0);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.s(parcel, r10);
    }
}
