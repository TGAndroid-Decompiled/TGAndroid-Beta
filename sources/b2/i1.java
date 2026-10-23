package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class i1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<i1> CREATOR = new q(2);
    public static final String d;
    public static final String e;
    public static final String f3791f;
    public final int f3792a;
    public final int f3793b;
    public final int f3794c;

    static {
        String str = e2.m0.f8259a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f3791f = Integer.toString(2, 36);
    }

    public i1(int i10, int i11, int i12) {
        this.f3792a = i10;
        this.f3793b = i11;
        this.f3794c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        i1 i1Var = (i1) obj;
        int i10 = this.f3792a - i1Var.f3792a;
        if (i10 == 0) {
            int i11 = this.f3793b - i1Var.f3793b;
            if (i11 == 0) {
                return this.f3794c - i1Var.f3794c;
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
        if (obj != null && i1.class == obj.getClass()) {
            i1 i1Var = (i1) obj;
            if (this.f3792a == i1Var.f3792a && this.f3793b == i1Var.f3793b && this.f3794c == i1Var.f3794c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f3792a * 31) + this.f3793b) * 31) + this.f3794c;
    }

    public final String toString() {
        return this.f3792a + "." + this.f3793b + "." + this.f3794c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3792a);
        parcel.writeInt(this.f3793b);
        parcel.writeInt(this.f3794c);
    }

    public i1(Parcel parcel) {
        this.f3792a = parcel.readInt();
        this.f3793b = parcel.readInt();
        this.f3794c = parcel.readInt();
    }
}
