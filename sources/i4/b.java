package i4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.h;
public final class b implements Comparable, Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new h(8);
    public final int f10923a;
    public final int f10924b;
    public final int f10925c;

    public b() {
        this.f10923a = -1;
        this.f10924b = -1;
        this.f10925c = -1;
    }

    @Override
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int i9 = this.f10923a - bVar.f10923a;
        if (i9 == 0) {
            int i10 = this.f10924b - bVar.f10924b;
            if (i10 == 0) {
                return this.f10925c - bVar.f10925c;
            }
            return i10;
        }
        return i9;
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
            if (this.f10923a == bVar.f10923a && this.f10924b == bVar.f10924b && this.f10925c == bVar.f10925c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f10923a * 31) + this.f10924b) * 31) + this.f10925c;
    }

    public final String toString() {
        return this.f10923a + "." + this.f10924b + "." + this.f10925c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f10923a);
        parcel.writeInt(this.f10924b);
        parcel.writeInt(this.f10925c);
    }

    public b(Parcel parcel) {
        this.f10923a = parcel.readInt();
        this.f10924b = parcel.readInt();
        this.f10925c = parcel.readInt();
    }
}
