package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class e1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new m(2);
    public static final String d;
    public static final String e;
    public static final String f1674f;
    public final int f1675a;
    public final int f1676b;
    public final int f1677c;

    static {
        String str = e2.d0.f7188a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f1674f = Integer.toString(2, 36);
    }

    public e1(int i10, int i11, int i12) {
        this.f1675a = i10;
        this.f1676b = i11;
        this.f1677c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int i10 = this.f1675a - e1Var.f1675a;
        if (i10 == 0) {
            int i11 = this.f1676b - e1Var.f1676b;
            if (i11 == 0) {
                return this.f1677c - e1Var.f1677c;
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
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (this.f1675a == e1Var.f1675a && this.f1676b == e1Var.f1676b && this.f1677c == e1Var.f1677c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f1675a * 31) + this.f1676b) * 31) + this.f1677c;
    }

    public final String toString() {
        return this.f1675a + "." + this.f1676b + "." + this.f1677c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1675a);
        parcel.writeInt(this.f1676b);
        parcel.writeInt(this.f1677c);
    }

    public e1(Parcel parcel) {
        this.f1675a = parcel.readInt();
        this.f1676b = parcel.readInt();
        this.f1677c = parcel.readInt();
    }
}
