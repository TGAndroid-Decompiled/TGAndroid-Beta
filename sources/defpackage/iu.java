package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class iu extends v55 {
    public final nu S;

    public iu(nu nuVar) {
        super(true);
        this.S = nuVar;
    }

    @Override
    public final boolean x0() {
        return false;
    }

    @Override
    public final boolean z1(int i) {
        byte b;
        nu nuVar = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = nuVar.s.items;
        mu muVar = nuVar.w;
        j47 j47Var = (j47) muVar.b.get(arrayList.get((arrayList.size() - i) - 1));
        if (j47Var.a != j47Var.b && (b = j47Var.c) == j47Var.d && b != 0) {
            int size = muVar.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                j47 j47Var2 = (j47) muVar.a.get(i2);
                if (j47Var2 != j47Var) {
                    byte b2 = j47Var2.c;
                    byte b3 = j47Var.c;
                    if (b2 <= b3 && j47Var2.d >= b3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
