package e2;

import android.os.Parcel;
import android.os.Parcelable;
public final class f1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<f1> CREATOR = new p(2);
    public static final String d;
    public static final String f10425e;
    public static final String f10426f;
    public final int f10427a;
    public final int f10428b;
    public final int f10429c;

    static {
        String str = h2.l0.f13812a;
        d = Integer.toString(0, 36);
        f10425e = Integer.toString(1, 36);
        f10426f = Integer.toString(2, 36);
    }

    public f1(int i7, int i10, int i11) {
        this.f10427a = i7;
        this.f10428b = i10;
        this.f10429c = i11;
    }

    @Override
    public final int compareTo(Object obj) {
        f1 f1Var = (f1) obj;
        int i7 = this.f10427a - f1Var.f10427a;
        if (i7 == 0) {
            int i10 = this.f10428b - f1Var.f10428b;
            if (i10 == 0) {
                return this.f10429c - f1Var.f10429c;
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
            if (this.f10427a == f1Var.f10427a && this.f10428b == f1Var.f10428b && this.f10429c == f1Var.f10429c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f10427a * 31) + this.f10428b) * 31) + this.f10429c;
    }

    public final String toString() {
        return this.f10427a + "." + this.f10428b + "." + this.f10429c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10427a);
        parcel.writeInt(this.f10428b);
        parcel.writeInt(this.f10429c);
    }

    public f1(Parcel parcel) {
        this.f10427a = parcel.readInt();
        this.f10428b = parcel.readInt();
        this.f10429c = parcel.readInt();
    }
}
