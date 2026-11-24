package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class kbd extends b4 {
    public static final Parcelable.Creator<kbd> CREATOR = new xff((byte) 13);
    public int a;
    public final boolean b;
    public final String c;
    public final String d;
    public final byte[] e;
    public final boolean f;

    public kbd() {
        this.a = 0;
        this.b = true;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb.append(this.a);
        sb.append("' } { uploadable: '");
        sb.append(this.b);
        sb.append("' } ");
        String str = this.c;
        if (str != null) {
            ug8.z("{ completionToken: '", str, "' } ", sb);
        }
        String str2 = this.d;
        if (str2 != null) {
            ug8.z("{ accountName: '", str2, "' } ", sb);
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            sb.append("{ ssbContext: [ ");
            for (byte b : bArr) {
                sb.append("0x");
                sb.append(Integer.toHexString(b));
                sb.append(" ");
            }
            sb.append("] } ");
        }
        sb.append("{ contextOnly: '");
        sb.append(this.f);
        sb.append("' } }");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 1, 4);
        parcel.writeInt(i2);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        jte.l(parcel, 3, this.c);
        jte.l(parcel, 4, this.d);
        jte.c(parcel, 5, this.e);
        jte.q(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        jte.s(parcel, r);
    }

    public kbd(int i, boolean z, String str, String str2, byte[] bArr, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = bArr;
        this.f = z2;
    }
}
