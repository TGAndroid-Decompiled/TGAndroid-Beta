package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class e1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new m(2);
    public static final String d;
    public static final String e;
    public static final String f2973f;
    public final int f2974a;
    public final int f2975b;
    public final int f2976c;

    static {
        String str = e2.d0.f7871a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f2973f = Integer.toString(2, 36);
    }

    public e1(int i10, int i11, int i12) {
        this.f2974a = i10;
        this.f2975b = i11;
        this.f2976c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int i10 = this.f2974a - e1Var.f2974a;
        if (i10 == 0) {
            int i11 = this.f2975b - e1Var.f2975b;
            if (i11 == 0) {
                return this.f2976c - e1Var.f2976c;
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
            if (this.f2974a == e1Var.f2974a && this.f2975b == e1Var.f2975b && this.f2976c == e1Var.f2976c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2974a * 31) + this.f2975b) * 31) + this.f2976c;
    }

    public final String toString() {
        return this.f2974a + "." + this.f2975b + "." + this.f2976c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2974a);
        parcel.writeInt(this.f2975b);
        parcel.writeInt(this.f2976c);
    }

    public e1(Parcel parcel) {
        this.f2974a = parcel.readInt();
        this.f2975b = parcel.readInt();
        this.f2976c = parcel.readInt();
    }
}
