package f4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import java.util.Arrays;
import java.util.Locale;
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new c.c(25);
    public final long f5581a;
    public final long f5582b;
    public final int f5583c;

    public c(long j10, long j11, int i9) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        this.f5581a = j10;
        this.f5582b = j11;
        this.f5583c = i9;
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
            if (this.f5581a == cVar.f5581a && this.f5582b == cVar.f5582b && this.f5583c == cVar.f5583c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5581a), Long.valueOf(this.f5582b), Integer.valueOf(this.f5583c)});
    }

    public final String toString() {
        int i9 = f0.f4349a;
        Locale locale = Locale.US;
        StringBuilder s10 = aa.d.s(this.f5581a, "Segment: startTimeMs=", ", endTimeMs=");
        s10.append(this.f5582b);
        s10.append(", speedDivisor=");
        s10.append(this.f5583c);
        return s10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f5581a);
        parcel.writeLong(this.f5582b);
        parcel.writeInt(this.f5583c);
    }
}
