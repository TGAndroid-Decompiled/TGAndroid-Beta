package j3;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
public final class y0 implements g {
    public static final String B;
    public static final q0 C;
    public static final String f8884r;
    public static final String f8885s;
    public static final String v;
    public static final String f8886w;
    public static final String f8887x;
    public static final String f8888y;
    public final Uri f8889a;
    public final String f8890b;
    public final w0 f8891c;
    public final r0 d;
    public final List e;
    public final String f8892f;
    public final s8.v h;
    public final Object f8893n;

    static {
        int i10 = h5.d0.f6937a;
        f8884r = Integer.toString(0, 36);
        f8885s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f8886w = Integer.toString(3, 36);
        f8887x = Integer.toString(4, 36);
        f8888y = Integer.toString(5, 36);
        B = Integer.toString(6, 36);
        C = new q0(4);
    }

    public y0(Uri uri, String str, w0 w0Var, r0 r0Var, List list, String str2, s8.v vVar, Object obj) {
        this.f8889a = uri;
        this.f8890b = str;
        this.f8891c = w0Var;
        this.d = r0Var;
        this.e = list;
        this.f8892f = str2;
        this.h = vVar;
        s8.t tVar = s8.v.f44157b;
        s8.l.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        boolean z4 = false;
        while (i10 < vVar.size()) {
            b1 b1Var = (b1) vVar.get(i10);
            ?? obj2 = new Object();
            obj2.d = b1Var.f8435a;
            obj2.f2143a = b1Var.f8436b;
            obj2.e = b1Var.f8437c;
            obj2.f2144b = b1Var.d;
            obj2.f2145c = b1Var.e;
            obj2.f2146f = b1Var.f8438f;
            obj2.f2147g = b1Var.h;
            b1 b1Var2 = new b1(obj2);
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.g(objArr.length, i12));
            } else if (z4) {
                objArr = (Object[]) objArr.clone();
            } else {
                objArr[i11] = b1Var2;
                i10++;
                i11++;
            }
            z4 = false;
            objArr[i11] = b1Var2;
            i10++;
            i11++;
        }
        s8.v.s(i11, objArr);
        this.f8893n = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f8889a.equals(y0Var.f8889a) && h5.d0.a(this.f8890b, y0Var.f8890b) && h5.d0.a(this.f8891c, y0Var.f8891c) && h5.d0.a(this.d, y0Var.d) && this.e.equals(y0Var.e) && h5.d0.a(this.f8892f, y0Var.f8892f) && this.h.equals(y0Var.h) && h5.d0.a(this.f8893n, y0Var.f8893n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.f8889a.hashCode() * 31;
        int i10 = 0;
        String str = this.f8890b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 + hashCode) * 31;
        w0 w0Var = this.f8891c;
        if (w0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = w0Var.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        r0 r0Var = this.d;
        if (r0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r0Var.hashCode();
        }
        int hashCode6 = (this.e.hashCode() + ((i12 + hashCode3) * 31)) * 31;
        String str2 = this.f8892f;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int hashCode7 = (this.h.hashCode() + ((hashCode6 + hashCode4) * 31)) * 31;
        Object obj = this.f8893n;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode7 + i10;
    }
}
