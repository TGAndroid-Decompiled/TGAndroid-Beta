package n4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j3.g;
import l4.j;
public final class b implements Comparable, Parcelable, g {
    public static final Parcelable.Creator<b> CREATOR = new j(13);
    public static final String d;
    public static final String f15237e;
    public static final String f15238f;
    public final int f15239a;
    public final int f15240b;
    public final int f15241c;

    static {
        int i10 = d0.f7237a;
        d = Integer.toString(0, 36);
        f15237e = Integer.toString(1, 36);
        f15238f = Integer.toString(2, 36);
    }

    public b(int i10, int i11, int i12) {
        this.f15239a = i10;
        this.f15240b = i11;
        this.f15241c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int i10 = this.f15239a - bVar.f15239a;
        if (i10 == 0) {
            int i11 = this.f15240b - bVar.f15240b;
            if (i11 == 0) {
                return this.f15241c - bVar.f15241c;
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
            if (this.f15239a == bVar.f15239a && this.f15240b == bVar.f15240b && this.f15241c == bVar.f15241c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f15239a * 31) + this.f15240b) * 31) + this.f15241c;
    }

    public final String toString() {
        return this.f15239a + "." + this.f15240b + "." + this.f15241c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15239a);
        parcel.writeInt(this.f15240b);
        parcel.writeInt(this.f15241c);
    }

    public b(Parcel parcel) {
        this.f15239a = parcel.readInt();
        this.f15240b = parcel.readInt();
        this.f15241c = parcel.readInt();
    }
}
