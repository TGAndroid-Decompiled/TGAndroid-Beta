package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class vab implements Comparable, Parcelable {
    public static final Parcelable.Creator<vab> CREATOR = new hx6((byte) 20);
    public static final String d;
    public static final String e;
    public static final String f;
    public final int a;
    public final int b;
    public final int c;

    static {
        String str = hac.a;
        d = "0";
        e = "1";
        f = "2";
    }

    public vab(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override
    public final int compareTo(Object obj) {
        vab vabVar = (vab) obj;
        int i = this.a - vabVar.a;
        if (i == 0 && (i = this.b - vabVar.b) == 0) {
            return this.c - vabVar.c;
        }
        return i;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vab.class == obj.getClass()) {
            vab vabVar = (vab) obj;
            if (this.a == vabVar.a && this.b == vabVar.b && this.c == vabVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.a + "." + this.b + "." + this.c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public vab(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
