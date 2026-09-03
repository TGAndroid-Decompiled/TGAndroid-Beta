package b9;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new e(0);
    public int f1759a;
    public final boolean f1760b;
    public final String f1761c;
    public final String d;
    public final byte[] e;
    public final boolean f1762f;

    public a() {
        this.f1759a = 0;
        this.f1760b = true;
        this.f1761c = null;
        this.d = null;
        this.e = null;
        this.f1762f = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb.append(this.f1759a);
        sb.append("' } { uploadable: '");
        sb.append(this.f1760b);
        sb.append("' } ");
        String str = this.f1761c;
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
        byte[] bArr = this.e;
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
        sb.append(this.f1762f);
        sb.append("' } }");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f1759a;
        f5.s(parcel, 1, 4);
        parcel.writeInt(i11);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f1760b ? 1 : 0);
        f5.l(parcel, 3, this.f1761c);
        f5.l(parcel, 4, this.d);
        f5.c(parcel, 5, this.e);
        f5.s(parcel, 6, 4);
        parcel.writeInt(this.f1762f ? 1 : 0);
        f5.r(parcel, q10);
    }

    public a(int i10, boolean z4, String str, String str2, byte[] bArr, boolean z10) {
        this.f1759a = i10;
        this.f1760b = z4;
        this.f1761c = str;
        this.d = str2;
        this.e = bArr;
        this.f1762f = z10;
    }
}
