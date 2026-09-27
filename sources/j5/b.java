package j5;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import k5.d;
import k5.f;
import k5.g;
import k5.h;
import k5.i;
import k5.j;
import k5.k;
import k5.l;
import k5.n;
import k5.o;
import k5.q;
import k5.r;
import k5.s;
import k5.v;
import ka.c;
import m5.e;
import v7.k0;
public final class b implements e {
    public final c f12873a;
    public final ConnectivityManager f12874b;
    public final Context f12875c;
    public final URL d;
    public final u5.a e;
    public final u5.a f12876f;
    public final int f12877g;

    public b(Context context, u5.a aVar, u5.a aVar2) {
        ka.e eVar = new ka.e();
        k5.c cVar = k5.c.f13439a;
        eVar.a(o.class, cVar);
        eVar.a(i.class, cVar);
        f fVar = f.f13449a;
        eVar.a(s.class, fVar);
        eVar.a(l.class, fVar);
        d dVar = d.f13441a;
        eVar.a(q.class, dVar);
        eVar.a(j.class, dVar);
        k5.b bVar = k5.b.f13429a;
        eVar.a(k5.a.class, bVar);
        eVar.a(h.class, bVar);
        k5.e eVar2 = k5.e.f13444a;
        eVar.a(r.class, eVar2);
        eVar.a(k.class, eVar2);
        g gVar = g.f13454a;
        eVar.a(v.class, gVar);
        eVar.a(n.class, gVar);
        eVar.d = true;
        this.f12873a = new c(eVar, 0);
        this.f12875c = context;
        this.f12874b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f12869c);
        this.e = aVar2;
        this.f12876f = aVar;
        this.f12877g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(k0.g("Invalid url: ", str), e);
        }
    }

    public final l5.h a(l5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: j5.b.a(l5.h):l5.h");
    }
}
