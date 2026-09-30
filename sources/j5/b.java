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
public final class b implements e {
    public final c f12870a;
    public final ConnectivityManager f12871b;
    public final Context f12872c;
    public final URL d;
    public final u5.a e;
    public final u5.a f12873f;
    public final int f12874g;

    public b(Context context, u5.a aVar, u5.a aVar2) {
        ka.e eVar = new ka.e();
        k5.c cVar = k5.c.f13437a;
        eVar.a(o.class, cVar);
        eVar.a(i.class, cVar);
        f fVar = f.f13447a;
        eVar.a(s.class, fVar);
        eVar.a(l.class, fVar);
        d dVar = d.f13439a;
        eVar.a(q.class, dVar);
        eVar.a(j.class, dVar);
        k5.b bVar = k5.b.f13427a;
        eVar.a(k5.a.class, bVar);
        eVar.a(h.class, bVar);
        k5.e eVar2 = k5.e.f13442a;
        eVar.a(r.class, eVar2);
        eVar.a(k.class, eVar2);
        g gVar = g.f13452a;
        eVar.a(v.class, gVar);
        eVar.a(n.class, gVar);
        eVar.d = true;
        this.f12870a = new c(eVar, 0);
        this.f12872c = context;
        this.f12871b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f12866c);
        this.e = aVar2;
        this.f12873f = aVar;
        this.f12874g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(v7.j.g("Invalid url: ", str), e);
        }
    }

    public final l5.h a(l5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: j5.b.a(l5.h):l5.h");
    }
}
