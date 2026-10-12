package og;

import gg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.vm0;
import s4.o;
public abstract class b extends vm0 {
    public final g f16878c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f16878c;
        gVar.f10606c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).b(this);
    }
}
