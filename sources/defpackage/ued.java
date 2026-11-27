package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class ued extends c4 {
    public static final Parcelable.Creator<ued> CREATOR = new ced((byte) 6);
    public final fed a;
    public final fed b;

    public ued(fed fedVar, fed fedVar2) {
        this.a = fedVar;
        this.b = fedVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ued)) {
            return false;
        }
        ued uedVar = (ued) obj;
        if (qd1.d(this.a, uedVar.a) && qd1.d(this.b, uedVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        bye.k(parcel, 3, this.b, i);
        bye.s(parcel, r);
    }
}
