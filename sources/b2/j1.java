package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class j1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<j1> CREATOR = new r(2);
    public static final String d;
    public static final String e;
    public static final String f2179f;
    public final int f2180a;
    public final int f2181b;
    public final int f2182c;

    static {
        String str = e2.m0.f8375a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f2179f = Integer.toString(2, 36);
    }

    public j1(int i10, int i11, int i12) {
        this.f2180a = i10;
        this.f2181b = i11;
        this.f2182c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        j1 j1Var = (j1) obj;
        int i10 = this.f2180a - j1Var.f2180a;
        if (i10 == 0) {
            int i11 = this.f2181b - j1Var.f2181b;
            if (i11 == 0) {
                return this.f2182c - j1Var.f2182c;
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
            if (this.f2180a == j1Var.f2180a && this.f2181b == j1Var.f2181b && this.f2182c == j1Var.f2182c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2180a * 31) + this.f2181b) * 31) + this.f2182c;
    }

    public final String toString() {
        return this.f2180a + "." + this.f2181b + "." + this.f2182c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2180a);
        parcel.writeInt(this.f2181b);
        parcel.writeInt(this.f2182c);
    }

    public j1(Parcel parcel) {
        this.f2180a = parcel.readInt();
        this.f2181b = parcel.readInt();
        this.f2182c = parcel.readInt();
    }
}
