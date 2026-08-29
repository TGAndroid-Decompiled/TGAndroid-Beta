package h4;

import a4.w;
import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import java.util.Arrays;
import java.util.Locale;
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new g8.b(7);
    public final long f7531a;
    public final long f7532b;
    public final int f7533c;

    public c(long j10, long j11, int i10) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        this.f7531a = j10;
        this.f7532b = j11;
        this.f7533c = i10;
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
            if (this.f7531a == cVar.f7531a && this.f7532b == cVar.f7532b && this.f7533c == cVar.f7533c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7531a), Long.valueOf(this.f7532b), Integer.valueOf(this.f7533c)});
    }

    public final String toString() {
        int i10 = d0.f6579a;
        Locale locale = Locale.US;
        StringBuilder r6 = w.r(this.f7531a, "Segment: startTimeMs=", ", endTimeMs=");
        r6.append(this.f7532b);
        r6.append(", speedDivisor=");
        r6.append(this.f7533c);
        return r6.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f7531a);
        parcel.writeLong(this.f7532b);
        parcel.writeInt(this.f7533c);
    }
}
