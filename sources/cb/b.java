package cb;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import x5.l;
public final class b implements y8.d {
    public static final b f2335b = new b(0);
    public static final b f2336c = new b(1);
    public final int f2337a;

    public b(int i9) {
        this.f2337a = i9;
    }

    @Override
    public final Object H1(b3.b bVar) {
        switch (this.f2337a) {
            case 0:
                ArrayList arrayList = new ArrayList(bVar.x(bb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f2338a);
                return new e((Context) bVar.a(Context.class), (bb.a) arrayList.get(0));
            default:
                return new a((e) bVar.a(e.class), (ya.d) bVar.a(ya.d.class));
        }
    }
}
