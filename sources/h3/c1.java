package h3;

import android.net.Uri;
import g7.p7;
import java.util.Arrays;
import java.util.List;

public final class c1 {

    public final Uri f7795a;

    public final List f7796b;

    public final p8.z f7797c;

    public c1(Uri uri, p7 p7Var, List list, p8.z zVar) {
        this.f7795a = uri;
        this.f7796b = list;
        this.f7797c = zVar;
        p8.x xVar = p8.z.f45604b;
        p8.l.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < zVar.size()) {
            ((e1) zVar.get(i10)).getClass();
            e1 e1Var = new e1();
            int i12 = i11 + 1;
            if (objArrCopyOf.length < i12) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, p8.w.d(objArrCopyOf.length, i12));
            }
            objArrCopyOf[i11] = e1Var;
            i10++;
            i11 = i12;
        }
        p8.z.s(i11, objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (!this.f7795a.equals(c1Var.f7795a)) {
            return false;
        }
        int i10 = d5.g0.f4795a;
        return d5.g0.a(null, null) && this.f7796b.equals(c1Var.f7796b) && this.f7797c.equals(c1Var.f7797c);
    }

    public final int hashCode() {
        return (this.f7797c.hashCode() + ((this.f7796b.hashCode() + (this.f7795a.hashCode() * 923521)) * 961)) * 31;
    }
}
