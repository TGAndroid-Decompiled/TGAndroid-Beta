package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class j1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<j1> CREATOR = new r(2);
    public static final String d;
    public static final String e;
    public static final String f2175f;
    public final int f2176a;
    public final int f2177b;
    public final int f2178c;

    static {
        String str = e2.m0.f8372a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f2175f = Integer.toString(2, 36);
    }

    public j1(int i10, int i11, int i12) {
        this.f2176a = i10;
        this.f2177b = i11;
        this.f2178c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        j1 j1Var = (j1) obj;
        int i10 = this.f2176a - j1Var.f2176a;
        if (i10 == 0) {
            int i11 = this.f2177b - j1Var.f2177b;
            if (i11 == 0) {
                return this.f2178c - j1Var.f2178c;
            }
            return i11;
        }
        return i10;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class == obj.getClass()) {
            j1 j1Var = (j1) obj;
            if (this.f2176a == j1Var.f2176a && this.f2177b == j1Var.f2177b && this.f2178c == j1Var.f2178c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2176a * 31) + this.f2177b) * 31) + this.f2178c;
    }

    public final String toString() {
        return this.f2176a + "." + this.f2177b + "." + this.f2178c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2176a);
        parcel.writeInt(this.f2177b);
        parcel.writeInt(this.f2178c);
    }

    public j1(Parcel parcel) {
        this.f2176a = parcel.readInt();
        this.f2177b = parcel.readInt();
        this.f2178c = parcel.readInt();
    }
}
