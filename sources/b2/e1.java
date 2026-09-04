package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class e1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new m(2);
    public static final String d;
    public static final String f2019e;
    public static final String f2020f;
    public final int f2021a;
    public final int f2022b;
    public final int f2023c;

    static {
        String str = e2.d0.f8737a;
        d = Integer.toString(0, 36);
        f2019e = Integer.toString(1, 36);
        f2020f = Integer.toString(2, 36);
    }

    public e1(int i10, int i11, int i12) {
        this.f2021a = i10;
        this.f2022b = i11;
        this.f2023c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int i10 = this.f2021a - e1Var.f2021a;
        if (i10 == 0) {
            int i11 = this.f2022b - e1Var.f2022b;
            if (i11 == 0) {
                return this.f2023c - e1Var.f2023c;
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
            if (this.f2021a == e1Var.f2021a && this.f2022b == e1Var.f2022b && this.f2023c == e1Var.f2023c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2021a * 31) + this.f2022b) * 31) + this.f2023c;
    }

    public final String toString() {
        return this.f2021a + "." + this.f2022b + "." + this.f2023c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2021a);
        parcel.writeInt(this.f2022b);
        parcel.writeInt(this.f2023c);
    }

    public e1(Parcel parcel) {
        this.f2021a = parcel.readInt();
        this.f2022b = parcel.readInt();
        this.f2023c = parcel.readInt();
    }
}
