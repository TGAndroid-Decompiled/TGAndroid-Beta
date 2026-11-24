package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
public final class cn {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i = 0; i < arrayList.size(); i++) {
            ((bn) arrayList.get(i)).d.spanDrawn = false;
        }
    }

    public final void b(int i) {
        bn bnVar = (bn) this.a.remove(i);
        HashMap hashMap = this.b;
        en enVar = (en) hashMap.get(bnVar.c);
        if (enVar != null) {
            ArrayList arrayList = enVar.b;
            arrayList.remove(bnVar);
            enVar.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(bnVar.c);
                this.c.remove(enVar);
            }
            vm vmVar = bnVar.f;
            if (vmVar != null) {
                vmVar.n(bnVar);
                return;
            }
            return;
        }
        zo4.k("!!!");
    }
}
