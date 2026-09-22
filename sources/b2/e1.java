package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class e1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new m(2);
    public static final String d;
    public static final String e;
    public static final String f2980f;
    public final int f2981a;
    public final int f2982b;
    public final int f2983c;

    static {
        String str = e2.d0.f7887a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f2980f = Integer.toString(2, 36);
    }

    public e1(int i10, int i11, int i12) {
        this.f2981a = i10;
        this.f2982b = i11;
        this.f2983c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int i10 = this.f2981a - e1Var.f2981a;
        if (i10 == 0) {
            int i11 = this.f2982b - e1Var.f2982b;
            if (i11 == 0) {
                return this.f2983c - e1Var.f2983c;
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
            if (this.f2981a == e1Var.f2981a && this.f2982b == e1Var.f2982b && this.f2983c == e1Var.f2983c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2981a * 31) + this.f2982b) * 31) + this.f2983c;
    }

    public final String toString() {
        return this.f2981a + "." + this.f2982b + "." + this.f2983c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2981a);
        parcel.writeInt(this.f2982b);
        parcel.writeInt(this.f2983c);
    }

    public e1(Parcel parcel) {
        this.f2981a = parcel.readInt();
        this.f2982b = parcel.readInt();
        this.f2983c = parcel.readInt();
    }
}
