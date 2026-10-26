package ae;

import a8.pe;
import ce.r1;
import java.util.Iterator;
public final class j implements zd.b {
    public final int f1243a;
    public final Object f1244b;

    public j(Object obj, int i10) {
        this.f1243a = i10;
        this.f1244b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f1243a) {
            case 0:
                return new b((String) this.f1244b);
            case 1:
                ?? obj = new Object();
                obj.f52852c = pe.a(obj, obj, (r1) this.f1244b);
                return obj;
            default:
                return (Iterator) this.f1244b;
        }
    }
}
