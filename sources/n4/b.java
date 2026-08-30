package n4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j3.g;
import l4.j;
public final class b implements Comparable, Parcelable, g {
    public static final Parcelable.Creator<b> CREATOR = new j(13);
    public static final String d;
    public static final String e;
    public static final String f14260f;
    public final int f14261a;
    public final int f14262b;
    public final int f14263c;

    static {
        int i10 = d0.f6937a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f14260f = Integer.toString(2, 36);
    }

    public b(int i10, int i11, int i12) {
        this.f14261a = i10;
        this.f14262b = i11;
        this.f14263c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int i10 = this.f14261a - bVar.f14261a;
        if (i10 == 0) {
            int i11 = this.f14262b - bVar.f14262b;
            if (i11 == 0) {
                return this.f14263c - bVar.f14263c;
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
            if (this.f14261a == bVar.f14261a && this.f14262b == bVar.f14262b && this.f14263c == bVar.f14263c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f14261a * 31) + this.f14262b) * 31) + this.f14263c;
    }

    public final String toString() {
        return this.f14261a + "." + this.f14262b + "." + this.f14263c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14261a);
        parcel.writeInt(this.f14262b);
        parcel.writeInt(this.f14263c);
    }

    public b(Parcel parcel) {
        this.f14261a = parcel.readInt();
        this.f14262b = parcel.readInt();
        this.f14263c = parcel.readInt();
    }
}
