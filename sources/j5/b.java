package j5;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import k5.d;
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
import ka.e;
import m5.f;
import v7.j0;
public final class b implements f {
    public final c f12882a;
    public final ConnectivityManager f12883b;
    public final Context f12884c;
    public final URL d;
    public final u5.a e;
    public final u5.a f12885f;
    public final int f12886g;

    public b(Context context, u5.a aVar, u5.a aVar2) {
        e eVar = new e();
        k5.c cVar = k5.c.f13451a;
        eVar.m(o.class, cVar);
        eVar.m(i.class, cVar);
        k5.f fVar = k5.f.f13461a;
        eVar.m(s.class, fVar);
        eVar.m(l.class, fVar);
        d dVar = d.f13453a;
        eVar.m(q.class, dVar);
        eVar.m(j.class, dVar);
        k5.b bVar = k5.b.f13441a;
        eVar.m(k5.a.class, bVar);
        eVar.m(h.class, bVar);
        k5.e eVar2 = k5.e.f13456a;
        eVar.m(r.class, eVar2);
        eVar.m(k.class, eVar2);
        g gVar = g.f13466a;
        eVar.m(v.class, gVar);
        eVar.m(n.class, gVar);
        eVar.d = true;
        this.f12882a = new c(eVar, 0);
        this.f12884c = context;
        this.f12883b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f12878c);
        this.e = aVar2;
        this.f12885f = aVar;
        this.f12886g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(j0.g("Invalid url: ", str), e);
        }
    }

    public final l5.h a(l5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: j5.b.a(l5.h):l5.h");
    }
}
