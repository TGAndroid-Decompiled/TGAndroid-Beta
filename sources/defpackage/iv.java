package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class iv extends yp {
    public final mv c;

    public iv(mv mvVar) {
        this.c = mvVar;
    }

    @Override
    public final int i(int i) {
        mv mvVar = this.c;
        ArrayList<TL_iv.PageBlock> arrayList = mvVar.s.items;
        return ((c47) mvVar.w.b.get(arrayList.get((arrayList.size() - i) - 1))).i;
    }
}
