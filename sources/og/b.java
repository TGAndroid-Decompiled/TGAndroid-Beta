package og;

import gg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.vl0;
import s4.o;
public abstract class b extends vl0 {
    public final g f15674c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.f15674c;
        gVar.f9738c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).b(this);
    }
}
