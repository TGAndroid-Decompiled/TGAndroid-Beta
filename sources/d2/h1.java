package d2;

import android.os.Parcel;
import android.os.Parcelable;
public final class h1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<h1> CREATOR = new q(2);
    public static final String d;
    public static final String f8125e;
    public static final String f8126f;
    public final int f8127a;
    public final int f8128b;
    public final int f8129c;

    static {
        String str = g2.n0.f11873a;
        d = Integer.toString(0, 36);
        f8125e = Integer.toString(1, 36);
        f8126f = Integer.toString(2, 36);
    }

    public h1(int i3, int i10, int i11) {
        this.f8127a = i3;
        this.f8128b = i10;
        this.f8129c = i11;
    }

    @Override
    public final int compareTo(Object obj) {
        h1 h1Var = (h1) obj;
        int i3 = this.f8127a - h1Var.f8127a;
        if (i3 == 0) {
            int i10 = this.f8128b - h1Var.f8128b;
            if (i10 == 0) {
                return this.f8129c - h1Var.f8129c;
            }
            return i10;
        }
        return i3;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class == obj.getClass()) {
            h1 h1Var = (h1) obj;
            if (this.f8127a == h1Var.f8127a && this.f8128b == h1Var.f8128b && this.f8129c == h1Var.f8129c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f8127a * 31) + this.f8128b) * 31) + this.f8129c;
    }

    public final String toString() {
        return this.f8127a + "." + this.f8128b + "." + this.f8129c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f8127a);
        parcel.writeInt(this.f8128b);
        parcel.writeInt(this.f8129c);
    }

    public h1(Parcel parcel) {
        this.f8127a = parcel.readInt();
        this.f8128b = parcel.readInt();
        this.f8129c = parcel.readInt();
    }
}
