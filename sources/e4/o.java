package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;

public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new c8.o(24);

    public final String f5220b;

    public final String f5221c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f5220b = str2;
        this.f5221c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f5209a.equals(oVar.f5209a) && g0.a(this.f5220b, oVar.f5220b) && g0.a(this.f5221c, oVar.f5221c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG = i0.a.g(527, 31, this.f5209a);
        String str = this.f5220b;
        int iHashCode = (iG + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5221c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override
    public final String toString() {
        return this.f5209a + ": url=" + this.f5221c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5209a);
        parcel.writeString(this.f5220b);
        parcel.writeString(this.f5221c);
    }

    public o(Parcel parcel) {
        String string = parcel.readString();
        int i10 = g0.f4795a;
        super(string);
        this.f5220b = parcel.readString();
        this.f5221c = parcel.readString();
    }
}
