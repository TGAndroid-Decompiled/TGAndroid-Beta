package gb;

import android.content.Context;
import b6.m;
import c5.j;
import java.util.ArrayList;
import java.util.Collections;
public final class b implements c9.e {
    public static final b f6987b = new b(0);
    public static final b f6988c = new b(1);
    public final int f6989a;

    public b(int i10) {
        this.f6989a = i10;
    }

    @Override
    public final Object e0(j jVar) {
        switch (this.f6989a) {
            case 0:
                ArrayList arrayList = new ArrayList(jVar.w(fb.a.class));
                m.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f6990a);
                return new e((Context) jVar.a(Context.class), (fb.a) arrayList.get(0));
            default:
                return new a((e) jVar.a(e.class), (cb.d) jVar.a(cb.d.class));
        }
    }
}
