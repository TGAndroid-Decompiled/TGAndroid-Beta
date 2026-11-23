package e2;

import android.os.Parcel;
import android.os.Parcelable;
public final class f1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<f1> CREATOR = new p(2);
    public static final String d;
    public static final String f10428e;
    public static final String f10429f;
    public final int f10430a;
    public final int f10431b;
    public final int f10432c;

    static {
        String str = h2.l0.f13815a;
        d = Integer.toString(0, 36);
        f10428e = Integer.toString(1, 36);
        f10429f = Integer.toString(2, 36);
    }

    public f1(int i7, int i10, int i11) {
        this.f10430a = i7;
        this.f10431b = i10;
        this.f10432c = i11;
    }

    @Override
    public final int compareTo(Object obj) {
        f1 f1Var = (f1) obj;
        int i7 = this.f10430a - f1Var.f10430a;
        if (i7 == 0) {
            int i10 = this.f10431b - f1Var.f10431b;
            if (i10 == 0) {
                return this.f10432c - f1Var.f10432c;
            }
            return i10;
        }
        return i7;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (this.f10430a == f1Var.f10430a && this.f10431b == f1Var.f10431b && this.f10432c == f1Var.f10432c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f10430a * 31) + this.f10431b) * 31) + this.f10432c;
    }

    public final String toString() {
        return this.f10430a + "." + this.f10431b + "." + this.f10432c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10430a);
        parcel.writeInt(this.f10431b);
        parcel.writeInt(this.f10432c);
    }

    public f1(Parcel parcel) {
        this.f10430a = parcel.readInt();
        this.f10431b = parcel.readInt();
        this.f10432c = parcel.readInt();
    }
}
