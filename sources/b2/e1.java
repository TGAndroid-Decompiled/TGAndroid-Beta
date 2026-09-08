package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class e1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new m(2);
    public static final String d;
    public static final String f2046e;
    public static final String f2047f;
    public final int f2048a;
    public final int f2049b;
    public final int f2050c;

    static {
        String str = e2.d0.f8765a;
        d = Integer.toString(0, 36);
        f2046e = Integer.toString(1, 36);
        f2047f = Integer.toString(2, 36);
    }

    public e1(int i10, int i11, int i12) {
        this.f2048a = i10;
        this.f2049b = i11;
        this.f2050c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int i10 = this.f2048a - e1Var.f2048a;
        if (i10 == 0) {
            int i11 = this.f2049b - e1Var.f2049b;
            if (i11 == 0) {
                return this.f2050c - e1Var.f2050c;
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
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (this.f2048a == e1Var.f2048a && this.f2049b == e1Var.f2049b && this.f2050c == e1Var.f2050c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2048a * 31) + this.f2049b) * 31) + this.f2050c;
    }

    public final String toString() {
        return this.f2048a + "." + this.f2049b + "." + this.f2050c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2048a);
        parcel.writeInt(this.f2049b);
        parcel.writeInt(this.f2050c);
    }

    public e1(Parcel parcel) {
        this.f2048a = parcel.readInt();
        this.f2049b = parcel.readInt();
        this.f2050c = parcel.readInt();
    }
}
