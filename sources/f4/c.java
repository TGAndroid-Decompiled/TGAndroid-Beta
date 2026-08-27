package f4;

import a9.p;
import android.os.Parcel;
import android.os.Parcelable;
import c8.o;
import d5.g0;
import java.util.Arrays;
import java.util.Locale;

public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new o(29);

    public final long f5876a;

    public final long f5877b;

    public final int f5878c;

    public c(long j10, long j11, int i10) {
        d5.a.f(j10 < j11);
        this.f5876a = j10;
        this.f5877b = j11;
        this.f5878c = i10;
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
            if (this.f5876a == cVar.f5876a && this.f5877b == cVar.f5877b && this.f5878c == cVar.f5878c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5876a), Long.valueOf(this.f5877b), Integer.valueOf(this.f5878c)});
    }

    public final String toString() {
        int i10 = g0.f4795a;
        Locale locale = Locale.US;
        StringBuilder sbQ = p.q(this.f5876a, "Segment: startTimeMs=", ", endTimeMs=");
        sbQ.append(this.f5877b);
        sbQ.append(", speedDivisor=");
        sbQ.append(this.f5878c);
        return sbQ.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f5876a);
        parcel.writeLong(this.f5877b);
        parcel.writeInt(this.f5878c);
    }
}
