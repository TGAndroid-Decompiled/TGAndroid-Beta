package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import kh.a2;
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new f8.o(22);
    public final String f8934b;
    public final String f8935c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f8934b = str2;
        this.f8935c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f8924a.equals(oVar.f8924a) && d0.a(this.f8934b, oVar.f8934b) && d0.a(this.f8935c, oVar.f8935c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int e = a2.e(527, 31, this.f8924a);
        int i11 = 0;
        String str = this.f8934b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (e + i10) * 31;
        String str2 = this.f8935c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f8924a + ": url=" + this.f8935c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8924a);
        parcel.writeString(this.f8934b);
        parcel.writeString(this.f8935c);
    }

    public o(android.os.Parcel r3) {
        throw new UnsupportedOperationException("Method not decompiled: j4.o.<init>(android.os.Parcel):void");
    }
}
