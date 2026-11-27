package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class scb implements Comparable, Parcelable {
    public static final Parcelable.Creator<scb> CREATOR = new mx6((byte) 20);
    public static final String d;
    public static final String e;
    public static final String f;
    public final int a;
    public final int b;
    public final int c;

    static {
        String str = gcc.a;
        d = "0";
        e = "1";
        f = "2";
    }

    public scb(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override
    public final int compareTo(Object obj) {
        scb scbVar = (scb) obj;
        int i = this.a - scbVar.a;
        if (i == 0 && (i = this.b - scbVar.b) == 0) {
            return this.c - scbVar.c;
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
        if (obj != null && scb.class == obj.getClass()) {
            scb scbVar = (scb) obj;
            if (this.a == scbVar.a && this.b == scbVar.b && this.c == scbVar.c) {
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

    public scb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
