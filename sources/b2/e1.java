package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class e1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new m(2);
    public static final String d;
    public static final String f3292e;
    public static final String f3293f;
    public final int f3294a;
    public final int f3295b;
    public final int f3296c;

    static {
        String str = e2.d0.f8532a;
        d = Integer.toString(0, 36);
        f3292e = Integer.toString(1, 36);
        f3293f = Integer.toString(2, 36);
    }

    public e1(int i10, int i11, int i12) {
        this.f3294a = i10;
        this.f3295b = i11;
        this.f3296c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int i10 = this.f3294a - e1Var.f3294a;
        if (i10 == 0) {
            int i11 = this.f3295b - e1Var.f3295b;
            if (i11 == 0) {
                return this.f3296c - e1Var.f3296c;
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
            if (this.f3294a == e1Var.f3294a && this.f3295b == e1Var.f3295b && this.f3296c == e1Var.f3296c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f3294a * 31) + this.f3295b) * 31) + this.f3296c;
    }

    public final String toString() {
        return this.f3294a + "." + this.f3295b + "." + this.f3296c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3294a);
        parcel.writeInt(this.f3295b);
        parcel.writeInt(this.f3296c);
    }

    public e1(Parcel parcel) {
        this.f3294a = parcel.readInt();
        this.f3295b = parcel.readInt();
        this.f3296c = parcel.readInt();
    }
}
