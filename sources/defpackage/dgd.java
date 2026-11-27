package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class dgd extends c4 {
    public static final Parcelable.Creator<dgd> CREATOR = new nkf((byte) 13);
    public int a;
    public final boolean b;
    public final String c;
    public final String d;
    public final byte[] e;
    public final boolean f;

    public dgd() {
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
            ik8.z("{ completionToken: '", str, "' } ", sb);
        }
        String str2 = this.d;
        if (str2 != null) {
            ik8.z("{ accountName: '", str2, "' } ", sb);
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
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 1, 4);
        parcel.writeInt(i2);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        bye.l(parcel, 3, this.c);
        bye.l(parcel, 4, this.d);
        bye.c(parcel, 5, this.e);
        bye.q(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        bye.s(parcel, r);
    }

    public dgd(int i, boolean z, String str, String str2, byte[] bArr, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = bArr;
        this.f = z2;
    }
}
