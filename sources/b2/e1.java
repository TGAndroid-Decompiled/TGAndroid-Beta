package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class e1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new m(2);
    public static final String d;
    public static final String e;
    public static final String f2981f;
    public final int f2982a;
    public final int f2983b;
    public final int f2984c;

    static {
        String str = e2.d0.f7888a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f2981f = Integer.toString(2, 36);
    }

    public e1(int i10, int i11, int i12) {
        this.f2982a = i10;
        this.f2983b = i11;
        this.f2984c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int i10 = this.f2982a - e1Var.f2982a;
        if (i10 == 0) {
            int i11 = this.f2983b - e1Var.f2983b;
            if (i11 == 0) {
                return this.f2984c - e1Var.f2984c;
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
            if (this.f2982a == e1Var.f2982a && this.f2983b == e1Var.f2983b && this.f2984c == e1Var.f2984c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2982a * 31) + this.f2983b) * 31) + this.f2984c;
    }

    public final String toString() {
        return this.f2982a + "." + this.f2983b + "." + this.f2984c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2982a);
        parcel.writeInt(this.f2983b);
        parcel.writeInt(this.f2984c);
    }

    public e1(Parcel parcel) {
        this.f2982a = parcel.readInt();
        this.f2983b = parcel.readInt();
        this.f2984c = parcel.readInt();
    }
}
