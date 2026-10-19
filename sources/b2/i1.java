package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class i1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<i1> CREATOR = new q(2);
    public static final String d;
    public static final String e;
    public static final String f3784f;
    public final int f3785a;
    public final int f3786b;
    public final int f3787c;

    static {
        String str = e2.m0.f8252a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f3784f = Integer.toString(2, 36);
    }

    public i1(int i10, int i11, int i12) {
        this.f3785a = i10;
        this.f3786b = i11;
        this.f3787c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        i1 i1Var = (i1) obj;
        int i10 = this.f3785a - i1Var.f3785a;
        if (i10 == 0) {
            int i11 = this.f3786b - i1Var.f3786b;
            if (i11 == 0) {
                return this.f3787c - i1Var.f3787c;
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
            if (this.f3785a == i1Var.f3785a && this.f3786b == i1Var.f3786b && this.f3787c == i1Var.f3787c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f3785a * 31) + this.f3786b) * 31) + this.f3787c;
    }

    public final String toString() {
        return this.f3785a + "." + this.f3786b + "." + this.f3787c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3785a);
        parcel.writeInt(this.f3786b);
        parcel.writeInt(this.f3787c);
    }

    public i1(Parcel parcel) {
        this.f3785a = parcel.readInt();
        this.f3786b = parcel.readInt();
        this.f3787c = parcel.readInt();
    }
}
