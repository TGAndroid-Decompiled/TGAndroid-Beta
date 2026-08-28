package h3;

import android.net.Uri;
import f7.u7;
import java.util.Arrays;
import java.util.List;
public final class c1 {
    public final Uri f9362a;
    public final String f9363b;
    public final List f9364c;
    public final String d;
    public final o8.z f9365e;
    public final Object f9366f;

    public c1(Uri uri, String str, u7 u7Var, List list, String str2, o8.z zVar, Object obj) {
        this.f9362a = uri;
        this.f9363b = str;
        this.f9364c = list;
        this.d = str2;
        this.f9365e = zVar;
        o8.x xVar = o8.z.f19105b;
        o8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i9 = 0;
        int i10 = 0;
        while (i9 < zVar.size()) {
            ((e1) zVar.get(i9)).getClass();
            Object obj2 = new Object();
            int i11 = i10 + 1;
            if (objArr.length < i11) {
                objArr = Arrays.copyOf(objArr, o8.w.d(objArr.length, i11));
            }
            objArr[i10] = obj2;
            i9++;
            i10 = i11;
        }
        o8.z.s(i10, objArr);
        this.f9366f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (this.f9362a.equals(c1Var.f9362a) && d5.f0.a(this.f9363b, c1Var.f9363b) && d5.f0.a(null, null) && this.f9364c.equals(c1Var.f9364c) && d5.f0.a(this.d, c1Var.d) && this.f9365e.equals(c1Var.f9365e) && d5.f0.a(this.f9366f, c1Var.f9366f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f9362a.hashCode() * 31;
        int i9 = 0;
        String str = this.f9363b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (this.f9364c.hashCode() + ((hashCode3 + hashCode) * 29791)) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode5 = (this.f9365e.hashCode() + ((hashCode4 + hashCode2) * 31)) * 31;
        Object obj = this.f9366f;
        if (obj != null) {
            i9 = obj.hashCode();
        }
        return hashCode5 + i9;
    }
}
