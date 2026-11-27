package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
public final class d0c implements kcc {
    public final n0c a;
    public final String b;
    public final long c;
    public final Boolean d;

    public d0c(n0c n0cVar, String str, long j, Boolean bool) {
        this.a = n0cVar;
        this.b = str;
        this.c = j;
        this.d = bool;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj;
        pyb pybVar = (pyb) obj2;
        Integer num = (Integer) obj3;
        n0c n0cVar = this.a;
        ArrayList arrayList2 = n0cVar.N;
        boolean z = false;
        n0cVar.O = 0;
        if (this.b.equals(n0cVar.M)) {
            if (this.c == n0cVar.V) {
                if (Objects.equals(this.d, n0cVar.W)) {
                    arrayList2.addAll(arrayList);
                    n0cVar.Q = pybVar;
                    n0cVar.R = (pybVar == null || arrayList2.size() >= num.intValue()) ? true : true;
                    n0cVar.n();
                }
            }
        }
    }
}
