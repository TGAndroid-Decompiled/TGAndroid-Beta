package cg;

import f2.q;
import java.util.ArrayList;
import org.telegram.ui.Components.sl0;
public abstract class c extends sl0 {
    public final a f2507c = new a();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        a aVar = this.f2507c;
        aVar.f2504c = arrayList;
        aVar.d = arrayList2;
        q.c(aVar, true).b(this);
    }
}
