package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import j3.r0;
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new c.c(16);
    public final String f4861b;
    public final String f4862c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f4861b = str2;
        this.f4862c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f4850a.equals(oVar.f4850a) && f0.a(this.f4861b, oVar.f4861b) && f0.a(this.f4862c, oVar.f4862c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int f10 = r0.f(527, 31, this.f4850a);
        int i10 = 0;
        String str = this.f4861b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = (f10 + i9) * 31;
        String str2 = this.f4862c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override
    public final String toString() {
        return this.f4850a + ": url=" + this.f4862c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f4850a);
        parcel.writeString(this.f4861b);
        parcel.writeString(this.f4862c);
    }

    public o(android.os.Parcel r3) {
        throw new UnsupportedOperationException("Method not decompiled: e4.o.<init>(android.os.Parcel):void");
    }
}
