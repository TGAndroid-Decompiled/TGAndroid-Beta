package j3;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
public final class y0 implements g {
    public static final String B;
    public static final q0 C;
    public static final String f9482r;
    public static final String f9483s;
    public static final String v;
    public static final String f9484w;
    public static final String f9485x;
    public static final String f9486y;
    public final Uri f9487a;
    public final String f9488b;
    public final w0 f9489c;
    public final r0 d;
    public final List f9490e;
    public final String f9491f;
    public final s8.v h;
    public final Object f9492n;

    static {
        int i10 = h5.d0.f7237a;
        f9482r = Integer.toString(0, 36);
        f9483s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f9484w = Integer.toString(3, 36);
        f9485x = Integer.toString(4, 36);
        f9486y = Integer.toString(5, 36);
        B = Integer.toString(6, 36);
        C = new q0(4);
    }

    public y0(Uri uri, String str, w0 w0Var, r0 r0Var, List list, String str2, s8.v vVar, Object obj) {
        this.f9487a = uri;
        this.f9488b = str;
        this.f9489c = w0Var;
        this.d = r0Var;
        this.f9490e = list;
        this.f9491f = str2;
        this.h = vVar;
        s8.t tVar = s8.v.f47174b;
        s8.l.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        boolean z4 = false;
        while (i10 < vVar.size()) {
            b1 b1Var = (b1) vVar.get(i10);
            ?? obj2 = new Object();
            obj2.d = b1Var.f8993a;
            obj2.f2330a = b1Var.f8994b;
            obj2.f2333e = b1Var.f8995c;
            obj2.f2331b = b1Var.d;
            obj2.f2332c = b1Var.f8996e;
            obj2.f2334f = b1Var.f8997f;
            obj2.f2335g = b1Var.h;
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
        this.f9492n = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f9487a.equals(y0Var.f9487a) && h5.d0.a(this.f9488b, y0Var.f9488b) && h5.d0.a(this.f9489c, y0Var.f9489c) && h5.d0.a(this.d, y0Var.d) && this.f9490e.equals(y0Var.f9490e) && h5.d0.a(this.f9491f, y0Var.f9491f) && this.h.equals(y0Var.h) && h5.d0.a(this.f9492n, y0Var.f9492n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.f9487a.hashCode() * 31;
        int i10 = 0;
        String str = this.f9488b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 + hashCode) * 31;
        w0 w0Var = this.f9489c;
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
        int hashCode6 = (this.f9490e.hashCode() + ((i12 + hashCode3) * 31)) * 31;
        String str2 = this.f9491f;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int hashCode7 = (this.h.hashCode() + ((hashCode6 + hashCode4) * 31)) * 31;
        Object obj = this.f9492n;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode7 + i10;
    }
}
