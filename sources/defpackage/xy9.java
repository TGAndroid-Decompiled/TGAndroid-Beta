package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
public final class xy9 implements p8c {
    public final byte a;
    public final zy9 b;
    public final boolean c;

    public xy9(zy9 zy9Var, boolean z, byte b) {
        this.a = b;
        this.b = zy9Var;
        this.c = z;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = this.c;
        zy9 zy9Var = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                ArrayList arrayList = zy9Var.b2;
                if (z) {
                    zy9Var.c2.addAll(list);
                }
                if (zy9Var.m2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    zy9Var.i1(true, true);
                    zy9Var.e1(true);
                    return;
                }
                return;
            default:
                zy9Var.Z0(z, (Pair) obj);
                return;
        }
    }
}
