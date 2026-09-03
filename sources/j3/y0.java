package j3;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
public final class y0 implements g {
    public static final String B;
    public static final q0 C;
    public static final String f8866r;
    public static final String f8867s;
    public static final String v;
    public static final String f8868w;
    public static final String f8869x;
    public static final String f8870y;
    public final Uri f8871a;
    public final String f8872b;
    public final w0 f8873c;
    public final r0 d;
    public final List e;
    public final String f8874f;
    public final s8.v h;
    public final Object f8875n;

    static {
        int i10 = h5.d0.f6924a;
        f8866r = Integer.toString(0, 36);
        f8867s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f8868w = Integer.toString(3, 36);
        f8869x = Integer.toString(4, 36);
        f8870y = Integer.toString(5, 36);
        B = Integer.toString(6, 36);
        C = new q0(4);
    }

    public y0(Uri uri, String str, w0 w0Var, r0 r0Var, List list, String str2, s8.v vVar, Object obj) {
        this.f8871a = uri;
        this.f8872b = str;
        this.f8873c = w0Var;
        this.d = r0Var;
        this.e = list;
        this.f8874f = str2;
        this.h = vVar;
        s8.t tVar = s8.v.f44222b;
        s8.l.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        boolean z4 = false;
        while (i10 < vVar.size()) {
            b1 b1Var = (b1) vVar.get(i10);
            ?? obj2 = new Object();
            obj2.d = b1Var.f8417a;
            obj2.f2166a = b1Var.f8418b;
            obj2.e = b1Var.f8419c;
            obj2.f2167b = b1Var.d;
            obj2.f2168c = b1Var.e;
            obj2.f2169f = b1Var.f8420f;
            obj2.f2170g = b1Var.h;
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
        this.f8875n = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f8871a.equals(y0Var.f8871a) && h5.d0.a(this.f8872b, y0Var.f8872b) && h5.d0.a(this.f8873c, y0Var.f8873c) && h5.d0.a(this.d, y0Var.d) && this.e.equals(y0Var.e) && h5.d0.a(this.f8874f, y0Var.f8874f) && this.h.equals(y0Var.h) && h5.d0.a(this.f8875n, y0Var.f8875n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.f8871a.hashCode() * 31;
        int i10 = 0;
        String str = this.f8872b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 + hashCode) * 31;
        w0 w0Var = this.f8873c;
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
        String str2 = this.f8874f;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int hashCode7 = (this.h.hashCode() + ((hashCode6 + hashCode4) * 31)) * 31;
        Object obj = this.f8875n;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode7 + i10;
    }
}
