package e2;

import android.os.Parcel;
import android.os.Parcelable;
public final class f1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<f1> CREATOR = new p(2);
    public static final String d;
    public static final String f10081e;
    public static final String f10082f;
    public final int f10083a;
    public final int f10084b;
    public final int f10085c;

    static {
        String str = h2.l0.f13471a;
        d = Integer.toString(0, 36);
        f10081e = Integer.toString(1, 36);
        f10082f = Integer.toString(2, 36);
    }

    public f1(int i7, int i10, int i11) {
        this.f10083a = i7;
        this.f10084b = i10;
        this.f10085c = i11;
    }

    @Override
    public final int compareTo(Object obj) {
        f1 f1Var = (f1) obj;
        int i7 = this.f10083a - f1Var.f10083a;
        if (i7 == 0) {
            int i10 = this.f10084b - f1Var.f10084b;
            if (i10 == 0) {
                return this.f10085c - f1Var.f10085c;
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
            if (this.f10083a == f1Var.f10083a && this.f10084b == f1Var.f10084b && this.f10085c == f1Var.f10085c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f10083a * 31) + this.f10084b) * 31) + this.f10085c;
    }

    public final String toString() {
        return this.f10083a + "." + this.f10084b + "." + this.f10085c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10083a);
        parcel.writeInt(this.f10084b);
        parcel.writeInt(this.f10085c);
    }

    public f1(Parcel parcel) {
        this.f10083a = parcel.readInt();
        this.f10084b = parcel.readInt();
        this.f10085c = parcel.readInt();
    }
}
