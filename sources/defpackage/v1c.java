package defpackage;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class v1c extends yo {
    public final d2c c;

    public v1c(d2c d2cVar) {
        this.c = d2cVar;
    }

    @Override
    public final int i(int i) {
        d2c d2cVar = this.c;
        w39 adapter = d2cVar.n.getAdapter();
        c2c c2cVar = d2cVar.s;
        if (adapter == c2cVar) {
            if ((c2cVar.d.get(i) instanceof Integer) || i >= c2cVar.x) {
                return c2cVar.w;
            }
            return 1;
        }
        c1b c1bVar = d2cVar.w;
        SparseArray sparseArray = c1bVar.s;
        if (i != c1bVar.E && (sparseArray.get(i) == null || (sparseArray.get(i) instanceof TLRPC.Document))) {
            return 1;
        }
        return c1bVar.e.a();
    }
}
