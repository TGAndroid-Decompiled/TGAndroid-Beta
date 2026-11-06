package a6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import q6.m;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new w.a(4);
    public final boolean f279a;
    public final String f280b;

    public b(String str, boolean z9) {
        if (z9) {
            m.g(str);
        }
        this.f279a = z9;
        this.f280b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f279a == bVar.f279a && m.k(this.f280b, bVar.f280b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f279a), this.f280b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f279a ? 1 : 0);
        wb.l(parcel, 2, this.f280b);
        wb.s(parcel, r10);
    }
}
