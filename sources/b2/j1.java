package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class j1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<j1> CREATOR = new r(2);
    public static final String d;
    public static final String e;
    public static final String f3242f;
    public final int f3243a;
    public final int f3244b;
    public final int f3245c;

    static {
        String str = e2.n0.f9692a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f3242f = Integer.toString(2, 36);
    }

    public j1(int i10, int i11, int i12) {
        this.f3243a = i10;
        this.f3244b = i11;
        this.f3245c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        j1 j1Var = (j1) obj;
        int i10 = this.f3243a - j1Var.f3243a;
        if (i10 == 0) {
            int i11 = this.f3244b - j1Var.f3244b;
            if (i11 == 0) {
                return this.f3245c - j1Var.f3245c;
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
        if (obj != null && j1.class == obj.getClass()) {
            j1 j1Var = (j1) obj;
            if (this.f3243a == j1Var.f3243a && this.f3244b == j1Var.f3244b && this.f3245c == j1Var.f3245c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f3243a * 31) + this.f3244b) * 31) + this.f3245c;
    }

    public final String toString() {
        return this.f3243a + "." + this.f3244b + "." + this.f3245c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3243a);
        parcel.writeInt(this.f3244b);
        parcel.writeInt(this.f3245c);
    }

    public j1(Parcel parcel) {
        this.f3243a = parcel.readInt();
        this.f3244b = parcel.readInt();
        this.f3245c = parcel.readInt();
    }
}
