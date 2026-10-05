package og;

import gg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.yl0;
import s4.o;
public abstract class b extends yl0 {
    public final g f17194c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f17194c;
        gVar.f10585c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).b(this);
    }
}
