package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class bfc extends c4 {
    public final int a;
    public final int b;
    public final int c;
    public static final he6 d = new he6("VideoInfo", null);
    public static final Parcelable.Creator<bfc> CREATOR = new hud((byte) 9);

    public bfc(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfc)) {
            return false;
        }
        bfc bfcVar = (bfc) obj;
        if (this.b == bfcVar.b && this.a == bfcVar.a && this.c == bfcVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bye.s(parcel, r);
    }
}
