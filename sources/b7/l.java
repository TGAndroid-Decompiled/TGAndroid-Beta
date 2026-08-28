package b7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import f7.h0;
import g7.p8;
import j3.r0;
import java.util.Arrays;
import java.util.List;
public final class l extends y5.a {
    public static final Parcelable.Creator<l> CREATOR = new o(3);
    public final int f1566a;
    public final int f1567b;
    public final String f1568c;
    public final String d;
    public final int f1569e;
    public final String f1570f;
    public final l h;
    public final v f1571n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public l(int i9, int i10, String str, String str2, String str3, int i11, List list, l lVar) {
        w wVar;
        w wVar2;
        v vVar;
        this.f1566a = i9;
        this.f1567b = i10;
        this.f1568c = str;
        this.d = str2;
        this.f1570f = str3;
        this.f1569e = i11;
        t tVar = v.f1590b;
        if (list instanceof s) {
            vVar = (v) ((s) list);
            if (vVar.p()) {
                Object[] array = vVar.toArray(s.f1585a);
                int length = array.length;
                if (length == 0) {
                    wVar2 = w.f1591e;
                    vVar = wVar2;
                } else {
                    wVar = new w(length, array);
                    vVar = wVar;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i12 = 0; i12 < length2; i12++) {
                if (array2[i12] == null) {
                    throw new NullPointerException(r0.l(i12, "at index "));
                }
            }
            if (length2 == 0) {
                wVar2 = w.f1591e;
                vVar = wVar2;
            } else {
                wVar = new w(length2, array2);
                vVar = wVar;
            }
        }
        this.f1571n = vVar;
        this.h = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f1566a == lVar.f1566a && this.f1567b == lVar.f1567b && this.f1569e == lVar.f1569e && this.f1568c.equals(lVar.f1568c) && h0.a(this.d, lVar.d) && h0.a(this.f1570f, lVar.f1570f) && h0.a(this.h, lVar.h) && this.f1571n.equals(lVar.f1571n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1566a), this.f1568c, this.d, this.f1570f});
    }

    public final String toString() {
        String str = this.f1568c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f1566a);
        sb2.append("/");
        sb2.append(str);
        if (str2 != null) {
            sb2.append("[");
            if (str2.startsWith(str)) {
                sb2.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        String str3 = this.f1570f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f1566a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f1567b);
        p8.l(parcel, 3, this.f1568c);
        p8.l(parcel, 4, this.d);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.f1569e);
        p8.l(parcel, 6, this.f1570f);
        p8.k(parcel, 7, this.h, i9);
        p8.p(parcel, 8, this.f1571n);
        p8.r(parcel, q10);
    }
}
