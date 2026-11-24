package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
public final class epd extends b4 {
    public static final Parcelable.Creator<epd> CREATOR = new urd((byte) 14);
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final epd h;
    public final qtd n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public epd(int i, int i2, String str, String str2, String str3, int i3, List list, epd epdVar) {
        vtd vtdVar;
        vtd vtdVar2;
        qtd qtdVar;
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.e = i3;
        itd itdVar = qtd.b;
        if (list instanceof dtd) {
            qtdVar = (qtd) ((dtd) list);
            if (qtdVar.k()) {
                Object[] array = qtdVar.toArray(dtd.a);
                int length = array.length;
                if (length == 0) {
                    vtdVar2 = vtd.e;
                    qtdVar = vtdVar2;
                } else {
                    vtdVar = new vtd(length, array);
                    qtdVar = vtdVar;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i4 = 0; i4 < length2; i4++) {
                if (array2[i4] == null) {
                    gxc.d(hg9.j(i4, "at index "));
                    throw null;
                }
            }
            if (length2 == 0) {
                vtdVar2 = vtd.e;
                qtdVar = vtdVar2;
            } else {
                vtdVar = new vtd(length2, array2);
                qtdVar = vtdVar;
            }
        }
        this.n = qtdVar;
        this.h = epdVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof epd) {
            epd epdVar = (epd) obj;
            if (this.a == epdVar.a && this.b == epdVar.b && this.e == epdVar.e && this.c.equals(epdVar.c) && j3f.a(this.d, epdVar.d) && j3f.a(this.f, epdVar.f) && j3f.a(this.h, epdVar.h) && this.n.equals(epdVar.n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c, this.d, this.f});
    }

    public final String toString() {
        String str = this.c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.a);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (str2.startsWith(str)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.f;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.l(parcel, 3, this.c);
        mve.l(parcel, 4, this.d);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        mve.l(parcel, 6, this.f);
        mve.k(parcel, 7, this.h, i);
        mve.p(parcel, 8, this.n);
        mve.s(parcel, r);
    }
}
