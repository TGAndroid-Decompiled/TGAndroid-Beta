package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;

public final class e extends j {
    public static final Parcelable.Creator<e> CREATOR = new c8.o(18);

    public final String f5199b;

    public final String f5200c;
    public final String d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f5199b = str;
        this.f5200c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (g0.a(this.f5200c, eVar.f5200c) && g0.a(this.f5199b, eVar.f5199b) && g0.a(this.d, eVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5199b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5200c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override
    public final String toString() {
        return this.f5209a + ": language=" + this.f5199b + ", description=" + this.f5200c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5209a);
        parcel.writeString(this.f5199b);
        parcel.writeString(this.d);
    }

    public e(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i10 = g0.f4795a;
        this.f5199b = string;
        this.f5200c = parcel.readString();
        this.d = parcel.readString();
    }
}
