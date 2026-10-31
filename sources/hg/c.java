package hg;

import java.util.ArrayList;
import org.telegram.ui.Components.sk0;
import s4.n;
public abstract class c extends sk0 {
    public final a f7682c = new a();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        a aVar = this.f7682c;
        aVar.f7679c = arrayList;
        aVar.d = arrayList2;
        n.c(aVar, true).c(this);
    }
}
