package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import g7.i0;
import h7.r8;
import java.util.Arrays;
import java.util.List;

public final class k extends z5.a {
    public static final Parcelable.Creator<k> CREATOR = new n(3);

    public final int f2472a;

    public final int f2473b;

    public final String f2474c;
    public final String d;

    public final int f2475e;

    public final String f2476f;
    public final k h;

    public final u f2477n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public k(int i10, int i11, String str, String str2, String str3, int i12, List list, k kVar) {
        v vVar;
        v vVar2;
        u uVar;
        this.f2472a = i10;
        this.f2473b = i11;
        this.f2474c = str;
        this.d = str2;
        this.f2476f = str3;
        this.f2475e = i12;
        s sVar = u.f2496b;
        if (list instanceof r) {
            uVar = (u) ((r) list);
            if (uVar.p()) {
                Object[] array = uVar.toArray(r.f2491a);
                int length = array.length;
                if (length == 0) {
                    vVar2 = v.f2497e;
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
                    throw new NullPointerException(i0.a.k(i13, "at index "));
                }
            }
            if (length2 == 0) {
                vVar2 = v.f2497e;
                uVar = vVar2;
            } else {
                vVar = new v(length2, array2);
                uVar = vVar;
            }
        }
        this.f2477n = uVar;
        this.h = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f2472a == kVar.f2472a && this.f2473b == kVar.f2473b && this.f2475e == kVar.f2475e && this.f2474c.equals(kVar.f2474c) && i0.a(this.d, kVar.d) && i0.a(this.f2476f, kVar.f2476f) && i0.a(this.h, kVar.h) && this.f2477n.equals(kVar.f2477n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2472a), this.f2474c, this.d, this.f2476f});
    }

    public final String toString() {
        String str = this.f2474c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f2472a);
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
        String str3 = this.f2476f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f2472a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f2473b);
        r8.l(parcel, 3, this.f2474c);
        r8.l(parcel, 4, this.d);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.f2475e);
        r8.l(parcel, 6, this.f2476f);
        r8.k(parcel, 7, this.h, i10);
        r8.p(parcel, 8, this.f2477n);
        r8.r(parcel, iQ);
    }
}
