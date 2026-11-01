package nb;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;
public final class b implements r9.d {
    public static final b f13739b = new b(0);
    public static final b f13740c = new b(1);
    public final int f13741a;

    public b(int i10) {
        this.f13741a = i10;
    }

    @Override
    public final Object K(bh.d dVar) {
        switch (this.f13741a) {
            case 0:
                ArrayList arrayList = new ArrayList(dVar.J(mb.a.class));
                l.i("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f13742a);
                return new e((Context) dVar.b(Context.class), (mb.a) arrayList.get(0));
            default:
                return new a((e) dVar.b(e.class), (jb.d) dVar.b(jb.d.class));
        }
    }
}
