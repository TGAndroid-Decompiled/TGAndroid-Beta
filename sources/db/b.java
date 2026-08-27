package db;

import af.h;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import y5.l;

public final class b implements z8.d {

    public static final b f4879b = new b(0);

    public static final b f4880c = new b(1);

    public final int f4881a;

    public b(int i10) {
        this.f4881a = i10;
    }

    @Override
    public final Object u0(h hVar) {
        switch (this.f4881a) {
            case 0:
                ArrayList arrayList = new ArrayList(hVar.y(cb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f4882a);
                return new e((Context) hVar.a(Context.class), (cb.a) arrayList.get(0));
            default:
                return new a((e) hVar.a(e.class), (za.d) hVar.a(za.d.class));
        }
    }
}
