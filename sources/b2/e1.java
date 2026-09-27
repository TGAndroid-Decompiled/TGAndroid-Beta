package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class e1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new m(2);
    public static final String d;
    public static final String e;
    public static final String f2975f;
    public final int f2976a;
    public final int f2977b;
    public final int f2978c;

    static {
        String str = e2.d0.f7872a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f2975f = Integer.toString(2, 36);
    }

    public e1(int i10, int i11, int i12) {
        this.f2976a = i10;
        this.f2977b = i11;
        this.f2978c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int i10 = this.f2976a - e1Var.f2976a;
        if (i10 == 0) {
            int i11 = this.f2977b - e1Var.f2977b;
            if (i11 == 0) {
                return this.f2978c - e1Var.f2978c;
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
            if (this.f2976a == e1Var.f2976a && this.f2977b == e1Var.f2977b && this.f2978c == e1Var.f2978c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2976a * 31) + this.f2977b) * 31) + this.f2978c;
    }

    public final String toString() {
        return this.f2976a + "." + this.f2977b + "." + this.f2978c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2976a);
        parcel.writeInt(this.f2977b);
        parcel.writeInt(this.f2978c);
    }

    public e1(Parcel parcel) {
        this.f2976a = parcel.readInt();
        this.f2977b = parcel.readInt();
        this.f2978c = parcel.readInt();
    }
}
