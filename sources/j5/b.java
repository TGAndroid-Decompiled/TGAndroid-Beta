package j5;

import a4.l;
import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import k5.c;
import k5.e;
import k5.g;
import k5.h;
import k5.i;
import k5.j;
import k5.k;
import k5.n;
import k5.o;
import k5.q;
import k5.r;
import k5.s;
import k5.v;
import la.d;
import m5.f;
public final class b implements f {
    public final l f9670a;
    public final ConnectivityManager f9671b;
    public final Context f9672c;
    public final URL d;
    public final u5.a e;
    public final u5.a f9673f;
    public final int f9674g;

    public b(Context context, u5.a aVar, u5.a aVar2) {
        d dVar = new d();
        c cVar = c.f10877a;
        dVar.e(o.class, cVar);
        dVar.e(i.class, cVar);
        k5.f fVar = k5.f.f10887a;
        dVar.e(s.class, fVar);
        dVar.e(k5.l.class, fVar);
        k5.d dVar2 = k5.d.f10879a;
        dVar.e(q.class, dVar2);
        dVar.e(j.class, dVar2);
        k5.b bVar = k5.b.f10867a;
        dVar.e(k5.a.class, bVar);
        dVar.e(h.class, bVar);
        e eVar = e.f10882a;
        dVar.e(r.class, eVar);
        dVar.e(k.class, eVar);
        g gVar = g.f10892a;
        dVar.e(v.class, gVar);
        dVar.e(n.class, gVar);
        dVar.d = true;
        this.f9670a = new l(dVar, 26);
        this.f9672c = context;
        this.f9671b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f9666c);
        this.e = aVar2;
        this.f9673f = aVar;
        this.f9674g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(sc.e.h("Invalid url: ", str), e);
        }
    }

    public final l5.h a(l5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: j5.b.a(l5.h):l5.h");
    }
}
