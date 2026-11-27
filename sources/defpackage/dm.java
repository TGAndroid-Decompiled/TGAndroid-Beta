package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
public final class dm {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i = 0; i < arrayList.size(); i++) {
            ((cm) arrayList.get(i)).d.spanDrawn = false;
        }
    }

    public final void b(int i) {
        cm cmVar = (cm) this.a.remove(i);
        HashMap hashMap = this.b;
        fm fmVar = (fm) hashMap.get(cmVar.c);
        if (fmVar != null) {
            ArrayList arrayList = fmVar.b;
            arrayList.remove(cmVar);
            fmVar.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(cmVar.c);
                this.c.remove(fmVar);
            }
            wl wlVar = cmVar.f;
            if (wlVar != null) {
                wlVar.n(cmVar);
                return;
            }
            return;
        }
        xi4.l("!!!");
    }
}
