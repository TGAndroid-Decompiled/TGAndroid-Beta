package e2;

import android.os.Parcel;
import android.os.Parcelable;
public final class f1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<f1> CREATOR = new p(2);
    public static final String d;
    public static final String f10250e;
    public static final String f10251f;
    public final int f10252a;
    public final int f10253b;
    public final int f10254c;

    static {
        String str = h2.m0.f14114a;
        d = Integer.toString(0, 36);
        f10250e = Integer.toString(1, 36);
        f10251f = Integer.toString(2, 36);
    }

    public f1(int i7, int i10, int i11) {
        this.f10252a = i7;
        this.f10253b = i10;
        this.f10254c = i11;
    }

    @Override
    public final int compareTo(Object obj) {
        f1 f1Var = (f1) obj;
        int i7 = this.f10252a - f1Var.f10252a;
        if (i7 == 0) {
            int i10 = this.f10253b - f1Var.f10253b;
            if (i10 == 0) {
                return this.f10254c - f1Var.f10254c;
            }
            return i10;
        }
        return i7;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (this.f10252a == f1Var.f10252a && this.f10253b == f1Var.f10253b && this.f10254c == f1Var.f10254c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f10252a * 31) + this.f10253b) * 31) + this.f10254c;
    }

    public final String toString() {
        return this.f10252a + "." + this.f10253b + "." + this.f10254c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10252a);
        parcel.writeInt(this.f10253b);
        parcel.writeInt(this.f10254c);
    }

    public f1(Parcel parcel) {
        this.f10252a = parcel.readInt();
        this.f10253b = parcel.readInt();
        this.f10254c = parcel.readInt();
    }
}
