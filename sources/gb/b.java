package gb;

import android.content.Context;
import b6.m;
import c5.j;
import c9.f;
import java.util.ArrayList;
import java.util.Collections;
public final class b implements f {
    public static final b f6493b = new b(0);
    public static final b f6494c = new b(1);
    public final int f6495a;

    public b(int i10) {
        this.f6495a = i10;
    }

    @Override
    public final Object d0(j jVar) {
        switch (this.f6495a) {
            case 0:
                ArrayList arrayList = new ArrayList(jVar.x(fb.a.class));
                m.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f6496a);
                return new e((Context) jVar.a(Context.class), (fb.a) arrayList.get(0));
            default:
                return new a((e) jVar.a(e.class), (cb.d) jVar.a(cb.d.class));
        }
    }
}
