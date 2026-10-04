package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class e1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new m(2);
    public static final String d;
    public static final String f3213e;
    public static final String f3214f;
    public final int f3215a;
    public final int f3216b;
    public final int f3217c;

    static {
        String str = e2.d0.f8538a;
        d = Integer.toString(0, 36);
        f3213e = Integer.toString(1, 36);
        f3214f = Integer.toString(2, 36);
    }

    public e1(int i10, int i11, int i12) {
        this.f3215a = i10;
        this.f3216b = i11;
        this.f3217c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int i10 = this.f3215a - e1Var.f3215a;
        if (i10 == 0) {
            int i11 = this.f3216b - e1Var.f3216b;
            if (i11 == 0) {
                return this.f3217c - e1Var.f3217c;
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
            if (this.f3215a == e1Var.f3215a && this.f3216b == e1Var.f3216b && this.f3217c == e1Var.f3217c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f3215a * 31) + this.f3216b) * 31) + this.f3217c;
    }

    public final String toString() {
        return this.f3215a + "." + this.f3216b + "." + this.f3217c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3215a);
        parcel.writeInt(this.f3216b);
        parcel.writeInt(this.f3217c);
    }

    public e1(Parcel parcel) {
        this.f3215a = parcel.readInt();
        this.f3216b = parcel.readInt();
        this.f3217c = parcel.readInt();
    }
}
