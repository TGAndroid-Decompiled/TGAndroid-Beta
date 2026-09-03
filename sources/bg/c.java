package bg;

import f2.q;
import java.util.ArrayList;
import org.telegram.ui.Components.ql0;
public abstract class c extends ql0 {
    public final a f1832c = new a();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        a aVar = this.f1832c;
        aVar.f1829c = arrayList;
        aVar.d = arrayList2;
        q.c(aVar, true).b(this);
    }
}
