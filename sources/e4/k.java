package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
public final class k extends j {
    public static final Parcelable.Creator<k> CREATOR = new c.c(12);
    public final String f4851b;
    public final String f4852c;
    public final String d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f4851b = str;
        this.f4852c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (f0.a(this.f4852c, kVar.f4852c) && f0.a(this.f4851b, kVar.f4851b) && f0.a(this.d, kVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11 = 0;
        String str = this.f4851b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (527 + i9) * 31;
        String str2 = this.f4852c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    @Override
    public final String toString() {
        return this.f4850a + ": domain=" + this.f4851b + ", description=" + this.f4852c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f4850a);
        parcel.writeString(this.f4851b);
        parcel.writeString(this.d);
    }

    public k(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i9 = f0.f4349a;
        this.f4851b = readString;
        this.f4852c = parcel.readString();
        this.d = parcel.readString();
    }
}
