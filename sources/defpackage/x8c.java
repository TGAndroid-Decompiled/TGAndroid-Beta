package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class x8c extends b4 {
    public static final Parcelable.Creator<x8c> CREATOR = new j9d((byte) 23);
    public final int a;
    public final short b;
    public final short c;

    public x8c(int i, short s, short s2) {
        this.a = i;
        this.b = s;
        this.c = s2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x8c)) {
            return false;
        }
        x8c x8cVar = (x8c) obj;
        if (this.a != x8cVar.a || this.b != x8cVar.b || this.c != x8cVar.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Short.valueOf(this.b), Short.valueOf(this.c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        jte.s(parcel, r);
    }
}
