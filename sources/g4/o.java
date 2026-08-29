package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import j7.l1;
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new d6.d(29);
    public final String f7017b;
    public final String f7018c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f7017b = str2;
        this.f7018c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f7006a.equals(oVar.f7006a) && d0.a(this.f7017b, oVar.f7017b) && d0.a(this.f7018c, oVar.f7018c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f9 = l1.f(527, 31, this.f7006a);
        int i11 = 0;
        String str = this.f7017b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (f9 + i10) * 31;
        String str2 = this.f7018c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f7006a + ": url=" + this.f7018c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7006a);
        parcel.writeString(this.f7017b);
        parcel.writeString(this.f7018c);
    }

    public o(android.os.Parcel r3) {
        throw new UnsupportedOperationException("Method not decompiled: g4.o.<init>(android.os.Parcel):void");
    }
}
