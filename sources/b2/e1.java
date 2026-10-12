package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class e1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new m(2);
    public static final String d;
    public static final String f3290e;
    public static final String f3291f;
    public final int f3292a;
    public final int f3293b;
    public final int f3294c;

    static {
        String str = e2.d0.f8529a;
        d = Integer.toString(0, 36);
        f3290e = Integer.toString(1, 36);
        f3291f = Integer.toString(2, 36);
    }

    public e1(int i10, int i11, int i12) {
        this.f3292a = i10;
        this.f3293b = i11;
        this.f3294c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int i10 = this.f3292a - e1Var.f3292a;
        if (i10 == 0) {
            int i11 = this.f3293b - e1Var.f3293b;
            if (i11 == 0) {
                return this.f3294c - e1Var.f3294c;
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
            if (this.f3292a == e1Var.f3292a && this.f3293b == e1Var.f3293b && this.f3294c == e1Var.f3294c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f3292a * 31) + this.f3293b) * 31) + this.f3294c;
    }

    public final String toString() {
        return this.f3292a + "." + this.f3293b + "." + this.f3294c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3292a);
        parcel.writeInt(this.f3293b);
        parcel.writeInt(this.f3294c);
    }

    public e1(Parcel parcel) {
        this.f3292a = parcel.readInt();
        this.f3293b = parcel.readInt();
        this.f3294c = parcel.readInt();
    }
}
