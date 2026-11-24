package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class yac extends b4 {
    public static final Parcelable.Creator<yac> CREATOR = new lbd((byte) 23);
    public final int a;
    public final short b;
    public final short c;

    public yac(int i, short s, short s2) {
        this.a = i;
        this.b = s;
        this.c = s2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yac)) {
            return false;
        }
        yac yacVar = (yac) obj;
        if (this.a != yacVar.a || this.b != yacVar.b || this.c != yacVar.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Short.valueOf(this.b), Short.valueOf(this.c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        mve.s(parcel, r);
    }
}
