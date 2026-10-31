package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class i1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<i1> CREATOR = new r(2);
    public static final String d;
    public static final String e;
    public static final String f2067f;
    public final int f2068a;
    public final int f2069b;
    public final int f2070c;

    static {
        String str = e2.l0.f6165a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f2067f = Integer.toString(2, 36);
    }

    public i1(int i10, int i11, int i12) {
        this.f2068a = i10;
        this.f2069b = i11;
        this.f2070c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        i1 i1Var = (i1) obj;
        int i10 = this.f2068a - i1Var.f2068a;
        if (i10 == 0) {
            int i11 = this.f2069b - i1Var.f2069b;
            if (i11 == 0) {
                return this.f2070c - i1Var.f2070c;
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
            if (this.f2068a == i1Var.f2068a && this.f2069b == i1Var.f2069b && this.f2070c == i1Var.f2070c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2068a * 31) + this.f2069b) * 31) + this.f2070c;
    }

    public final String toString() {
        return this.f2068a + "." + this.f2069b + "." + this.f2070c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2068a);
        parcel.writeInt(this.f2069b);
        parcel.writeInt(this.f2070c);
    }

    public i1(Parcel parcel) {
        this.f2068a = parcel.readInt();
        this.f2069b = parcel.readInt();
        this.f2070c = parcel.readInt();
    }
}
