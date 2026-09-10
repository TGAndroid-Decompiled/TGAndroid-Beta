package j5;

import a6.i;
import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import k5.c;
import k5.f;
import k5.g;
import k5.h;
import k5.j;
import k5.k;
import k5.l;
import k5.n;
import k5.o;
import k5.q;
import k5.r;
import k5.s;
import k5.v;
import ka.d;
import m5.e;
import org.telegram.ui.Cells.r6;
public final class b implements e {
    public final i f11772a;
    public final ConnectivityManager f11773b;
    public final Context f11774c;
    public final URL d;
    public final u5.a e;
    public final u5.a f11775f;
    public final int f11776g;

    public b(Context context, u5.a aVar, u5.a aVar2) {
        d dVar = new d();
        c cVar = c.f12295a;
        dVar.m(o.class, cVar);
        dVar.m(k5.i.class, cVar);
        f fVar = f.f12305a;
        dVar.m(s.class, fVar);
        dVar.m(l.class, fVar);
        k5.d dVar2 = k5.d.f12297a;
        dVar.m(q.class, dVar2);
        dVar.m(j.class, dVar2);
        k5.b bVar = k5.b.f12285a;
        dVar.m(k5.a.class, bVar);
        dVar.m(h.class, bVar);
        k5.e eVar = k5.e.f12300a;
        dVar.m(r.class, eVar);
        dVar.m(k.class, eVar);
        g gVar = g.f12310a;
        dVar.m(v.class, gVar);
        dVar.m(n.class, gVar);
        dVar.d = true;
        this.f11772a = new i(dVar, 28);
        this.f11774c = context;
        this.f11773b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f11768c);
        this.e = aVar2;
        this.f11775f = aVar;
        this.f11776g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(r6.i("Invalid url: ", str), e);
        }
    }

    public final l5.h a(l5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: j5.b.a(l5.h):l5.h");
    }
}
