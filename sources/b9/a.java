package b9;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new e(0);
    public int f1894a;
    public final boolean f1895b;
    public final String f1896c;
    public final String d;
    public final byte[] f1897e;
    public final boolean f1898f;

    public a() {
        this.f1894a = 0;
        this.f1895b = true;
        this.f1896c = null;
        this.d = null;
        this.f1897e = null;
        this.f1898f = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb.append(this.f1894a);
        sb.append("' } { uploadable: '");
        sb.append(this.f1895b);
        sb.append("' } ");
        String str = this.f1896c;
        if (str != null) {
            sb.append("{ completionToken: '");
            sb.append(str);
            sb.append("' } ");
        }
        String str2 = this.d;
        if (str2 != null) {
            sb.append("{ accountName: '");
            sb.append(str2);
            sb.append("' } ");
        }
        byte[] bArr = this.f1897e;
        if (bArr != null) {
            sb.append("{ ssbContext: [ ");
            for (byte b10 : bArr) {
                sb.append("0x");
                sb.append(Integer.toHexString(b10));
                sb.append(" ");
            }
            sb.append("] } ");
        }
        sb.append("{ contextOnly: '");
        sb.append(this.f1898f);
        sb.append("' } }");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.f1894a;
        g5.s(parcel, 1, 4);
        parcel.writeInt(i11);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f1895b ? 1 : 0);
        g5.l(parcel, 3, this.f1896c);
        g5.l(parcel, 4, this.d);
        g5.c(parcel, 5, this.f1897e);
        g5.s(parcel, 6, 4);
        parcel.writeInt(this.f1898f ? 1 : 0);
        g5.r(parcel, q10);
    }

    public a(int i10, boolean z4, String str, String str2, byte[] bArr, boolean z10) {
        this.f1894a = i10;
        this.f1895b = z4;
        this.f1896c = str;
        this.d = str2;
        this.f1897e = bArr;
        this.f1898f = z10;
    }
}
