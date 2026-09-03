package k4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j8.t;
import java.util.Arrays;
import java.util.Locale;
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new t(14);
    public final long f9723a;
    public final long f9724b;
    public final int f9725c;

    public c(long j10, long j11, int i10) {
        boolean z4;
        if (j10 < j11) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        this.f9723a = j10;
        this.f9724b = j11;
        this.f9725c = i10;
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
            if (this.f9723a == cVar.f9723a && this.f9724b == cVar.f9724b && this.f9725c == cVar.f9725c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9723a), Long.valueOf(this.f9724b), Integer.valueOf(this.f9725c)});
    }

    public final String toString() {
        int i10 = d0.f6924a;
        Locale locale = Locale.US;
        StringBuilder s6 = android.support.v4.media.a.s(this.f9723a, "Segment: startTimeMs=", ", endTimeMs=");
        s6.append(this.f9724b);
        s6.append(", speedDivisor=");
        s6.append(this.f9725c);
        return s6.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9723a);
        parcel.writeLong(this.f9724b);
        parcel.writeInt(this.f9725c);
    }
}
