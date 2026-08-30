package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import j7.f5;
import j7.k7;
import java.util.Arrays;
import java.util.List;
import kh.a2;
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new n(3);
    public final int f6025a;
    public final int f6026b;
    public final String f6027c;
    public final String d;
    public final int e;
    public final String f6028f;
    public final k h;
    public final u f6029n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public k(int i10, int i11, String str, String str2, String str3, int i12, List list, k kVar) {
        v vVar;
        v vVar2;
        u uVar;
        this.f6025a = i10;
        this.f6026b = i11;
        this.f6027c = str;
        this.d = str2;
        this.f6028f = str3;
        this.e = i12;
        s sVar = u.f6045b;
        if (list instanceof r) {
            uVar = (u) ((r) list);
            if (uVar.p()) {
                Object[] array = uVar.toArray(r.f6041a);
                int length = array.length;
                if (length == 0) {
                    vVar2 = v.e;
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
                    throw new NullPointerException(a2.j(i13, "at index "));
                }
            }
            if (length2 == 0) {
                vVar2 = v.e;
                uVar = vVar2;
            } else {
                vVar = new v(length2, array2);
                uVar = vVar;
            }
        }
        this.f6029n = uVar;
        this.h = kVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f6025a == kVar.f6025a && this.f6026b == kVar.f6026b && this.e == kVar.e && this.f6027c.equals(kVar.f6027c) && k7.a(this.d, kVar.d) && k7.a(this.f6028f, kVar.f6028f) && k7.a(this.h, kVar.h) && this.f6029n.equals(kVar.f6029n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6025a), this.f6027c, this.d, this.f6028f});
    }

    public final String toString() {
        String str = this.f6027c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.f6025a);
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
        String str3 = this.f6028f;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f6025a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f6026b);
        f5.l(parcel, 3, this.f6027c);
        f5.l(parcel, 4, this.d);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f5.l(parcel, 6, this.f6028f);
        f5.k(parcel, 7, this.h, i10);
        f5.p(parcel, 8, this.f6029n);
        f5.r(parcel, q10);
    }
}
