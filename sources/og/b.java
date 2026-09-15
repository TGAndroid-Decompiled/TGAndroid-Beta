package og;

import gg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.kl0;
import s4.o;
public abstract class b extends kl0 {
    public final g f15535c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f15535c;
        gVar.f9734c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).b(this);
    }
}
