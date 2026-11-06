package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class k0 extends r6.a {
    public static final Parcelable.Creator<k0> CREATOR = new c(27);
    public final int f3067a;
    public final String f3068b;
    public final byte[] f3069c;
    public final String d;

    public k0(int i7, String str, String str2, byte[] bArr) {
        this.f3067a = i7;
        this.f3068b = str;
        this.f3069c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f3069c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f3067a);
        sb2.append(",");
        sb2.append(this.f3068b);
        sb2.append(", size=");
        return a8.p0.s(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3067a);
        wb.l(parcel, 3, this.f3068b);
        wb.c(parcel, 4, this.f3069c);
        wb.l(parcel, 5, this.d);
        wb.s(parcel, r10);
    }
}
