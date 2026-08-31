package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
public final class k extends j {
    public static final Parcelable.Creator<k> CREATOR = new f8.o(18);
    public final String f9530b;
    public final String f9531c;
    public final String d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f9530b = str;
        this.f9531c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (d0.a(this.f9531c, kVar.f9531c) && d0.a(this.f9530b, kVar.f9530b) && d0.a(this.d, kVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f9530b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f9531c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override
    public final String toString() {
        return this.f9529a + ": domain=" + this.f9530b + ", description=" + this.f9531c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9529a);
        parcel.writeString(this.f9530b);
        parcel.writeString(this.d);
    }

    public k(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i10 = d0.f7237a;
        this.f9530b = readString;
        this.f9531c = parcel.readString();
        this.d = parcel.readString();
    }
}
