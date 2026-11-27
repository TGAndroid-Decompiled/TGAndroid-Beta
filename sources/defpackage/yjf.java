package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class yjf extends c4 {
    public static final Parcelable.Creator<yjf> CREATOR = new nkf((byte) 5);
    public final boolean a;

    public yjf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yjf) && this.a == ((yjf) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.s(parcel, r);
    }
}
