package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class i1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<i1> CREATOR = new q(2);
    public static final String d;
    public static final String e;
    public static final String f3787f;
    public final int f3788a;
    public final int f3789b;
    public final int f3790c;

    static {
        String str = e2.m0.f8254a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f3787f = Integer.toString(2, 36);
    }

    public i1(int i10, int i11, int i12) {
        this.f3788a = i10;
        this.f3789b = i11;
        this.f3790c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        i1 i1Var = (i1) obj;
        int i10 = this.f3788a - i1Var.f3788a;
        if (i10 == 0) {
            int i11 = this.f3789b - i1Var.f3789b;
            if (i11 == 0) {
                return this.f3790c - i1Var.f3790c;
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
            if (this.f3788a == i1Var.f3788a && this.f3789b == i1Var.f3789b && this.f3790c == i1Var.f3790c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f3788a * 31) + this.f3789b) * 31) + this.f3790c;
    }

    public final String toString() {
        return this.f3788a + "." + this.f3789b + "." + this.f3790c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3788a);
        parcel.writeInt(this.f3789b);
        parcel.writeInt(this.f3790c);
    }

    public i1(Parcel parcel) {
        this.f3788a = parcel.readInt();
        this.f3789b = parcel.readInt();
        this.f3790c = parcel.readInt();
    }
}
