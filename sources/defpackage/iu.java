package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class iu extends yo {
    public final mu c;

    public iu(mu muVar) {
        this.c = muVar;
    }

    @Override
    public final int i(int i) {
        mu muVar = this.c;
        ArrayList<TL_iv.PageBlock> arrayList = muVar.s.items;
        return ((c27) muVar.w.b.get(arrayList.get((arrayList.size() - i) - 1))).i;
    }
}
