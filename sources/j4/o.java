package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import kf.k0;
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new f8.o(22);
    public final String f8916b;
    public final String f8917c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f8916b = str2;
        this.f8917c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f8906a.equals(oVar.f8906a) && d0.a(this.f8916b, oVar.f8916b) && d0.a(this.f8917c, oVar.f8917c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int e = k0.e(527, 31, this.f8906a);
        int i11 = 0;
        String str = this.f8916b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (e + i10) * 31;
        String str2 = this.f8917c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f8906a + ": url=" + this.f8917c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8906a);
        parcel.writeString(this.f8916b);
        parcel.writeString(this.f8917c);
    }

    public o(android.os.Parcel r3) {
        throw new UnsupportedOperationException("Method not decompiled: j4.o.<init>(android.os.Parcel):void");
    }
}
