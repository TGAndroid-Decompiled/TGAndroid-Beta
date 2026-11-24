package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class wbc extends b4 {
    public static final Parcelable.Creator<wbc> CREATOR = new hx6((byte) 23);
    public final int a;
    public final String b;
    public final int c;

    public wbc(int i, int i2, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbc)) {
            return false;
        }
        wbc wbcVar = (wbc) obj;
        if (this.a == wbcVar.a && rr5.a(this.b, wbcVar.b) && this.c == wbcVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ts2.j(this.a * 31, 31, this.b) + this.c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.l(parcel, 2, this.b);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        mve.s(parcel, r);
    }
}
