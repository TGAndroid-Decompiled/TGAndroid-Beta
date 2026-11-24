package defpackage;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class v3c extends yp {
    public final d4c c;

    public v3c(d4c d4cVar) {
        this.c = d4cVar;
    }

    @Override
    public final int i(int i) {
        d4c d4cVar = this.c;
        y59 adapter = d4cVar.n.getAdapter();
        c4c c4cVar = d4cVar.s;
        if (adapter == c4cVar) {
            if ((c4cVar.d.get(i) instanceof Integer) || i >= c4cVar.x) {
                return c4cVar.w;
            }
            return 1;
        }
        e3b e3bVar = d4cVar.w;
        SparseArray sparseArray = e3bVar.s;
        if (i != e3bVar.E && (sparseArray.get(i) == null || (sparseArray.get(i) instanceof TLRPC.Document))) {
            return 1;
        }
        return e3bVar.e.a();
    }
}
