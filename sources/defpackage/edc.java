package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class edc extends b4 {
    public final int a;
    public final int b;
    public final int c;
    public static final ce6 d = new ce6("VideoInfo", null);
    public static final Parcelable.Creator<edc> CREATOR = new urd((byte) 9);

    public edc(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edc)) {
            return false;
        }
        edc edcVar = (edc) obj;
        if (this.b == edcVar.b && this.a == edcVar.a && this.c == edcVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.s(parcel, r);
    }
}
