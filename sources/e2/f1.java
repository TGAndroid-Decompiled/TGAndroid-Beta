package e2;

import android.os.Parcel;
import android.os.Parcelable;
public final class f1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<f1> CREATOR = new p(2);
    public static final String d;
    public static final String f10389e;
    public static final String f10390f;
    public final int f10391a;
    public final int f10392b;
    public final int f10393c;

    static {
        String str = h2.l0.f13778a;
        d = Integer.toString(0, 36);
        f10389e = Integer.toString(1, 36);
        f10390f = Integer.toString(2, 36);
    }

    public f1(int i7, int i10, int i11) {
        this.f10391a = i7;
        this.f10392b = i10;
        this.f10393c = i11;
    }

    @Override
    public final int compareTo(Object obj) {
        f1 f1Var = (f1) obj;
        int i7 = this.f10391a - f1Var.f10391a;
        if (i7 == 0) {
            int i10 = this.f10392b - f1Var.f10392b;
            if (i10 == 0) {
                return this.f10393c - f1Var.f10393c;
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
            if (this.f10391a == f1Var.f10391a && this.f10392b == f1Var.f10392b && this.f10393c == f1Var.f10393c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f10391a * 31) + this.f10392b) * 31) + this.f10393c;
    }

    public final String toString() {
        return this.f10391a + "." + this.f10392b + "." + this.f10393c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10391a);
        parcel.writeInt(this.f10392b);
        parcel.writeInt(this.f10393c);
    }

    public f1(Parcel parcel) {
        this.f10391a = parcel.readInt();
        this.f10392b = parcel.readInt();
        this.f10393c = parcel.readInt();
    }
}
