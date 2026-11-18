package e2;

import android.os.Parcel;
import android.os.Parcelable;
public final class f1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<f1> CREATOR = new p(2);
    public static final String d;
    public static final String f10399e;
    public static final String f10400f;
    public final int f10401a;
    public final int f10402b;
    public final int f10403c;

    static {
        String str = h2.l0.f13786a;
        d = Integer.toString(0, 36);
        f10399e = Integer.toString(1, 36);
        f10400f = Integer.toString(2, 36);
    }

    public f1(int i7, int i10, int i11) {
        this.f10401a = i7;
        this.f10402b = i10;
        this.f10403c = i11;
    }

    @Override
    public final int compareTo(Object obj) {
        f1 f1Var = (f1) obj;
        int i7 = this.f10401a - f1Var.f10401a;
        if (i7 == 0) {
            int i10 = this.f10402b - f1Var.f10402b;
            if (i10 == 0) {
                return this.f10403c - f1Var.f10403c;
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
            if (this.f10401a == f1Var.f10401a && this.f10402b == f1Var.f10402b && this.f10403c == f1Var.f10403c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f10401a * 31) + this.f10402b) * 31) + this.f10403c;
    }

    public final String toString() {
        return this.f10401a + "." + this.f10402b + "." + this.f10403c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10401a);
        parcel.writeInt(this.f10402b);
        parcel.writeInt(this.f10403c);
    }

    public f1(Parcel parcel) {
        this.f10401a = parcel.readInt();
        this.f10402b = parcel.readInt();
        this.f10403c = parcel.readInt();
    }
}
