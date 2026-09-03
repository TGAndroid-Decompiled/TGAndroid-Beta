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
    public static final String f14245f;
    public final int f14246a;
    public final int f14247b;
    public final int f14248c;

    static {
        int i10 = d0.f6924a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f14245f = Integer.toString(2, 36);
    }

    public b(int i10, int i11, int i12) {
        this.f14246a = i10;
        this.f14247b = i11;
        this.f14248c = i12;
    }

    @Override
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int i10 = this.f14246a - bVar.f14246a;
        if (i10 == 0) {
            int i11 = this.f14247b - bVar.f14247b;
            if (i11 == 0) {
                return this.f14248c - bVar.f14248c;
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
            if (this.f14246a == bVar.f14246a && this.f14247b == bVar.f14247b && this.f14248c == bVar.f14248c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f14246a * 31) + this.f14247b) * 31) + this.f14248c;
    }

    public final String toString() {
        return this.f14246a + "." + this.f14247b + "." + this.f14248c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14246a);
        parcel.writeInt(this.f14247b);
        parcel.writeInt(this.f14248c);
    }

    public b(Parcel parcel) {
        this.f14246a = parcel.readInt();
        this.f14247b = parcel.readInt();
        this.f14248c = parcel.readInt();
    }
}
