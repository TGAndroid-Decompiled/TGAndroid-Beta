package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
public final class r2a implements pcc {
    public final byte a;
    public final t2a b;
    public final boolean c;

    public r2a(t2a t2aVar, boolean z, byte b) {
        this.a = b;
        this.b = t2aVar;
        this.c = z;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = this.c;
        t2a t2aVar = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                ArrayList arrayList = t2aVar.b2;
                if (z) {
                    t2aVar.c2.addAll(list);
                }
                if (t2aVar.m2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    t2aVar.j1(true, true);
                    t2aVar.f1(true);
                    return;
                }
                return;
            default:
                t2aVar.a1(z, (Pair) obj);
                return;
        }
    }
}
