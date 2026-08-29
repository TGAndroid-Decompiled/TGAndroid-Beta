package eb;

import a5.j;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import z5.l;
public final class b implements a9.e {
    public static final b f5847b = new b(0);
    public static final b f5848c = new b(1);
    public final int f5849a;

    public b(int i10) {
        this.f5849a = i10;
    }

    @Override
    public final Object I0(j jVar) {
        switch (this.f5849a) {
            case 0:
                ArrayList arrayList = new ArrayList(jVar.r(db.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f5850a);
                return new e((Context) jVar.a(Context.class), (db.a) arrayList.get(0));
            default:
                return new a((e) jVar.a(e.class), (ab.d) jVar.a(ab.d.class));
        }
    }
}
