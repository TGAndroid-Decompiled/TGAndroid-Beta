package j3;

import android.net.Uri;
import h7.n8;
import java.util.Arrays;
import java.util.List;
public final class c1 {
    public final Uri f10401a;
    public final String f10402b;
    public final List f10403c;
    public final String d;
    public final q8.z f10404e;
    public final Object f10405f;

    public c1(Uri uri, String str, n8 n8Var, List list, String str2, q8.z zVar, Object obj) {
        this.f10401a = uri;
        this.f10402b = str;
        this.f10403c = list;
        this.d = str2;
        this.f10404e = zVar;
        q8.x xVar = q8.z.f46511b;
        q8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < zVar.size()) {
            ((e1) zVar.get(i10)).getClass();
            Object obj2 = new Object();
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, q8.w.d(objArr.length, i12));
            }
            objArr[i11] = obj2;
            i10++;
            i11 = i12;
        }
        q8.z.s(i11, objArr);
        this.f10405f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (this.f10401a.equals(c1Var.f10401a) && f5.d0.a(this.f10402b, c1Var.f10402b) && f5.d0.a(null, null) && this.f10403c.equals(c1Var.f10403c) && f5.d0.a(this.d, c1Var.d) && this.f10404e.equals(c1Var.f10404e) && f5.d0.a(this.f10405f, c1Var.f10405f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f10401a.hashCode() * 31;
        int i10 = 0;
        String str = this.f10402b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (this.f10403c.hashCode() + ((hashCode3 + hashCode) * 29791)) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode5 = (this.f10404e.hashCode() + ((hashCode4 + hashCode2) * 31)) * 31;
        Object obj = this.f10405f;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode5 + i10;
    }
}
