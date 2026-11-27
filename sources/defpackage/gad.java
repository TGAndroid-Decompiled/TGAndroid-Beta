package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class gad extends c4 {
    public static final Parcelable.Creator<gad> CREATOR = new m9d((byte) 11);
    public final long a;

    public gad(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gad) || this.a != ((gad) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 8);
        parcel.writeLong(this.a);
        bye.s(parcel, r);
    }
}
