package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
public final class srd extends c4 {
    public static final Parcelable.Creator<srd> CREATOR = new hud((byte) 14);
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final srd h;
    public final dwd n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public srd(int i, int i2, String str, String str2, String str3, int i3, List list, srd srdVar) {
        iwd iwdVar;
        iwd iwdVar2;
        dwd dwdVar;
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.e = i3;
        vvd vvdVar = dwd.b;
        if (list instanceof qvd) {
            dwdVar = (dwd) ((qvd) list);
            if (dwdVar.k()) {
                Object[] array = dwdVar.toArray(qvd.a);
                int length = array.length;
                if (length == 0) {
                    iwdVar2 = iwd.e;
                    dwdVar = iwdVar2;
                } else {
                    iwdVar = new iwd(length, array);
                    dwdVar = iwdVar;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i4 = 0; i4 < length2; i4++) {
                if (array2[i4] == null) {
                    p3d.h(uh9.k(i4, "at index "));
                    throw null;
                }
            }
            if (length2 == 0) {
                iwdVar2 = iwd.e;
                dwdVar = iwdVar2;
            } else {
                iwdVar = new iwd(length2, array2);
                dwdVar = iwdVar;
            }
        }
        this.n = dwdVar;
        this.h = srdVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof srd) {
            srd srdVar = (srd) obj;
            if (this.a == srdVar.a && this.b == srdVar.b && this.e == srdVar.e && this.c.equals(srdVar.c) && z5f.a(this.d, srdVar.d) && z5f.a(this.f, srdVar.f) && z5f.a(this.h, srdVar.h) && this.n.equals(srdVar.n)) {
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
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.l(parcel, 3, this.c);
        bye.l(parcel, 4, this.d);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        bye.l(parcel, 6, this.f);
        bye.k(parcel, 7, this.h, i);
        bye.p(parcel, 8, this.n);
        bye.s(parcel, r);
    }
}
