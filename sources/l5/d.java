package l5;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import m5.a0;
import m5.b0;
import m5.c0;
import m5.d0;
import m5.e0;
import m5.f;
import m5.f0;
import m5.g;
import m5.h;
import m5.i;
import m5.i0;
import m5.j;
import m5.k;
import m5.l;
import m5.m;
import m5.n;
import m5.o;
import m5.p;
import m5.q;
import m5.r;
import m5.s;
import m5.t;
import m5.v;
import m5.w;
import m5.y;
import o5.e;
public final class d implements e {
    public final hi.d f18045a;
    public final ConnectivityManager f18046b;
    public final Context f18047c;
    public final URL d;
    public final w5.a f18048e;
    public final w5.a f18049f;
    public final int f18050g;

    public d(Context context, w5.a aVar, w5.a aVar2) {
        oa.d dVar = new oa.d();
        m5.c cVar = m5.c.f19101a;
        dVar.c(w.class, cVar);
        dVar.c(m.class, cVar);
        j jVar = j.f19128a;
        dVar.c(f0.class, jVar);
        dVar.c(t.class, jVar);
        m5.d dVar2 = m5.d.f19103a;
        dVar.c(y.class, dVar2);
        dVar.c(n.class, dVar2);
        m5.b bVar = m5.b.f19090a;
        dVar.c(m5.a.class, bVar);
        dVar.c(l.class, bVar);
        i iVar = i.f19120a;
        dVar.c(e0.class, iVar);
        dVar.c(s.class, iVar);
        m5.e eVar = m5.e.f19106a;
        dVar.c(a0.class, eVar);
        dVar.c(o.class, eVar);
        h hVar = h.f19116a;
        dVar.c(d0.class, hVar);
        dVar.c(r.class, hVar);
        g gVar = g.f19112a;
        dVar.c(c0.class, gVar);
        dVar.c(q.class, gVar);
        k kVar = k.f19136a;
        dVar.c(i0.class, kVar);
        dVar.c(v.class, kVar);
        f fVar = f.f19109a;
        dVar.c(b0.class, fVar);
        dVar.c(p.class, fVar);
        dVar.d = true;
        this.f18045a = new hi.d(dVar, 19);
        this.f18047c = context;
        this.f18046b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f18035c);
        this.f18048e = aVar2;
        this.f18049f = aVar;
        this.f18050g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(t4.c.f("Invalid url: ", str), e10);
        }
    }

    public final n5.h a(n5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: l5.d.a(n5.h):n5.h");
    }
}
