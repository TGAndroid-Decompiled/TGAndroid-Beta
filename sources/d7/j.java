package d7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import h7.y6;
import j7.l1;
import java.util.Arrays;
import java.util.List;
public final class j extends a6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(3);
    public final int f5441a;
    public final int f5442b;
    public final String f5443c;
    public final String d;
    public final int f5444e;
    public final String f5445f;
    public final j h;
    public final t f5446n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i10, int i11, String str, String str2, String str3, int i12, List list, j jVar) {
        u uVar;
        u uVar2;
        t tVar;
        this.f5441a = i10;
        this.f5442b = i11;
        this.f5443c = str;
        this.d = str2;
        this.f5445f = str3;
        this.f5444e = i12;
        r rVar = t.f5465b;
        if (list instanceof q) {
            tVar = (t) ((q) list);
            if (tVar.p()) {
                Object[] array = tVar.toArray(q.f5460a);
                int length = array.length;
                if (length == 0) {
                    uVar2 = u.f5466e;
                    tVar = uVar2;
                } else {
                    uVar = new u(length, array);
                    tVar = uVar;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i13 = 0; i13 < length2; i13++) {
                if (array2[i13] == null) {
                    throw new NullPointerException(l1.k(i13, "at index "));
                }
            }
            if (length2 == 0) {
                uVar2 = u.f5466e;
                tVar = uVar2;
            } else {
                uVar = new u(length2, array2);
                tVar = uVar;
            }
        }
        this.f5446n = tVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f5441a == jVar.f5441a && this.f5442b == jVar.f5442b && this.f5444e == jVar.f5444e && this.f5443c.equals(jVar.f5443c) && y6.a(this.d, jVar.d) && y6.a(this.f5445f, jVar.f5445f) && y6.a(this.h, jVar.h) && this.f5446n.equals(jVar.f5446n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5441a), this.f5443c, this.d, this.f5445f});
    }

    public final String toString() {
        String str = this.f5443c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f5441a);
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
        String str3 = this.f5445f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f5441a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f5442b);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f5443c);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.d);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.f5444e);
        com.google.android.gms.internal.cast.o.l(parcel, 6, this.f5445f);
        com.google.android.gms.internal.cast.o.k(parcel, 7, this.h, i10);
        com.google.android.gms.internal.cast.o.p(parcel, 8, this.f5446n);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
