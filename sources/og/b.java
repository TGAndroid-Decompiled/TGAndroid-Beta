package og;

import gg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.rm0;
import s4.o;
public abstract class b extends rm0 {
    public final g f17177c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f17177c;
        gVar.f10607c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).b(this);
    }
}
