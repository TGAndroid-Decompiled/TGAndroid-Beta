package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class l0 extends z5.a implements i8.g {
    public static final Parcelable.Creator<l0> CREATOR = new c(27);

    public final int f12801a;

    public final String f12802b;

    public final byte[] f12803c;
    public final String d;

    public l0(int i10, String str, String str2, byte[] bArr) {
        this.f12801a = i10;
        this.f12802b = str;
        this.f12803c = bArr;
        this.d = str2;
    }

    public final String toString() {
        byte[] bArr = this.f12803c;
        String string = (bArr == null ? "null" : Integer.valueOf(bArr.length)).toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f12801a);
        sb2.append(",");
        sb2.append(this.f12802b);
        sb2.append(", size=");
        return a9.p.p(sb2, string, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12801a);
        r8.l(parcel, 3, this.f12802b);
        r8.c(parcel, 4, this.f12803c);
        r8.l(parcel, 5, this.d);
        r8.r(parcel, iQ);
    }
}
