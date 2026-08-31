package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import j7.g5;
import j7.l7;
import java.util.Arrays;
import java.util.List;
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new n(3);
    public final int f6133a;
    public final int f6134b;
    public final String f6135c;
    public final String d;
    public final int f6136e;
    public final String f6137f;
    public final k h;
    public final u f6138n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public k(int i10, int i11, String str, String str2, String str3, int i12, List list, k kVar) {
        v vVar;
        v vVar2;
        u uVar;
        this.f6133a = i10;
        this.f6134b = i11;
        this.f6135c = str;
        this.d = str2;
        this.f6137f = str3;
        this.f6136e = i12;
        s sVar = u.f6157b;
        if (list instanceof r) {
            uVar = (u) ((r) list);
            if (uVar.p()) {
                Object[] array = uVar.toArray(r.f6152a);
                int length = array.length;
                if (length == 0) {
                    vVar2 = v.f6158e;
                    uVar = vVar2;
                } else {
                    vVar = new v(length, array);
                    uVar = vVar;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i13 = 0; i13 < length2; i13++) {
                if (array2[i13] == null) {
                    throw new NullPointerException(l.d.j(i13, "at index "));
                }
            }
            if (length2 == 0) {
                vVar2 = v.f6158e;
                uVar = vVar2;
            } else {
                vVar = new v(length2, array2);
                uVar = vVar;
            }
        }
        this.f6138n = uVar;
        this.h = kVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f6133a == kVar.f6133a && this.f6134b == kVar.f6134b && this.f6136e == kVar.f6136e && this.f6135c.equals(kVar.f6135c) && l7.a(this.d, kVar.d) && l7.a(this.f6137f, kVar.f6137f) && l7.a(this.h, kVar.h) && this.f6138n.equals(kVar.f6138n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6133a), this.f6135c, this.d, this.f6137f});
    }

    public final String toString() {
        String str = this.f6135c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.f6133a);
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
        String str3 = this.f6137f;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f6133a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f6134b);
        g5.l(parcel, 3, this.f6135c);
        g5.l(parcel, 4, this.d);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.f6136e);
        g5.l(parcel, 6, this.f6137f);
        g5.k(parcel, 7, this.h, i10);
        g5.p(parcel, 8, this.f6138n);
        g5.r(parcel, q10);
    }
}
