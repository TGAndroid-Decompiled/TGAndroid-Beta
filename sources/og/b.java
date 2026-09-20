package og;

import gg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.ul0;
import s4.o;
public abstract class b extends ul0 {
    public final g f15706c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f15706c;
        gVar.f9739c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).b(this);
    }
}
