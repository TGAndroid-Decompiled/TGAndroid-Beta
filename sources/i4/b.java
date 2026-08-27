package i4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.h;

public final class b implements Comparable, Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new h(15);

    public final int f10563a;

    public final int f10564b;

    public final int f10565c;

    public b() {
        this.f10563a = -1;
        this.f10564b = -1;
        this.f10565c = -1;
    }

    @Override
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int i10 = this.f10563a - bVar.f10563a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f10564b - bVar.f10564b;
        return i11 == 0 ? this.f10565c - bVar.f10565c : i11;
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
            if (this.f10563a == bVar.f10563a && this.f10564b == bVar.f10564b && this.f10565c == bVar.f10565c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f10563a * 31) + this.f10564b) * 31) + this.f10565c;
    }

    public final String toString() {
        return this.f10563a + "." + this.f10564b + "." + this.f10565c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10563a);
        parcel.writeInt(this.f10564b);
        parcel.writeInt(this.f10565c);
    }

    public b(Parcel parcel) {
        this.f10563a = parcel.readInt();
        this.f10564b = parcel.readInt();
        this.f10565c = parcel.readInt();
    }
}
