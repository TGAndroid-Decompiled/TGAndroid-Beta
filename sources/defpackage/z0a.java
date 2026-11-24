package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
public final class z0a implements qac {
    public final byte a;
    public final b1a b;
    public final boolean c;

    public z0a(b1a b1aVar, boolean z, byte b) {
        this.a = b;
        this.b = b1aVar;
        this.c = z;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = this.c;
        b1a b1aVar = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                ArrayList arrayList = b1aVar.b2;
                if (z) {
                    b1aVar.c2.addAll(list);
                }
                if (b1aVar.m2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    b1aVar.i1(true, true);
                    b1aVar.e1(true);
                    return;
                }
                return;
            default:
                b1aVar.Z0(z, (Pair) obj);
                return;
        }
    }
}
