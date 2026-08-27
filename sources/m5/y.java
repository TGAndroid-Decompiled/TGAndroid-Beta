package m5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class y extends z5.a {
    public static final Parcelable.Creator<y> CREATOR = new w(3);

    public final x f17865a;

    public final x f17866b;

    public y(x xVar, x xVar2) {
        this.f17865a = xVar;
        this.f17866b = xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return r5.a.d(this.f17865a, yVar.f17865a) && r5.a.d(this.f17866b, yVar.f17866b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17865a, this.f17866b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.f17865a, i10);
        r8.k(parcel, 3, this.f17866b, i10);
        r8.r(parcel, iQ);
    }
}
