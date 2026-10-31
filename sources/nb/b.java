package nb;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;
public final class b implements r9.d {
    public static final b f13738b = new b(0);
    public static final b f13739c = new b(1);
    public final int f13740a;

    public b(int i10) {
        this.f13740a = i10;
    }

    @Override
    public final Object K(bh.d dVar) {
        switch (this.f13740a) {
            case 0:
                ArrayList arrayList = new ArrayList(dVar.J(mb.a.class));
                l.i("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f13741a);
                return new e((Context) dVar.b(Context.class), (mb.a) arrayList.get(0));
            default:
                return new a((e) dVar.b(e.class), (jb.d) dVar.b(jb.d.class));
        }
    }
}
