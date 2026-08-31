package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new f8.o(22);
    public final String f9540b;
    public final String f9541c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f9540b = str2;
        this.f9541c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f9529a.equals(oVar.f9529a) && d0.a(this.f9540b, oVar.f9540b) && d0.a(this.f9541c, oVar.f9541c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int e6 = l.d.e(527, 31, this.f9529a);
        int i11 = 0;
        String str = this.f9540b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (e6 + i10) * 31;
        String str2 = this.f9541c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f9529a + ": url=" + this.f9541c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9529a);
        parcel.writeString(this.f9540b);
        parcel.writeString(this.f9541c);
    }

    public o(android.os.Parcel r3) {
        throw new UnsupportedOperationException("Method not decompiled: j4.o.<init>(android.os.Parcel):void");
    }
}
