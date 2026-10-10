package og;

import gg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.qm0;
import s4.o;
public abstract class b extends qm0 {
    public final g f17131c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f17131c;
        gVar.f10608c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).b(this);
    }
}
