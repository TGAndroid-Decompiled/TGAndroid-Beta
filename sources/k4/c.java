package k4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j8.t;
import java.util.Arrays;
import java.util.Locale;
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new t(14);
    public final long f10463a;
    public final long f10464b;
    public final int f10465c;

    public c(long j10, long j11, int i10) {
        boolean z4;
        if (j10 < j11) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        this.f10463a = j10;
        this.f10464b = j11;
        this.f10465c = i10;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f10463a == cVar.f10463a && this.f10464b == cVar.f10464b && this.f10465c == cVar.f10465c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10463a), Long.valueOf(this.f10464b), Integer.valueOf(this.f10465c)});
    }

    public final String toString() {
        int i10 = d0.f7237a;
        Locale locale = Locale.US;
        StringBuilder s6 = android.support.v4.media.a.s(this.f10463a, "Segment: startTimeMs=", ", endTimeMs=");
        s6.append(this.f10464b);
        s6.append(", speedDivisor=");
        s6.append(this.f10465c);
        return s6.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f10463a);
        parcel.writeLong(this.f10464b);
        parcel.writeInt(this.f10465c);
    }
}
