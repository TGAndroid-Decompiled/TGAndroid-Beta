package e2;

import android.os.Parcel;
import android.os.Parcelable;
public final class f1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<f1> CREATOR = new p(2);
    public static final String d;
    public static final String f10396e;
    public static final String f10397f;
    public final int f10398a;
    public final int f10399b;
    public final int f10400c;

    static {
        String str = h2.l0.f13783a;
        d = Integer.toString(0, 36);
        f10396e = Integer.toString(1, 36);
        f10397f = Integer.toString(2, 36);
    }

    public f1(int i7, int i10, int i11) {
        this.f10398a = i7;
        this.f10399b = i10;
        this.f10400c = i11;
    }

    @Override
    public final int compareTo(Object obj) {
        f1 f1Var = (f1) obj;
        int i7 = this.f10398a - f1Var.f10398a;
        if (i7 == 0) {
            int i10 = this.f10399b - f1Var.f10399b;
            if (i10 == 0) {
                return this.f10400c - f1Var.f10400c;
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
            if (this.f10398a == f1Var.f10398a && this.f10399b == f1Var.f10399b && this.f10400c == f1Var.f10400c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f10398a * 31) + this.f10399b) * 31) + this.f10400c;
    }

    public final String toString() {
        return this.f10398a + "." + this.f10399b + "." + this.f10400c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10398a);
        parcel.writeInt(this.f10399b);
        parcel.writeInt(this.f10400c);
    }

    public f1(Parcel parcel) {
        this.f10398a = parcel.readInt();
        this.f10399b = parcel.readInt();
        this.f10400c = parcel.readInt();
    }
}
