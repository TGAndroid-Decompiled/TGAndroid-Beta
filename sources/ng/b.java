package ng;

import fg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.ul0;
import s4.o;
public abstract class b extends ul0 {
    public final g f14048c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f14048c;
        gVar.f8019c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).b(this);
    }
}
