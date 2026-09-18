package og;

import gg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.ll0;
import s4.o;
public abstract class b extends ll0 {
    public final g f15545c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f15545c;
        gVar.f9739c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).b(this);
    }
}
