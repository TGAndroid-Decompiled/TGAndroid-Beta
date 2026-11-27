package defpackage;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class u5c extends zo {
    public final d6c c;

    public u5c(d6c d6cVar) {
        this.c = d6cVar;
    }

    @Override
    public final int i(int i) {
        d6c d6cVar = this.c;
        j79 adapter = d6cVar.n.getAdapter();
        c6c c6cVar = d6cVar.s;
        if (adapter == c6cVar) {
            if ((c6cVar.d.get(i) instanceof Integer) || i >= c6cVar.x) {
                return c6cVar.w;
            }
            return 1;
        }
        z4b z4bVar = d6cVar.w;
        SparseArray sparseArray = z4bVar.s;
        if (i != z4bVar.E && (sparseArray.get(i) == null || (sparseArray.get(i) instanceof TLRPC.Document))) {
            return 1;
        }
        return z4bVar.e.a();
    }
}
