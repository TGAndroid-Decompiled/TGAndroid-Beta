package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;

public final class k extends j {
    public static final Parcelable.Creator<k> CREATOR = new c8.o(20);

    public final String f5210b;

    public final String f5211c;
    public final String d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f5210b = str;
        this.f5211c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (g0.a(this.f5211c, kVar.f5211c) && g0.a(this.f5210b, kVar.f5210b) && g0.a(this.d, kVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5210b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5211c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override
    public final String toString() {
        return this.f5209a + ": domain=" + this.f5210b + ", description=" + this.f5211c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5209a);
        parcel.writeString(this.f5210b);
        parcel.writeString(this.d);
    }

    public k(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i10 = g0.f4795a;
        this.f5210b = string;
        this.f5211c = parcel.readString();
        this.d = parcel.readString();
    }
}
