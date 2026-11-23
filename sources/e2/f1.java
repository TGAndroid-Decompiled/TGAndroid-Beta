package e2;

import android.os.Parcel;
import android.os.Parcelable;
public final class f1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<f1> CREATOR = new p(2);
    public static final String d;
    public static final String f10391e;
    public static final String f10392f;
    public final int f10393a;
    public final int f10394b;
    public final int f10395c;

    static {
        String str = h2.l0.f13778a;
        d = Integer.toString(0, 36);
        f10391e = Integer.toString(1, 36);
        f10392f = Integer.toString(2, 36);
    }

    public f1(int i7, int i10, int i11) {
        this.f10393a = i7;
        this.f10394b = i10;
        this.f10395c = i11;
    }

    @Override
    public final int compareTo(Object obj) {
        f1 f1Var = (f1) obj;
        int i7 = this.f10393a - f1Var.f10393a;
        if (i7 == 0) {
            int i10 = this.f10394b - f1Var.f10394b;
            if (i10 == 0) {
                return this.f10395c - f1Var.f10395c;
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
            if (this.f10393a == f1Var.f10393a && this.f10394b == f1Var.f10394b && this.f10395c == f1Var.f10395c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f10393a * 31) + this.f10394b) * 31) + this.f10395c;
    }

    public final String toString() {
        return this.f10393a + "." + this.f10394b + "." + this.f10395c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10393a);
        parcel.writeInt(this.f10394b);
        parcel.writeInt(this.f10395c);
    }

    public f1(Parcel parcel) {
        this.f10393a = parcel.readInt();
        this.f10394b = parcel.readInt();
        this.f10395c = parcel.readInt();
    }
}
