package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class e1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new m(2);
    public static final String d;
    public static final String e;
    public static final String f2976f;
    public final int f2977a;
    public final int f2978b;
    public final int f2979c;

    static {
        String str = e2.d0.f7883a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f2976f = Integer.toString(2, 36);
    }

    public e1(int i10, int i11, int i12) {
        this.f2977a = i10;
        this.f2978b = i11;
        this.f2979c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int i10 = this.f2977a - e1Var.f2977a;
        if (i10 == 0) {
            int i11 = this.f2978b - e1Var.f2978b;
            if (i11 == 0) {
                return this.f2979c - e1Var.f2979c;
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
            if (this.f2977a == e1Var.f2977a && this.f2978b == e1Var.f2978b && this.f2979c == e1Var.f2979c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2977a * 31) + this.f2978b) * 31) + this.f2979c;
    }

    public final String toString() {
        return this.f2977a + "." + this.f2978b + "." + this.f2979c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2977a);
        parcel.writeInt(this.f2978b);
        parcel.writeInt(this.f2979c);
    }

    public e1(Parcel parcel) {
        this.f2977a = parcel.readInt();
        this.f2978b = parcel.readInt();
        this.f2979c = parcel.readInt();
    }
}
