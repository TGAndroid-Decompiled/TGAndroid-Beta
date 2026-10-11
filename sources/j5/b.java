package j5;

import a4.l;
import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import k5.c;
import k5.f;
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
import ka.d;
import m5.e;
public final class b implements e {
    public final l f14025a;
    public final ConnectivityManager f14026b;
    public final Context f14027c;
    public final URL d;
    public final u5.a f14028e;
    public final u5.a f14029f;
    public final int f14030g;

    public b(Context context, u5.a aVar, u5.a aVar2) {
        d dVar = new d();
        c cVar = c.f14640a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f14651a;
        dVar.a(s.class, fVar);
        dVar.a(k5.l.class, fVar);
        k5.d dVar2 = k5.d.f14642a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        k5.b bVar = k5.b.f14629a;
        dVar.a(k5.a.class, bVar);
        dVar.a(h.class, bVar);
        k5.e eVar = k5.e.f14645a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f14657a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.d = true;
        this.f14025a = new l(dVar, 26);
        this.f14027c = context;
        this.f14026b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f14020c);
        this.f14028e = aVar2;
        this.f14029f = aVar;
        this.f14030g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException(sc.v.i("Invalid url: ", str), e7);
        }
    }

    public final l5.h a(l5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: j5.b.a(l5.h):l5.h");
    }
}
