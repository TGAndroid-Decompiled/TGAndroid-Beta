package e2;

import android.os.Parcel;
import android.os.Parcelable;
public final class f1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<f1> CREATOR = new p(2);
    public static final String d;
    public static final String f10245e;
    public static final String f10246f;
    public final int f10247a;
    public final int f10248b;
    public final int f10249c;

    static {
        String str = h2.m0.f14112a;
        d = Integer.toString(0, 36);
        f10245e = Integer.toString(1, 36);
        f10246f = Integer.toString(2, 36);
    }

    public f1(int i7, int i10, int i11) {
        this.f10247a = i7;
        this.f10248b = i10;
        this.f10249c = i11;
    }

    @Override
    public final int compareTo(Object obj) {
        f1 f1Var = (f1) obj;
        int i7 = this.f10247a - f1Var.f10247a;
        if (i7 == 0) {
            int i10 = this.f10248b - f1Var.f10248b;
            if (i10 == 0) {
                return this.f10249c - f1Var.f10249c;
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
            if (this.f10247a == f1Var.f10247a && this.f10248b == f1Var.f10248b && this.f10249c == f1Var.f10249c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f10247a * 31) + this.f10248b) * 31) + this.f10249c;
    }

    public final String toString() {
        return this.f10247a + "." + this.f10248b + "." + this.f10249c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10247a);
        parcel.writeInt(this.f10248b);
        parcel.writeInt(this.f10249c);
    }

    public f1(Parcel parcel) {
        this.f10247a = parcel.readInt();
        this.f10248b = parcel.readInt();
        this.f10249c = parcel.readInt();
    }
}
