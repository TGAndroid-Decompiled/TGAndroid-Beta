package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class e1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new m(2);
    public static final String d;
    public static final String e;
    public static final String f2978f;
    public final int f2979a;
    public final int f2980b;
    public final int f2981c;

    static {
        String str = e2.d0.f7885a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f2978f = Integer.toString(2, 36);
    }

    public e1(int i10, int i11, int i12) {
        this.f2979a = i10;
        this.f2980b = i11;
        this.f2981c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int i10 = this.f2979a - e1Var.f2979a;
        if (i10 == 0) {
            int i11 = this.f2980b - e1Var.f2980b;
            if (i11 == 0) {
                return this.f2981c - e1Var.f2981c;
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
            if (this.f2979a == e1Var.f2979a && this.f2980b == e1Var.f2980b && this.f2981c == e1Var.f2981c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2979a * 31) + this.f2980b) * 31) + this.f2981c;
    }

    public final String toString() {
        return this.f2979a + "." + this.f2980b + "." + this.f2981c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2979a);
        parcel.writeInt(this.f2980b);
        parcel.writeInt(this.f2981c);
    }

    public e1(Parcel parcel) {
        this.f2979a = parcel.readInt();
        this.f2980b = parcel.readInt();
        this.f2981c = parcel.readInt();
    }
}
