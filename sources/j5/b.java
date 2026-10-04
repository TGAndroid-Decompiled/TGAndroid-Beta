package j5;

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
import k5.l;
import k5.n;
import k5.o;
import k5.q;
import k5.r;
import k5.s;
import k5.v;
import ka.d;
import m5.e;
public final class b implements e {
    public final k2.e f13989a;
    public final ConnectivityManager f13990b;
    public final Context f13991c;
    public final URL d;
    public final u5.a f13992e;
    public final u5.a f13993f;
    public final int f13994g;

    public b(Context context, u5.a aVar, u5.a aVar2) {
        d dVar = new d();
        c cVar = c.f14609a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f14620a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        k5.d dVar2 = k5.d.f14611a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        k5.b bVar = k5.b.f14598a;
        dVar.a(k5.a.class, bVar);
        dVar.a(h.class, bVar);
        k5.e eVar = k5.e.f14614a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f14626a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.d = true;
        this.f13989a = new k2.e(dVar, 1);
        this.f13991c = context;
        this.f13990b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f13984c);
        this.f13992e = aVar2;
        this.f13993f = aVar;
        this.f13994g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException(sa.e.i("Invalid url: ", str), e7);
        }
    }

    public final l5.h a(l5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: j5.b.a(l5.h):l5.h");
    }
}
