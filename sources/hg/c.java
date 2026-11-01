package hg;

import java.util.ArrayList;
import org.telegram.ui.Components.tk0;
import s4.n;
public abstract class c extends tk0 {
    public final a f7683c = new a();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        a aVar = this.f7683c;
        aVar.f7680c = arrayList;
        aVar.d = arrayList2;
        n.c(aVar, true).c(this);
    }
}
