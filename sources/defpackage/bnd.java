package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
public final class bnd extends b4 {
    public static final Parcelable.Creator<bnd> CREATOR = new rpd((byte) 14);
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final bnd h;
    public final nrd n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public bnd(int i, int i2, String str, String str2, String str3, int i3, List list, bnd bndVar) {
        srd srdVar;
        srd srdVar2;
        nrd nrdVar;
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.e = i3;
        frd frdVar = nrd.b;
        if (list instanceof ard) {
            nrdVar = (nrd) ((ard) list);
            if (nrdVar.k()) {
                Object[] array = nrdVar.toArray(ard.a);
                int length = array.length;
                if (length == 0) {
                    srdVar2 = srd.e;
                    nrdVar = srdVar2;
                } else {
                    srdVar = new srd(length, array);
                    nrdVar = srdVar;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i4 = 0; i4 < length2; i4++) {
                if (array2[i4] == null) {
                    fvc.f(de9.k(i4, "at index "));
                    throw null;
                }
            }
            if (length2 == 0) {
                srdVar2 = srd.e;
                nrdVar = srdVar2;
            } else {
                srdVar = new srd(length2, array2);
                nrdVar = srdVar;
            }
        }
        this.n = nrdVar;
        this.h = bndVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnd) {
            bnd bndVar = (bnd) obj;
            if (this.a == bndVar.a && this.b == bndVar.b && this.e == bndVar.e && this.c.equals(bndVar.c) && h1f.a(this.d, bndVar.d) && h1f.a(this.f, bndVar.f) && h1f.a(this.h, bndVar.h) && this.n.equals(bndVar.n)) {
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
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.l(parcel, 3, this.c);
        jte.l(parcel, 4, this.d);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        jte.l(parcel, 6, this.f);
        jte.k(parcel, 7, this.h, i);
        jte.p(parcel, 8, this.n);
        jte.s(parcel, r);
    }
}
