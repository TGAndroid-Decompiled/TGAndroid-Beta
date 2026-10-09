package og;

import gg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.pm0;
import s4.o;
public abstract class b extends pm0 {
    public final g f17127c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f17127c;
        gVar.f10608c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).b(this);
    }
}
