package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class hv extends r55 {
    public final mv S;

    public hv(mv mvVar) {
        super(true);
        this.S = mvVar;
    }

    @Override
    public final boolean x0() {
        return false;
    }

    @Override
    public final boolean z1(int i) {
        byte b;
        mv mvVar = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = mvVar.s.items;
        lv lvVar = mvVar.w;
        c47 c47Var = (c47) lvVar.b.get(arrayList.get((arrayList.size() - i) - 1));
        if (c47Var.a != c47Var.b && (b = c47Var.c) == c47Var.d && b != 0) {
            int size = lvVar.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                c47 c47Var2 = (c47) lvVar.a.get(i2);
                if (c47Var2 != c47Var) {
                    byte b2 = c47Var2.c;
                    byte b3 = c47Var.c;
                    if (b2 <= b3 && c47Var2.d >= b3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
