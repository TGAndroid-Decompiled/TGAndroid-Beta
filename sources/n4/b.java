package n4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j3.g;
import l4.j;
public final class b implements Comparable, Parcelable, g {
    public static final Parcelable.Creator<b> CREATOR = new j(13);
    public static final String d;
    public static final String f15239e;
    public static final String f15240f;
    public final int f15241a;
    public final int f15242b;
    public final int f15243c;

    static {
        int i10 = d0.f7237a;
        d = Integer.toString(0, 36);
        f15239e = Integer.toString(1, 36);
        f15240f = Integer.toString(2, 36);
    }

    public b(int i10, int i11, int i12) {
        this.f15241a = i10;
        this.f15242b = i11;
        this.f15243c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int i10 = this.f15241a - bVar.f15241a;
        if (i10 == 0) {
            int i11 = this.f15242b - bVar.f15242b;
            if (i11 == 0) {
                return this.f15243c - bVar.f15243c;
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f15241a == bVar.f15241a && this.f15242b == bVar.f15242b && this.f15243c == bVar.f15243c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f15241a * 31) + this.f15242b) * 31) + this.f15243c;
    }

    public final String toString() {
        return this.f15241a + "." + this.f15242b + "." + this.f15243c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15241a);
        parcel.writeInt(this.f15242b);
        parcel.writeInt(this.f15243c);
    }

    public b(Parcel parcel) {
        this.f15241a = parcel.readInt();
        this.f15242b = parcel.readInt();
        this.f15243c = parcel.readInt();
    }
}
