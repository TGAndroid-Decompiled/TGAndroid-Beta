package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class ju extends zo {
    public final nu c;

    public ju(nu nuVar) {
        this.c = nuVar;
    }

    @Override
    public final int i(int i) {
        nu nuVar = this.c;
        ArrayList<TL_iv.PageBlock> arrayList = nuVar.s.items;
        return ((j47) nuVar.w.b.get(arrayList.get((arrayList.size() - i) - 1))).i;
    }
}
