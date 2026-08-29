package k4;

import android.os.Parcel;
import android.os.Parcelable;
import i4.g;
public final class b implements Comparable, Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new g(20);
    public final int f13446a;
    public final int f13447b;
    public final int f13448c;

    public b() {
        this.f13446a = -1;
        this.f13447b = -1;
        this.f13448c = -1;
    }

    @Override
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int i10 = this.f13446a - bVar.f13446a;
        if (i10 == 0) {
            int i11 = this.f13447b - bVar.f13447b;
            if (i11 == 0) {
                return this.f13448c - bVar.f13448c;
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
            if (this.f13446a == bVar.f13446a && this.f13447b == bVar.f13447b && this.f13448c == bVar.f13448c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f13446a * 31) + this.f13447b) * 31) + this.f13448c;
    }

    public final String toString() {
        return this.f13446a + "." + this.f13447b + "." + this.f13448c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13446a);
        parcel.writeInt(this.f13447b);
        parcel.writeInt(this.f13448c);
    }

    public b(Parcel parcel) {
        this.f13446a = parcel.readInt();
        this.f13447b = parcel.readInt();
        this.f13448c = parcel.readInt();
    }
}
